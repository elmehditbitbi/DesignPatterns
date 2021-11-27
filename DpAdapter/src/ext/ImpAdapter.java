package ext;
//on veut utiliser cette classe en utilisant standard
public class ImpAdapter {
public int operation2(int nb1 , int nb2){
	return nb1*nb2;
}
public void operation3(int nb){
	System.out.println("Ancienne implementation resultat : "+nb);
}
}
