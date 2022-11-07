package dk.via.and1.networking;

import java.util.ArrayList;

public class PokemonResponse
{
    private int id;
    private String name;
    private Sprites sprites;
    private int height;
    private int weight;
    private ArrayList<Types> types;

    public Pokemon getPokemon()
    {
       ArrayList<String> temp =  new ArrayList<>();

        for (Types type: types) {
            temp.add(type.type.getName());
        }
        return new Pokemon(id,name,sprites.front_default,height,weight,temp);
    }

    private static class Sprites{
        private String front_default;
    }

    private static class Types{
        private Type type;

        public Type getType() {
            return type;
        }

        private static class Type{
            private String name;

            public String getName() {
                return name;
            }
        }
    }
}
