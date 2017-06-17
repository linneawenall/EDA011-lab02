import se.lth.cs.pt.square.Square;
import se.lth.cs.pt.window.SimpleWindow;

public class SquarePrintClicks {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "SquarePrintClicks");
		Square sq = new Square(100, 100, 100); // ny kvadrat skapas
		sq.draw(w); // kvadraten ritas i fönstret w
		while (true) { // fortsätter
			w.waitForMouseClick(); // vänta på musklick
			sq.erase(w); // När musklick skett, raderas kvadraten
			int Oldx = w.getX(); // Kvadratens gamla X-koordinat hämtas
			int Oldy = w.getY(); // Kvadratens gamla Y-koordinat hämtas
			int dx = w.getMouseX() - Oldx; // Skillnaden i X-led bestäms
			int dy = w.getMouseY() - Oldy; // Skillnaden i Y-led bestäms
			sq.move(dx, dy); // Kvadraten flyttas dx steg i X-led och dy
			sq.draw(w); // Kvadraten ritas upp igen

		}
	}
}