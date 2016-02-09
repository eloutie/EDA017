import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class DrawManySquares {
	public static void main(String[] args) {

		SimpleWindow w = new SimpleWindow(600, 600, "Drawing Window");
		Square sq = new Square(0, 0, 100);
		int oldX = 0;
		int oldY = 0;

		while (true) {
			w.waitForMouseClick();
			int x = w.getMouseX();
			int y = w.getMouseY();
			w.moveTo(x, y);
			int xDist = (x - oldX) / 10;
			int yDist = (y - oldY) / 10;

			for (int i = 0; i < 10; i++) {
				sq.move(xDist, yDist);
				sq.draw(w);
			}

			oldX = x;
			oldY = y;
		}

	}
}
