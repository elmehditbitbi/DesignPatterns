package dp;

import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
private Map <String , Commande> commandes = new HashMap<String , Commande>();
public void addNewCommande(String ref , Commande cmd){
	commandes.put(ref, cmd);
}
public void invoquer(String ref){
	Commande cmd = commandes.get(ref);
	if(cmd != null){
	cmd.executer();	
	}
}
}
