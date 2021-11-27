package dp;

public class Appli {

	public static void main(String[] args) {
		Context cntx = new Context();
		cntx.setStrategy(new StrategyImp1());
		cntx.appliquerStrategy();//traitement selon le choix de l'utilisateur
		cntx.setStrategy(new StrategyImp2());
		cntx.appliquerStrategy();
		cntx.setStrategy(new StrategyImp3());
		cntx.appliquerStrategy();
	}

}
