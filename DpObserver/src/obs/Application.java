package obs;

public class Application {

	public static void main(String[] args) {
		ObservableConcret sujet = new ObservableConcret();
		ObservateurConcret obs1 = new ObservateurConcret();
		sujet.addObservateur(obs1);
		ObservateurConcret1 obs2 = new ObservateurConcret1();
		sujet.addObservateur(obs2);
		sujet.setEtat(4);
	}

}
