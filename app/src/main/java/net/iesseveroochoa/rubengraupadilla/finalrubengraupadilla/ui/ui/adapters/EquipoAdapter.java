package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.utils.Utils;

import java.util.List;

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {
    private List<Personaje> equipo;

    private OnItemPersonajeEquipoClickListener listener;

    public void setEquipo(List<Personaje> personajes) {
        equipo = personajes;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public EquipoAdapter.EquipoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje_equipo, parent, false);
        return new EquipoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull EquipoAdapter.EquipoViewHolder holder, int posicion) {
        if (equipo != null) {
            final Personaje personaje = equipo.get(posicion);
            holder.tvNombrePersonaje.setText(personaje.getNombre());
            Utils.cargaImagenEquipo(holder.ivPersonaje, personaje.getNombre());
            holder.personaje = personaje;
        }
    }

    @Override
    public int getItemCount() {
        if (equipo != null && equipo.size() <= 4)
            return equipo.size();
        else return 0;
    }

    public class EquipoViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPersonaje;
        private TextView tvNombrePersonaje;
        private CardView cvPersonaje;
        private Personaje personaje;

        public EquipoViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPersonaje = itemView.findViewById(R.id.ivPersonaje);
            tvNombrePersonaje = itemView.findViewById(R.id.tvNombrePersonaje);
            cvPersonaje = itemView.findViewById(R.id.cvItem);

            cvPersonaje.setOnClickListener(v -> {
                if (listener != null) {
                    listener.onItemPersonajeEquipoClick(equipo.get(EquipoViewHolder.this.getAdapterPosition()));
                }
            });

        }

        public Personaje getPersonaje() {
            return personaje;
        }
    }

    public interface OnItemPersonajeEquipoClickListener {
        void onItemPersonajeEquipoClick(Personaje personaje);
    }

    public void setOnItemPersonajeEquipoClickListener(OnItemPersonajeEquipoClickListener personajeEquipoClickListener) {
        this.listener = personajeEquipoClickListener;
    }
}
