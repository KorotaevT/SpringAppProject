package ru.korotaev.springapp;

import org.springframework.stereotype.Component;

@Component("classicalMusic1")
public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("My Initialization");
    }

    public void doMyDestroy(){
        System.out.println("My Destruction");
    }

    @Override
    public String GetSong() {
        return "Hungarian Rhapsody";
    }
}
