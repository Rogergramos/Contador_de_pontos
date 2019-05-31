package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalPontoA = 0;
    int totalPontoB = 0;

    int totalSoma3 = 3;
    int totalSoma6 = 6;
    int totalSoma9 = 9;
    int totalSoma12 = 12;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable background = getDrawable(R.drawable.truco);
        background.setAlpha(80);

        pontoA();
        pontoB();
    }

    private void pontoA() {

        Button aSoma = findViewById(R.id.botaoASoma);
        Button aSub = findViewById(R.id.botaoAsub);
        Button soma3 = findViewById(R.id.botao3soma);
        Button soma6 = findViewById(R.id.botao6soma);
        Button soma9 = findViewById(R.id.botao9soma);
        Button soma12 = findViewById(R.id.botao12soma);
        final TextView pontoA = findViewById(R.id.pontoA);

        aSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPontoA >= 0 && totalPontoA <= 11) {
                    totalPontoA++;
                    pontoA.setText("" + totalPontoA);
                }
            }
        });
        aSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPontoA >= 1) {
                    totalPontoA--;
                    pontoA.setText("" + totalPontoA);
                }
            }
        });
        soma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPontoA >= 0 && totalPontoA <= 10) {
                    totalPontoA = totalPontoA + totalSoma3;

                    pontoA.setText(""+ totalPontoA);
                }
            }
        });
    }

    private void pontoB() {

        Button bSoma = findViewById(R.id.botaoBSoma);
        Button bSub = findViewById(R.id.botaoBSub);
        final TextView pontoB = findViewById(R.id.pontoB);

        bSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPontoB >= 0 && totalPontoB <= 11) {
                    totalPontoB++;
                    pontoB.setText("" + totalPontoB);
                }
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (totalPontoB >= 1) {
                    totalPontoB--;
                    pontoB.setText("" + totalPontoB);
                }
            }
        });
    }

}