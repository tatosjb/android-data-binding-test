package com.example.altair.teste;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.tool.util.StringUtils;

import org.abego.treelayout.internal.util.java.util.ListUtil;

/**
 * Created by Altair on 26/01/2017.
 */

public class ModeloPresenter extends BaseObservable {
    private Modelo modelo;

    public ModeloPresenter(Modelo modelo) {
        this.modelo = modelo;
    }

    @Bindable
    public String getNome() {
        return modelo.getTeste();
    }

    public void setNome(String teste) {
        this.modelo.setTeste(teste);
        notifyPropertyChanged(BR._all);
    }
}
