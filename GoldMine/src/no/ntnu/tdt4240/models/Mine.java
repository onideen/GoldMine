package no.ntnu.tdt4240.models;

import android.graphics.Canvas;

public class Mine extends Cell {

	private String type = "mine";
	private boolean clicked;
	private Canvas image;
	
	Mine(Canvas image) {
		super(image);
		this.image=image;
		clicked=false;
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}