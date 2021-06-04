package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.ui.ui.personajes;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model.Personaje;
import net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.repository.PersonajeRepository;

import java.util.List;

public class PersonajesViewModel extends AndroidViewModel {
    private PersonajeRepository mRepository;
    private LiveData<List<Personaje>> mAllPersonajes;

    public PersonajesViewModel(@NonNull Application application) {
        super(application);
        mRepository = PersonajeRepository.getInstance(application);
        mAllPersonajes = mRepository.getAllPersonajes();
    }

    public LiveData<List<Personaje>> getAllPersonajes() {
        return mAllPersonajes;
    }

    public List<Personaje> getAllPersonajeList() {
        return mAllPersonajes.getValue();
    }

    public void insert(Personaje personaje) {
        mRepository.insert(personaje);
    }

    public void delete(Personaje personaje) {
        mRepository.delete(personaje);
    }

    public void update(Personaje personaje) {
        mRepository.update(personaje);
    }
}