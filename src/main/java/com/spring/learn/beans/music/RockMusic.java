package com.spring.learn.beans.music;

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
