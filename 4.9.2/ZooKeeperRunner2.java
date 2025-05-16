
import java.util.ArrayList;

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner2
{
  public static void main(String[] args)
  {
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
      hearTheAnimal(animal);
  }

  public static void hearTheAnimal(Animal currentAnimal)
  {
    currentAnimal.speak();
  }
}