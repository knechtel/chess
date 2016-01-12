package br.com.chess;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import br.com.chess.bean.Bishop;
import br.com.chess.bean.Horse;
import br.com.chess.bean.King;
import br.com.chess.bean.Pawn;
import br.com.chess.bean.Piece;
import br.com.chess.bean.Point;
import br.com.chess.bean.Queen;
import br.com.chess.bean.Square;
import br.com.chess.bean.Tower;
import br.com.chess.client.Client;
import br.com.chess.protocolo.Message;
import br.com.chess.util.Util;

public class Handler implements MouseListener {

	private Main main;
	private List<Integer> listIndexPossibleChoices;
	private Piece pieceMove;
	private boolean xequemate = false;

	public Handler(Main main) {
		this.main = main;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

		int x = arg0.getX();
		int y = arg0.getY();

		if (Session.getCont() == 1) {
			Session.setFirstTime(true);
		} else {
			Session.setFirstTime(false);
		}

		if (Session.isEnableFrame()) {

			Point pointIndex = Util.getIndex(x, y);

			if (pointIndex != null) {

				if (listIndexPossibleChoices != null) {
					checkPossibleChoices(pointIndex);
				} else {
					doChoice(pointIndex);
				}
			}
		}
	}

	private void doChoice(Point pointIndex) {

		Piece[][] chessbord = main.getChessboard();
		Piece p = chessbord[pointIndex.getX()][pointIndex.getY()];
		if (p != null) {
			if (!p.isEnemy()) {
				movePiece(p,pointIndex);
			}
		}
	}

	private void movePiece(Piece p,Point pointIndex) {
		Piece[][] chessbord = main.getChessboard();
		Bishop b = null;
		Horse h = null;
		King k = null;
		Pawn pwn = null;
		Queen q = null;
		Tower t = null;
		
		if (p instanceof Bishop) {
			b = (Bishop) p;

			List<Integer> listPositions = b.move(pointIndex.getX(),
					pointIndex.getY(), chessbord);
			// clearChoices();

			paintChoices(b, pointIndex.getX(), pointIndex.getY(),
					listPositions);
			pieceMove = b;
		} else if (p instanceof Horse) {
			h = (Horse) p;
			List<Integer> listPositions = h.move(pointIndex.getX(),
					pointIndex.getY(), chessbord);
			// clearChoices();
			paintChoices(h, pointIndex.getX(), pointIndex.getY(),
					listPositions);
			pieceMove = h;
		} else if (p instanceof King) {
			k = (King) p;
			List<Integer> listPositions = k.move(pointIndex.getX(),
					pointIndex.getY(), chessbord);
			// clearChoices();
			paintChoices(k, pointIndex.getX(), pointIndex.getY(),
					listPositions);
			pieceMove = k;
		} else if (p instanceof Pawn) {
			pwn = (Pawn) p;
			List<Integer> listPositions = pwn.move(pointIndex.getX(),
					pointIndex.getY(), chessbord);
			// clearChoices();
			paintChoices(pwn, pointIndex.getX(), pointIndex.getY(),
					listPositions);
			pieceMove = pwn;

		} else if (p instanceof Queen) {
			q = (Queen) p;

			List<Integer> listPositions = q.move(pointIndex.getX(),
					pointIndex.getY(), chessbord);
			// clearChoices();
			paintChoices(q, pointIndex.getX(), pointIndex.getY(),
					listPositions);
			pieceMove = q;
		} else if (p instanceof Tower) {
			t = (Tower) p;
			List<Integer> listPositions = t.move(pointIndex.getX(),
					pointIndex.getY(), chessbord);
			paintChoices(t, pointIndex.getX(), pointIndex.getY(),
					listPositions);
			pieceMove = t;

		}

		
	}

