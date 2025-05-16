public class Lion extends Feline
{
    public void huntInPack()
    {
        System.out.println("The lion hunts with its pack.");
    }

    @Override
    public void roar()
    {
        System.out.println("The Lion roars.");
    }

    @Override
    public void speak()
    {
        roar();
    }
}
