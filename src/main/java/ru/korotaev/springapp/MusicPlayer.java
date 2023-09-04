package ru.korotaev.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("musicPlayer")
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private  String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private Music Music1;
    private Music Music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        Music1 = music1;
        Music2 = music2;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        if (genre == MusicGenre.CLASSICAL) {
            // случайная классическая песня
            System.out.println(Music2.getSongs().get(randomNumber));
        } else {
            // случайная рок песня
            System.out.println(Music1.getSongs().get(randomNumber));
        }
    }
}
