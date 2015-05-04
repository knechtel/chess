package br.com.chess.bean;

import java.io.Serializable;

public class Point implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer x;
	private Integer y;
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getX() {
		return x;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getY() {
		return y;
	}

}
