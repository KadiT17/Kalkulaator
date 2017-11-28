package com.example.opilane.kalkulaator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText oprl, opr2;
    private Button Lahuta, Liita, Jaga, Korruta, Kustutada;
    private TextView tulemus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.activity_main);
        oprl = (EditText) findViewById(R.id.editOP1);
        oprl = (EditText) findViewById(R.editOp2);
        Liita = (Button) findViewById(R.id.liita);
        Lahuta = (Button) findViewById(R.id.Lahuta);
        Korruta = (Button) findViewById(R.id.Korruta);
        Jaga = (Button) findViewById(R.id.jaga);

        Liita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((oprl).getText().length() > 0) &&(opr2.getText().length() > 0)){
                    double oper1 = Double.parseDouble(oprl.getText().toString());
                    double oper2 = Double.parseDouble(opr2).getText().toString());
                    double tulem = oper1 + oper2;
                    tulemus.setText(Double.toString(tulemus));
                }
                else{
                    Toast toast = toast
                }
            }
        });

    }
}
