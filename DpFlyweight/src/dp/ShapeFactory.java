package dp;
//Create a factory to generate object of concrete class based on given information
/*Chaque fois qu'une demande vient de créer un cercle d'une couleur particulière à ShapeFactory, 
 * elle vérifie l'objet cercle dans son HashMap, si l'objet de Circle est trouvé, 
 * cet objet est retourné sinon un nouvel objet est créé, stocké dans hashmap pour une utilisation future, et renvoyé à client*/

import java.util.HashMap;

public class ShapeFactory {

   // Uncomment the compiler directive line and
   // javac *.java will compile properly.
   // @SuppressWarnings("unchecked")
   private static final HashMap circleMap = new HashMap();

   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);

      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}