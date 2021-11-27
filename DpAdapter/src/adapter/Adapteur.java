package adapter;
//methode par heritage
import ext.ImpAdapter;

public class Adapteur extends ImpAdapter implements Standard {

	public void operation(int nb1, int nb2) {
		int resultat = operation2(nb1, nb2);
		operation3(resultat);
		}

}
