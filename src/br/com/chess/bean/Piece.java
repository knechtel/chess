package br.com.chess.bean;

import java.io.Serializable;

public class Piece implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer x;
	private Integer y;
	private boolean enemy;
	
	
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
	public void setEnemy(boolean enemy) {
		this.enemy = enemy;
	}
	public boolean isEnemy() {
		return enemy;
	}

	

}
