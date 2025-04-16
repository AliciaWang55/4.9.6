/*
 * Activity 4.9.2
 */

import java.util.ArrayList;

public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    System.out.println("My Felines");
    Lion myLion = new Lion();
    myLion.setName("Romeo");
    myLion.setLifeSpan(5.0);
    myLion.isNocturnal(false);
    myLion.setFood("deer");
    myLion.growl();
    myLion.roar();
    myLion.huntInPack();

    Tiger myTiger = new Tiger();
    myTiger.setName("Tybalt");
    myTiger.growl();
    myTiger.roar();
    myTiger.huntAlone();
    myTiger.swim();

    System.out.println("My Elephant");
    Elephant myElephant = new Elephant();
    Elephant("leaves, grasses, roots", false, 60.0);
    myElephant.setName("Balthasar");
    myElephant.forage();
    myElephant.trumpet();

    System.out.println("My Primates");
    Monkey myMonkey = new Monkey();
    myMonkey.setName("Peter");
    myMonkey.forage();
    myMonkey.hoot();
    myMonkey.climb();
    myMonkey.howl();
    
    Gorilla myGorilla = new Gorilla();
    myGorilla.setName("Gregory");
    myGorilla.forage();
    myGorilla.grunt();
    
    System.out.println("My Hooved Animals");
    Hippo myHippo = new Hippo();
    myHippo.setName("Benvolio");
    myHippo.forage();
    myHippo.groan();
    
    Giraffe myGiraffe = new Giraffe();
    myGiraffe.setName("Langston");
    myGiraffe.forage();
    myGiraffe.hum();
    
    Deer myDeer = new Deer();
    myDeer.setName("Juliet");
    myDeer.forage();
    myDeer.grunt(); 

    // create zoo
    ArrayList<Animal> zoo = new ArrayList<>();

    // add animals to zoo
    zoo.add(myLion);
    zoo.add(myTiger);
    zoo.add(myElephant);
    zoo.add(myMonkey;
    zoo.add(myGorilla);
    zoo.add(myHippo);
    zoo.add(myGiraffe);
    zoo.add(myDeer);

    for (Animal animal: zoo) {
      animal.speak();
    }

    // call the new method
    hearTheAnimal(myMonkey);
    hearTheAnimal(myGiraffe);
    
    
       
  }

  public static void hearTheAnimal(Animal currentAnimal)
  {
    currentAnimal.speak();
  }

  // 4.9.6
  Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
  a.isNocturnal();
  // a.trumpet();

  // Animal a1 = new Animal();
  // a1.sleep();
  // Object a2 = new Animal();
  // a2.sleep();

  Object o = new Object();
  System.out.println(o.toString());
  Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
  System.out.println(e.toString());

  Animal a3 = new Animal();
  System.out.println(a3.toString());

  Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
  System.out.println(a4.toString());

  Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
  System.out.println(o2.toString());
}
