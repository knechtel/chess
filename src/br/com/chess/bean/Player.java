package br.com.chess.bean;

import java.io.Serializable;

public class Player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nickname;
	private String computerName;

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}

	public String getComputerName() {
		return computerName;
	}
}
