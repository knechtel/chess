package br.com.chess;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import br.com.chess.bean.Piece;
import br.com.chess.bean.Point;

public class Session {

	private static boolean enableFrame;
	private static boolean firstTime;
	private static Integer origin;
	private static Integer destination;
	private static boolean black;
	private static List<Piece> listForPromotionPlayerOne = new ArrayList<Piece>();
	private static List<Piece> listForPromotionPlayerTwo = new ArrayList<Piece>();
	private static Piece pieceMove;
	private static Point point;
	private static Point pointRemove;
	private static JFrame frame;
	private static Integer cont = 0;

	public static Integer getCont() {
		cont++;
		return cont;
	}

	public static void setCont(Integer cont) {
		Session.cont = cont;
	}

	public static boolean isEnableFrame() {
		return enableFrame;
	}

	public static void setEnableFrame(boolean enableFrame) {
		Session.enableFrame = enableFrame;
	}

	public static void setFirstTime(boolean firstTime) {
		Session.firstTime = firstTime;
	}

	public static boolean isFirstTime() {
		return firstTime;
	}

	public static void setOrigin(Integer origin) {
		Session.origin = origin;
	}

	public static Integer getOrigin() {
		return origin;
	}

	public static void setDestination(Integer destination) {
		Session.destination = destination;
	}

	public static Integer getDestination() {
		return destination;
	}

	public static void setPlayerOne(boolean black) {
		Session.black = black;
	}

	public static boolean isPlayerOne() {
		return black;
	}

	public static void setListForPromotionPlayerOne(List<Piece> listForPromotion) {
		Session.listForPromotionPlayerOne = listForPromotion;
	}

	public static List<Piece> getListForPromotionPlayerOne() {
		return listForPromotionPlayerOne;
	}

	public static void main(String[] args) {

	}

	public static void setListForPromotionPlayerTwo(
			List<Piece> listForPromotionPlayerTwo) {
		Session.listForPromotionPlayerTwo = listForPromotionPlayerTwo;
	}

	public static List<Piece> getListForPromotionPlayerTwo() {
		return listForPromotionPlayerTwo;
	}

	public static void setPieceMove(Piece pieceMove) {
		Session.pieceMove = pieceMove;
	}

	public static Piece getPieceMove() {
		return pieceMove;
	}

	public static void setPoint(Point point) {
		Session.point = point;
	}

	public static Point getPoint() {
		return point;
	}

	public static void setPointRemove(Point pointRemove) {
		Session.pointRemove = pointRemove;
	}

	public static Point getPointRemove() {
		return pointRemove;
	}

	public static void setFrame(JFrame frame) {
		Session.frame = frame;
	}

	public static JFrame getFrame() {
		return frame;
	}

}
