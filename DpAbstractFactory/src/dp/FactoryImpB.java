package dp;

public class FactoryImpB implements AbstractFactory {

	public AbstractPlugin getInstance() {
		
		return new PluginImpB();
	}

}
