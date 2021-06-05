import java.util.Observable;

/* Classe permettant de gerer une Lampe */
public class Lampe extends Observable{
  /* Attribut de la classe Lampe */
  private boolean allume;

  /* Constructeur de la classe Lampe */
  public Lampe(){
    this.allume = false;
  }

  /* Methode permettant d'allumer la Lampe */
  public void allumer(){
    if(!allume){
      allume = true;
      setChanged();
      notifyObservers();
    }
  }

  /* Methode permettant d'eteindre la Lampe */
  public void eteindre(){
    if(allume){
      allume = false;
      setChanged();
      notifyObservers();
    }
  }

  /* Methode qui renvoie true si la Lampe est allumee sinon false */
  public boolean etreAllume(){
    if(allume) return true;
    else return false;
  }
}
