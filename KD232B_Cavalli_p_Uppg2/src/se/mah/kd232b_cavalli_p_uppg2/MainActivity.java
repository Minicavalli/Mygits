package se.mah.kd232b_cavalli_p_uppg2;

import android.os.Bundle;

import android.app.ListActivity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ListActivity implements OnItemClickListener{

	String [] Planeter = new String []{ "Merkurius", "Venus", "Jorden", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus", "Pluto", "Solen" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new MyPlanetAdapter(this, Planeter));
		
		ListView listView=getListView();
		listView.setOnItemClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View arg1, int position, long arg3) {
	
		String ord=adapter.getItemAtPosition(position).toString();
		Toast.makeText(MainActivity.this, "Du klickade på: "+ord, Toast.LENGTH_SHORT).show();
		
	}
	  
	
}
	
