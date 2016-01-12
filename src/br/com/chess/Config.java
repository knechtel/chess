package br.com.chess;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import br.com.chess.bean.Bishop;
import br.com.chess.bean.Horse;
import br.com.chess.bean.King;
import br.com.chess.bean.Pawn;
import br.com.chess.bean.Piece;
import br.com.chess.bean.Queen;
import br.com.chess.bean.Tower;

public class Config {

	public void doConfig() {

	}

	static void drawPiecePossibleChoice(Piece piece2, Graphics2D g) {
		BufferedImage imgPawnWhite = null;
		BufferedImage imgHorseWhite = null;
		BufferedImage imgBishopWhite = null;
		BufferedImage imgTowerWhite = null;
		BufferedImage imgQueenWhite = null;
		BufferedImage imgKingWhite = null;

		BufferedImage imgPawnBlack = null;
		BufferedImage imgHorseBlack = null;
		BufferedImage imgBishopBlack = null;
		BufferedImage imgTowerBlack = null;
		BufferedImage imgQueenBlack = null;
		BufferedImage imgKingBlack = null;

		try {
			imgTowerWhite = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "towerWhite.png"));
			imgPawnWhite = ImageIO.read(new File(System.getProperty("user.dir")
					+ "/img/" + "pawnWhite.png"));
			imgHorseWhite = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "horseWhite.png"));
			imgBishopWhite = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "bishopWhite.png"));
			imgTowerWhite = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "towerWhite.png"));
			imgQueenWhite = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "QueenWhite.png"));
			imgKingWhite = ImageIO.read(new File(System.getProperty("user.dir")
					+ "/img/" + "kingWhite.png"));
			// Black
			imgPawnBlack = ImageIO.read(new File(System.getProperty("user.dir")
					+ "/img/" + "pawnBlack.png"));
			imgHorseBlack = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "horseBlack.png"));
			imgBishopBlack = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "bishopBlack.png"));
			imgTowerBlack = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "towerBlack.png"));
			imgQueenBlack = ImageIO.read(new File(System
					.getProperty("user.dir") + "/img/" + "queenBlack.png"));
			imgKingBlack = ImageIO.read(new File(System.getProperty("user.dir")
					+ "/img/" + "kingBlack.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (piece2 != null) {
			if (piece2 instanceof Bishop) {
				if (Session.isPlayerOne()) {
					g.drawImage(imgBishopWhite, piece2.getX(), piece2.getY(),
							null);
				} else {
					g.drawImage(imgBishopBlack, piece2.getX(), piece2.getY(),
							null);
				}
			} else if (piece2 instanceof Horse) {
				if (Session.isPlayerOne()) {
					g.drawImage(imgHorseWhite, piece2.getX(), piece2.getY(),
							null);
				} else {
					g.drawImage(imgHorseBlack, piece2.getX(), piece2.getY(),
							null);
				}
			} else if (piece2 instanceof King) {
				if (Session.isPlayerOne()) {
					g.drawImage(imgKingWhite, piece2.getX(), piece2.getY(),
							null);
				} else {
					g.drawImage(imgKingBlack, piece2.getX(), piece2.getY(),
							null);
				}
			} else if (piece2 instanceof Pawn) {
				if (Session.isPlayerOne()) {
					g.drawImage(imgPawnWhite, piece2.getX(), piece2.getY(),
							null);
				} else {
					g.drawImage(imgPawnBlack, piece2.getX(), piece2.getY(),
							null);
				}
			} else if (piece2 instanceof Queen) {
				if (Session.isPlayerOne()) {
					g.drawImage(imgQueenWhite, piece2.getX(), piece2.getY(),
							null);
				} else {
					g.drawImage(imgQueenBlack, piece2.getX(), piece2.getY(),
							null);
				}
			} else if (piece2 instanceof Tower) {
				if (Session.isPlayerOne()) {
					g.drawImage(imgTowerWhite, piece2.getX(), piece2.getY(),
							null);
				} else {
					g.drawImage(imgTowerBlack, piece2.getX(), piece2.getY(),
							null);
				}

				
			}
		}
	}

}
