package dp;


public abstract class Figure implements Cloneable { //obligatoire d'implementer une interface de type clonable
protected Point p1;
protected Point p2;
public Figure(Point p1, Point p2) {
	super();
	this.p1 = p1;
	this.p2 = p2;
}
       @Override
public Figure clone() throws CloneNotSupportedException { //une methode deja qui existe dans la classe object
	
	Figure f = (Figure) super.clone();	
	return f;
	}
public abstract double surface();
	@Override
public String toString() {
	return "Figure [p1=" + p1 + ", p2=" + p2 + "]";
}

}
