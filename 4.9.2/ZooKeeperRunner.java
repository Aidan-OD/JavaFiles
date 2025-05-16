
import java.util.ArrayList;

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { /* 
    //Step 6
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();
    System.out.println();

    //Step 15
    elephant.eat();
    elephant.getLifeSpan(); 
    System.out.println();

    //Step 8
    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.roar();
    tiger.eat();
    System.out.println();

    //Step 24
    Tiger tig = new Tiger();
    Elephant ele = new Elephant();
    System.out.println();

    //Step 25
    Gorilla gorilla = new Gorilla();
    System.out.println();

    //Step 27
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();
    System.out.println();

    //Step 28
    Hippo hippo = new Hippo();
    hippo.eat();
    System.out.println();

    //Step 30
    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat(); */

    ArrayList<Animal> zoo = new ArrayList<Animal>();

    Deer d = new Deer();
    zoo.add(d);
    Elephant e = new Elephant();
    zoo.add(e);
    Giraffe gi = new Giraffe("leaves", false, 25.0);
    zoo.add(gi);
    Gorilla g = new Gorilla();
    zoo.add(g);
    Hippo h = new Hippo();
    zoo.add(h);
    Lion l = new Lion();
    zoo.add(l);
    Monkey m = new Monkey();
    zoo.add(m);
    Owl o = new Owl();
    zoo.add(o);
    Penguin p = new Penguin();
    zoo.add(p);
    Tiger t = new Tiger();
    zoo.add(t);

    for (Animal animal : zoo)
      animal.speak();
  }
}