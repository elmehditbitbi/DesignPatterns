package obs;
//interface qui contient tout les classe qui doit etre observer
public interface Observable {
public void addObservateur(Observateur o);
public void deleteObservateur(Observateur o);
public void notifyObservateur();
}
