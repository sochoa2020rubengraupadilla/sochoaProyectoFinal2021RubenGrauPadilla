package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.utils;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;


import androidx.core.content.ContextCompat;


import com.bumptech.glide.Glide;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;

public class Utils {
    public static void cargaImagen(ImageView imageView, String nombre) {
        Drawable imagen;
        switch (nombre) {
            case "Albedo":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_albedo_personajes);
                break;
            case "Amber":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_amber_personajes);
                break;
            case "Barbara":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_barbara_personajes);
                break;
            case "Beidou":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_beidou_personajes);
                break;
            case "Bennet":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_bennet_personajes);
                break;
            case "Chongyun":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_chongyun_personajes);
                break;
            case "Diluc":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_diluc_personajes);
                break;
            case "Diona":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_diona_personajes);
                break;
            case "Eula":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_eula_personajes);
                break;
            case "Fischl":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_fischl_personajes);
                break;
            case "Ganyu":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_ganyu_personajes);
                break;
            case "Hu Tao":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_hutao_personajes);
                break;
            case "Jean":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_jean_personajes);
                break;
            case "Kaeya":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_kaeya_personajes);
                break;
            case "Keqing":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_keqing_personajes);
                break;
            case "Klee":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_klee_personajes);
                break;
            case "Lisa":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_lisa_personajes);
                break;
            case "Mona":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_mona_personajes);
                break;
            case "Ningguang":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_ningguang_personajes);
                break;
            case "Noelle":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_noelle_personajes);
                break;
            case "Qiqi":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_qiqi_personajes);
                break;
            case "Razor":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_razor_personajes);
                break;
            case "Rosaria":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_rosaria_personajes);
                break;
            case "Sucrose":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_sucrose_personajes);
                break;
            case "Tartaglia":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_tartaglia_personajes);
                break;
            case "Venti":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_venti_personajes);
                break;
            case "Xiangling":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_xiangling_personajes);
                break;
            case "Xiao":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_xiao_personajes);
                break;
            case "Xingqiu":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_xingqiu_personajes);
                break;
            case "Xinyan":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_xinyian_personajes);
                break;
            case "Yanfei":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_yanfei_personajes);
                break;
            case "Zhongli":
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_zhongli_personajes);
                break;
            default:
                imagen = ContextCompat.getDrawable(imageView.getContext(), R.drawable.icono_equipo);
        }
        Glide
                .with(imageView.getContext())
                .load(imagen)
                .error(R.drawable.error)
                .into(imageView);
    }

    public static void cargaImagenBackground(ImageView imageView, String nombre) {
        Drawable background;
        switch (nombre) {
            case "Albedo":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.albedo_background);
                break;
            case "Amber":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.amber_background);
                break;
            case "Barbara":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.barbara_background);
                break;
            case "Beidou":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.beidou_background);
                break;
            case "Bennet":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.bennet_background);
                break;
            case "Chongyun":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.chongyun_background);
                break;
            case "Diluc":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.diluc_background);
                break;
            case "Diona":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.diona_background);
                break;
            case "Eula":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.eula_background);
                break;
            case "Fischl":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.fischl_background);
                break;
            case "Ganyu":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ganyu_background);
                break;
            case "Hu Tao":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.hutao_background);
                break;
            case "Jean":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.jean_background);
                break;
            case "Kaeya":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.kaeya_background);
                break;
            case "Keqing":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.keqing_background);
                break;
            case "Klee":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.klee_background);
                break;
            case "Lisa":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.lisa_background);
                break;
            case "Mona":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.mona_background);
                break;
            case "Ningguang":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ningguang_background);
                break;
            case "Noelle":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.noelle_background);
                break;
            case "Qiqi":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.qiqi_background);
                break;
            case "Razor":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.razor_background);
                break;
            case "Rosaria":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.rosaria_background);
                break;
            case "Sucrose":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.sucrose_background);
                break;
            case "Tartaglia":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.tartaglia_background);
                break;
            case "Venti":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.venti_background);
                break;
            case "Xiangling":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xiangling_background);
                break;
            case "Xiao":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xiao_background);
                break;
            case "Xingqiu":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xingqiu_background);
                break;
            case "Xinyan":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xinyan_background);
                break;
            case "Yanfei":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.yanfei_background);
                break;
            case "Zhongli":
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.zhongli_background);
                break;
            default:
                background = ContextCompat.getDrawable(imageView.getContext(), R.drawable.default_background);
        }
        Glide
                .with(imageView.getContext())
                .load(background)
                .error(R.drawable.error)
                .into(imageView);
    }

    public static void cargaImagenEquipo(ImageView imageView, String nombre) {
        Drawable imagenEquipo;
        switch (nombre) {
            case "Albedo":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.albedo_equipo);
                break;
            case "Amber":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.amber_equipo);
                break;
            case "Barbara":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.barbara_equipo);
                break;
            case "Beidou":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.beidou_equipo);
                break;
            case "Bennet":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.bennet_equipo);
                break;
            case "Chongyun":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.chongyun_equipo);
                break;
            case "Diluc":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.diluc_equipo);
                break;
            case "Diona":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.diona_equipo);
                break;
            case "Eula":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.eula_equipo);
                break;
            case "Fischl":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.fischl_equipo);
                break;
            case "Ganyu":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ganyu_equipo);
                break;
            case "Hu Tao":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.hutao_equipo);
                break;
            case "Jean":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.jean_equipo);
                break;
            case "Kaeya":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.kaeya_equipo);
                break;
            case "Keqing":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.keqing_equipo);
                break;
            case "Klee":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.klee_equipo);
                break;
            case "Lisa":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.lisa_equipo);
                break;
            case "Mona":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.mona_equipo);
                break;
            case "Ningguang":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.ningguang_equipo);
                break;
            case "Noelle":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.noelle_equipo);
                break;
            case "Qiqi":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.qiqi_equipo);
                break;
            case "Razor":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.razor_equipo);
                break;
            case "Rosaria":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.rosaria_equipo);
                break;
            case "Sucrose":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.sucrose_equipo);
                break;
            case "Tartaglia":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.tartaglia_equipo);
                break;
            case "Venti":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.venti_equipo);
                break;
            case "Xiangling":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xiangling_equipo);
                break;
            case "Xiao":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xiao_equipo);
                break;
            case "Xingqiu":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xingqiu_equipo);
                break;
            case "Xinyan":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.xinyan_equipo);
                break;
            case "Yanfei":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.yanfei_equipo);
                break;
            case "Zhongli":
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.zhongli_equipo);
                break;
            default:
                imagenEquipo = ContextCompat.getDrawable(imageView.getContext(), R.drawable.albedo_equipo);
        }
        Glide
                .with(imageView.getContext())
                .load(imagenEquipo)
                .error(R.drawable.error)
                .into(imageView);
    }
}
