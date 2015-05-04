package br.com.chess.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.chess.Session;

public class Horse extends Piece {

	private static final long serialVersionUID = 1L;

	private List<Integer> listPositions;

	public List<Integer> move(int index_X, int index_Y, Piece[][] chessbord) {
		listPositions = new ArrayList<Integer>();
		Piece piece = null;
		if (Session.isPlayerOne()) {
			// == movimento 1
			if (index_X - 1 >= 0 && index_Y - 2 >= 0) {

				piece = chessbord[index_X - 1][index_Y - 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 1);
						listPositions.add(index_Y - 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 2);
				}
			}
			// == movimento 2
			if (index_X - 2 >= 0 && index_Y - 1 >= 0) {

				piece = chessbord[index_X - 2][index_Y - 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 2);
						listPositions.add(index_Y - 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 2);
					listPositions.add(index_Y - 1);
				}
			}
			// == movimento 3
			if (index_X + 1 <= 7 && index_Y - 2 >= 0) {

				piece = chessbord[index_X + 1][index_Y - 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 1);
						listPositions.add(index_Y - 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y - 2);
				}
			}
			// == movimento 4
			if (index_X + 2 <= 7 && index_Y - 1 >= 0) {

				piece = chessbord[index_X + 2][index_Y - 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 2);
						listPositions.add(index_Y - 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 2);
					listPositions.add(index_Y - 1);
				}
			}

			// == movimento 5
			if (index_X - 2 >= 0 && index_Y + 1 <= 7) {

				piece = chessbord[index_X - 2][index_Y + 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 2);
						listPositions.add(index_Y + 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 2);
					listPositions.add(index_Y + 1);
				}
			}

			// == movimento 6
			if (index_X - 1 >= 0 && index_Y + 2 <= 7) {

				piece = chessbord[index_X - 1][index_Y + 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 1);
						listPositions.add(index_Y + 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 2);
				}
			}

			// == movimento 7
			if (index_X + 1 <= 7 && index_Y + 2 <= 7) {

				piece = chessbord[index_X + 1][index_Y + 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 1);
						listPositions.add(index_Y + 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 2);
				}
			}

			// == movimento 8
			if (index_X + 2 <= 7 && index_Y + 1 <= 7) {

				piece = chessbord[index_X + 2][index_Y + 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 2);
						listPositions.add(index_Y + 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 2);
					listPositions.add(index_Y + 1);
				}
			}

		} else {
			// == movimento 1
			if (index_X - 1 >= 0 && index_Y + 2 <= 7) {

				piece = chessbord[index_X - 1][index_Y + 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 1);
						listPositions.add(index_Y + 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 2);
				}
			}
			// == movimento 2
			if (index_X - 2 >= 0 && index_Y + 1 <= 7) {

				piece = chessbord[index_X - 2][index_Y + 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 2);
						listPositions.add(index_Y + 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 2);
					listPositions.add(index_Y + 1);
				}
			}

			// == movimento 3
			if (index_X + 1 <= 7 && index_Y + 2 <= 7) {

				piece = chessbord[index_X + 1][index_Y + 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 1);
						listPositions.add(index_Y + 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 2);
				}
			}
			// movimento 4
			if (index_X + 2 <= 7 && index_Y + 1 <= 7) {

				piece = chessbord[index_X + 2][index_Y + 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 2);
						listPositions.add(index_Y + 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 2);
					listPositions.add(index_Y + 1);
				}
			}

			// == movimento 5
			if (index_X - 2 >= 0 && index_Y - 1 >= 0) {

				piece = chessbord[index_X - 2][index_Y - 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 2);
						listPositions.add(index_Y - 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 2);
					listPositions.add(index_Y - 1);
				}
			}

			// == movimento 6
			if (index_X - 1 >= 0 && index_Y - 2 >= 0) {

				piece = chessbord[index_X - 1][index_Y - 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X - 1);
						listPositions.add(index_Y - 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 2);
				}
			}

			// == movimento 7
			if (index_X + 1 <= 7 && index_Y - 2 >= 0) {

				piece = chessbord[index_X + 1][index_Y - 2];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 1);
						listPositions.add(index_Y - 2);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y - 2);
				}
			}

			// == movimento 8
			if (index_X + 2 <= 7 && index_Y - 1 >= 0) {

				piece = chessbord[index_X + 2][index_Y - 1];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X + 2);
						listPositions.add(index_Y - 1);
					} else if (!piece.isEnemy()) {
					}
				} else {
					listPositions.add(index_X + 2);
					listPositions.add(index_Y - 1);
				}
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

	public static void main(String[] args) {
		System.out.println("testando");
	}
	
	@Override
	public String toString() {
		return "Cavalo";
	}
}
