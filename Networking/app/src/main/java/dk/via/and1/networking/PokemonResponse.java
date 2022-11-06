package dk.via.and1.networking;

import java.util.ArrayList;

public class PokemonResponse
{
    private int id;
    private String name;
    private Sprites sprites;
    private int height;
    private int weight;

    public Pokemon getPokemon()
    {
        return new Pokemon(id,name,sprites.front_default,height,weight);
    }

    private static class Sprites{
        private String front_default;
    }
}
