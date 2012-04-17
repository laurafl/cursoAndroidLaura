package com.curso.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CursoAndroidLauraActivity extends Activity {
    /** Called when the activity is first created. */
    TextView texto;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        texto =(TextView)findViewById(R.id.text1);
        getResources().getColor(R.color.blanco);
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
}