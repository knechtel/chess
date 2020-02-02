package br.com.chess;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import br.com.chess.bean.*;
import br.com.chess.bean.Rook;

public class Config {

	public static void doConfigPlayerOne() {
		Piece[][] chessboard =  Session.getCheessBoard();
		{
			Piece towerOne = new Rook();
			towerOne.setX(5);
			towerOne.setY(5);
			towerOne.setEnemy(true);
			chessboard[0][0] = towerOne;

			Piece horseOne = new Horse();
			horseOne.setX(55);
			horseOne.setY(5);
			horseOne.setEnemy(true);
			chessboard[1][0] = horseOne;

			Piece bishopOne = new Bishop();
			bishopOne.setX(105);
			bishopOne.setY(5);
			bishopOne.setEnemy(true);
			chessboard[2][0] = bishopOne;

			Piece king = new King();
			king.setX(155);
			king.setY(5);
			king.setEnemy(true);
			chessboard[3][0] = king;

			Piece queen = new Queen();
			queen.setX(205);
			queen.setY(5);
			queen.setEnemy(true);
			chessboard[4][0] = queen;

			Piece bishopTwo = new Bishop();
			bishopTwo.setX(255);
			bishopTwo.setY(5);
			bishopTwo.setEnemy(true);
			chessboard[5][0] = bishopTwo;

			Piece horseTwo = new Horse();
			horseTwo.setX(305);
			horseTwo.setY(5);
			horseTwo.setEnemy(true);
			chessboard[6][0] = horseTwo;

			Piece towerTwo = new Rook();
			towerTwo.setX(355);
			towerTwo.setY(5);
			towerTwo.setEnemy(true);
			chessboard[7][0] = towerTwo;

			Piece pawnOne = new Pawn();
			pawnOne.setX(5);
			pawnOne.setY(55);
			pawnOne.setEnemy(true);
			chessboard[0][1] = pawnOne;

			Piece pawnTwo = new Pawn();
			pawnTwo.setX(55);
			pawnTwo.setY(55);
			pawnTwo.setEnemy(true);
			chessboard[1][1] = pawnTwo;

			Piece pawnThree = new Pawn();
			pawnThree.setX(105);
			pawnThree.setY(55);
			pawnThree.setEnemy(true);
			chessboard[2][1] = pawnThree;

			Piece pawnFour = new Pawn();
			pawnFour.setX(155);
			pawnFour.setY(55);
			pawnFour.setEnemy(true);
			chessboard[3][1] = pawnFour;

			Piece pawnFive = new Pawn();
			pawnFive.setX(205);
			pawnFive.setY(55);
			pawnFive.setEnemy(true);
			chessboard[4][1] = pawnFive;

			Piece pawnSix = new Pawn();
			pawnSix.setX(255);
			pawnSix.setY(55);
			pawnSix.setEnemy(true);
			chessboard[5][1] = pawnSix;

			Piece pawnSeven = new Pawn();
			pawnSeven.setX(305);
			pawnSeven.setY(55);
			pawnSeven.setEnemy(true);
			chessboard[6][1] = pawnSeven;

			Piece pawnEight = new Pawn();
			pawnEight.setX(355);
			pawnEight.setY(55);
			pawnEight.setEnemy(true);
			chessboard[7][1] = pawnEight;

		}

		{

			Piece towerOne = new Rook();
			towerOne.setX(5);
			towerOne.setY(355);
			chessboard[0][7] = towerOne;

			Piece horseOne = new Horse();
			horseOne.setX(55);
			horseOne.setY(355);
			chessboard[1][7] = horseOne;

			Piece bishopOne = new Bishop();
			bishopOne.setX(105);
			bishopOne.setY(355);
			chessboard[2][7] = bishopOne;

			Piece king = new King();
			king.setX(155);
			king.setY(355);
			chessboard[3][7] = king;

			Piece queen = new Queen();
			queen.setX(205);
			queen.setY(355);
			chessboard[4][7] = queen;

			Piece bishopTwo = new Bishop();
			bishopTwo.setX(255);
			bishopTwo.setY(355);
			chessboard[5][7] = bishopTwo;

			Piece horseTwo = new Horse();
			horseTwo.setX(305);
			horseTwo.setY(355);
			chessboard[6][7] = horseTwo;

			Piece towerTwo = new Rook();
			towerTwo.setX(355);
			towerTwo.setY(355);
			chessboard[7][7] = towerTwo;

			Piece pawnOne = new Pawn();
			pawnOne.setX(5);
			pawnOne.setY(305);
			chessboard[0][6] = pawnOne;

			Piece pawnTwo = new Pawn();
			pawnTwo.setX(55);
			pawnTwo.setY(305);
			chessboard[1][6] = pawnTwo;

			Piece pawnThree = new Pawn();
			pawnThree.setX(105);
			pawnThree.setY(305);
			chessboard[2][6] = pawnThree;

			Piece pawnFour = new Pawn();
			pawnFour.setX(155);
			pawnFour.setY(305);
			chessboard[3][6] = pawnFour;

			Piece pawnFive = new Pawn();
			pawnFive.setX(205);
			pawnFive.setY(305);
			chessboard[4][6] = pawnFive;

			Piece pawnSix = new Pawn();
			pawnSix.setX(255);
			pawnSix.setY(305);
			chessboard[5][6] = pawnSix;

			Piece pawnSeven = new Pawn();
			pawnSeven.setX(305);
			pawnSeven.setY(305);
			chessboard[6][6] = pawnSeven;

			Piece pawnEight = new Pawn();
			pawnEight.setX(355);
			pawnEight.setY(305);
			chessboard[7][6] = pawnEight;

		}


	}

