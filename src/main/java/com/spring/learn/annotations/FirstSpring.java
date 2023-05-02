package com.spring.learn.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml")) {
            final MusicPlayer musicPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.play();
        }
    }
}
