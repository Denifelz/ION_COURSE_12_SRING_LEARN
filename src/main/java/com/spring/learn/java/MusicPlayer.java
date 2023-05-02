package com.spring.learn.java;

import com.spring.learn.java.music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class MusicPlayer {
    @Autowired
    private List<Music> music;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public void play() {
        if (music == null || music.size() == 0) {
            System.out.println(this.name + "(vol." + this.volume + "%)" + " >> Stopping");
        } else {
            System.out.println(this.name + "(vol." + this.volume + "%)" + " >> Playing >> " + music.get(0));
            System.out.println("Next:");
            music.stream().skip(1).forEach(System.out::println);
        }
    }

    @PostConstruct
    public void onInit() {
        System.out.println("INFO: MusicPlayer Initialization Event.");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("INFO: MusicPlayer Destruction Event.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
