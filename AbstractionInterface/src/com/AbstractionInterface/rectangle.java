package com.AbstractionInterface;

public class rectangle extends Shape{
	
	private float width,height;
	
	
	public rectangle() {
		this.width=5.0f;
		this.height=4.0f;
	}


	public rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	void calArea()
	{
		area=width*height;
	}

}
