package com.curso.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ejemplotwitter extends ListActivity{
	
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 
		 String[] from=new String[]{"nombre","user","twit","hora"};
		 int[] to=new int[]{R.id.nombre,R.id.user,R.id.twit,R.id.hora};
		 List dataMap =new ArrayList();
		 
		 HashMap map1=new HashMap();
		 map1.put("nombre", "nombre1");
		 map1.put("user", "user1");
		 map1.put("twit", "este es el primer twit");
		 map1.put("hora", "16:00");
		 
		 HashMap map2=new HashMap();
		 map2.put("nombre", "nombre2");
		 map2.put("user", "user2");
		 map2.put("twit", "este es el segundo twit");
		 map2.put("hora", "16:30");
		 
		 HashMap map3=new HashMap();
		 map3.put("nombre", "nombre3");
		 map3.put("user", "user3");
		 map3.put("twit", "este es el tercer twit");
		 map3.put("hora", "17:00");
		 
		 HashMap map4=new HashMap();
		 map4.put("nombre", "nombre4");
		 map4.put("user", "user4");
		 map4.put("twit", "este es el cuarto twit");
		 map4.put("hora", "16:15");
		 
		 dataMap.add(map1);
		 dataMap.add(map2);
		 dataMap.add(map3);
		 dataMap.add(map4);
		 
		 SimpleAdapter simpleAdapter=new SimpleAdapter(this,dataMap,R.layout.recuperarformulario,from,to);
		 this.setListAdapter(simpleAdapter);
	 }
		 
}