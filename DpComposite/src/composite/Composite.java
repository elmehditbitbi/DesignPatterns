package composite;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.ListView;

public class Composite extends Composant{
    public Composite(String nom) {
		super(nom);
		
	}
	private List<Composant> composants=new ArrayList<Composant>(); 
	public void operation() {
		 String tab="";	
		 for(int i=0;i<=niveau;i++) tab+="----"; 
		System.out.println(tab+" Composite "+nom);
	for (Composant c : composants){
		c.operation();
	}	
	}
	      
	      
    public void add(Composant c){
    	c.niveau = this.niveau+1;
    	composants.add(c);
    }
    public void remove(Composant c){
    	composants.remove(c);
    }
    public List<Composant> getChild(){
    	return composants;
    }
}
