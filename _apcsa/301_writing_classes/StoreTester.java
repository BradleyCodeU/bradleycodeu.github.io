public class StoreTester
{
	public static void main(String[] args)
	{
		//1. First Constructor and toString
		Store store1 = new Store("grocery");
		System.out.println("1. \nOUTPUT: Grocery store is open from 10am to 9pm");
		System.out.println("YOUR OUTPUT: "+store1);
		System.out.println();

		//2. Second constructor and toString
		Store store2 = new Store("pet", 8, 18);
		System.out.println("2.\nOUTPUT: Pet store is open from 8am to 6pm");
		System.out.println("YOUR OUTPUT: "+store2);
		System.out.println();

		//3. getType
		Store store3 = new Store ("grocery", 0, 23);
		System.out.println("3.\nOUTPUT: grocery");
		System.out.println("YOUR OUTPUT: "+store3.getType());
		System.out.println();

		//4. getNumHoursOpen
		Store store4 = new Store ("pet", 7, 20);
		System.out.println("4.\nOUTPUT: 13");
		System.out.println("YOUR OUTPUT: "+store4.getNumHoursOpen());
		System.out.println();

		//5. isOpen (true - store is open)
		Store store5 = new Store ("grocery");
		System.out.println("5.\nOUTPUT: true");
		System.out.println("YOUR OUTPUT: "+store5.isOpen(12));
		System.out.println();

		//6. isOpen (false - store is closed)
		Store store6 = new Store ("pet", 12,20);
		System.out.println("6.\nOUTPUT: false");
		System.out.println("YOUR OUTPUT: "+store6.isOpen(11));
		System.out.println();

		//7a. setType - invalid
		Store store7 = new Store("pet");
		System.out.println("7a.\nOUTPUT: false");
		System.out.println("YOUR OUTPUT: "+store7.setType("card"));
		System.out.println();

		//7b. type not changed
		System.out.println("7b.\nOUTPUT: pet");
		System.out.println("YOUR OUTPUT: "+store7.getType());
		System.out.println();

		//8a. setType - valid
		Store store8 = new Store("pet");
		System.out.println("8a.\nOUTPUT: true");
		System.out.println("YOUR OUTPUT: "+store8.setType("grocery"));
		System.out.println();

		//8b. type changed
		System.out.println("8b.\nOUTPUT: grocery");
		System.out.println("YOUR OUTPUT: "+store8.getType());
		System.out.println();

		//9. convertTime - am
		System.out.println("9.\nOUTPUT: 11am");
		System.out.println("YOUR OUTPUT: "+Store.convertTime(11));
		System.out.println();

		//10. convertTime - pm
		System.out.println("10.\nOUTPUT: 5pm");
		System.out.println("YOUR OUTPUT: "+Store.convertTime(17));
		System.out.println();

		//11a. setHours - valid
		Store store11 = new Store("grocery");
		System.out.println("11a.\nOUTPUT: true");
		System.out.println("YOUR OUTPUT: "+store11.setHours(5,23));
		System.out.println();

		//11b. Check if new Hours were set
		System.out.println("11b.\nOUTPUT: Grocery store is open from 5am to 11pm");
		System.out.println("YOUR OUTPUT: " + store11);
		System.out.println();

		//12a. setHours - invalid
		Store store12 = new Store("pet");
		System.out.println("12a.\nOUTPUT: false");
		System.out.println("YOUR OUTPUT: "+store12.setHours(11,24));
		System.out.println();

		//12b. Hours should not have changed
		System.out.println("12b.\nOUTPUT: Pet store is open from 10am to 9pm");
		System.out.println("YOUR OUTPUT: " + store12);
		System.out.println();


		//13a. setHours - invalid
		Store store13 = new Store("pet");
		System.out.println("13a.\nOUTPUT: false");
		System.out.println("YOUR OUTPUT: "+store13.setHours(12,4));
		System.out.println();

		//13b. Hours should not have changed because open is after close
		System.out.println("13b.\nOUTPUT: Pet store is open from 10am to 9pm");
		System.out.println("YOUR OUTPUT: " + store13);
		System.out.println();
	}
}
