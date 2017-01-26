package com.example.altair.teste;

/**
 * Created by Altair on 25/01/2017.
 */

public class OnClickButton {
    public void onClickButton(ModeloPresenter modelo){
        modelo.setNome(modelo.getNome().concat(", mais um"));
        System.out.println(modelo.getNome());
    }
}
