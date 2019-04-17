package com.test.product.structureMode.adapter.classAdapter.demo2;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 15:11 2019-04-17
 * @Modify By:
 */
public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
