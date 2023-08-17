package ru.korotaev.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.invoke.MutableCallSite;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music1 = context.getBean("classicalMusic1", Music.class);
        Music music2 = context.getBean("rockMusic1", Music.class);
        Music music3 = context.getBean("rapMusic1", Music.class);

        MusicPlayer firstMusicPlayer = new MusicPlayer(music1);

        firstMusicPlayer.playMusic();

        context.close();
    }
}
