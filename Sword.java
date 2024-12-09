import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Sword
{
	static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Integer> weaponInv = new ArrayList<>();
	
	static int swordOfFlames;
	static int swordOfSlicing;
	static int swordOfBleeding;
	static int swordOfHealing;
	
	public static void enchant()
    {
		if(weaponInv.isEmpty())
		{
			System.out.println("You have no weapons to use");
		}
		else
		{
			System.out.println("These are the swords you have: (1)Sword Of Flames; (2)Sword of Slicing; (3)Sword of Bleeding; (4)Sword of Healing");
			System.out.println("Do you want a breakdown of what each sword does(1) or choose a sword(2)");
			int swordChoice = scanner.nextInt();
			
			if(swordChoice == 1)
			{
				System.out.println("What sword do you want to learn about: (1) (2) (3) (4)? ");
				int loreChoice = scanner.nextInt();
				if(loreChoice == 1)
				{
					System.out.println();
				}
			}
			
		}
	}
}