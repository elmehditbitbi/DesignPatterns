package dp;

public class FactoryImpA implements AbstractFactory {

	public AbstractPlugin getInstance() {
		
		return new PluginImpA();
	}

}
