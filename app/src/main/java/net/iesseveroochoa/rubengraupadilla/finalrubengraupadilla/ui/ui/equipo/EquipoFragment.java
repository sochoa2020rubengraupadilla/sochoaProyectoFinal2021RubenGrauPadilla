package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.equipo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.VerPersonajeFragment;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.adapters.PersonajeAdapter;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.personajes.PersonajesFragment;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.personajes.PersonajesViewModel;

import java.util.List;

public class EquipoFragment extends Fragment {
    private RecyclerView rvEquipo;
    private EquipoViewModel equipoViewModel;
    private PersonajeAdapter personajeAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        equipoViewModel = new ViewModelProvider(this).get(EquipoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_equipo, container, false);
        rvEquipo = root.findViewById(R.id.rvEquipo);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        equipoViewModel = new ViewModelProvider(this).get(EquipoViewModel.class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        personajeAdapter = new PersonajeAdapter();
        rvEquipo.setHasFixedSize(true);
        rvEquipo.setLayoutManager(layoutManager);
        rvEquipo.setLayoutManager(new GridLayoutManager(requireContext(), 4));
        rvEquipo.setAdapter(personajeAdapter);
//mirar la query
        equipoViewModel = new ViewModelProvider(this).get(EquipoViewModel.class);
        equipoViewModel.getPersonajesEquipo().observe(getViewLifecycleOwner(), new
                Observer<List<Personaje>>() {
                    @Override
                    public void onChanged(List<Personaje> personajes) {
                        personajeAdapter.setListaPersonajes(equipoViewModel.getPersonajesEquipoList());
                        personajeAdapter.notifyDataSetChanged();
                    }
                });
        personajeAdapter.setOnItemPersonajeClickListener(personaje -> {
            Bundle argumentosBundle = new Bundle();
            argumentosBundle.putParcelable(VerPersonajeFragment.ARG_PERSONAJE, personaje);
            NavHostFragment.findNavController(EquipoFragment.this).navigate(R.id.verPersonajeFragment, argumentosBundle);
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
        itemTouchHelper.attachToRecyclerView(rvEquipo);
    }

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
                        equipoViewModel.insert(personaje);
                        personajeAdapter.notifyItemChanged(posicion);
                    }
                });
        dialogo.show();
    }

    private void defineDetectarFinRecycler() {
        rvEquipo.addOnScrollListener(new RecyclerView.OnScrollListener() {
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