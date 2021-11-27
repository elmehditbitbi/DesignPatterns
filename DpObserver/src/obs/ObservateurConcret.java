package obs;

public class ObservateurConcret implements Observateur {

	public void update(Observable o) {
		int etat = ((ObservableConcret) o).getEtat();
		System.out.println("Resultat : "+etat*3);
		
	}

}
