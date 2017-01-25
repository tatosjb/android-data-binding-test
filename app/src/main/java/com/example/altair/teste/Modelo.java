package com.example.altair.teste;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Altair on 25/01/2017.
 */

public class Modelo extends BaseObservable {
    private String teste;

    public Modelo(String teste) {
        this.teste = teste;
    }

    @Bindable
    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
        notifyPropertyChanged(BR.teste);
    }
}
