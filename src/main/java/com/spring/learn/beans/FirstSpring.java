package com.spring.learn.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextBeans.xml")) {
            final MusicPlayer musicPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.play();
        }
    }
}
