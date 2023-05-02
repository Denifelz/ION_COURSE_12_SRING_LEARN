package com.spring.learn.beans.music;

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
