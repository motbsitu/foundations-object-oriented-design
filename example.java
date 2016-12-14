public class Spaceship{
  //instance variables
  public String name;
  private in shieldStrength;

  //constructor method
  public Spaceship(){
      name = "Unnamed Ship";
      shieldStrength = 100;
  }
  //methods
  public String fire(){
    return "Boom!";
  }
  public void reduceShields(int amount){
    shieldStrength -= amount;
  }
}

//Inheritance from the Product class
public class Album extends Product { ...}

//call a method from the parent class
super.doSomething();
