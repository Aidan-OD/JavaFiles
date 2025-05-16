public class Tiger extends Feline
{
    //Step 21-22
    public Tiger(String food, boolean nocturnal, 
                    double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A tiger arrives");
    }

    public Tiger()
    {
        super();
        System.out.println("A tiger arrives");
    }

    public void huntAlone()
    {
        System.out.println("The tiger hunts alone.");
    }

    public void swim()
    {
        System.out.println("The tiger swims.");
    }

    @Override
    public void roar()
    {
        System.out.println("The tiger roars.");
    }

    @Override
    public void speak()
    {
       roar(); 
    }
}
