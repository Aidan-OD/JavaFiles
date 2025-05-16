public class Elephant extends Animal
{
    //Step 13-15
    public Elephant(String food, boolean nocturnal, 
                    double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephant arrives"); //Step 16
    }

    //Step 24
    public Elephant()
    {
        System.out.println("An elephant arrives");
    }

    public void trumpet()
    {
        System.out.println("The elephant trumpets.");
    }

    public void forage()
    {
        System.out.println("The elephant forages for food.");
    }

    @Override
    public void speak()
    {
        trumpet();
    }

    //4.9.6: Step 8
    public String toString()
    {
    return "This is an object of the Elephant class.";
    }
}