	private void checkPossibleChoices(Point pointIndex) {

		for (int i = 0; i < listIndexPossibleChoices.size(); i++) {

			if (i + 1 <= listIndexPossibleChoices.size()) {
				int xx = listIndexPossibleChoices.get(i);
				int yy = listIndexPossibleChoices.get(++i);

				if (pointIndex.getX() == xx && pointIndex.getY() == yy) {

					Point position = Util.parseIndexToPosition(xx, yy);
					int remove_x = pieceMove.getX();
					int remove_y = pieceMove.getY();

					pieceMove.setX(position.getX());
					pieceMove.setY(position.getY());

					Point pointRemove = Util.parsePositionToIndex(remove_x,
							remove_y);

					Piece[][] chess2 = main.getChessboard();

					Piece newPiece = chess2[xx][yy];

					Bishop b = null;
					Horse h = null;
					Queen q = null;
					Tower t = null;
					@SuppressWarnings("unused")
					King k = null;
					if (newPiece instanceof Bishop) {
						b = (Bishop) newPiece;
					} else if (newPiece instanceof Horse) {
						h = (Horse) newPiece;
					} else if (newPiece instanceof Queen) {
						q = (Queen) newPiece;
					} else if (newPiece instanceof Tower) {
						t = (Tower) newPiece;
					} else if (newPiece instanceof King) {
						k = (King) newPiece;
						xequemate = true;
					}

					if (b != null) {
						if (Session.isPlayerOne()) {
							Session.getListForPromotionPlayerTwo().add(b);
						} else {
							Session.getListForPromotionPlayerOne().add(b);
						}
					} else if (h != null) {
						if (Session.isPlayerOne()) {
							Session.getListForPromotionPlayerTwo().add(h);
						} else {
							Session.getListForPromotionPlayerOne().add(h);
						}

					} else if (q != null) {
						if (Session.isPlayerOne()) {
							Session.getListForPromotionPlayerTwo().add(q);
						} else {
							Session.getListForPromotionPlayerOne().add(q);
						}
					} else if (t != null) {
						if (Session.isPlayerOne()) {
							Session.getListForPromotionPlayerTwo().add(t);
						} else {
							Session.getListForPromotionPlayerOne().add(t);
						}
					}

					// anula posi��o antiga da pe�a
					chess2[pointRemove.getX()][pointRemove.getY()] = null;
					main.paint(main.getGraphics());

					doPaint(pieceMove, position.getX(), position.getY());

					// atualiza o tabuleiro
					Point p = Util.parsePositionToIndex(position.getX(),
							position.getY());

					Piece[][] chess = main.getChessboard();

					chess[p.getX()][p.getY()] = pieceMove;
					Piece peca = pieceMove;
					clearChoices();
					// verifica se � o caso da promo��o de um pe�o
					if (Session.isPlayerOne()) {
						if (pieceMove instanceof Pawn) {
							if (p.getY() == 0) {
								if (Session.getListForPromotionPlayerTwo()
										.size() >= 1) {

									// promoçao de peão

									System.out
											.println("Promove>>>>>>>>>>>>>>>>>>>");
									ComboBoxDemo combo = new ComboBoxDemo(this);
									pieceMove.setEnemy(pieceMove.isEnemy());
									Session.setPieceMove(pieceMove);
									Session.setPoint(p);
									Session.setPointRemove(pointRemove);
									combo.createAndShowGUI();
								} else {
									enviaPeca(
											peca,
											pointRemove,
											p,
											Session.getListForPromotionPlayerTwo(),
											xequemate);
								}
								Session.setEnableFrame(false);
								listIndexPossibleChoices = null;
								break;
							}
						}
					} else {
						if (pieceMove instanceof Pawn) {
							if (p.getY() == 7) {
								if (Session.getListForPromotionPlayerOne()
										.size() >= 1) {
									System.out.println("promove >>>>>>>");

									ComboBoxDemo combo = new ComboBoxDemo(this);
									pieceMove.setEnemy(pieceMove.isEnemy());
									Session.setPieceMove(pieceMove);
									Session.setPoint(p);
									Session.setPointRemove(pointRemove);
									combo.createAndShowGUI();
								} else {
									enviaPeca(
											peca,
											pointRemove,
											p,
											Session.getListForPromotionPlayerOne(),
											xequemate);
								}
								listIndexPossibleChoices = null;
								Session.setEnableFrame(false);
								break;
							}
						}
					}

					listIndexPossibleChoices = null;
					if (Session.isPlayerOne()) {
						enviaPeca(peca, pointRemove, p,
								Session.getListForPromotionPlayerTwo(),
								xequemate);
					} else {
						enviaPeca(peca, pointRemove, p,
								Session.getListForPromotionPlayerOne(),
								xequemate);
					}

					if (xequemate) {
						JOptionPane.showMessageDialog(null,
								"Xequemate, fim de jogo!");
						Main.closeConnection();
					}
					Session.setEnableFrame(false);
					break;

				} else {
					Piece[][] chessbordTwo = main.getChessboard();
					Piece pTwo = chessbordTwo[pointIndex.getX()][pointIndex
							.getY()];

					if (pTwo != null) {
						// se a posi��o selecionada retorna uma pe�a
						// nao nula

						if (!pTwo.isEnemy()) {

							Bishop b = null;
							Horse h = null;
							King k = null;
							Pawn pwn = null;
							Queen q = null;
							Tower t = null;
							if (pTwo instanceof Bishop) {
								b = (Bishop) pTwo;

								List<Integer> listPositions = b.move(
										pointIndex.getX(), pointIndex.getY(),
										chessbordTwo);
								clearChoices();
								paintChoices(b, pointIndex.getX(),
										pointIndex.getY(), listPositions);
								pieceMove = b;
							} else if (pTwo instanceof Horse) {
								h = (Horse) pTwo;
								List<Integer> listPositions = h.move(
										pointIndex.getX(), pointIndex.getY(),
										chessbordTwo);
								clearChoices();
								paintChoices(h, pointIndex.getX(),
										pointIndex.getY(), listPositions);
								pieceMove = h;
							} else if (pTwo instanceof King) {
								k = (King) pTwo;

								List<Integer> listPositions = k.move(
										pointIndex.getX(), pointIndex.getY(),
										chessbordTwo);
								clearChoices();
								paintChoices(k, pointIndex.getX(),
										pointIndex.getY(), listPositions);
								pieceMove = k;
							} else if (pTwo instanceof Pawn) {
								pwn = (Pawn) pTwo;

								// //converte a posicao de uma pe�a
								// na tela
								// //para uma posicao no tabuleiro
								// Point p =
								// Util.parsePositionToIndex(pwn.getX(),
								// pwn.getY());

								// //pointIndex � a nova posicao no
								// tabuleiro
								List<Integer> listPositions = pwn.move(
										pointIndex.getX(), pointIndex.getY(),
										chessbordTwo);

								// enviaPeca(p, pointIndex);
								clearChoices();
								paintChoices(pwn, pointIndex.getX(),
										pointIndex.getY(), listPositions);

								pieceMove = pwn;

							} else if (pTwo instanceof Queen) {
								q = (Queen) pTwo;
								List<Integer> listPositions = q.move(
										pointIndex.getX(), pointIndex.getY(),
										chessbordTwo);
								clearChoices();
								paintChoices(q, pointIndex.getX(),
										pointIndex.getY(), listPositions);
								pieceMove = q;

							} else if (pTwo instanceof Tower) {
								t = (Tower) pTwo;

								List<Integer> listPositions = t.move(
										pointIndex.getX(), pointIndex.getY(),
										chessbordTwo);
								clearChoices();
								paintChoices(t, pointIndex.getX(),
										pointIndex.getY(), listPositions);
								pieceMove = t;
							}
						}
					}
				}// final do else
			}
		}// final do for

	}

