public class Feline extends Animal
{
    public Feline(String food, boolean nocturnal, 
                    double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives"); //Step 23
    }

    //Step 24
    public Feline()
    {
        System.out.println("A feline arrives");
    }

    public void roar()
    {
        System.out.println("The feline roars.");
    }

    public void growl()
    {
        System.out.println("The feline growls.");
    }

    @Override
    public void speak()
    {}
}
