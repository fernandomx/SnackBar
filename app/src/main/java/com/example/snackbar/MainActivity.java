package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    private Button buttonAbrir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);
        buttonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Botao Pressionado", Snackbar.LENGTH_LONG).setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonAbrir.setText("Botao alterado");
                    }
                }) .show();    //recurso extra - dependência no gradle (module: app)
            // snackbar.dismiss() -> fecha uma snackba
                // snackbar.setActionTextColor(getResources().getColor(R.color.colorPrimary)) -> define a cor do botão da snackbar

            }
        });
    }

    public void abrirSnackBar(View view){


    }
}
