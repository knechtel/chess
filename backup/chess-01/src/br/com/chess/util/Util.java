package br.com.chess.util;

import br.com.chess.bean.Piece;
import br.com.chess.bean.Point;

public class Util {

	public static Point parsePositionToIndex(int x, int y) {
		Point p = new Point();
		if (x == 5) {
			p.setX(0);
		}
		if (y == 5) {
			p.setY(0);
		}
		if (x == 55) {
			p.setX(1);
		}
		if (y == 55) {
			p.setY(1);
		}
		if (x == 105) {
			p.setX(2);
		}
		if (y == 105) {
			p.setY(2);
		}
		if (x == 155) {
			p.setX(3);
		}
		if (y == 155) {
			p.setY(3);
		}
		if (x == 205) {
			p.setX(4);
		}
		if (y == 205) {
			p.setY(4);
		}
		if (x == 255) {
			p.setX(5);
		}
		if (y == 255) {
			p.setY(5);
		}
		if (x == 305) {
			p.setX(6);
		}
		if (y == 305) {
			p.setY(6);
		}
		if (x == 355) {
			p.setX(7);
		}
		if (y == 355) {
			p.setY(7);
		}

		return p;
	}

	public static int[] parseIndexToSquare(int index_x, int index_y) {
		int[] square = new int[2];
		if (index_x == 0) {
			square[0] = 0;
		}
		if (index_y == 0) {
			square[1] = 0;
		}
		if (index_x == 1) {
			square[0] = 50;
		}
		if (index_y == 1) {
			square[1] = 50;
		}
		if (index_x == 2) {
			square[0] = 100;
		}
		if (index_y == 2) {
			square[1] = 100;
		}
		if (index_x == 3) {
			square[0] = 150;
		}
		if (index_y == 3) {
			square[1] = 150;
		}
		if (index_x == 4) {
			square[0] = 200;
		}
		if (index_y == 4) {
			square[1] = 200;
		}
		if (index_x == 5) {
			square[0] = 250;
		}
		if (index_y == 5) {
			square[1] = 250;
		}
		if (index_x == 6) {
			square[0] = 300;
		}
		if (index_y == 6) {
			square[1] = 300;
		}

		if (index_x == 7) {
			square[0] = 350;
		}
		if (index_y == 7) {
			square[1] = 350;
		}

		return square;
	}

	public static Point parseIndexToPosition(int index_x, int index_y) {
		Point p = new Point();

		if (index_x == 0) {
			p.setX(5);
		}
		if (index_y == 0) {
			p.setY(5);
		}
		if (index_x == 1) {
			p.setX(55);
		}
		if (index_y == 1) {
			p.setY(55);
		}
		if (index_x == 2) {
			p.setX(105);
		}
		if (index_y == 2) {
			p.setY(105);
		}
		if (index_x == 3) {
			p.setX(155);
		}
		if (index_y == 3) {
			p.setY(155);
		}
		if (index_x == 4) {
			p.setX(205);
		}
		if (index_y == 4) {
			p.setY(205);
		}
		if (index_x == 5) {
			p.setX(255);
		}
		if (index_y == 5) {
			p.setY(255);
		}
		if (index_x == 6) {
			p.setX(305);
		}
		if (index_y == 6) {
			p.setY(305);
		}
		if (index_x == 7) {
			p.setX(355);
		}
		if (index_y == 7) {
			p.setY(355);
		}
		return p;
	}

