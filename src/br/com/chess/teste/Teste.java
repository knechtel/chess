package br.com.chess.teste;


import br.com.chess.bean.*;
import br.com.chess.bean.Rook;

public class Teste {
	public static void main(String[] args) {
		Piece piece = new Rook();

		if (piece instanceof Bishop) {
			System.out.println("eh meu amigo");
		} else if (piece instanceof Horse) {
		} else if (piece instanceof King) {
		} else if (piece instanceof Pawn) {
		} else if (piece instanceof Queen) {

		}else if (piece instanceof Rook) {
			System.out.println("torre");
		} else {
			System.out.println("nao eh heim");
		}
	}
}
