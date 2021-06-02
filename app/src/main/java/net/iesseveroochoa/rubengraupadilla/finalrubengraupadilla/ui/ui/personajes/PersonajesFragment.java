package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.personajes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.adapters.PersonajeAdapter;

public class PersonajesFragment extends Fragment {
    private RecyclerView rvPersonajes;
    private PersonajesViewModel personajesViewModel;
    private PersonajeAdapter personajeAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        personajesViewModel = new ViewModelProvider(this).get(PersonajesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_personajes, container, false);
        rvPersonajes = root.findViewById(R.id.rvPersonajes);
        return root;
    }
}