package br.com.chess.server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Server {

	private ServerSocket serverSocket;
	private GUIPrincipal guiPrincipal;
	private ArrayList<ClientListener> listClientListner;

	public Server() {
		int port = 0;
		try {
			port = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a porta do servidor (Ex. 8082)", "8082"));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Porta s? aceita numeros! (Ex. 8082)");
			System.exit(1);
		}

		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			System.err.println("Porta " + port + " em uso.");
			JOptionPane.showMessageDialog(null, "Porta " + port + " em uso.");
			System.exit(1);
		}
		guiPrincipal = new GUIPrincipal(this);

		listClientListner = new ArrayList<ClientListener>();

		ConexListener conex = new ConexListener(this);
		conex.start();
	}

	void enviarMsg(String msg) {
		// envia pra todos a msg
		PrintStream out;
		System.out.println(msg);
		for (ClientListener cliente : listClientListner) {
			try {
				out = new PrintStream(cliente.getSocket().getOutputStream(),
						true);
				out.println(msg);
			} catch (IOException e) {
			}
		}
	}

	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	public void setListClientListner(
			ArrayList<ClientListener> listClienteListner) {
		this.listClientListner = listClienteListner;
	}

	public ArrayList<ClientListener> getListClientListner() {
		return listClientListner;
	}

	public void addRowTable(String nick, String nomeMaq) {
		guiPrincipal.addRowTable(nick, nomeMaq);
	}

	public static void main(String[] args) {
		new Server();
	}
}
