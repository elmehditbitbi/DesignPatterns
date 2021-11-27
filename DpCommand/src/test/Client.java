package test;

import dp.Commande;
import dp.CommandeA;
import dp.CommandeB;
import dp.CommandeC;
import dp.Invoqueur;
import dp.RecepteurImp1;
import dp.RecepteurImp2;

public class Client {

	public static void main(String[] args) {
		RecepteurImp1 rec1 = new RecepteurImp1();
		RecepteurImp2 rec2 = new RecepteurImp2();
        
		Commande cmd1 = new CommandeA(rec1);
		Commande cmd2 = new CommandeB(rec1);
		Commande cmd3 = new CommandeC(rec2);
		Invoqueur telecomande = new Invoqueur();
		telecomande.addNewCommande("A", cmd1);
		telecomande.addNewCommande("B", cmd2);
		telecomande.addNewCommande("C", cmd3);
		telecomande.invoquer("A");
		telecomande.invoquer("C");
		telecomande.invoquer("C");
	}

}
