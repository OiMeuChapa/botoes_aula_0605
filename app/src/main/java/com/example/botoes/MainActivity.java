package com.example.botoes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int Bazinga = 0;
    int BazingaUn =3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mais(View view){
    TextView textView = findViewById(R.id.batata);
    Bazinga++;
    textView.setText("Preco Bazinga: " + Bazinga);
}

    public void Menos(View view){
        TextView textView = findViewById(R.id.batata);



        if (Bazinga < 0){
            Toast.makeText(this , "Cafes n podem ser negativos" , Toast.LENGTH_SHORT).show();
        }else{
            Bazinga--;
            textView.setText("Preco Bazinga: " + Bazinga);
        }
    }

    public void Total(View view){

        TextView textView = findViewById(R.id.batata);
        Bazinga--;
        int BazingaTotal = BazingaUn*Bazinga;
        textView.setText("Preco Bazinga: " + BazingaTotal);

    }


}

