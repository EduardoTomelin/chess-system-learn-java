package boardgame;

public class Position {

	private int row;
	private int colum;
	
	public Position(int row, int colum) {
		super();
		this.row = row;
		this.colum = colum;
		
	}
	
	public int getRow() {
		return this.row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColum() {
		return this.colum;
	}
	public void setColum(int colum) {
		this.colum = colum;
	}
	
	@Override
	public String toString() {
		return this.row + ", " + this.colum;
	}
	
}
