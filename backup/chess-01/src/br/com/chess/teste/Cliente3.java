package br.com.chess.teste;

import java.io.*;
import java.net.*;

import br.com.chess.bean.Piece;
import br.com.chess.bean.Tower;
import br.com.chess.protocolo.Message;

public class Cliente3 {

	public static void main(String argv[]) throws Exception {

		@SuppressWarnings("unused")
		String frase;
		@SuppressWarnings("unused")
		String fraseModificada;
		ObjectOutputStream output;
		// Pessoa p = new Pessoa("Mateus", 25, 01, 1985);

		Message dataMatrix = new Message();
		Tower p = new Tower();
		p.setX(10);
		p.setY(0);
		Piece[][] dataM = new Piece[8][8];
		dataM = dataMatrix.getDataMatrix();
		dataM[0][0]=p;
		dataMatrix.setDataMatrix(dataM);
		Socket socketCliente = new Socket("127.0.0.1", 6789);

		output = new ObjectOutputStream(socketCliente.getOutputStream());
		output.flush();
		output.writeObject(dataMatrix);
		output.flush();
		output.close();

		socketCliente.close();

	}
}
