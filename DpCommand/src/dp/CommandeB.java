package dp;

public class CommandeB implements Commande {
    private RecepteurImp1 recepteur2;
	public CommandeB(RecepteurImp1 recepteur2) {
		super();
		this.recepteur2 = recepteur2;
	}

	public void executer() {
	recepteur2.action1();	
		
	}

}
