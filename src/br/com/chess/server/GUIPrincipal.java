package br.com.chess.server;




import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GUIPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JButton btnSair;
	private GUITable tabela;
	private Server server;
	
	public Server getServer() {
		return server;
	}


	public void setServer(Server server) {
		this.server = server;
	}


	public GUIPrincipal(Server serv) {
		super("Servidor");
		super.setVisible(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.server = serv;
		
		painel = new JPanel(new BorderLayout());
		
		tabela = new GUITable(this);
		JScrollPane tabelaScroll = new JScrollPane(tabela);
		
		btnSair = new JButton("Fechar Servidor");
		btnSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Fechando Servidor...");
				System.exit(0);
			}
		});
		
		
		
		painel.add(tabelaScroll,BorderLayout.CENTER);
		FlowLayout pnlLayout = new FlowLayout(FlowLayout.RIGHT);
		JPanel pnlBtn = new JPanel(pnlLayout);
		
		pnlBtn.add(btnSair);
		
		painel.add(pnlBtn,BorderLayout.SOUTH);
		add(painel);
		pack();
		setLocation(100, 100);
		setVisible(true);	
		
	}

	
	public void addRowTable(String nick, String nomeMaq) {
		String[] novo = {nick,nomeMaq};
		tabela.getModelo().addRow(novo);
	}
}
