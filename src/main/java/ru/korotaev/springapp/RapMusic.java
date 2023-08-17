package ru.korotaev.springapp;

import org.springframework.stereotype.Component;

@Component("rapMusic1")
public class RapMusic implements Music{

    @Override
    public String GetSong(){
        return "The Next Episode";
    }
}
