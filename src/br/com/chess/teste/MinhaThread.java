package br.com.chess.teste;

public class MinhaThread extends Thread{

	public void run(){
	
	}
	public static void main(String[] args) {
		MinhaThread t = new MinhaThread();
		System.out.println("dispara Thread:");
		t.start();
	}
}
