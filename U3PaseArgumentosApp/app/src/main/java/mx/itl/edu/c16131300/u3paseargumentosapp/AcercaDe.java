package mx.itl.edu.c16131300.u3paseargumentosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acerca_de);
    }

    public void btnAtrasClick ( View v ) {
        Intent intent = new Intent( AcercaDe.this, MainActivity.class );
        startActivity( intent );
        finish();
    }
}