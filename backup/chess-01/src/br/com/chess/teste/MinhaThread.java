package br.com.chess.teste;

public class MinhaThread extends Thread{

	public void run(){
		try {
			wait();
			System.out.println("aqui");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MinhaThread t = new MinhaThread();
		System.out.println("dispara Thread:");
		t.start();
	}
}
