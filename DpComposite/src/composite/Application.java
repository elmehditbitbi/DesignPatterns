package composite;

public class Application {

	public static void main(String[] args) {
		Composite composite1 = new Composite("composite1");
		Composite composite2 = new Composite("composite2");
        composite1.add(composite2);
        composite1.add(new Element("element 11"));
        composite1.add(new Element("element 12"));
        composite1.add(new Element("element 13"));
        composite2.add(new Element("element 21"));
        composite2.add(new Element("element 22"));
        composite2.add(new Element("element 23"));
        composite1.operation();
	}

}
