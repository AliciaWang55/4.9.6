/*
 * Activity 4.9.2
 */
public class Animal
{
  private String food;
  private boolean nocturnal;
  private double aveLifeSpan;
  private String name;

  public void setName(String name)
  {
    this.name = name;
    System.out.println("My name is " + name);
  }
  
  public String getName()
  {
    return name;
  }

  public void setFood(String food)
  {
    this.food = food;
    System.out.println("I eat " + food);
  }
  
  public void eat() 
  {
    System.out.println("This animal's diet consists of " + food + ".");
  }
  
  public void isNocturnal(boolean nocturnal)
  {
    if (nocturnal)
      System.out.println("This animal is active at night.");
    else
      System.out.println("This animal is active during the day.");
  }

  public void setNocturnal(boolean nocturnal)
  {
    if (nocturnal)
      this.nocturnal = True;
    else
      this.nocturnal = False;
  }

  public void setLifeSpan(double years)
  {
    this.aveLifeSpan = years;
    System.out.println("My average lifespan is " + years);
  }
  
  public void getLifeSpan()
  {
     System.out.println("This animal's life span is " + aveLifeSpan + " years.");
  }
  
  public void sleep()
  {
    System.out.println("zzzzz");
  }
}
