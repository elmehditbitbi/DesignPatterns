package dp;
//BridgePatternDemo, notre classe de démonstration utilisera la classe Shape pour dessiner des cercles de couleurs différentes.

public class BridgePatternDemo {
	   public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
	}
