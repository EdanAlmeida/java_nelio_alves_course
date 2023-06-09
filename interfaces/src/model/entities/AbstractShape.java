package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
	//Interessante como o compilador entende que essa classe por ser abstrata não precisa
	//implementar o método de cálculo de área
	//fica entendido que somente as classes específicas que precisam ter o método

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}