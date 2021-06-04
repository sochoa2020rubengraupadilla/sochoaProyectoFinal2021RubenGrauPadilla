package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.text.ParseException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Personaje.class}, version = 1)

public abstract class PersonajeDataBase extends RoomDatabase {
    public abstract PersonajeDao personajeDao();

    //BBDD
    private static volatile PersonajeDataBase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static PersonajeDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (PersonajeDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PersonajeDataBase.class, "personaje_database").addCallback(sRoomDatabaseCallback).build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new
            RoomDatabase.Callback() {
                @RequiresApi(api = Build.VERSION_CODES.N)
                @Override
                public void onCreate(@NonNull SupportSQLiteDatabase db) {
                    super.onCreate(db);
                    executor.execute(() -> cargaPersonajes());
                }

                @Override
                public void onOpen(@NonNull SupportSQLiteDatabase db) {
                    super.onOpen(db);
                }
            };

    @RequiresApi(api = Build.VERSION_CODES.N)
    private static void cargaPersonajes() {
        Personaje personaje;
        try {
            PersonajeDao mDao = INSTANCE.personajeDao();
            personaje = new Personaje("Albedo", "Geo", "Support", true);
            mDao.insert(personaje);
            personaje = new Personaje("Amber", "Pyro", "Support", true);
            mDao.insert(personaje);
            personaje = new Personaje("Barbara", "Hydro", "Healer", true);
            mDao.insert(personaje);
            personaje = new Personaje("Beidou", "Electro", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Bennet", "Pyro", "Utility", true);
            mDao.insert(personaje);
            personaje = new Personaje("Chongyun", "Cryo", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Diluc", "Pyro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Diona", "Cryo", "Utility", true);
            mDao.insert(personaje);
            personaje = new Personaje("Eula", "Cryo", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Fischl", "Electro", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Ganyu", "Cryo", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Hu Tao", "Pyro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Jean", "Anemo", "Utility", true);
            mDao.insert(personaje);
            personaje = new Personaje("Kaeya", "Cryo", "Support", true);
            mDao.insert(personaje);
            personaje = new Personaje("Keqing", "Electro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Klee", "Pyro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Lisa", "Electro", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Mona", "Hydro", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Ningguang", "Geo", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Noelle", "Geo", "Utility", true);
            mDao.insert(personaje);
            personaje = new Personaje("Qiqi", "Cryo", "Healer", true);
            mDao.insert(personaje);
            personaje = new Personaje("Razor", "Electro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Rosaria", "Cryo", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Sucrose", "Anemo", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Tartaglia", "Hydro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Venti", "Anemo", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Xiangling", "Pyro", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Xiao", "Anemo", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Xingqiu", "Hydro", "Sub DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Xinyan", "Pyro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Yanfei", "Pyro", "DPS", true);
            mDao.insert(personaje);
            personaje = new Personaje("Zhongli", "Geo", "Utility", true);
            mDao.insert(personaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
