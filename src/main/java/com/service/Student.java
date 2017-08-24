package com.service;

/**
 * Created by Маша on 27.02.2017.
 */
public class Student {
    private int id;
    private String name;
    private int grupa;
    private int ocenka;

    Student(String name, int grupa, int ocenka) {
        this.name = name;
        this.grupa = grupa;
        this.ocenka = ocenka;
    }
    Student(int id, String name, int grupa, int ocenka) {
        this.id = id;
        this.name = name;
        this.grupa = grupa;
        this.ocenka = ocenka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }

    @Override
    public String toString() {
        return "StudentBD{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grupa=" + grupa +
                ", ocenka=" + ocenka +
                '}'+"<br>";
    }
}
