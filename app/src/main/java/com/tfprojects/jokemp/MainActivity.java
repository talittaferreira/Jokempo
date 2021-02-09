package com.tfprojects.jokemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void selecionadoPedra(View view){
            this.opcaoSelecionada("pedra");
        }

        public void selecionadoPapel(View view){
            this.opcaoSelecionada("papel");
        }

        public void selecionadoTesoura(View view){
            this.opcaoSelecionada("tesoura");
        }


        public void opcaoSelecionada(String opcaoSelecionada){

        ImageView ImagemResult = findViewById(R.id.Result);
            TextView textoResult = findViewById(R.id.txtResult);

            System.out.println( "item clicado: " + opcaoSelecionada );
            int numero = new Random().nextInt(3);
            String[] opçoes ={"pedra", "papel", "tesoura"};
            String opcaoApp = opçoes[numero];

            switch (opcaoApp) {
                case "pedra":
                    ImagemResult.setImageResource(R.drawable.pedra);
                    break;
                case "papel":
                    ImagemResult.setImageResource(R.drawable.papel);
                    break;
                case "tesoura":
                    ImagemResult.setImageResource(R.drawable.tesoura);
                    break;
            }
                    if((opcaoApp == "tesoura" && opcaoSelecionada == "papel") ||
                            (opcaoApp == "papel" && opcaoSelecionada == "pedra") ||
                             (opcaoApp == "pedra" && opcaoSelecionada == "tesoura")) {
                        textoResult.setText("Voce perdeu :(");
                    } else if((opcaoSelecionada == "tesoura" && opcaoApp == "papel") ||
                            (opcaoSelecionada == "papel" && opcaoApp == "pedra") ||
                            (opcaoSelecionada == "pedra" && opcaoApp == "tesoura")){
                        textoResult.setText("Voce ganhou :D");
                    }
                    else{
                        textoResult.setText("Empatamos ;)");
                    }
            }
}
