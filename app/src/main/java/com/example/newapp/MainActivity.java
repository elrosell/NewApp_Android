package com.example.newapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editadito;
    Button botoncitol, botonciton, botoncitoi, botoncitop;
    TextView vistitita;
    Arreglito aobjetito = new Arreglito();
    ArrayList<Clasesita> aRegreso = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editadito = findViewById(R.id.edit1);

        botoncitol = findViewById(R.id.Local);
        botoncitoi = findViewById(R.id.Internacional);
        botonciton = findViewById(R.id.Nacional);
        botoncitop = findViewById(R.id.Pagar);

        botoncitol.setOnClickListener(this);
        botoncitoi.setOnClickListener(this);
        botonciton.setOnClickListener(this);
        botoncitop.setOnClickListener(this);

        vistitita = findViewById(R.id.resultado);

    }

    @Override
    public void onClick(View v) {
        String cadenita = ((Button)v).getText().toString();
        if (cadenita.equals("Local")){
            Clasesita objetito = new Clasesita();
            objetito.setTipo(1);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.setCosto(1 * Integer.parseInt(editadito.getText().toString()));
            aobjetito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        else
            if (cadenita.equals("Pagar")){                aRegreso = aobjetito.regresar();
                int apagar = 0;
                String cadenota = "";
                Toast.makeText(this, "Tiene: " + aRegreso.size()
                        , Toast.LENGTH_SHORT).show();
                int cuantos = aRegreso.size();
                for (int i = 0; i < cuantos; ++i){
                    cadenota = cadenota + "Tipo: " + aRegreso.get(i).getTipo() + "\t\t" +
                            "Duración: " + aRegreso.get(i).getDuracion() + "\t\t" +
                            "Costo: " + aRegreso.get(i).getCosto() + "\n";
                    apagar = apagar + aRegreso.get(i).getCosto();
                }
                cadenota = cadenota + "\n" + "gran total: " + apagar;
                vistitita.setText(cadenota);

            }
        if (cadenita.equals("Nacional")){
            Clasesita objetito = new Clasesita();
            objetito.setTipo(2);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.setCosto(2 * Integer.parseInt(editadito.getText().toString()));
            aobjetito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        else
            if (cadenita.equals("Pagar")){
                aRegreso = aobjetito.regresar();
                int apagar = 0;
                String cadenota = "";
                Toast.makeText(this, "Tiene: " + aRegreso.size()
                        , Toast.LENGTH_SHORT).show();
                int cuantos = aRegreso.size();
                for (int i = 0; i < cuantos; ++i){
                    cadenota = cadenota + "Tipo: " + aRegreso.get(i).getTipo() + "\t\t" +
                            "Duración: " + aRegreso.get(i).getDuracion() + "\t\t" +
                            "Costo: " + aRegreso.get(i).getCosto() + "\n";
                    apagar = apagar + aRegreso.get(i).getCosto();
                }
                cadenota = cadenota + "\n" + "gran total: " + apagar;
                vistitita.setText(cadenota);
            }
        if (cadenita.equals("Internacional")){
            Clasesita objetito = new Clasesita();
            objetito.setTipo(3);
            objetito.setDuracion(Integer.parseInt(editadito.getText().toString()));
            objetito.setCosto(3 * Integer.parseInt(editadito.getText().toString()));
            aobjetito.agregar(objetito);
            Toast.makeText(this, "agregado", Toast.LENGTH_SHORT).show();
        }
        else
            if (cadenita.equals("Pagar")){
                aRegreso = aobjetito.regresar();
                int apagar = 0;
                String cadenota = "";
                Toast.makeText(this, "Tiene: " + aRegreso.size()
                        , Toast.LENGTH_SHORT).show();
                int cuantos = aRegreso.size();
                for (int i = 0; i < cuantos; ++i){
                    cadenota = cadenota + "Tipo: " + aRegreso.get(i).getTipo() + "\t\t" +
                            "Duración: " + aRegreso.get(i).getDuracion() + "\t\t" +
                            "Costo: " + aRegreso.get(i).getCosto() + "\n";
                    apagar = apagar + aRegreso.get(i).getCosto();
                }
                cadenota = cadenota + "\n" + "gran total: " + apagar;
                vistitita.setText(cadenota);
            }
    }
}