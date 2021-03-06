package com.example.altair.teste;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.altair.teste.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ModeloPresenter modelo = new ModeloPresenter(new Modelo("Test"));
        binding.setTeste(modelo);
        binding.setHandlers(new OnClickButton());
    }
}
