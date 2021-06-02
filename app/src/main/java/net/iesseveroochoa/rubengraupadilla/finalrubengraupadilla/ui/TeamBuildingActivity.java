package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;

public class TeamBuildingActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_building);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_equipo, R.id.nav_personajes)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.team_building, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}


//Para cuando haga falta


//switch(nombre){
//        case"Albedo":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_albedo_personajes);
//        break;
//        case"Amber":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_amber_personajes);
//        break;
//        case"Barbara":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_barbara_personajes);
//        break;
//        case"Beidou":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_beidou_personajes);
//        break;
//        case"Bennet":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_bennet_personajes);
//        break;
//        case"Chongyun":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_chongyun_personajes);
//        break;
//        case"Diluc":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_diluc_personajes);
//        break;
//        case"Diona":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_diona_personajes);
//        break;
//        case"Eula":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_eula_personajes);
//        break;
//        case"Fischl":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_fischl_personajes);
//        break;
//        case"Ganyu":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_ganyu_personajes);
//        break;
//        case"Hu Tao":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_hutao_personajes);
//        break;
//        case"Jean":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_jean_personajes);
//        break;
//        case"Kaeya":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_kaeya_personajes);
//        break;
//        case"Keqing":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_keqing_personajes);
//        break;
//        case"Klee":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_klee_personajes);
//        break;
//        case"Lisa":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_lisa_personajes);
//        break;
//        case"Mona":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_mona_personajes);
//        break;
//        case"Ningguang":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_ningguang_personajes);
//        break;
//        case"Noelle":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_noelle_personajes);
//        break;
//        case"Qiqi":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_qiqi_personajes);
//        break;
//        case"Razor":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_razor_personajes);
//        break;
//        case"Rosaria":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_rosaria_personajes);
//        break;
//        case"Sucrose":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_sucrose_personajes);
//        break;
//        case"Tartaglia":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_tartaglia_personajes);
//        break;
//        case"Venti":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_venti_personajes);
//        break;
//        case"Xiangling":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_xiangling_personajes);
//        break;
//        case"Xiao":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_xiao_personajes);
//        break;
//        case"Xingqiu":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_xingqiu_personajes);
//        break;
//        case"Xinyan":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_xinyian_personajes);
//        break;
//        case"Yanfei":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_yanfei_personajes);
//        break;
//        case"Zhongli":
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.ic_zhongli_personajes);
//        break;
//default:
//        imagen=ContextCompat.getDrawable(imageView.getContext(),R.drawable.icono_equipo);
//        }