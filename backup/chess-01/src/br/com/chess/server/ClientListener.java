package br.com.chess.server;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import br.com.chess.bean.Player;
import br.com.chess.protocolo.Message;

public class ClientListener extends Thread {

	public Server server;
	private Socket socket;
	private String nick;
	private String nomeMaq;
	private static Integer cont = 0;
	private Integer indexClient;

	public ClientListener(Server server) throws IOException {
		this.server = server;
		socket = server.getServerSocket().accept();
		setIndexClient(cont);
		cont++;
	}

	@Override
	public void run() {
		Message m = null;
		{
			ObjectInputStream input = null;
			try {
				input = new ObjectInputStream(socket.getInputStream());

				try {
					m = (Message) input.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				Player player = m.getPlayer();
				server.addRowTable(player.getNickname(),
						player.getComputerName());

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		List<ClientListener> listClientListener = server.getListClientListner();
		if (listClientListener.size() == 1) {
			envia();
		}

		if (listClientListener.size() > 1) {

			int size = listClientListener.size();

			if (size % 2 == 0) {
				ClientListener clientListner = listClientListener
						.get(listClientListener.size() - 2);

				clientListner.envia2(getIndexClient(),
						listClientListener.size() - 2, m);

			}
		}

		while (true) {
			ObjectInputStream input = null;
			try {
				input = new ObjectInputStream(socket.getInputStream());
				Message message = null;
				try {
					message = (Message) input.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (message.isEndOfGame()) {
					ArrayList<ClientListener> list = new ArrayList<ClientListener>();
					server.setListClientListner(list);
					cont = 0;
					socket.close();
					break;
				}

				ClientListener clientListener = server.getListClientListner()
						.get(message.getDestino());
				clientListener.envia2(getIndexClient(), message.getDestino(),
						message);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}

	public void setNomeMaq(String nomeMaq) {
		this.nomeMaq = nomeMaq;
	}

	public String getNomeMaq() {
		return nomeMaq;
	}

	public void envia() {
		Message dataMatrix = new Message();
		dataMatrix.setBlack(true);
		Socket socketCliente = socket;
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(socketCliente.getOutputStream());
			output.flush();
			output.writeObject(dataMatrix);
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void envia2(Integer origem, Integer destino, Message dataMatrix) {
		dataMatrix.setStart(true);
		dataMatrix.setOrigem(origem);
		dataMatrix.setDestino(destino);

		Socket socketCliente = socket;
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(socketCliente.getOutputStream());
			output.flush();
			output.writeObject(dataMatrix);
			output.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		int size = 1;
		if (size % 2 == 0) {
			System.out.println("==0");
		} else {
			System.out.println("!=0");
		}

	}

	public void setIndexClient(Integer indexClient) {
		this.indexClient = indexClient;
	}

	public Integer getIndexClient() {
		return indexClient;
	}

}
