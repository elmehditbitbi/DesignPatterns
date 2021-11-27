package dp;
public class Context {
    protected Strategy strategy ;
	public void appliquerStrategy(){
	strategy.operationStrategy();
	 
	/*if(type==1){
		System.out.println("Traitement version 1");
	}else if(type==2){
		System.out.println("Traitement version 2");
	}else if(type==3){
		System.out.println("Traitement version 3");
	}else {  //probleme d'application ouvert a la modification
		System.out.println("Traitement version par defaut");
	}*/
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
