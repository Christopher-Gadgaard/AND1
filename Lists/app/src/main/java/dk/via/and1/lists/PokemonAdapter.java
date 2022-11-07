package dk.via.and1.lists;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {

    List<Pokemon> pokemons;
    OnListClickListener listener;

    public PokemonAdapter(List<Pokemon> pokemons, OnListClickListener listener) {
        this.pokemons = pokemons;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PokemonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.pokemon_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.ViewHolder holder, int position) {
        holder.PokemonName.setText(pokemons.get(position).getName());
        holder.PokemonNo.setText(pokemons.get(position).getNo());
    }

    @Override
    public int getItemCount() {
      return pokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView PokemonName;
        TextView PokemonNo;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(view -> listener.onClick(pokemons.get(getBindingAdapterPosition())));
            PokemonName = itemView.findViewById(R.id.PokemonName);
            PokemonNo = itemView.findViewById(R.id.PokemonNo);
        }
    }

    public interface OnListClickListener{
        void onClick(Pokemon pokemon);
    }
}
