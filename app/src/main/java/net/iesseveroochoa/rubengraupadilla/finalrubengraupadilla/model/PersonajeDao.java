package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonajeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Personaje personaje);

    @Delete
    void deleteByPersonaje(Personaje personaje);

    @Query("DELETE FROM " + Personaje.TABLE_NAME)
    void deleteAll();

    @Update
    void update(Personaje personaje);

    @Query("SELECT * FROM " + Personaje.TABLE_NAME + " ORDER BY " + Personaje.NOMBRE)
    LiveData<List<Personaje>> allPersonajes();

    @Query("SELECT * FROM " + Personaje.TABLE_NAME + " WHERE " + Personaje.EN_EQUIPO + " = 'true'")
    LiveData<List<Personaje>> personajesEquipo();
}
