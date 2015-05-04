package br.com.chess.bean;

import java.util.ArrayList;
import java.util.List;

import br.com.chess.Session;

public class Pawn extends Piece {

	private static final long serialVersionUID = 1L;
	private List<Integer> listPositions;

	public List<Integer> move(int index_X, int index_Y, Piece[][] chessbord) {
		listPositions = new ArrayList<Integer>();
		Piece piece = null;
		if (Session.isPlayerOne()) {
			// move duas casas para frente se for a primeira vez
			if (Session.isFirstTime()) {
				listPositions.add(index_X);
				listPositions.add(index_Y - 2);

			}
			// move para diagonal esquerda ok
			if (index_X - 1 >= 0 && index_Y - 1 >= 0) {
				piece = chessbord[index_X - 1][index_Y - 1];
				if (piece != null && piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y - 1);

				}
			}

			// move para diagonal direita
			if (index_X + 1 <= 7 && index_Y - 1 >= 0) {
				piece = chessbord[index_X + 1][index_Y - 1];
				if (piece != null && piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y - 1);
					System.out.println("move para diagonal direita");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("index x = " + index_X + " index y ="
							+ index_Y);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
				}
			}

			// move uma posicao pra frente no tabuleiro
			if (index_Y - 1 >= 0) {
				piece = chessbord[index_X][index_Y - 1];

				if (piece == null) {
					listPositions.add(index_X);
					listPositions.add(index_Y - 1);

				}
			}

			System.out.println(">>>>>>> PAWN -move ");
			for (int i = 0; i < listPositions.size(); i++) {
				if (i + 1 <= listPositions.size()) {
					int xx = listPositions.get(i);
					int yy = listPositions.get(++i);
					System.out.println("index x = " + xx + " index y =" + yy);
				}
			}
		}else{
			if (Session.isFirstTime()) {
				listPositions.add(index_X);
				listPositions.add(index_Y + 2);
			}
			// move uma posicao pra frente no tabuleiro
			if (index_Y + 1 <= 7) {
				piece = chessbord[index_X][index_Y + 1];

				if (piece == null) {
					listPositions.add(index_X);
					listPositions.add(index_Y + 1);

				}
			}
			//move para diagonal esquerda
			if (index_X - 1 >= 0 && index_Y + 1 <= 7) {
				piece = chessbord[index_X - 1][index_Y + 1];
				if (piece != null && piece.isEnemy()) {
					listPositions.add(index_X - 1);
					listPositions.add(index_Y + 1);

				}
			}
			// move para diagonal direita
			if (index_X + 1 <= 7 && index_Y + 1 <= 7) {
				piece = chessbord[index_X + 1][index_Y + 1];
				if (piece != null && piece.isEnemy()) {
					listPositions.add(index_X + 1);
					listPositions.add(index_Y + 1);
					
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
}
