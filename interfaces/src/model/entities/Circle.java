package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {
	//Essa classe passa a herdar de AbstractShape e, por consequência, da interface Shape

	private Double radius;

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
