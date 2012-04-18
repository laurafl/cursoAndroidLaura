package com.curso.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CursoAndroidLauraActivity extends Activity implements OnItemSelectedListener {
	/** Called when the activity is first created. */
	TextView texto;
	Spinner spinner;
	String country="";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		texto =(TextView)findViewById(R.id.text1);
		getResources().getColor(R.color.blanco);
		spinner =(Spinner)findViewById(R.id.spinner);
		generateSpinerValues();
	}
	public void click(View view) {
		texto.setText("esta aplicación se autodestruirá");
		Log.e("AUTODES", "Esta aplicación se autodestruirá...");
		//findViewById(R.id.text1)
		LinearLayout linLay=(LinearLayout)texto.getParent();
		linLay.setBackgroundColor(Color.BLUE);
	}
	public void clickEnviar(View view) {
		texto=(TextView)findViewById(R.id.text1);
		TextView msg=(TextView) findViewById(R.id.text2);
		msg.setText(texto.getText().toString());
	}
	public void clickBorrar(View view) {
		TextView msg=(TextView)findViewById(R.id.text1);

	}

	public void clickEnv(View view) {
		//para el formulario
		Toast.makeText(CursoAndroidLauraActivity.this.getApplication(), "Se ha enviado la solicitud", Toast.LENGTH_LONG).show();

		Intent intent=new Intent(CursoAndroidLauraActivity.this.getApplication(), pantallaFormularioActivity.class);
		TextView nombre=(TextView)findViewById(R.id.nombre);
		intent.putExtra("NOMBRE",nombre.getText().toString());
		TextView apellidos=(TextView)findViewById(R.id.apellidos);
		intent.putExtra("APELLIDOS",apellidos.getText().toString());
		intent.putExtra("COUNTRY",country);
		startActivity(intent);
	}

	private void generateSpinerValues(){

		ArrayAdapter<CharSequence> adapter=
				ArrayAdapter.createFromResource(this, R.array.ciudades, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);


	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View arg1, int position,
			long arg3) {
		country=parent.getItemAtPosition(position).toString();
		Log.e("COUNTRY", country);

	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		country="no item";
	}

	public boolean onCreateOptionsMenu(Menu menu){

		MenuItem item=null;
		item=menu.add(this.getString(R.string.info));
		item.setIcon(android.R.drawable.ic_dialog_info);
		return super.onCreateOptionsMenu(menu);

	}

	public boolean onMenuItemSelected(int featureId, MenuItem item){

		if(item.getTitle().equals(this.getString(R.string.info))){
			new AlertDialog.Builder(CursoAndroidLauraActivity.this).setTitle("Información").setMessage("Mensaje de prueba").setNeutralButton("ok", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					// Hacer algo cuando se pulsta el boton del dialog

				}
			}).show();
	}

	return super.onMenuItemSelected(featureId, item);
}
}