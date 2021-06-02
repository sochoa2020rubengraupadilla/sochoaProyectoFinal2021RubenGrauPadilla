package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.personajes;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.VerPersonajeFragment;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.adapters.PersonajeAdapter;

import java.util.Date;
import java.util.List;

public class PersonajesFragment extends Fragment {
    private RecyclerView rvPersonajes;
    private PersonajesViewModel personajesViewModel;
    private PersonajeAdapter personajeAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        personajesViewModel = new ViewModelProvider(this).get(PersonajesViewModel.class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        personajeAdapter = new PersonajeAdapter();
        rvPersonajes.setHasFixedSize(true);
        rvPersonajes.setLayoutManager(layoutManager);

        rvPersonajes.setAdapter(personajeAdapter);

        personajesViewModel = new ViewModelProvider(this).get(PersonajesViewModel.class);
        personajesViewModel.getAllPersonajes().observe(getViewLifecycleOwner(), new
                Observer<List<Personaje>>() {
                    @Override
                    public void onChanged(List<Personaje> personajes) {
                        personajeAdapter.setListaPersonajes(personajesViewModel.getAllPersonajeList());
                        personajeAdapter.notifyDataSetChanged();
                    }
                });
        personajeAdapter.setOnItemPersonajeClickListener(personaje -> {
            Bundle argumentosBundle = new Bundle();
            argumentosBundle.putParcelable(VerPersonajeFragment.ARG_PERSONAJE, personaje);
            NavHostFragment.findNavController(PersonajesFragment.this).navigate(R.id.verPersonajeFragment, argumentosBundle);
        });
        definirEventoSwiper();
    }

    private void definirEventoSwiper() {
        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new
                ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT |
                        ItemTouchHelper.RIGHT) {
                    @Override
                    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                        return false;
                    }

                    @Override
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                        PersonajeAdapter.PersonajeViewHolder vhPersonaje = (PersonajeAdapter.PersonajeViewHolder) viewHolder;
                        Personaje personaje = vhPersonaje.getPersonaje();
                        anyadirAlEquipo(personaje, vhPersonaje.getAdapterPosition());
                    }
                };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(rvPersonajes);
    }

    //Método que añade un pokemon a favoritos
    private void anyadirAlEquipo(Personaje personaje, int posicion) {
        AlertDialog.Builder dialogo = new AlertDialog.Builder(getContext());
        dialogo.setTitle(R.string.aviso);
        dialogo.setMessage("Desea añadir el personaje al equipo?");
        dialogo.setNegativeButton(android.R.string.cancel, new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        personajeAdapter.notifyItemChanged(posicion);
                    }
                });
        dialogo.setPositiveButton(android.R.string.ok, new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        personajesViewModel.insert(personaje);
                        personajeAdapter.notifyItemChanged(posicion);
                    }
                });
        dialogo.show();
    }

    private void defineDetectarFinRecycler() {
        rvPersonajes.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if ((!recyclerView.canScrollVertically(1)) && (newState == RecyclerView.SCROLL_STATE_IDLE)) {
                    Log.v("scroll", "fin recyclerview");
                }
            }
        });
    }
}