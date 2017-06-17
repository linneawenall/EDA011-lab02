import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class Square10step {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Square10step");
		Square sq = new Square(100, 100, 100); // ny kvadrat skapas
		sq.draw(w); // kvadraten ritas i fönstret w
		while (true) { // fortsätter i loop
			w.waitForMouseClick(); // vänta på musklick
			int Oldx = w.getX(); // Kvadratens gamla X-koordinat hämtas
			int Oldy = w.getY(); // Kvadratens gamla Y-koordinat hämtas
			int dx = (w.getMouseX() - Oldx) / 10; // Skilln i X-led per flytt
			int dy = (w.getMouseY() - Oldy) / 10; // Skilln i Y-led per flytt
			for (int i = 0; i < 10; i++) { // fortsätter så länge i<10 (10ggr)
				sq.move(dx, dy); // Kvadraten flyttas dx steg i X-led resp y
				sq.draw(w); // Kvadraten ritas upp igen
			}
		}
	}
}