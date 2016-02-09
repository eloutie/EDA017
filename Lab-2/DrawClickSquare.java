import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawClickSquares {
	public static void main(String[] args) {
		
		SimpleWindow w = new SimpleWindow(600, 600, "Drawing Window");
		Square sq = new Square(0, 0, 100);
		int oldX = 0;
		int oldY = 0;
		
		while(true) {
			w.waitForMouseClick();
			sq.erase(w);
			int x = w.getMouseX();
			int y = w.getMouseY();
			int xDist = x - oldX;
			int yDist = y - oldY;
			sq.move(xDist, yDist);
			sq.draw(w);
			oldX = x;
			oldY = y;
		}
		
	}
}
