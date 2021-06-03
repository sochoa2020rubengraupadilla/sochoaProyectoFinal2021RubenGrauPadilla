package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;

public class PopUp {

    public void showPopupWindow(final View view, Personaje p) {

        LayoutInflater inflater = (LayoutInflater) view.getContext().getSystemService(view.getContext().LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.ventana_build_recomendada, null);

        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;

        boolean focusable = true;

        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        TextView armas = popupView.findViewById(R.id.tvArmas);
        TextView artefactos = popupView.findViewById(R.id.tvArtefactos);
        TextView estadisticasABuscar = popupView.findViewById(R.id.tvEstadisticasABuscar);
        armas.setText(R.string.build_recomendada);

        String nombre = p.getNombre();

        switch (nombre) {
            case "Albedo":
                armas.setText(R.string.armas_albedo);
                artefactos.setText(R.string.artefactos_albedo);
                estadisticasABuscar.setText(R.string.estadisticas_albedo);
                break;
            case "Amber":
                armas.setText(R.string.armas_amber);
                artefactos.setText(R.string.artefactos_amber);
                estadisticasABuscar.setText(R.string.estadisticas_amber);
                break;
            case "Barbara":
                armas.setText(R.string.armas_barbara);
                artefactos.setText(R.string.artefactos_barbara);
                estadisticasABuscar.setText(R.string.estadisticas_barbara);
                break;
            case "Beidou":
                armas.setText(R.string.armas_beidou);
                artefactos.setText(R.string.artefactos_beidou);
                estadisticasABuscar.setText(R.string.estadisticas_beidou);
                break;
            case "Bennet":
                armas.setText(R.string.armas_bennet);
                artefactos.setText(R.string.artefactos_bennet);
                estadisticasABuscar.setText(R.string.estadisticas_bennet);
                break;
            case "Chongyun":
                armas.setText(R.string.armas_chongyun);
                artefactos.setText(R.string.artefactos_chongyun);
                estadisticasABuscar.setText(R.string.estadisticas_chongyun);
                break;
            case "Diluc":
                armas.setText(R.string.armas_diluc);
                artefactos.setText(R.string.artefactos_diluc);
                estadisticasABuscar.setText(R.string.estadisticas_diluc);
                break;
            case "Diona":
                armas.setText(R.string.armas_diona);
                artefactos.setText(R.string.artefactos_diona);
                estadisticasABuscar.setText(R.string.estadisticas_diona);
                break;
            case "Eula":
                armas.setText(R.string.armas_eula);
                artefactos.setText(R.string.artefactos_eula);
                estadisticasABuscar.setText(R.string.estadisticas_eula);
                break;
            case "Fischl":
                armas.setText(R.string.armas_fischl);
                artefactos.setText(R.string.artefactos_fischl);
                estadisticasABuscar.setText(R.string.estadisticas_fischl);
                break;
            case "Ganyu":
                armas.setText(R.string.armas_ganyu);
                artefactos.setText(R.string.artefactos_ganyu);
                estadisticasABuscar.setText(R.string.estadisticas_ganyu);
                break;
            case "Hu Tao":
                armas.setText(R.string.armas_hutao);
                artefactos.setText(R.string.artefactos_hutao);
                estadisticasABuscar.setText(R.string.estadisticas_hutao);
                break;
            case "Jean":
                armas.setText(R.string.armas_jean);
                artefactos.setText(R.string.artefactos_jean);
                estadisticasABuscar.setText(R.string.estadisticas_jean);
                break;
            case "Kaeya":
                armas.setText(R.string.armas_kaeya);
                artefactos.setText(R.string.artefactos_kaeya);
                estadisticasABuscar.setText(R.string.estadisticas_kaeya);
                break;
            case "Keqing":
                armas.setText(R.string.armas_keqing);
                artefactos.setText(R.string.artefactos_keqing);
                estadisticasABuscar.setText(R.string.estadisticas_keqing);
                break;
            case "Klee":
                armas.setText(R.string.armas_klee);
                artefactos.setText(R.string.artefactos_klee);
                estadisticasABuscar.setText(R.string.estadisticas_klee);
                break;
            case "Lisa":
                armas.setText(R.string.armas_lisa);
                artefactos.setText(R.string.artefactos_lisa);
                estadisticasABuscar.setText(R.string.estadisticas_lisa);
                break;
            case "Mona":
                armas.setText(R.string.armas_mona);
                artefactos.setText(R.string.artefactos_mona);
                estadisticasABuscar.setText(R.string.estadisticas_mona);
                break;
            case "Ningguang":
                armas.setText(R.string.armas_ningguang);
                artefactos.setText(R.string.artefactos_ningguang);
                estadisticasABuscar.setText(R.string.estadisticas_ningguang);
                break;
            case "Noelle":
                armas.setText(R.string.armas_noelle);
                artefactos.setText(R.string.artefactos_noelle);
                estadisticasABuscar.setText(R.string.estadisticas_noelle);
                break;
            case "Qiqi":
                armas.setText(R.string.armas_qiqi);
                artefactos.setText(R.string.artefactos_qiqi);
                estadisticasABuscar.setText(R.string.estadisticas_qiqi);
                break;
            case "Razor":
                armas.setText(R.string.armas_razor);
                artefactos.setText(R.string.artefactos_razor);
                estadisticasABuscar.setText(R.string.estadisticas_razor);
                break;
            case "Rosaria":
                armas.setText(R.string.armas_rosaria);
                artefactos.setText(R.string.artefactos_rosaria);
                estadisticasABuscar.setText(R.string.estadisticas_rosaria);
                break;
            case "Sucrose":
                armas.setText(R.string.armas_sacarosa);
                artefactos.setText(R.string.artefactos_sacarosa);
                estadisticasABuscar.setText(R.string.estadisticas_sacarosa);
                break;
            case "Tartaglia":
                armas.setText(R.string.armas_tartaglia);
                artefactos.setText(R.string.artefactos_tartaglia);
                estadisticasABuscar.setText(R.string.estadisticas_tartaglia);
                break;
            case "Venti":
                armas.setText(R.string.armas_venti);
                artefactos.setText(R.string.artefactos_venti);
                estadisticasABuscar.setText(R.string.estadisticas_venti);
                break;
            case "Xiangling":
                armas.setText(R.string.armas_xiangling);
                artefactos.setText(R.string.artefactos_xiangling);
                estadisticasABuscar.setText(R.string.estadisticas_xiangling);
                break;
            case "Xiao":
                armas.setText(R.string.armas_xiao);
                artefactos.setText(R.string.artefactos_xiao);
                estadisticasABuscar.setText(R.string.estadisticas_xiao);
                break;
            case "Xingqiu":
                armas.setText(R.string.armas_xingqiu);
                artefactos.setText(R.string.artefactos_xingqiu);
                estadisticasABuscar.setText(R.string.estadisticas_xingqiu);
                break;
            case "Xinyan":
                armas.setText(R.string.armas_xinyan);
                artefactos.setText(R.string.artefactos_xinyan);
                estadisticasABuscar.setText(R.string.estadisticas_xinyan);
                break;
            case "Yanfei":
                armas.setText(R.string.armas_yanfei);
                artefactos.setText(R.string.artefactos_yanfei);
                estadisticasABuscar.setText(R.string.estadisticas_yanfei);
                break;
            case "Zhongli":
                armas.setText(R.string.armas_zhongli);
                artefactos.setText(R.string.artefactos_zhongli);
                estadisticasABuscar.setText(R.string.estadisticas_zhongli);
                break;
            default:
                armas.setText(R.string.armas);
                artefactos.setText(R.string.artefactos);
                estadisticasABuscar.setText(R.string.estadisticas_a_buscar);
        }
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }

}
