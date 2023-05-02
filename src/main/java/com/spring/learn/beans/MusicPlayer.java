package com.spring.learn.beans;

import com.spring.learn.beans.music.Music;

import java.util.List;

public class MusicPlayer {
    private List<Music> music;

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public void play() {
        if (music == null || music.size() == 0) {
            System.out.println(this.name + "(vol." + this.volume + "%)" + " >> Stopping");
        } else {
            System.out.println(this.name + "(vol." + this.volume + "%)" + " >> Playing >> " + music.get(0));
            System.out.println("Next:");
            music.stream().skip(1).forEach(System.out::println);
        }
    }

    public void onInit() {
        System.out.println("INFO: MusicPlayer Initialization Event.");
    }

    public void onDestroy() {
        System.out.println("INFO: MusicPlayer Destruction Event.");
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
