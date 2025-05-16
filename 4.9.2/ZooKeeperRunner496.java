

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner496
{
  public static void main(String[] args)
  {
    //Step 1-3
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    //a.trumpet();  //Animal does not always have-a trumpet method and cannot call it

    //Step 4-6
    Animal a1 = new Animal();
    a1.sleep();
    //Object a2 = new Animal();
    //a2.sleep();

    //Step 7-10
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());

    //Step 11
    Animal a3 = new Animal();
    System.out.println(a3.toString());

    //Step 13
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());

    //Step 15
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());
  }

  public static void hearTheAnimal(Animal currentAnimal)
  {
    currentAnimal.speak();
  }
}