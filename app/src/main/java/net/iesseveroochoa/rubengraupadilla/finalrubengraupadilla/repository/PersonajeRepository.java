package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.PersonajeDao;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.PersonajeDataBase;

import java.util.List;

public class PersonajeRepository {

    private static volatile PersonajeRepository INSTANCE;

    private PersonajeDao mPersonajeDao;

    public static PersonajeRepository getInstance(Application application) {
        if (INSTANCE == null) {
            synchronized (PersonajeRepository.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PersonajeRepository(application);
                }
            }
        }
        return INSTANCE;
    }

    private PersonajeRepository(Application application) {
        PersonajeDataBase db = PersonajeDataBase.getDatabase(application);
        mPersonajeDao = db.personajeDao();
    }

    public LiveData<List<Personaje>> getAllPersonajes() {
        return mPersonajeDao.allPersonajes();
    }

    public LiveData<List<Personaje>> getPersonajesEquipo() {
        return mPersonajeDao.personajesEquipo();
    }

    public void insert(Personaje personaje) {
        PersonajeDataBase.executor.execute(() -> mPersonajeDao.insert(personaje));
    }

    public void delete(Personaje personaje) {
        PersonajeDataBase.executor.execute(() -> mPersonajeDao.deleteByPersonaje(personaje));
    }
}
