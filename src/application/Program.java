package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatchTest = new ChessMatch();
		UI.printBoard(chessMatchTest.getPieces());
	}
}
