package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable {
    private List<Observateur> observers = new ArrayList<Observateur>();
    private int etat ;
	public void addObservateur(Observateur o) {
		observers.add(o);
		
	}

	public void deleteObservateur(Observateur o) {
		observers.remove(o);
		
	}

	public void notifyObservateur() {
	    for(Observateur o : observers)
	    	o.update(this);
		
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyObservateur();
	}


}
