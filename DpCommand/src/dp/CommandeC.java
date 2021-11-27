package dp;

public class CommandeC implements Commande {
   private RecepteurImp2 recepteur3;
	
	public CommandeC(RecepteurImp2 recepteur3) {
		super();
		this.recepteur3 = recepteur3;
	}
    public void executer() {
		recepteur3.action3();
		
	}
}
