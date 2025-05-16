/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public Hippo(String food, boolean nocturnal, 
                  double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
  }

  public Hippo()
  {
    super();
  }

  public void groan()
  {
    System.out.println("The hippo groans.");
  }

  @Override
  public void speak()
  {
    groan();   
  }
}