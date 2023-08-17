package ru.korotaev.springapp;

import org.springframework.stereotype.Component;

@Component("rockMusic1")
public class RockMusic implements Music{
    @Override
    public String GetSong() {
        return "Wind cries Mary";
    }
}
