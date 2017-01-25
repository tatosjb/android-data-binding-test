package com.example.altair.teste;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.example.altair.teste.databinding.ActivityMainBinding;

/**
 * Created by Altair on 25/01/2017.
 */

public class OnClickButton {
    public void onClickButton(Modelo modelo){
        modelo.setTeste(modelo.getTeste().concat(", mais um"));
        System.out.println(modelo.getTeste());
    }
}
