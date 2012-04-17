package com.curso.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class CursoAndroidLauraActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void click(View view) {
    	Log.e("AUTODES", "Esta aplicación se autodestruirá...");
    }
}