package chess;

import boadgame.Board;
import chess_pieces.King;
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

	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.White));
		placeNewPiece('c', 2, new Rook(board, Color.White));
		placeNewPiece('d', 2, new Rook(board, Color.White));
		placeNewPiece('e', 2, new Rook(board, Color.White));
		placeNewPiece('e', 1, new Rook(board, Color.White));
		placeNewPiece('d', 1, new King(board, Color.White));
		
		placeNewPiece('c', 7, new Rook(board, Color.Black));
		placeNewPiece('c', 8, new Rook(board, Color.Black));
		placeNewPiece('d', 7, new Rook(board, Color.Black));
		placeNewPiece('e', 7, new Rook(board, Color.Black));
		placeNewPiece('e', 8, new Rook(board, Color.Black));
		placeNewPiece('d', 8, new King(board, Color.Black));
	}

}
