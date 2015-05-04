package br.com.chess.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.chess.Session;

public class King extends Piece {

	private static final long serialVersionUID = 1L;

	private List<Integer> listPositions;

	public List<Integer> move(int index_X, int index_Y, Piece[][] chessbord) {
		listPositions = new ArrayList<Integer>();
		Piece piece = null;

		if (Session.isPlayerOne()) {
			// diagonal superior esquerda  01
 			if (index_X - 1 >= 0 && index_Y - 1 >= 0) {
				piece = chessbord[index_X - 1][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 1);
				}
			}

			// uma casa pra frente 02
			if (index_Y - 1 >= 0) {
				piece = chessbord[index_X][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X);
					listPositions.add(index_Y - 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X);
					listPositions.add(index_Y - 1);
				}
			}

			// diagonal superior direita 03
			if (index_X + 1 <= 7 && index_Y - 1 >= 0) {
				piece = chessbord[index_X + 1][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y - 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y - 1);
				}
			}

			// lado esquerdo 04
			if (index_X - 1 >= 0) {
				piece = chessbord[index_X - 1][index_Y];

				if (piece == null) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y);
				}
			}

			// lado direito 05
			if (index_X + 1 <= 7) {
				piece = chessbord[index_X + 1][index_Y];

				if (piece == null) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y);
				}
			}

			// diagonal inferior esquerda 06
			if (index_X - 1 >= 0 && index_Y + 1 <= 7) {
				piece = chessbord[index_X - 1][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 1);
				}
			}

			// uma casa para tras 07
			if (index_Y + 1 <= 7) {
				piece = chessbord[index_X][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X);
					listPositions.add(index_Y + 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X);
					listPositions.add(index_Y + 1);
				}
			}

			// diagonal inferior direita 08
			if (index_X + 1 <= 7 && index_Y + 1 <= 7) {
				piece = chessbord[index_X + 1][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 1);
				}
			}
		}else{
			//01
			if (index_X - 1 >= 0 && index_Y + 1 <= 7) {
				piece = chessbord[index_X - 1][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 1);
				}
			}
			//02
			if (index_Y + 1 <= 7) {
				piece = chessbord[index_X][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X);
					listPositions.add(index_Y + 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X);
					listPositions.add(index_Y + 1);
				}
			}

			//03
			if (index_X + 1 <= 7 && index_Y + 1 <= 7) {
				piece = chessbord[index_X + 1][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 1);
				}
			}
			
			//04
			if (index_X - 1 >= 0) {
				piece = chessbord[index_X - 1][index_Y];

				if (piece == null) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y);
				}
			}
			
			//05
			if (index_X + 1 <= 7) {
				piece = chessbord[index_X + 1][index_Y];

				if (piece == null) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y);
				}
			}

			//06
			if (index_X - 1 >= 0 && index_Y - 1 >= 0) {
				piece = chessbord[index_X - 1][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 1);
				}
			}
			
			//07
			if (index_Y - 1 >= 0) {
				piece = chessbord[index_X][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X);
					listPositions.add(index_Y - 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X);
					listPositions.add(index_Y - 1);
				}
			}

			//  08
			if (index_X + 1 <= 7 && index_Y - 1 >= 0) {
				piece = chessbord[index_X + 1][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y - 1);
				} else if (piece.isEnemy()) {
					listPositions.add(index_X + 1);
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

}
