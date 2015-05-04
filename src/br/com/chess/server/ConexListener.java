package br.com.chess.server;

import java.io.IOException;

public class ConexListener extends Thread {

	public Server server;

	public ConexListener(Server server) {
		this.server = server;
	}

	@Override
	public void run() {
		while (true) {
			try {
				ClientListener cliente = new ClientListener(server);
				server.getListClientListner().add(cliente);
				cliente.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
