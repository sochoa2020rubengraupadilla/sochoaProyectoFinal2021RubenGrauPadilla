package net.iesseveroochoa.rubengraupadilla.finalrubengraupadilla.model;

import android.provider.BaseColumns;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = Personaje.TABLE_NAME,
        indices = {@Index(value = {Personaje.NOMBRE}, unique = true)})
public class Personaje implements Parcelable {
    public static final String TABLE_NAME = "Personaje";
    public static final String ID = BaseColumns._ID;
    public static final String NOMBRE = "nombre";
    public static final String ELEMENTO = "elemento";
    public static final String ROL = "rol";
    public static final String EN_EQUIPO = "enEquipo";

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = ID)
    private int id;

    @ColumnInfo(name = NOMBRE)
    @NonNull
    private String nombre;

    @ColumnInfo(name = ELEMENTO)
    @NonNull
    private String elemento;

    @ColumnInfo(name = ROL)
    @NonNull
    private String rol;

    @ColumnInfo(name = EN_EQUIPO)
    @NonNull
    private boolean enEquipo;

    public Personaje(@NonNull String nombre, @NonNull String elemento, @NonNull String rol, @NonNull boolean enEquipo) {
        this.nombre = nombre;
        this.elemento = elemento;
        this.rol = rol;
        this.enEquipo = enEquipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    public boolean isEnEquipo() {
        return enEquipo;
    }

    public void setEnEquipo(@NonNull boolean enEquipo) {
        this.enEquipo = enEquipo;
    }

    @NonNull
    public String getElemento() {
        return elemento;
    }

    public void setElemento(@NonNull String elemento) {
        this.elemento = elemento;
    }

    @NonNull
    public String getRol() {
        return rol;
    }

    public void setRol(@NonNull String rol) {
        this.rol = rol;
    }

    //Parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombre);
        dest.writeBoolean(this.enEquipo);
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    protected Personaje(Parcel in) {
        this.id = in.readInt();
        this.nombre = in.readString();
        this.enEquipo = in.readBoolean();
    }

    public static final Parcelable.Creator<Personaje> CREATOR = new Parcelable.Creator<Personaje>() {
        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public Personaje createFromParcel(Parcel source) {
            return new Personaje(source);
        }

        @Override
        public Personaje[] newArray(int size) {
            return new Personaje[size];
        }
    };
}
