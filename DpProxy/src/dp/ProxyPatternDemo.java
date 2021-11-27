package dp;
/*ProxyPatternDemo, notre classe de d�monstration 
utilisera ProxyImage pour obtenir un objet Image � charger et � afficher selon ses besoins.*/

public class ProxyPatternDemo {
	
	   public static void main(String[] args) {
	      Image image = new ProxyImage("elmehdi.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
	   }
	}
