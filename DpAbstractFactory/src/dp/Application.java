package dp;

public class Application {

	public static void main(String[] args) throws Exception {
		//implementation statique
		AbstractFactory factory = new FactoryImpA();
		AbstractPlugin plugin = factory.getInstance();
		plugin.traitment();
       //implementation dynamique
	   AbstractFactory factory2 = (AbstractFactory) Class.forName("dp.FactoryImpB").newInstance();		
	   AbstractPlugin plugin2 = factory2.getInstance();
	   plugin2.traitment();
	
	}}


