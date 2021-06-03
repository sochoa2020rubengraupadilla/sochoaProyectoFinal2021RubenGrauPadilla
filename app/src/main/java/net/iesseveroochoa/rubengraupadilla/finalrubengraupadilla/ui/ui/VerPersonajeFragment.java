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
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.utils.Utils;

public class VerPersonajeFragment extends Fragment {

    public static final String ARG_PERSONAJE = "VerPersonajeFragment.personaje";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ver_personaje, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btBuildRecomendada;
        ImageView ivPersonajeBackground;
        Personaje personaje;
        btBuildRecomendada = view.findViewById(R.id.btBuild);
        ivPersonajeBackground = view.findViewById(R.id.ivBackgroundPersonaje);
        personaje = getArguments().getParcelable(ARG_PERSONAJE);
        Utils.cargaImagenBackground(ivPersonajeBackground, personaje.getNombre());
        btBuildRecomendada.setOnClickListener(v -> {
            PopUp ventana = new PopUp();
            ventana.showPopupWindow(view, personaje);
        });
    }
}