package dk.via.and1.networking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    private EditText pokemonInput;
    private TextView id;
    private TextView name;
    private TextView height;
    private TextView weight;
    private ImageView picture;

    PokemonViewModel viewModel;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pokemonInput = findViewById(R.id.editTextSearchPokemon);
        id = findViewById(R.id.idValueTextView);
        name = findViewById(R.id.nameValueTextView);
        height = findViewById(R.id.heightValueTextView);
        weight = findViewById(R.id.weightValueTextView);
        picture = findViewById(R.id.imageView);

        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);
        viewModel.getSearchedPokemon().observe(this, pokemon ->
        {
            System.out.println(pokemon.getTypes().get(0)+"here");
           // id.setText(String.valueOf(pokemon.getId()));
            id.setText(pokemon.getTypes().get(0));
            name.setText(pokemon.getName().substring(0,1).toUpperCase(Locale.ROOT)+ pokemon.getName().substring(1));
            height.setText(String.valueOf(pokemon.getHeight()));
            weight.setText(String.valueOf(pokemon.getWeight()));
            Glide.with(this).load(pokemon.getImageUrl()).into(picture);
        });
    }

    public void searchForPokemon(View view)
    {
        viewModel.searchForPokemon(pokemonInput.getText().toString());
    }
}