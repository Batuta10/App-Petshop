package br.com.fiap.rm78792.desafio2.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Inicializa os Componetes na class(this)
    RadioGroup rgRaca;
    CheckBox chBoxFemea;
    CheckBox chBoxAdestrado;
    CheckBox chBoxVacina;
    TextView txtResutado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Para Remover a bara de estatos na activity
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Referenciando os componentes da view na class(this).
        rgRaca = (RadioGroup)findViewById(R.id.rgRaca);
        txtResutado = (TextView)findViewById(R.id.txtResutado);
        chBoxFemea = (CheckBox)findViewById(R.id.chBoxFemea);
        chBoxAdestrado = (CheckBox)findViewById(R.id.chBoxAdestrado);
        chBoxVacina = (CheckBox)findViewById(R.id.chBoxVacina);
    }
    public void calcular(View v){
        //Inicializando as Variaves
        double valor = 0;
        double custo = 0;

        //Pega o id que esta selecionado na view.
        int radioC = rgRaca.getCheckedRadioButtonId();

        //If Encadeado para valida e atribuir o valor dos cachorros.
        if(radioC == R.id.rbCollie){
            valor = 800.00;
            txtResutado.setText("R$ " + valor);
        }else if(radioC == R.id.rbPit){
            valor = 750.00;
            txtResutado.setText("R$ " + valor);
        }else if(radioC == R.id.rbAlemao){
            valor = 700.00;
            txtResutado.setText("R$ " + valor);
        }else if(radioC == R.id.rbCanadense){
            valor = 800.00;
            txtResutado.setText("R$ " + valor);
        }else{
            valor = 000.00;
            txtResutado.setText("R$ " + valor);
        }

        //If que verifica se o CheckBox esta selecionado, Atribuir os custo que sera usado no valor final (cachoro + itemdoCheckBox).
        if(chBoxFemea.isChecked()){
            custo = 180.00;
            valor += custo;
            txtResutado.setText("R$ " + valor);
        }
        if(chBoxAdestrado.isChecked()){
            custo = 400.00;
            valor += custo;
            txtResutado.setText("R$ " + valor);
        }
        if(chBoxVacina.isChecked()){
            custo = 200.00;
            valor += custo;
            txtResutado.setText("R$ " + valor);
        }
        //If Verifica de os checkBox nao estao marcados
        if (chBoxFemea.isChecked() == false && chBoxAdestrado.isChecked() == false && chBoxVacina.isChecked() == false){
            custo = 0;
            valor += custo;
            txtResutado.setText("R$ " + valor);
        }
    }//Metodo Calcular
}//Class