	public static Point getIndex(int x, int y) {
		Point point = new Point();
		if (x <= 55 && y <= 75) {
			point.setX(0);
			point.setY(0);
			return point;
		} else if (x < 105 && y <= 75) {
			point.setX(1);
			point.setY(0);
			return point;
		} else if (x < 160 && y <= 75) {
			point.setX(2);
			point.setY(0);
			return point;
		} else if (x < 205 && y <= 75) {
			point.setX(3);
			point.setY(0);
			return point;
		} else if (x > 205 && x < 255 && y <= 75) {
			point.setX(4);
			point.setY(0);
			return point;
		} else if (x > 260 && x < 305 && y <= 75) {
			point.setX(5);
			point.setY(0);
			return point;
		} else if (x > 310 && x < 355 && y <= 75) {
			point.setX(6);
			point.setY(0);
			return point;
		} else if (x > 360 && y <= 75) {
			point.setX(7);
			point.setY(0);
			return point;
		} else if (x <= 55 && y >= 80 && y <= 125) {
			point.setX(0);
			point.setY(1);
			return point;
		} else if (x < 105 && y >= 80 && y <= 125) {
			point.setX(1);
			point.setY(1);
			return point;
		} else if (x < 160 && y >= 80 && y <= 125) {
			point.setX(2);
			point.setY(1);
			return point;
		} else if (x < 205 && y >= 80 && y <= 125) {
			point.setX(3);
			point.setY(1);
			return point;
		} else if (x > 205 && x < 255 && y >= 80 && y <= 125) {
			point.setX(4);
			point.setY(1);
			return point;
		} else if (x > 260 && x < 305 && y >= 80 && y <= 125) {
			point.setX(5);
			point.setY(1);
			return point;
		} else if (x > 310 && x < 355 && y >= 80 && y <= 125) {
			point.setX(6);
			point.setY(1);
			return point;
		} else if (x > 360 && y >= 80 && y <= 125) {
			point.setX(7);
			point.setY(1);
			return point;
		} else if (x <= 55 && y < 175) {
			point.setX(0);
			point.setY(2);
			return point;
		} else if (x < 105 && y < 175) {
			point.setX(1);
			point.setY(2);
			return point;
		} else if (x < 160 && y >= 80 && y < 175) {
			point.setX(2);
			point.setY(2);
			return point;
		} else if (x < 205 && y < 175) {
			point.setX(3);
			point.setY(2);
			return point;
		} else if (x > 205 && x < 255 && y < 175) {
			point.setX(4);
			point.setY(2);
			return point;
		} else if (x > 260 && x < 305 && y < 175) {
			point.setX(5);
			point.setY(2);
			return point;
		} else if (x > 310 && x < 355 && y < 175) {
			point.setX(6);
			point.setY(2);
			return point;
		} else if (x > 360 && y >= 80 && y < 175) {
			point.setX(7);
			point.setY(2);
			return point;
		} else if (x <= 55 && y < 225) {
			point.setX(0);
			point.setY(3);
			return point;
		} else if (x < 105 && y < 225) {
			point.setX(1);
			point.setY(3);
			return point;
		} else if (x < 160 && y < 225) {
			point.setX(2);
			point.setY(3);
			return point;
		} else if (x < 205 && y < 225) {
			point.setX(3);
			point.setY(3);
			return point;
		} else if (x > 205 && x < 255 && y < 225) {
			point.setX(4);
			point.setY(3);
			return point;
		} else if (x > 260 && x < 305 && y < 225) {
			point.setX(5);
			point.setY(3);
			return point;
		} else if (x > 310 && x < 355 && y < 225) {
			point.setX(6);
			point.setY(3);
			return point;
		} else if (x > 360 && y < 225) {
			point.setX(7);
			point.setY(3);
			return point;
		} else if (x <= 55 && y < 275) {
			point.setX(0);
			point.setY(4);
			return point;
		} else if (x < 105 && y < 275) {
			point.setX(1);
			point.setY(4);
			return point;
		} else if (x < 160 && y < 275) {
			point.setX(2);
			point.setY(4);
			return point;
		} else if (x < 205 && y < 275) {
			point.setX(3);
			point.setY(4);
			return point;
		} else if (x > 205 && x < 255 && y < 275) {
			point.setX(4);
			point.setY(4);
			return point;
		} else if (x > 260 && x < 305 && y < 275) {
			point.setX(5);
			point.setY(4);
			return point;
		} else if (x > 310 && x < 355 && y < 275) {
			point.setX(6);
			point.setY(4);
			return point;
		} else if (x > 360 && y < 275) {
			point.setX(7);
			point.setY(4);
			return point;
		} else if (x <= 55 && y < 325) {
			point.setX(0);
			point.setY(5);
			return point;
		} else if (x < 105 && y < 325) {
			point.setX(1);
			point.setY(5);
			return point;
		} else if (x < 160 && y < 325) {
			point.setX(2);
			point.setY(5);
			return point;
		} else if (x < 205 && y < 325) {
			point.setX(3);
			point.setY(5);
			return point;
		} else if (x > 205 && x < 255 && y < 325) {
			point.setX(4);
			point.setY(5);
			return point;
		} else if (x > 260 && x < 305 && y < 325) {
			point.setX(5);
			point.setY(5);
			return point;
		} else if (x > 310 && x < 355 && y < 325) {
			point.setX(6);
			point.setY(5);
			return point;
		} else if (x > 360 && y < 325) {
			point.setX(7);
			point.setY(5);
			return point;
		} else if (x <= 55 && y < 375) {
			point.setX(0);
			point.setY(6);
			return point;
		} else if (x < 105 && y < 375) {
			point.setX(1);
			point.setY(6);
			return point;
		} else if (x < 160 && y < 375) {
			point.setX(2);
			point.setY(6);
			return point;
		} else if (x < 205 && y < 375) {
			point.setX(3);
			point.setY(6);
			return point;
		} else if (x > 205 && x < 255 && y < 375) {
			point.setX(4);
			point.setY(6);
			return point;
		} else if (x > 260 && x < 305 && y < 375) {
			point.setX(5);
			point.setY(6);
			return point;
		} else if (x > 310 && x < 355 && y < 375) {
			point.setX(6);
			point.setY(6);
			return point;
		} else if (x > 360 && y < 375) {
			point.setX(7);
			point.setY(6);
			return point;
		} else if (x <= 55 && y < 425) {
			point.setX(0);
			point.setY(7);
			return point;
		} else if (x < 105 && y < 425) {
			point.setX(1);
			point.setY(7);
			return point;
		} else if (x < 160 && y < 425) {
			point.setX(2);
			point.setY(7);
			return point;
		} else if (x < 205 && y < 425) {
			point.setX(3);
			point.setY(7);
			return point;
		} else if (x > 205 && x < 255 && y < 425) {
			point.setX(4);
			point.setY(7);
			return point;
		} else if (x > 260 && x < 305 && y < 425) {
			point.setX(5);
			point.setY(7);
			return point;
		} else if (x > 310 && x < 355 && y < 425) {
			point.setX(6);
			point.setY(7);
			return point;
		} else if (x > 360 && y < 425) {
			point.setX(7);
			point.setY(7);
			return point;
		}
		return null;
	}