	public void clearChoices() {
		main.paint(main.getGraphics());

	}

	public void paintChoices(Piece piece, int x, int y,
			List<Integer> listPositions) {
		Graphics2D g = (Graphics2D) main.getGraphics2d();
		// refazer esse metodo
		listIndexPossibleChoices = new ArrayList<Integer>();
		for (int i = 0; i < listPositions.size(); i++) {
			if (i + 1 <= listPositions.size()) {
				int xx = listPositions.get(i);
				int yy = listPositions.get(++i);
				int[] var = Util.parseIndexToSquare(xx, yy);

				listIndexPossibleChoices.add(xx);
				listIndexPossibleChoices.add(yy);
				g.setColor(Color.GREEN);
				g.fill(new Rectangle2D.Double(var[0], var[1], 50, 50));
			}
		}

		for (int i = 0; i < listIndexPossibleChoices.size(); i++) {
			int xx = listIndexPossibleChoices.get(i);
			int yy = listIndexPossibleChoices.get(++i);

			if (main.getChessboard()[xx][yy] != null) {
				int[] var = Util.parseIndexToSquare(xx, yy);
				g.setColor(Color.GREEN);
				g.fill(new Rectangle2D.Double(var[0], var[1], 50, 50));

				Piece piece2 = main.getChessboard()[xx][yy];
				Config.drawPiecePossibleChoice(piece2, g);
			}

		}
		g.dispose();

	}

