public class Elephant extends Animal
{
  public void trumpet()
  {
    System.out.println(getName() + ": wooooooo");
  }

  public void forage()
  {
    System.out.println(getName() + ": looks around for food");
  }

  // Elephant speak method
  public void speak() {
    self.trumpet();
  }

  public String toString()
  {
    return "This is an object of the Elephant class.";
  }
 }
