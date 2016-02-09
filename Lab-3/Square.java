

import se.lth.cs.pt.window.SimpleWindow;

public class Square {
	private Point p;	// Den övre vänstra punkten i kvadraten
	private int side;	// Sidlängd

	/** Skapar en kvadrat med övre, vänstra hörnet i x,y  
	    och med sidlängden side. */
	public Square(int x, int y, int side) {
		this.p = new Point(x, y);
		this.side = side;
	}
	
	/** Ritar kvadraten i fönstret w. */
	public void draw(SimpleWindow w) {
		w.moveTo(p.getX(), p.getY()) ;
		w.lineTo(p.getX(), p.getY() + side);
		w.lineTo(p.getX() + side, p.getY() + side);
		w.lineTo(p.getX() + side, p.getY());
		w.lineTo(p.getX(), p.getY());
	}
	
	/** Raderar bilden av kvadraten i fönstret w. */
    public void erase(SimpleWindow w) {
		w.setLineColor(java.awt.Color.white);
		draw(w);
		w.setLineColor(java.awt.Color.black);
  	}		
    
    /** Flyttar kvadraten avståndet dx i x-led, dy i y-led. */
	public void move(int dx, int dy) {
		p.move(dx, dy);
	}

	/** Tar reda på x-koordinaten för kvadratens läge. */
	public int getX() {
		return p.getX();
	}
	
	/** Tar reda på y-koordinaten för kvadratens läge. */
	public int getY() {
		return p.getY();
	}
	
	/** Tar reda på punkten i kvadratens övre vänstra hörn. */
	public Point getPoint() {
		return p;
	}
	
	/** Ändra kvadratens sida till side. */
	public void setSide(int side) {
		this.side = side;
	}
	
	/** Tar reda på kvadratens sida. */
	public int getSide() {
		return side;
	}
	
	/** Tar reda på kvadratens area. */
	public int getArea() {
		return side * side;
	}
	
	/** Returnerar punkten på diagonalt motsatt sida punkten p.*/
	private Point getCrossPoint() {
		return new Point(getX() + getSide(), getY() + getSide());
	}
	
	/** Returenerar true om denna kvadrat innesluter punkten (x, y). */
	public boolean contains(int x, int y) {
		return (x > p.getX() && x < (p.getX() + getSide()) && y > p.getY() && y < (p.getY() + getSide()));
	}
	
	/** Returnerar true om denna kvadrat innesluter punkten p. */
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	/** Returnerar true om denna kvadrat innesluter alla punkter i kvadraten sq. */
	public boolean contains(Square sq) {
		return (contains(sq.getPoint()) && contains(sq.getCrossPoint()));
	}
}
