package com.spring.learn.annotations.music;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "First Classical Music";
    }

    @Override
    public String toString() {
        return this.getSong();
    }
}
