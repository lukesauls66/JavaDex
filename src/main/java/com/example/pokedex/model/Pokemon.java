package com.example.pokedex.model;

import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemon")
public class Pokemon {

    private String id;
    private String name;
    private String[] type;
    private Map<String, Map<String, String>> images;

    public Pokemon() {}

    public Pokemon(String name, String[] type, Map<String, Map<String, String>> images) {
        this.name = name;
        this.type = type;
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public Map<String, Map<String, String>> getImages() {
        return images;
    }

    public void setImages(Map<String, Map<String, String>> images) {
        this.images = images;
    }
}