	public static void doConfigPlayerTwo(){
		Piece[][] chessboard =  Session.getCheessBoard();
		{
			Piece towerOne = new Rook();
			towerOne.setX(5);
			towerOne.setY(5);

			chessboard[0][0] = towerOne;

			Piece horseOne = new Horse();
			horseOne.setX(55);
			horseOne.setY(5);

			chessboard[1][0] = horseOne;

			Piece bishopOne = new Bishop();
			bishopOne.setX(105);
			bishopOne.setY(5);

			chessboard[2][0] = bishopOne;

			Piece king = new King();
			king.setX(155);
			king.setY(5);

			chessboard[3][0] = king;

			Piece queen = new Queen();
			queen.setX(205);
			queen.setY(5);

			chessboard[4][0] = queen;

			Piece bishopTwo = new Bishop();
			bishopTwo.setX(255);
			bishopTwo.setY(5);

			chessboard[5][0] = bishopTwo;

			Piece horseTwo = new Horse();
			horseTwo.setX(305);
			horseTwo.setY(5);

			chessboard[6][0] = horseTwo;

			Piece towerTwo = new Rook();
			towerTwo.setX(355);
			towerTwo.setY(5);

			chessboard[7][0] = towerTwo;

			Piece pawnOne = new Pawn();
			pawnOne.setX(5);
			pawnOne.setY(55);

			chessboard[0][1] = pawnOne;

			Piece pawnTwo = new Pawn();
			pawnTwo.setX(55);
			pawnTwo.setY(55);

			chessboard[1][1] = pawnTwo;

			Piece pawnThree = new Pawn();
			pawnThree.setX(105);
			pawnThree.setY(55);

			chessboard[2][1] = pawnThree;

			Piece pawnFour = new Pawn();
			pawnFour.setX(155);
			pawnFour.setY(55);

			chessboard[3][1] = pawnFour;

			Piece pawnFive = new Pawn();
			pawnFive.setX(205);
			pawnFive.setY(55);

			chessboard[4][1] = pawnFive;

			Piece pawnSix = new Pawn();
			pawnSix.setX(255);
			pawnSix.setY(55);

			chessboard[5][1] = pawnSix;

			Piece pawnSeven = new Pawn();
			pawnSeven.setX(305);
			pawnSeven.setY(55);

			chessboard[6][1] = pawnSeven;

			Piece pawnEight = new Pawn();
			pawnEight.setX(355);
			pawnEight.setY(55);

			chessboard[7][1] = pawnEight;

		}

		{

			Piece towerOne = new Rook();
			towerOne.setX(5);
			towerOne.setY(355);
			towerOne.setEnemy(true);
			chessboard[0][7] = towerOne;

			Piece horseOne = new Horse();
			horseOne.setX(55);
			horseOne.setY(355);
			horseOne.setEnemy(true);
			chessboard[1][7] = horseOne;

			Piece bishopOne = new Bishop();
			bishopOne.setX(105);
			bishopOne.setY(355);
			bishopOne.setEnemy(true);
			chessboard[2][7] = bishopOne;

			Piece king = new King();
			king.setX(155);
			king.setY(355);
			king.setEnemy(true);
			chessboard[3][7] = king;

			Piece queen = new Queen();
			queen.setX(205);
			queen.setY(355);
			queen.setEnemy(true);
			chessboard[4][7] = queen;

			Piece bishopTwo = new Bishop();
			bishopTwo.setX(255);
			bishopTwo.setY(355);
			bishopTwo.setEnemy(true);
			chessboard[5][7] = bishopTwo;

			Piece horseTwo = new Horse();
			horseTwo.setX(305);
			horseTwo.setY(355);
			horseTwo.setEnemy(true);
			chessboard[6][7] = horseTwo;

			Piece towerTwo = new Rook();
			towerTwo.setX(355);
			towerTwo.setY(355);
			towerTwo.setEnemy(true);
			chessboard[7][7] = towerTwo;

			Piece pawnOne = new Pawn();
			pawnOne.setX(5);
			pawnOne.setY(305);
			pawnOne.setEnemy(true);
			chessboard[0][6] = pawnOne;

			Piece pawnTwo = new Pawn();
			pawnTwo.setX(55);
			pawnTwo.setY(305);
			pawnTwo.setEnemy(true);
			chessboard[1][6] = pawnTwo;

			Piece pawnThree = new Pawn();
			pawnThree.setX(105);
			pawnThree.setY(305);
			pawnThree.setEnemy(true);
			chessboard[2][6] = pawnThree;

			Piece pawnFour = new Pawn();
			pawnFour.setX(155);
			pawnFour.setY(305);
			pawnFour.setEnemy(true);
			chessboard[3][6] = pawnFour;

			Piece pawnFive = new Pawn();
			pawnFive.setX(205);
			pawnFive.setY(305);
			pawnFive.setEnemy(true);
			chessboard[4][6] = pawnFive;

			Piece pawnSix = new Pawn();
			pawnSix.setX(255);
			pawnSix.setY(305);
			pawnSix.setEnemy(true);
			chessboard[5][6] = pawnSix;

			Piece pawnSeven = new Pawn();
			pawnSeven.setX(305);
			pawnSeven.setY(305);
			pawnSeven.setEnemy(true);
			chessboard[6][6] = pawnSeven;

			Piece pawnEight = new Pawn();
			pawnEight.setX(355);
			pawnEight.setY(305);
			pawnEight.setEnemy(true);
			chessboard[7][6] = pawnEight;

		}


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
			} else if (piece2 instanceof Rook) {
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
