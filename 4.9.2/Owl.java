public class Owl extends Bird
{
    public Owl(String food, boolean nocturnal, 
                    double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An owl arrives");
    }

    public Owl()
    {
        super();
        System.out.println("An owl arrives");
    }

    public void hunt()
    {
        System.out.println("The Owl hunts for food.");
    }

    public void hoot()
    {
        System.out.println("The owl hoots.");
    }

    @Override
    public void speak()
    {
        hoot();
    }
}
