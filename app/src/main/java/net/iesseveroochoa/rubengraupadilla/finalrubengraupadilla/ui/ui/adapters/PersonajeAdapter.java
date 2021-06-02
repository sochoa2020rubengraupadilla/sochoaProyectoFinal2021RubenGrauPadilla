package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.utils.Utils;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {
    private List<Personaje> listaPersonajes;

    private OnItemPersonajeClickListener listener;

    public void setListaPersonajes(List<Personaje> personajes) {
        listaPersonajes = personajes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonajeAdapter.PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeAdapter.PersonajeViewHolder holder, int position) {
        if (listaPersonajes != null) {
            final Personaje personaje = listaPersonajes.get(position);
            holder.tvNombrePersonaje.setText(personaje.getNombre());
            Utils.cargaImagen(holder.ivPersonaje, personaje.getNombre());
            holder.personaje = personaje;
        }
    }

    @Override
    public int getItemCount() {
        if (listaPersonajes != null)
            return listaPersonajes.size();
        else return 0;
    }

    public class PersonajeViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPersonaje;
        private TextView tvNombrePersonaje;
        private CardView cvPersonaje;
        private Personaje personaje;

        public PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPersonaje = itemView.findViewById(R.id.ivPersonaje);
            tvNombrePersonaje = itemView.findViewById(R.id.tvNombrePersonaje);
            cvPersonaje = itemView.findViewById(R.id.cvItem);

            cvPersonaje.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onItemPersonajeClick(listaPersonajes.get(PersonajeViewHolder.this.getAdapterPosition()));
                }
            });
        }

        public Personaje getPersonaje() {
            return personaje;
        }
    }

    public interface OnItemPersonajeClickListener {
        void onItemPersonajeClick(Personaje personaje);
    }

    public void setOnItemPersonajeClickListener(OnItemPersonajeClickListener personajeClickListener) {
        this.listener = personajeClickListener;
    }

}
