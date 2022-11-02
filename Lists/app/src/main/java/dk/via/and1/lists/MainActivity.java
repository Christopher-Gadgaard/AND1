package dk.via.and1.lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PokemonAdapter.OnListClickListener
{

    PokemonAdapter pokemonAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.hasFixedSize();

        List<Pokemon> pokemons = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            pokemons.add(new Pokemon("test"+i, "test"));
        }



        pokemonAdapter = new PokemonAdapter(pokemons, this);
        recyclerView.setAdapter(pokemonAdapter);
    }


    @Override
    public void onClick(Pokemon pokemon) {
        Toast.makeText(this,"Pokemon: " + pokemon.getNo(),Toast.LENGTH_SHORT).show();
    }
}