package ru.korotaev.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("start");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("end");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
