package com.example.altair.teste;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;

import io.realm.RealmModel;
import io.realm.RealmObject;

/**
 * Created by Altair on 25/01/2017.
 */

public class Modelo extends RealmObject {
    private String teste;

    public Modelo() {
    }

    public Modelo(String teste) {
        this.teste = teste;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }
}
