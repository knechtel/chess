package br.com.chess;

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.chess.bean.*;
import br.com.chess.bean.Rook;

/* ComboBoxDemo2.java requires no other files. */
public class ComboBoxDemo extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame frame;
	JLabel result;
	String currentPattern;
	@SuppressWarnings("rawtypes")
	private DefaultComboBoxModel listModel = new DefaultComboBoxModel();
	private Handler handler;
	private Piece pieceMove;
	private Point position;
	private Point pointRemove;

	@SuppressWarnings("unchecked")
	public ComboBoxDemo(final Handler handler) {
		this.handler = handler;
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

		Bishop b = null;
		Horse h = null;
		Queen q = null;
		Rook t = null;
		if (Session.isPlayerOne()) {
			for (Piece piece : Session.getListForPromotionPlayerTwo()) {
				if (piece instanceof Bishop) {
					b = (Bishop) piece;
					listModel.addElement(b);
				} else if (piece instanceof Horse) {
					h = (Horse) piece;
					listModel.addElement(h);
				} else if (piece instanceof Queen) {
					q = (Queen) piece;
					listModel.addElement(q);
				} else if (piece instanceof Rook) {
					t = (Rook) piece;
					listModel.addElement(t);
				}
			}
		} else {

			Bishop b1 = null;
			Horse h1 = null;
			Queen q1 = null;
			Rook t1 = null;
			for (Piece piece : Session.getListForPromotionPlayerOne()) {
				if (piece instanceof Bishop) {
					b1 = (Bishop) piece;
					listModel.addElement(b1);
				} else if (piece instanceof Horse) {
					h1 = (Horse) piece;
					listModel.addElement(h1);
				} else if (piece instanceof Queen) {
					q1 = (Queen) piece;
					listModel.addElement(q1);
				} else if (piece instanceof Rook) {
					t1 = (Rook) piece;
					listModel.addElement(t1);
				}
			}
		}

		// Set up the UI for selecting a pattern.
		JLabel patternLabel1 = new JLabel("Selecione uma pe�a para ");
		JLabel patternLabel2 = new JLabel("voltar ao tabuleiro:");

		@SuppressWarnings("rawtypes")
		final JComboBox patternList = new JComboBox(listModel);
		patternList.setEditable(true);

		result = new JLabel(" ");
		JButton buttonEnviar = new JButton("Enviar");
		buttonEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Object piece = patternList.getSelectedItem();
				Bishop b = null;
				Horse h = null;
				Queen q = null;
				Rook t = null;

				if (piece instanceof Bishop) {
					b = (Bishop) piece;

				} else if (piece instanceof Horse) {
					h = (Horse) piece;

				} else if (piece instanceof Queen) {
					q = (Queen) piece;

				} else if (piece instanceof Rook) {
					t = (Rook) piece;

				}

				if (b != null) {
					Piece bishop = new Bishop();
					pieceMove = Session.getPieceMove();
					bishop.setX(pieceMove.getX());
					bishop.setY(pieceMove.getY());

					Piece[][] chessbord = handler.getMain().getChessboard();
					position = Session.getPoint();
					chessbord[position.getX()][position.getY()] = bishop;
					pointRemove = Session.getPointRemove();
					Main m = handler.getMain();
					m.paint(m.getGraphics());

					if (Session.isPlayerOne()) {
						handler.enviaPeca(bishop, pointRemove, position,
								Session.getListForPromotionPlayerTwo(),false);
					} else {
						handler.enviaPeca(bishop, pointRemove, position,
								Session.getListForPromotionPlayerOne(),false);
					}

					frame.dispose();
				
				}
				if (h != null) {
					Piece horse = new Horse();
					pieceMove = Session.getPieceMove();
					horse.setX(pieceMove.getX());
					horse.setY(pieceMove.getY());

					Piece[][] chessbord = handler.getMain().getChessboard();
					position = Session.getPoint();
					chessbord[position.getX()][position.getY()] = horse;
					pointRemove = Session.getPointRemove();
					Main m = handler.getMain();
					m.paint(m.getGraphics());

					if (Session.isPlayerOne()) {
						handler.enviaPeca(horse, pointRemove, position,
								Session.getListForPromotionPlayerTwo(),false);
					} else {
						handler.enviaPeca(horse, pointRemove, position,
								Session.getListForPromotionPlayerOne(),false);
					}

					frame.dispose();
				}
				if (q != null) {
					Piece queen = new Queen();
					pieceMove = Session.getPieceMove();
					queen.setX(pieceMove.getX());
					queen.setY(pieceMove.getY());

					Piece[][] chessbord = handler.getMain().getChessboard();
					position = Session.getPoint();
					chessbord[position.getX()][position.getY()] = queen;
					pointRemove = Session.getPointRemove();
					Main m = handler.getMain();
					m.paint(m.getGraphics());

					if (Session.isPlayerOne()) {
						handler.enviaPeca(queen, pointRemove, position,
								Session.getListForPromotionPlayerTwo(),false);
					} else {
						handler.enviaPeca(queen, pointRemove, position,
								Session.getListForPromotionPlayerOne(),false);
					}

					frame.dispose();
				
				}
				if (t != null) {
					Piece tower = new Rook();
					pieceMove = Session.getPieceMove();
					tower.setX(pieceMove.getX());
					tower.setY(pieceMove.getY());

					Piece[][] chessbord = handler.getMain().getChessboard();
					position = Session.getPoint();
					chessbord[position.getX()][position.getY()] = tower;
					pointRemove = Session.getPointRemove();
					Main m = handler.getMain();
					m.paint(m.getGraphics());

					if (Session.isPlayerOne()) {
						handler.enviaPeca(tower, pointRemove, position,
								Session.getListForPromotionPlayerTwo(),false);
					} else {
						handler.enviaPeca(tower, pointRemove, position,
								Session.getListForPromotionPlayerOne(),false);
					}

					frame.dispose();
				
				}

			}
		});

		// Lay out everything.
		JPanel patternPanel = new JPanel();
		patternPanel
				.setLayout(new BoxLayout(patternPanel, BoxLayout.PAGE_AXIS));
		patternPanel.add(patternLabel1);
		patternPanel.add(patternLabel2);
		patternList.setAlignmentX(Component.LEFT_ALIGNMENT);
		patternPanel.add(patternList);

		JPanel resultPanel = new JPanel(new GridLayout(0, 1));
		resultPanel.add(buttonEnviar);
		resultPanel.add(result);

		patternPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		resultPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

		add(patternPanel);
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(resultPanel);

		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

	} // constructor

	public void createAndShowGUI() {
		// Create and set up the window.
		frame = new JFrame("_Promoção :)");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		JComponent newContentPane = new ComboBoxDemo(this.handler);
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// createAndShowGUI();
			}
		});
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setPieceMove(Piece pieceMove) {
		this.pieceMove = pieceMove;
	}

	public Piece getPieceMove() {
		return pieceMove;
	}

	public void setPoint(Point position) {
		this.position = position;
	}

	public Point getPoint() {
		return position;
	}

	public Point getPointRemove() {
		return pointRemove;
	}

	public void setPointRemove(Point pointRemove) {
		this.pointRemove = pointRemove;
	}

}