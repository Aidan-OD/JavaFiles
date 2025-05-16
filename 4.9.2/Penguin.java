public class Penguin extends Bird
{
    public Penguin(String food, boolean nocturnal, 
                    double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
    }

    public Penguin()
    {
        super();
    }

    public void fish()
    {
        System.out.println("The penguin fishes for food.");
    }

    public void noise()
    {
        System.out.println("The penguin makes an unearthly sound.");
    }

    @Override
    public void speak()
    {
        noise();
    }
}
