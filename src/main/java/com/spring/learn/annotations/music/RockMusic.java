package com.spring.learn.annotations.music;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "First Rock Music";
    }

    @Override
    public String toString() {
        return this.getSong();
    }
}
