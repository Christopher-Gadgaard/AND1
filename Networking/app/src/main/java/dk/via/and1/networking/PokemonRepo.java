package dk.via.and1.networking;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class PokemonRepo {
    private static PokemonRepo instance;
    private final MutableLiveData<Pokemon> searchedPokemon;

    private PokemonRepo()
    {
        this.searchedPokemon = new MutableLiveData<>();
    }

    public static synchronized PokemonRepo getInstance()
    {
        if (instance == null)
        {
            instance = new PokemonRepo();
        }
        return instance;
    }

    public LiveData<Pokemon> getSearchedPokemon()
    {
        return searchedPokemon;
    }

    public void searchForPokemon(String name){
        PokemonApi pokemonApi = ServiceGenerator.getPokemonApi();
        Call<PokemonResponse> call = pokemonApi.getPokemon(name);
        call.enqueue(new Callback<PokemonResponse>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(Call<PokemonResponse> call, Response<PokemonResponse> response)
            {
                if (response.isSuccessful())
                {
                    searchedPokemon.setValue(response.body().getPokemon());
                }
            }
            @EverythingIsNonNull
            @Override
            public void onFailure(Call<PokemonResponse> call, Throwable t)
            {
                Log.i("Retrofit", "Something went wrong");
            }
        });
    }
}
