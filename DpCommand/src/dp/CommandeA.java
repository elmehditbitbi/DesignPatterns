package dp;

public class CommandeA implements Commande {
    private RecepteurImp1 recepteur1 ;//composition dans le diagramme de classe
	 public CommandeA(RecepteurImp1 recepteur) {
		super();
		this.recepteur1 = recepteur;
	}

	public void executer() {	
	recepteur1.action1();
	}

}
