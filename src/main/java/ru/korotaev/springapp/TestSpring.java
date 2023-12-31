package ru.korotaev.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.invoke.MutableCallSite;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());

        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
