package com.example.recyclerviewtutorial;

public class ModelClass {
    String name;
    String rating;
    int image;

    public ModelClass(String name, String rating, int image) {
        this.name = name;
        this.rating = rating;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public int getImage() {
        return image;
    }
}
