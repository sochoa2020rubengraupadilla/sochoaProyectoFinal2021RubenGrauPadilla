package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.R;

public class MainActivity extends AppCompatActivity {
    private Button btMundoAbierto;
    private Button btAbismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMundoAbierto = findViewById(R.id.btMundoAbierto);
        btAbismo = findViewById(R.id.btAbismo);

        btMundoAbierto.setOnClickListener(v -> {
            Intent teamBuilder = new Intent(this, TeamBuildingActivity.class);
            startActivity(teamBuilder);
        });

        btAbismo.setOnClickListener(v -> {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.btAbyssNoDisponible, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 40);
            toast.show();
        });
    }
}