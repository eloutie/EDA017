import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class AnimatedSquare {
	public static void main(String[] args) {

		SimpleWindow w = new SimpleWindow(600, 600, "Drawing Window");
		Square sq = new Square(0, 0, 100);
		int oldX = 0;
		int oldY = 0;

		while (true) {
			w.waitForMouseClick();
			int x = w.getMouseX();
			int y = w.getMouseY();
			int xDist = x - oldX;
			int yDist = y - oldY;

			for (int i = 10; i > 0; i--) {
				SimpleWindow.delay(10);
				sq.erase(w);
				sq.move((xDist / 10), (yDist / 10));
				sq.draw(w);
			}

			oldX = x;
			oldY = y;
		}

	}
}
