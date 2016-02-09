package ru.cardsim.app.entities;

/**
 * Created by bombaster on 09.02.2016.
 */
public class Entity {
    private String name;
    private int id;

    public Entity() {
    }

    public Entity(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}