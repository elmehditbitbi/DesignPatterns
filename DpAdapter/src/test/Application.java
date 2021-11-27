package test;
import adapter.Adapteur;
import adapter.Standard;
import adapter.StandardImp1;
public class Application {

	public static void main(String[] args) {
		
		Standard standar1 = new StandardImp1();
		standar1.operation(5,6);

		Standard standar2 = new Adapteur();
		standar2.operation(5,6);
		}


	}