	public void doPaint(Piece piece, Integer newX, Integer newY) {

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
		BufferedImage image = null;
		if (Session.isPlayerOne()) {
			if (piece instanceof Bishop) {
				image = imgBishopBlack;
			} else if (piece instanceof Horse) {
				image = imgHorseBlack;
			} else if (piece instanceof King) {
				image = imgKingBlack;
			} else if (piece instanceof Pawn) {
				image = imgPawnBlack;
			} else if (piece instanceof Queen) {
				image = imgQueenBlack;
			} else if (piece instanceof Tower) {
				image = imgTowerBlack;
			}
		} else {
			if (piece instanceof Bishop) {
				image = imgBishopWhite;
			} else if (piece instanceof Horse) {
				image = imgHorseWhite;
			} else if (piece instanceof King) {
				image = imgKingWhite;
			} else if (piece instanceof Pawn) {
				image = imgPawnWhite;
			} else if (piece instanceof Queen) {
				image = imgQueenWhite;
			} else if (piece instanceof Tower) {
				image = imgTowerWhite;
			}
		}
		Graphics2D g2 = (Graphics2D) main.getGraphics2d();
		List<Square> listSquare = main.getListSquare();

		// remove um inimigo
		// for (Square s : listSquare) {
		// if (s.getX() == newX-5 && s.getY() == newY-5) {

		// g2.setPaint(s.getColor());
		//
		// g2.fill(new Rectangle2D.Double(newX-5,
		// newY-5, 50, 50));
		// break;
		// }
		//
		// }
		// pinta o lugar anterior da peca
		// int[] var = Util.parsePositionToIndex(piece.getX(), piece.getY());
		// int[] var2 = Util.parseIndexToSquare(var[0], var[1]);
		// for (Square s : listSquare) {
		// if (s.getX() == var2[0] && s.getY() == var2[1]) {
		// s.setColor(Color.blue);
		// g2.setPaint(s.getColor());
		// g2.fill(new Rectangle2D.Double(s.getX(), s.getY(), 50,
		// 50));
		// System.out.println("pintou square");
		// }
		// }

		for (int i = 0; i < listIndexPossibleChoices.size(); i++) {
			if (i + 1 <= listIndexPossibleChoices.size()) {
				int xx = listIndexPossibleChoices.get(i);
				int yy = listIndexPossibleChoices.get(++i);
				int[] square = Util.parseIndexToSquare(xx, yy);
				for (Square s : listSquare) {
					if (s.getX() == square[0] && s.getY() == square[1]) {
						g2.setPaint(s.getColor());
						g2.fill(new Rectangle2D.Double(s.getX(), s.getY(), 50,
								50));

					}
				}
			}
		}
		for (Square s : listSquare) {
			if (s.getX() == piece.getX() - 5 && s.getY() == piece.getY() - 5) {

				g2.setPaint(s.getColor());

				g2.fill(new Rectangle2D.Double(piece.getX() - 5,
						piece.getY() - 5, 50, 50));

				g2.drawImage(image, newX, newY, null);
				break;
			}
		}

		g2.dispose();

	}

	public void enviaPeca(Piece piece, Point point, Point newPoint,
			List<Piece> listForPromotion, boolean xequemate) {

		Message dataMatrix = new Message();
		dataMatrix.setPiece(piece);
		dataMatrix.setXequemate(xequemate);

		if (Session.isPlayerOne()) {
			dataMatrix.setListForPromotionPlayerOne(listForPromotion);
		} else {
			dataMatrix.setListForPromotionPlayerTwo(listForPromotion);
		}

		dataMatrix.setLastPoint(point);
		dataMatrix.setNewPoint(newPoint);

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

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}
