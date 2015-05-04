package br.com.chess.bean;

import java.awt.Color;

public class Square {
	private Integer x;
	private Integer y;
	private Color color;
	
	
	public Square(Integer x, Integer y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Color getColor() {
		return color;
	}
	
	

}
