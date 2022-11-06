package dk.via.and1.networking;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class PokemonViewModel extends ViewModel {
    PokemonRepo pokemonRepo;

    public PokemonViewModel()
    {
        pokemonRepo = PokemonRepo.getInstance();
    }

    LiveData<Pokemon> getSearchedPokemon()
    {
        return pokemonRepo.getSearchedPokemon();
    }

    public void searchForPokemon(String name)
    {
        pokemonRepo.searchForPokemon(name);
    }
}
