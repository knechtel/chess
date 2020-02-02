package br.com.chess.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import br.com.chess.Main;
import br.com.chess.Session;
import br.com.chess.bean.Piece;
import br.com.chess.bean.Player;
import br.com.chess.bean.Point;
import br.com.chess.protocolo.Message;

public class Client {

	private static Socket servSocket = null;
	private Main main;
	private boolean playerOne;

	public static void main(String[] args) {
		new Client();
	}

	public Client() {
//		String host = JOptionPane.showInputDialog(
//				"Escolha o IP para se conectar (Ex. 200.190.150.121) ",
//				"localhost");
//
//		int port = 0;
//		try {
//			port = Integer.parseInt(JOptionPane.showInputDialog(
//					"Escolha a porta do servidor (Ex. 8082)", "8082"));
//		} catch (NumberFormatException e) {
//			JOptionPane.showMessageDialog(null,
//					"Porta s� aceita numeros inteiros! (Ex. 8082)");
//			System.exit(1);
//		}
//
//		System.out.println("Tentando conectar no servidor em " + host + ":"
//				+ port + " ...");
//		try {
//			servSocket = new Socket(host, port);
//
//			// String nick = JOptionPane.showInputDialog("Escolha o seu Nick");
//			// GUI = new GUIClient(servSocket);
//			// GUI.setNick(nick);
//
//			// envia o nick q o usuario digitou
//			// GUI.envia(GUI.getNick());
//			// envia o nome da maquina na rede (para reconhecer quem � o
//			// verdadeiro usuario)
//			Player player = new Player();
//			player.setComputerName(InetAddress.getLocalHost().getHostName());
//			player.setNickname("anonimo");
//			Message dataMatrix = new Message();
//			dataMatrix.setPlayer(player);
//			Socket socketCliente = Client.getServSocket();
//			ObjectOutputStream output;
//			try {
//				output = new ObjectOutputStream(socketCliente.getOutputStream());
//				output.flush();
//				output.writeObject(dataMatrix);
//				output.flush();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		} catch (UnknownHostException e) {
//			JOptionPane.showMessageDialog(null, "N�o encontrou o servidor: "
//					+ host + ":" + port + ".");
//			System.exit(1);
//		} catch (IOException e) {
//			JOptionPane
//					.showMessageDialog(null, "N�o conseguiu conex�o I/O com: "
//							+ host + ":" + port + ".");
//			System.exit(1);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.exit(1);
//		}
//
//		System.out
//				.println("Conex�o com sucesso em " + host + ":" + port + " !");
//
//		Thread servList = new Thread() {
//			@Override
//			public synchronized void run() {
//				super.run();
//				while (true) {
//					try {
//						// Rotina que aguarda as MSGs vindas do Servidor
//						ObjectInputStream input;
//						input = new ObjectInputStream(
//								servSocket.getInputStream());
//						Message p;
//						p = (Message) input.readObject();
//
//						setBlack(p.isBlack());
//
//
//						// verifica se a lista de pe�as para promo�ao � nula
//						if (p.isBlack()) {
//							if (p.getListForPromotionPlayerOne() != null) {
//								Session.setListForPromotionPlayerOne(p
//										.getListForPromotionPlayerOne());
//							}
//						} else {
//							if (p.getListForPromotionPlayerTwo() != null) {
//								Session.setListForPromotionPlayerTwo(p
//										.getListForPromotionPlayerTwo());
//							}
//						}
//
//						Point pLast = p.getLastPoint();
//
//						if (pLast != null) {
//
//							Point pNew = p.getNewPoint();
//
//							Piece[][] chessboard = main.getChessboard();
//
//							chessboard[pLast.getX()][pLast.getY()] = null;
//							Piece p2 = p.getPiece();
//							p2.setEnemy(!p2.isEnemy());
//							chessboard[pNew.getX()][pNew.getY()] = p2;
//							chessboard[pLast.getX()][pLast.getY()] = null;
//
//							main.setChessboard(chessboard);
//							main.paint(main.getGraphics());
//						}
//						if (p.isXequemate()) {
//							JOptionPane.showMessageDialog(null,
//									"Xequemate, fim de jogo!");
//							envia();
//						}
//
//						Session.setOrigin(p.getDestino());
//						Session.setDestination(p.getOrigem());
//
//						if (p.isStart()) {
//							Session.setEnableFrame(true);
//						}
//
//					} catch (Exception e) {
//
//						System.exit(0);
//					}
//				}
//			}
//		};
//
//		servList.start();

	}

	public static Socket getServSocket() {
		return servSocket;
	}

	public static void setServSocket(Socket servSocket) {
		Client.servSocket = servSocket;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Main getMain() {
		return main;
	}

	public void setBlack(boolean black) {
		this.playerOne = black;
	}

	public boolean isPlayerOne() {
		return playerOne;
	}

	public void envia() {
		Message dataMatrix = new Message();
		dataMatrix.setEndOfGame(true);
		
		Socket socketCliente = Client.getServSocket();
		ObjectOutputStream output;

		dataMatrix.setDestino(Session.getDestination());
		dataMatrix.setOrigem(Session.getOrigin());

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

}
