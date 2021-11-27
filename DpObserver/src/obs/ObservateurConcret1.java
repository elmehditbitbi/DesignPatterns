package obs;

public class ObservateurConcret1 implements Observateur {

	public void update(Observable o) {
		int etat = ((ObservableConcret) o).getEtat();
		System.out.println("Resultat : "+etat*6);

		
	}

}
