package boardgame;

public class Piece {
	
	protected Position position; //By Java default, the attribute receives null.
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}	
	
}
