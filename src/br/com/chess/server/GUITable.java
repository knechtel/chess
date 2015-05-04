package br.com.chess.server;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUITable extends JTable {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private GUIPrincipal GUIServer;
	private DefaultTableModel modelo;
	public GUITable(GUIPrincipal GUIServer){
		this.GUIServer = GUIServer;
		
		String[][] dados = {};
		String[] colunas = {"Nick","Nome da Maquina"};
		modelo = new DefaultTableModel(dados, colunas);
		
		super.setModel(modelo);
		
		super.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {
				
			}
			public void mouseEntered(MouseEvent arg0) {}
			public void mouseExited(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
		});
	}
	
	public DefaultTableModel getModelo(){
		return modelo;
	}
	
}

