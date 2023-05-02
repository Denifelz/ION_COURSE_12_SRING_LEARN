package com.spring.learn.annotations.music;

import org.springframework.stereotype.Component;

@Component
public class FolkMusic implements Music {
    @Override
    public String getSong() {
        return "First Folk Music";
    }

    @Override
    public String toString() {
        return this.getSong();
    }
}
