package com.test.fileIO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 14:59 2019-06-12
 * @Modify By:
 */
public class NioChannel {


    /**
     * FileChannel配合缓冲区
     */
    @Test
    public void channelTest() {

        //jdk1.7后通过静态方法.open()获取通道
        FileChannel inFileChannel = null;
        FileChannel outFileChannel = null;


        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        try {
            fileInputStream = new FileInputStream("/Users/lijinlong/online/wallet_nifa_provider.jar");
            fileOutputStream = new FileOutputStream("/Users/lijinlong/online/nio.jar");

            inFileChannel = fileInputStream.getChannel();
            outFileChannel = fileOutputStream.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            while (inFileChannel.read(byteBuffer) != -1) {
                byteBuffer.flip();
                outFileChannel.write(byteBuffer);
                byteBuffer.clear();
            }
        } catch (IOException e) {

        }
    }


    /**
     * 使用内存映射文件的方式实现文件复制的功能(直接操作缓冲区)：
     */
    @Test
    public void channelTest1() throws IOException {

        FileChannel inChannel = FileChannel.open(Paths.get("/Users/lijinlong/online/wallet_nifa_provider.jar"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("/Users/lijinlong/online/nio.jar"), StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW, StandardOpenOption.READ);

        MappedByteBuffer inMappedBuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMappedBuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, outChannel.size());

        byte[] dst = new byte[inMappedBuf.limit()];
        inMappedBuf.get(dst);
        outMappedBuf.put(dst);
    }

    /**
     * 通道之间通过transfer()实现数据的传输(直接操作缓冲区)：
     */
    @Test
    public void channelTest2() throws IOException {

        FileChannel inChannel = FileChannel.open(Paths.get("/Users/lijinlong/online/wallet_nifa_provider.jar"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("/Users/lijinlong/online/nio2.jar"), StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.READ);

        inChannel.transferTo(0, inChannel.size(), outChannel);

        inChannel.close();
        outChannel.close();

    }

}
