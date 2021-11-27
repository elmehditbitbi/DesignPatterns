package dp;
//ProxyImage est une classe proxy pour réduire l'empreinte mémoire du chargement des objets RealImage.

public class ProxyImage implements Image{

	   private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

	   public void display() {
	      if(realImage == null){
	         realImage = new RealImage(fileName);
	      }
	      realImage.display();
	   }
	}