package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.PopUp;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.equipo.EquipoViewModel;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.utils.Utils;

public class VerEquipoFragment extends Fragment {

    public static final String ARG_EQUIPO = "VerEquipoFragment.personaje";

    EquipoViewModel equipoViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ver_equipo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btBuildRecomendada;
        Button btQuitarDelEquipo;
        ImageView ivPersonajeBackground;
        Personaje personaje;
        btBuildRecomendada = view.findViewById(R.id.btBuild);
        btQuitarDelEquipo = view.findViewById(R.id.btQuitarDelEquipo);
        ivPersonajeBackground = view.findViewById(R.id.ivBackgroundPersonaje);
        personaje = getArguments().getParcelable(ARG_EQUIPO);
        Utils.cargaImagenBackground(ivPersonajeBackground, personaje.getNombre());
        btBuildRecomendada.setOnClickListener(v -> {
            PopUp ventana = new PopUp();
            ventana.showPopupWindow(view, personaje);
        });
        btQuitarDelEquipo.setOnClickListener(v -> {
            personaje.setEnEquipo(false);
            equipoViewModel.update(personaje);
        });
    }
}