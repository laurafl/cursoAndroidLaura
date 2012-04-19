package com.curso.android;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class buscaractivity extends Activity{
	
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.ejtelefono);
		 findViewById(R.id.botbuscar).setOnClickListener(callClickListener);
			
	    }
	 OnClickListener callClickListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				/*llamar y busqueda
				 * //TextView tel=(TextView)findViewById(R.id.tel);
				Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
				intent.putExtra(SearchManager.QUERY, "Busqueda");
				//intent.setData(Uri.parse("tel:+"+tel.getText().toString()));
				startActivity(intent);*/
				
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("geo:42.135391,-0.403331"));
				startActivity(intent);

			}
		};
}