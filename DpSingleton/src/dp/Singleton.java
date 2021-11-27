package dp;

public class Singleton {
private static final Singleton singleton ;
private int compteur ;//attribut de classe singleton
static{  //une fois la classe charger en memoire le bloc static qui va s'exucuter et creer une instance 
	singleton = new Singleton();
}

private Singleton(){
	System.out.println("Objet instancialisé singleton");
	
};//un constructeur privee
public static Singleton getInstance(){ //methode qui retourne cette instance
	return singleton;
}

public void traiter(String taskname){
	System.out.println("....traitment de la tache "+taskname);
	for(int i = 1; i<=5 ; i++){
	    ++compteur;
		System.out.println(".."+compteur);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
System.out.println("Fin du traitment de la tache "+taskname+" compteur = "+compteur);
}

}
