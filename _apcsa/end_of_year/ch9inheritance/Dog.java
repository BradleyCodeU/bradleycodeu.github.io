public class Dog
{
	private String breed;
	private String name;

	public Dog(String br, String nm)
	{
		breed = br;
		name = nm;
	}

	public Dog(String br)
	{
		breed = br;
		name = "";
	}

	public String getBreed()
	{
		return breed;
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		String output = "Breed: " + getBreed();
		output += "\nName: " + getName();
		return output;
	}
}