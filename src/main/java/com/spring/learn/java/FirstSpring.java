package com.spring.learn.java;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.spring.learn.java")
@PropertySource("classpath:musicPlayer.properties")
public class FirstSpring {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(FirstSpring.class)) {
            final MusicPlayer musicPlayer = appContext.getBean("musicPlayer", MusicPlayer.class);
            musicPlayer.play();
        }
    }
}
