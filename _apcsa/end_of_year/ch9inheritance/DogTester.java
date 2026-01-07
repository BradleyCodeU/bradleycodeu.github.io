public class DogTester
{
	public static void main(String[] args)
	{
		// create Dog object
		Dog d = new Dog("Collie","Bella");
		System.out.println(d.toString());

		Dog d2 = new Dog("Dalmation");
		System.out.println(d2.toString());
	}
}