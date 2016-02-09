import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.moveTo(0, 0);
		while (true) {
			
			//Vänta tills användaren klickar på en musknapp
			//Rita en linje till den punkt där användaren klickade
			w.waitForMouseClick();
			w.lineTo(w.getMouseX(), w.getMouseY());
		}
	}
}
