
package br.com.chess;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import br.com.chess.bean.Bishop;
import br.com.chess.bean.Horse;
import br.com.chess.bean.King;
import br.com.chess.bean.Pawn;
import br.com.chess.bean.Piece;
import br.com.chess.bean.Queen;
import br.com.chess.bean.Square;
import br.com.chess.bean.Tower;
import br.com.chess.client.Client;
import br.com.chess.protocolo.Message;

//test

public class Main extends JPanel {
	/**
	 * @author Maiquel knechtel
	 */
	private static final long serialVersionUID = 1;

	private Client client;
	private Piece[][] chessboard;
	private List<Square> listSquare;
	private boolean playerOne;

	public Main(Client client) {
		this.setClient(client);
		playerOne = client.isPlayerOne();
		chessboard = new Piece[8][8];
		Session.setPlayerOne(playerOne);
		if (playerOne) {
			{
				Piece towerOne = new Tower();
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

				Piece towerTwo = new Tower();
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

				Piece towerOne = new Tower();
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

				Piece towerTwo = new Tower();
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
		} else {
			{
				Piece towerOne = new Tower();
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

				Piece towerTwo = new Tower();
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

				Piece towerOne = new Tower();
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

				Piece towerTwo = new Tower();
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

	}

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;
		listSquare = new ArrayList<Square>();
		int x = 0, y = 0;
		boolean ctl = true;
		for (int j = 0; j <= 7; j++) {
			x = 0;
			for (int i = 0; i <= 7; i++) {
				ctl = !ctl;
				if (ctl) {
					g2.setPaint(Color.gray);
					g2.fill(new Rectangle2D.Double(x, y, 50, 50));
					listSquare.add(new Square(x, y, Color.gray));
				} else {
					g2.setPaint(Color.white);
					g2.fill(new Rectangle2D.Double(x, y, 50, 50));
					listSquare.add(new Square(x, y, Color.white));
				}
				x += 50;
			}
			ctl = !ctl;
			y += 50;
		}
		
		if (playerOne) {
			fillChessbordBlack(g2);
		} else {
			fillChessbordWhite(g2);
		}

	}

	public void fillChessbordBlack(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
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

		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard.length; j++) {
				Piece piece = chessboard[i][j];
				if (piece != null) {
					if (piece instanceof Bishop) {
						if (piece.isEnemy()) {
							g.drawImage(imgBishopWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgBishopBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Horse) {
						if (piece.isEnemy()) {
							g.drawImage(imgHorseWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgHorseBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof King) {
						if (piece.isEnemy()) {
							g.drawImage(imgKingWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgKingBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Pawn) {
						if (piece.isEnemy()) {
							g.drawImage(imgPawnWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgPawnBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Queen) {
						if (piece.isEnemy()) {
							g.drawImage(imgQueenWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgQueenBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Tower) {
						if (piece.isEnemy()) {
							g.drawImage(imgTowerWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgTowerBlack, piece.getX(),
									piece.getY(), null);
						}
					}
				}
			}
		}
		g2.dispose();

	}

	public void fillChessbordWhite(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
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

		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard.length; j++) {
				Piece piece = chessboard[i][j];
				if (piece != null) {
					if (piece instanceof Bishop) {
						if (!piece.isEnemy()) {
							g.drawImage(imgBishopWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgBishopBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Horse) {
						if (!piece.isEnemy()) {
							g.drawImage(imgHorseWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgHorseBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof King) {
						if (!piece.isEnemy()) {
							g.drawImage(imgKingWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgKingBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Pawn) {
						if (!piece.isEnemy()) {
							g.drawImage(imgPawnWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgPawnBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Queen) {
						if (!piece.isEnemy()) {
							g.drawImage(imgQueenWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgQueenBlack, piece.getX(),
									piece.getY(), null);
						}
					} else if (piece instanceof Tower) {
						if (!piece.isEnemy()) {
							g.drawImage(imgTowerWhite, piece.getX(),
									piece.getY(), null);
						} else {
							g.drawImage(imgTowerBlack, piece.getX(),
									piece.getY(), null);
						}
					}
				}
			}
		}
		g2.dispose();

	}

	public Graphics2D getGraphics2d() {
		return (Graphics2D) getGraphics();
	}

	public static void main(String args[]) {

		Client client = new Client();

		JFrame f = null;
		try {
			// espera 2000 milliseconds
			// para dar tempo de definir o player 1
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Main main = new Main(client);
		client.setMain(main);

		if (Session.isPlayerOne()) {
			f = new JFrame("- jogar com as pe�as pretas -");
			Session.setFrame(f);

		} else {
			f = new JFrame("- Jogar com as Pe�as Brancas - ");
			Session.setFrame(f);

		}

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Main.closeConnection();
				System.exit(0);

			}
		});

		f.pack();
		// 440
		f.setSize(new Dimension(406, 428));
		 f.setResizable(false);
		f.setVisible(true);

		f.add(main);
		Handler h = new Handler(main);
		f.addMouseListener(h);
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public List<Square> getListSquare() {
		return listSquare;
	}

	public void setListSquare(List<Square> listSquare) {
		this.listSquare = listSquare;
	}

	public void setChessboard(Piece[][] chessboard) {
		this.chessboard = chessboard;
	}

	public Piece[][] getChessboard() {
		return chessboard;
	}

	public static void closeConnection() {
		Message dataMatrix = new Message();
		dataMatrix.setEndOfGame(true);
		
		Socket socketCliente = Client.getServSocket();
		ObjectOutputStream output;

		dataMatrix.setDestino(Session.getDestination());
		dataMatrix.setOrigem(Session.getOrigin());

		try {
			output = new ObjectOutputStream(socketCliente.getOutputStream());
			output.flush();
			output.writeObject(dataMatrix);
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
