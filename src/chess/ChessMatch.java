package chess;

import boadgame.Board;
import boadgame.Position;
import chess_pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];

		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matriz[i][j] = (ChessPiece) board.piece(i, j);
			}

		}
		return matriz;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.Black), new Position(3, 3));
	}

}
