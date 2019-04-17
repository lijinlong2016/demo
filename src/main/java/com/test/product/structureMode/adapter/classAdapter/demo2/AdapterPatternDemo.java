package com.test.product.structureMode.adapter.classAdapter.demo2;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:15 2019-04-17
 * @Modify By:
 */
public class AdapterPatternDemo {


    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
