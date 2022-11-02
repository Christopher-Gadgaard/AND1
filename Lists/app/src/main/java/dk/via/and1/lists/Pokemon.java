package dk.via.and1.lists;

import android.net.Uri;

public class Pokemon {
    private final String no;
    private final String name;
    private double weight;
    private double height;
    private Uri thumbnailImage;

    public Pokemon(String no, String name, double weight, double height, Uri thumbnailImage) {
        this.no = no;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.thumbnailImage = thumbnailImage;
    }

    public Pokemon(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public Uri getThumbnailImage() {
        return thumbnailImage;
    }
}
