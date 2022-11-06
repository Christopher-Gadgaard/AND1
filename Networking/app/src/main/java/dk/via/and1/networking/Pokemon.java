package dk.via.and1.networking;

import android.util.Log;

import java.util.ArrayList;

public class Pokemon
{
    private final int id;
    private final String name;
    private final String imageUrl;
    private final int height;
    private final int weight;

    public Pokemon(int id, String name, String imageUrl, int height, int weight)
    {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.height = height;
        this.weight = weight;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWeight()
    {
        return weight;
    }
}
