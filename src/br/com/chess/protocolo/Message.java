package br.com.chess.protocolo;

import java.io.Serializable;
import java.util.List;

import br.com.chess.bean.Piece;
import br.com.chess.bean.Player;
import br.com.chess.bean.Point;

public class Message implements Serializable {


	/**
	 * @author Maiquel knechtel
	 */
	private static final long serialVersionUID = 1L;
	
	private Player player;
	private Point newPoint;
	private Point lastPoint;
	private boolean start;
	private boolean black;
	private boolean endOfGame;
	private boolean xequemate;
	private Piece piece;
	private List<Piece> listForPromotionPlayerOne;
	private List<Piece> listForPromotionPlayerTwo;
	
	private Integer origem;
	private Integer destino;
	

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public boolean isStart() {
		return start;
	}

	public void setDestino(Integer destino) {
		this.destino = destino;
	}

	public Integer getDestino() {
		return destino;
	}

	public void setOrigem(Integer origem) {
		this.origem = origem;
	}

	public Integer getOrigem() {
		return origem;
	}

	public static void main(String[] args) {
		Message message = new Message();
		System.out.println(message.getOrigem());
	}

	public void setNewPoint(Point newPoint) {
		this.newPoint = newPoint;
	}

	public Point getNewPoint() {
		return newPoint;
	}

	public void setLastPoint(Point lastPoint) {
		this.lastPoint = lastPoint;
	}

	public Point getLastPoint() {
		return lastPoint;
	}

	public void setBlack(boolean black) {
		this.black = black;
	}

	public boolean isBlack() {
		return black;
	}

	public void setListForPromotionPlayerOne(
			List<Piece> listForPromotionPlayerOne) {
		this.listForPromotionPlayerOne = listForPromotionPlayerOne;
	}

	public List<Piece> getListForPromotionPlayerOne() {
		return listForPromotionPlayerOne;
	}

	public void setListForPromotionPlayerTwo(
			List<Piece> listForPromotionPlayerTwo) {
		this.listForPromotionPlayerTwo = listForPromotionPlayerTwo;
	}

	public List<Piece> getListForPromotionPlayerTwo() {
		return listForPromotionPlayerTwo;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setEndOfGame(boolean endOfGame) {
		this.endOfGame = endOfGame;
	}

	public boolean isEndOfGame() {
		return endOfGame;
	}

	public void setXequemate(boolean xequemate) {
		this.xequemate = xequemate;
	}

	public boolean isXequemate() {
		return xequemate;
	}


}
