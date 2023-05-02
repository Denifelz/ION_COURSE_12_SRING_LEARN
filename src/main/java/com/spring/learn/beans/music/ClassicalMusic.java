package com.spring.learn.beans.music;

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
