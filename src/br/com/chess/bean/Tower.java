package br.com.chess.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.chess.Session;

public class Tower extends Piece {

	private static final long serialVersionUID = 1L;

	private List<Integer> listPositions;

	public List<Integer> move(int index_X, int index_Y, Piece[][] chessbord) {
		listPositions = new ArrayList<Integer>();
		Piece piece = null;
		if (Session.isPlayerOne()) {
			// andando para a direita
			for (int x = index_X + 1; x <= 7; x++) {
				piece = chessbord[x][index_Y];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(x);
						listPositions.add(index_Y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(x);
					listPositions.add(index_Y);

				}
			}
			// // andando para esquerda
			for (int x = index_X - 1; x >= 0; x--) {
				piece = chessbord[x][index_Y];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(x);
						listPositions.add(index_Y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(x);
					listPositions.add(index_Y);

				}
			}

			System.out.println("move tower");
			// andando para cima
			for (int y = index_Y - 1; y >= 0; y--) {
				System.out.println("entrei aqui-----109");
				piece = chessbord[index_X][y];
				System.out.println("index x = " + index_X + " y = " + y);
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X);
						listPositions.add(y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					System.out.println("entrei aqui 68");
					listPositions.add(index_X);
					listPositions.add(y);

				}
			}

			// // andando para baixo
			for (int y = index_Y + 1; y <= 7; y++) {
				piece = chessbord[index_X][y];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X);
						listPositions.add(y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(index_X);
					listPositions.add(y);

				}
			}
		}else{
			// andando para a direita
			for (int x = index_X + 1; x <= 7; x++) {
				piece = chessbord[x][index_Y];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(x);
						listPositions.add(index_Y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(x);
					listPositions.add(index_Y);

				}
			}
			// // andando para esquerda
			for (int x = index_X - 1; x >= 0; x--) {
				piece = chessbord[x][index_Y];

				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(x);
						listPositions.add(index_Y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(x);
					listPositions.add(index_Y);

				}
			}
			
			// andando para baixo
			for (int y = index_Y - 1; y >= 0; y--) {
				System.out.println("entrei aqui-----109");
				piece = chessbord[index_X][y];
				System.out.println("index x = " + index_X + " y = " + y);
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X);
						listPositions.add(y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					System.out.println("entrei aqui 68");
					listPositions.add(index_X);
					listPositions.add(y);

				}
			}
			//andando para cima
			for (int y = index_Y + 1; y <= 7; y++) {
				piece = chessbord[index_X][y];
				if (piece != null) {
					if (piece.isEnemy()) {
						listPositions.add(index_X);
						listPositions.add(y);
						break;
					} else if (!piece.isEnemy()) {
						break;
					}
				} else {
					listPositions.add(index_X);
					listPositions.add(y);

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
		return "Torre";
	}

}
