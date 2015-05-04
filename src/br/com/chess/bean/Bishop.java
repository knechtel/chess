package br.com.chess.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.chess.Session;

public class Bishop extends Piece {

	private static final long serialVersionUID = 1L;

	private List<Integer> listPositions;

	public List<Integer> move(int index_X, int index_Y, Piece[][] chessbord) {
		listPositions = new ArrayList<Integer>();
		Piece piece = null;

		if (Session.isPlayerOne()) {
			// diagonal superior direita
			int yy = -1;
			if (index_Y - 1 >= 0) {
				yy = index_Y - 1;
			}

			for (int i = index_X + 1; i <= 7; i++) {

				if (yy == -1 || yy < 0)
					break;

				piece = chessbord[i][yy];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yy);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yy);

				}
				yy--;
			}

			// diagonal inferior direita
			int yd = -1;
			if (index_Y + 1 <= 7) {
				yd = index_Y + 1;
			}

			for (int i = index_X + 1; i <= 7; i++) {

				if (yd == -1 || yd > 7)
					break;

				piece = chessbord[i][yd];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yd);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yd);

				}
				yd++;
			}

			// diagonal superior esquerda
			int yse = -1;
			if (index_Y - 1 >= 0) {
				yse = index_Y - 1;
			}

			for (int i = index_X - 1; i >= 0; i--) {
				System.out.println("x  = " + i + " y = " + yse);
				if (yse == -1 || yse < 0)
					break;

				piece = chessbord[i][yse];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yse);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yse);

				}
				yse--;
			}
			// diagonal inferior esquerda
			int yie = -1;
			if (index_Y + 1 <= 7) {
				yie = index_Y + 1;
			}

			for (int i = index_X - 1; i >= 0; i--) {
				System.out.println("x  = " + i + " y = " + yse);
				if (yie == -1 || yie > 7)
					break;

				piece = chessbord[i][yie];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yie);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yie);

				}
				yie++;
			}
		} else {
			// diagonal superior direita
			int yy = -1;
			if (index_Y + 1 <= 7) {
				yy = index_Y + 1;
			}

			for (int i = index_X + 1; i <= 7; i++) {

				if (yy == -1 || yy > 7)
					break;

				piece = chessbord[i][yy];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yy);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yy);

				}
				yy++;
			}

			// diagonal inferior direita
			int yd = -1;
			if (index_Y - 1 >= 0) {
				yd = index_Y - 1;
			}

			for (int i = index_X + 1; i <= 7; i++) {

				if (yd == -1 || yd < 0)
					break;

				piece = chessbord[i][yd];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yd);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yd);

				}
				yd--;
			}

			// diagonal superior esquerda
			int yse = -1;
			if (index_Y + 1 <= 7) {
				yse = index_Y + 1;
			}

			for (int i = index_X - 1; i >= 0; i--) {
				System.out.println("x  = " + i + " y = " + yse);
				if (yse == -1 || yse > 7)
					break;

				piece = chessbord[i][yse];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yse);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yse);

				}
				yse++;
			}
			
			// diagonal inferior esquerda
			int yie = -1;
			if (index_Y - 1 >= 0) {
				yie = index_Y - 1;
			}

			for (int i = index_X - 1; i >= 0; i--) {
				System.out.println("x  = " + i + " y = " + yse);
				if (yie == -1 || yie < 0)
					break;

				piece = chessbord[i][yie];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(i);
						listPositions.add(yie);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(i);
					listPositions.add(yie);

				}
				yie--;
			}


		}

		return listPositions;
	}

	public void setListPositions(List<Integer> listPositions) {
		this.listPositions = listPositions;
	}

	public List<Integer> getListPositions() {
		return listPositions;
	}

	@Override
	public String toString() {
		return "Bispo";
	}
	

}
