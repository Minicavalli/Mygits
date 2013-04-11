package se.mah.kd232b_cavalli_p_uppg2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyPlanetAdapter extends ArrayAdapter<String>{
	
	private Context context;
	private String[] values;

	public MyPlanetAdapter(Context context, String[] values) {
		
		super(context, R.layout.activity_main, values);
		this.context = context;
		this.values=values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflator = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
		
		View rowView=inflator.inflate(R.layout.activity_main, parent,false);
		
		TextView textView=(TextView)rowView.findViewById(R.id.textViewlable);
		ImageView imageView=(ImageView)rowView.findViewById(R.id.imageViewlogo);
		
		textView.setText(values[position]);
		
		String img = values[position];
		
		if (img.equalsIgnoreCase("Merkurius")){
		imageView.setImageResource(R.drawable.merkurius_planet);
		}else if(img.equalsIgnoreCase("Venus")){
			imageView.setImageResource(R.drawable.venus_planet);
		}else if(img.equalsIgnoreCase("Jorden")){
			imageView.setImageResource(R.drawable.jorden_planet);
		}else if(img.equalsIgnoreCase("Mars")){
			imageView.setImageResource(R.drawable.mars_planet);
		}else if(img.equalsIgnoreCase("Jupiter")){
			imageView.setImageResource(R.drawable.jupiter_planet);
		}else if(img.equalsIgnoreCase("Saturnus")){
			imageView.setImageResource(R.drawable.saturnus_planet);
		}else if(img.equalsIgnoreCase("Uranus")){
			imageView.setImageResource(R.drawable.uranus_planet);
		}else if(img.equalsIgnoreCase("Neptunus")){
			imageView.setImageResource(R.drawable.neptunus_planet);
		}else if(img.equalsIgnoreCase("Pluto")){
			imageView.setImageResource(R.drawable.pluto_planet);
			
		}
		
		
		return rowView;
	}

	
	
}
