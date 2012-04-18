package com.curso.android;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class pantallaFormularioActivity extends Activity{
	
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
			setContentView(R.layout.recuperarformulario);
			Bundle extras = getIntent().getExtras();
			String nombre = extras.getString("NOMBRE");
			String apellidos = extras.getString("APELLIDOS");
			String pais = extras.getString("COUNTRY");
			
			((TextView) findViewById(R.id.nombre)).setText(extras.getString("NOMBRE"));
			((TextView) findViewById(R.id.apellidos)).setText(extras.getString("APELLIDOS"));
			((TextView) findViewById(R.id.ciudad)).setText(extras.getString("COUNTRY"));
			
	    }
}