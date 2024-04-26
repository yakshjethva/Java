public class InterfaceFish implements InterfacePrey,InterfacePredator
{
	public void hunt() 
	{
		System.out.println("*The fish is hunting*");
	}
	public void flee() 
	{
		System.out.println("*The fish is fleeing*");
	}
}