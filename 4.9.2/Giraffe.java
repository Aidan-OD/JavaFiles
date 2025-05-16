/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public Giraffe(String food, boolean nocturnal, 
                  double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("A giraffe has arrived");
  }

  public Giraffe()
  {
    super();
  }

  public void hum()
  {
    System.out.println("The giraffe hums.");
  }

  @Override
  public void speak()
  {
    hum();     
  }
}