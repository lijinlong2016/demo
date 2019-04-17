package com.test.product.structureMode.adapter.classAdapter.demo2;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:12 2019-04-17
 * @Modify By:
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
