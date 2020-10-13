package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay;
    String operador;
    Double N1, N2, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

   public void Cero (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"0");
    }
    public void Uno (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"1");
        }
    public void Dos (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void Tres (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void Cuatro (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"4");
    }
    public void Cinco (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"5");
    }
    public void Seis (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"6");
    }
    public void Siete (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"7");
    }
    public void Ocho (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"8");
    }
    public void Nueve (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+"9");
    }
    public void Punto (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText(tvdisplay.getText()+".");
    }
    public void OnClickOperacionCaptureNumero1 (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        N1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText("");
    }
    public void Sumar(View View){
        operador="+";
        OnClickOperacionCaptureNumero1(View);
    }
    public void Multiplicacion(View View){
        operador="*";
        OnClickOperacionCaptureNumero1(View);
    }
    public void Restar(View View){
        operador="-";
        OnClickOperacionCaptureNumero1(View);
    }
    public void Division (View View){
        operador="/";
        OnClickOperacionCaptureNumero1(View);
    }
    public void Clean (View View){
        if (tvdisplay.getText().toString().equals("")){
            tvdisplay.setText(tvdisplay.getText().subSequence(0,tvdisplay.getText().length()-1)+"");
            }
    }
    public void Borrar (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        tvdisplay.setText("");
    }
    public void Igual (View View){
        tvdisplay=(TextView) findViewById(R.id.Etiqueta);
        N2=Double.parseDouble(tvdisplay.getText().toString());
        if (operador.equals("+")){
            res=N1+N2;
        }else if (operador.equals("-")){
            res=N1-N2;
        }else if (operador.equals("*")){
            res=N1*N2;
        }else if (operador.equals("/")){
            res=N1/N2;
        }
        tvdisplay.setText(""+res);
    }

}