	public static Point reversesPosition(Integer x, Integer y) {
		Point p = new Point();
		if (x == 5) {
			p.setX(355);
		}
		if (y == 5) {
			p.setY(355);
		}
		if (x == 55) {
			p.setX(305);
		}
		if (y == 55) {
			p.setY(305);
		}
		if (x == 105) {
			p.setX(255);
		}
		if (y == 105) {
			p.setY(255);
		}
		if (x == 155) {
			p.setX(205);
		}
		if (y == 155) {
			p.setY(205);
		}
		if (x == 205) {
			p.setX(155);
		}
		if (y == 205) {
			p.setY(155);
		}
		if (x == 255) {
			p.setX(105);
		}
		if (y == 255) {
			p.setY(105);
		}
		if (x == 305) {
			p.setX(55);
		}
		if (y == 305) {
			p.setY(55);
		}
		if (x == 355) {
			p.setX(5);
		}
		if (y == 355) {
			p.setY(5);
		}
		return p;
	}

	public static Piece[][] invertedMatrix(Piece[][] pieceMatrix) {
		Piece resultPiece[][] = new Piece[8][8];
		resultPiece[0][0] = pieceMatrix[7][7];
		resultPiece[0][1] = pieceMatrix[7][6];
		resultPiece[0][2] = pieceMatrix[7][5];
		resultPiece[0][3] = pieceMatrix[7][4];
		resultPiece[0][4] = pieceMatrix[7][3];
		resultPiece[0][5] = pieceMatrix[7][2];
		resultPiece[0][6] = pieceMatrix[7][1];
		resultPiece[0][7] = pieceMatrix[7][0];

		resultPiece[1][0] = pieceMatrix[6][7];
		resultPiece[1][1] = pieceMatrix[6][6];
		resultPiece[1][2] = pieceMatrix[6][5];
		resultPiece[1][3] = pieceMatrix[6][4];
		resultPiece[1][4] = pieceMatrix[6][3];
		resultPiece[1][5] = pieceMatrix[6][2];
		resultPiece[1][6] = pieceMatrix[6][1];
		resultPiece[1][7] = pieceMatrix[6][0];

		resultPiece[2][0] = pieceMatrix[5][7];
		resultPiece[2][1] = pieceMatrix[5][6];
		resultPiece[2][2] = pieceMatrix[5][5];
		resultPiece[2][3] = pieceMatrix[5][4];
		resultPiece[2][4] = pieceMatrix[5][3];
		resultPiece[2][5] = pieceMatrix[5][2];
		resultPiece[2][6] = pieceMatrix[5][1];
		resultPiece[2][7] = pieceMatrix[5][0];

		resultPiece[3][0] = pieceMatrix[4][7];
		resultPiece[3][1] = pieceMatrix[4][6];
		resultPiece[3][2] = pieceMatrix[4][5];
		resultPiece[3][3] = pieceMatrix[4][4];
		resultPiece[3][4] = pieceMatrix[4][3];
		resultPiece[3][5] = pieceMatrix[4][2];
		resultPiece[3][6] = pieceMatrix[4][1];
		resultPiece[3][7] = pieceMatrix[4][0];

		resultPiece[4][0] = pieceMatrix[3][7];
		resultPiece[4][1] = pieceMatrix[3][6];
		resultPiece[4][2] = pieceMatrix[3][5];
		resultPiece[4][3] = pieceMatrix[3][4];
		resultPiece[4][4] = pieceMatrix[3][3];
		resultPiece[4][5] = pieceMatrix[3][2];
		resultPiece[4][6] = pieceMatrix[3][1];
		resultPiece[4][7] = pieceMatrix[3][0];

		resultPiece[5][0] = pieceMatrix[2][7];
		resultPiece[5][1] = pieceMatrix[2][6];
		resultPiece[5][2] = pieceMatrix[2][5];
		resultPiece[5][3] = pieceMatrix[2][4];
		resultPiece[5][4] = pieceMatrix[2][3];
		resultPiece[5][5] = pieceMatrix[2][2];
		resultPiece[5][6] = pieceMatrix[2][1];
		resultPiece[5][7] = pieceMatrix[2][0];

		resultPiece[6][0] = pieceMatrix[1][7];
		resultPiece[6][1] = pieceMatrix[1][6];
		resultPiece[6][2] = pieceMatrix[1][5];
		resultPiece[6][3] = pieceMatrix[1][4];
		resultPiece[6][4] = pieceMatrix[1][3];
		resultPiece[6][5] = pieceMatrix[1][2];
		resultPiece[6][6] = pieceMatrix[1][1];
		resultPiece[6][7] = pieceMatrix[1][0];

		resultPiece[7][0] = pieceMatrix[0][7];
		resultPiece[7][1] = pieceMatrix[0][6];
		resultPiece[7][2] = pieceMatrix[0][5];
		resultPiece[7][3] = pieceMatrix[0][4];
		resultPiece[7][4] = pieceMatrix[0][3];
		resultPiece[7][5] = pieceMatrix[0][2];
		resultPiece[7][6] = pieceMatrix[0][1];
		resultPiece[7][7] = pieceMatrix[0][0];

		for (int i = 0; i < resultPiece.length; i++) {
			for (int j = 0; j < resultPiece.length; j++) {
				Piece piece = resultPiece[i][j];
				if (piece != null) {
					piece.setEnemy(!piece.isEnemy());
					resultPiece[i][j]=piece;
				}
			}
		}
//		for (int i = 0; i < resultPiece.length; i++) {
//			for (int j = 0; j < resultPiece.length; j++) {
//				Piece piece = resultPiece[i][j];
//				if (piece != null) {
//					Point p = reversesPosition(piece.getX(), piece.getY());
//					piece.setX(p.getX());
//					piece.setY(p.getY());
//					resultPiece[i][j]=piece;
//				}
//			}
//		}
		return resultPiece;
	}

	public static void main(String[] args) {

	}
}
