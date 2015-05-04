package br.com.chess.teste;


import br.com.chess.bean.Bishop;
import br.com.chess.bean.Horse;
import br.com.chess.bean.King;
import br.com.chess.bean.Pawn;
import br.com.chess.bean.Queen;
import br.com.chess.bean.Tower;
import br.com.chess.bean.Piece;

public class Teste {
	public static void main(String[] args) {
		Piece piece = new Tower();

		if (piece instanceof Bishop) {
			System.out.println("eh meu amigo");
		} else if (piece instanceof Horse) {
		} else if (piece instanceof King) {
		} else if (piece instanceof Pawn) {
		} else if (piece instanceof Queen) {

		}else if (piece instanceof Tower) {
			System.out.println("torre");
		} else {
			System.out.println("nao eh heim");
		}
	}
}
