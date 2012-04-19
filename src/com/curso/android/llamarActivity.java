package com.curso.android;

import android.app.Activity;
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

public class llamarActivity extends Activity{
	
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.ejtelefono);
		 findViewById(R.id.botbuscar).setOnClickListener(callClickListener);
			
	    }
	 OnClickListener callClickListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				TextView tel=(TextView)findViewById(R.id.tel);
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:+"+tel.getText().toString()));
				startActivity(intent);

			}
		};
}