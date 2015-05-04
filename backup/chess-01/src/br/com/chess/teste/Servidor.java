package br.com.chess.teste;

import java.io.*;
import java.net.*;

import br.com.chess.bean.Piece;
import br.com.chess.protocolo.Message;

class Servidor {

    //private Pessoa p;

    public static void main(String argv[]) throws Exception {
        Message p;
        @SuppressWarnings("unused")
        String fraseCliente;
        @SuppressWarnings("unused")
        String fraseMaiusculas;

        ServerSocket socketRecepcao = new ServerSocket(6789);

        Socket socketConexao = socketRecepcao.accept();
        //BufferedReader doCliente = new BufferedReader(new InputStreamReader(socketConexao.getInputStream()));
        //DataOutputStream paraCliente = new DataOutputStream(socketConexao.getOutputStream());
        
        ObjectInputStream input = new ObjectInputStream(socketConexao.getInputStream());
        p = (Message) input.readObject();
        Piece[][] dataM = new Piece[8][8];
		dataM = p.getDataMatrix();
        System.out.println("X : "+dataM[0][0].getX() + " y: "+ dataM[0][0].getY());
        
        /*while(true) {
            
            fraseCliente= doCliente.readLine();
            if(fraseCliente.equals("FIM")){
                socketConexao.close();
                break;
            }else{
                fraseMaiusculas= fraseCliente.toUpperCase() + '\n';
                paraCliente.writeBytes(fraseMaiusculas);
            }
        }*/
        socketConexao.close();
    }
}

