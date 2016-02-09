import se.lth.cs.pt.window.SimpleWindow;

public class TestPointSquare {
	public static void main(String[] args) {
		
		SimpleWindow w = new SimpleWindow(500, 500, "Testing");
		Square bigSquare = new Square(50, 50, 250);
		Square smallSquare1 = new Square(100, 100, 100);
		Square smallSquare2 = new Square(250, 250, 100);
		
		bigSquare.draw(w);
		smallSquare1.draw(w);
		smallSquare2.draw(w);
		
		if (bigSquare.contains(smallSquare1)) {
			System.out.println("Ja, den stora kvadraten innehåller den lilla kvadraten.");
		} else {
			System.out.println("Nej, den stora kvadraten innehåller inte den lilla kvadraten.");
		}
	}
}
