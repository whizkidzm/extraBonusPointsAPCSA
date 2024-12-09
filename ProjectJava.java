import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ProjectJava
{
    static int userHealth = 100;
    static int bossHealth = 300;
    static int healBoss;
    static int healUser;
    static int damageRecieved;
    static int damageDealt;
    static int turnNum = 0;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer> weaponInv = new ArrayList<>();

    public static void enchant()
    {
		if(weaponInv.isEmpty())
		{
			System.out.println("You have no weapons to use");
		}
		else
		{
			int swordChoice = scanner.nextInt();
		}
	}

    public static void userFight()
    {
        if(userHealth > 0)
        {
            damageDealt = random.nextInt(10);
            bossHealth = bossHealth - damageDealt;
        }
        turnNum++;
    }

    public static void userHeal()
    {
		if(userHealth > 0)
		{
			healUser = random.nextInt(20)+1;
		}
		turnNum++;
	}

	public static void bossFight()
	{
		if(bossHealth > 0)
		{
		    damageDealt = random.nextInt(10);
		    userHealth = userHealth - damageDealt;
		}
        turnNum++;

	}

	public static void bossHeal()
	{
		if(bossHealth > 0)
		{
			healBoss = random.nextInt(20)+1;
			bossHealth = bossHealth+healBoss;
		}
		turnNum++;
	}

	public static void main(String[] args)
	{
		System.out.println("Boss Fight. Choose your options");
		boolean gameRun = true;
		while(gameRun)
		{
			if(bossHealth != 0 || userHealth != 0)
			{

				System.out.println("(1) Fight; (2) Heal");
				int choice = scanner.nextInt();

				if(choice == 1)
				{
					userFight();
					System.out.println("User health is " + userHealth);
					if(bossHealth <= 0)
					{
						gameRun = false;
					}
					System.out.println("Boss health is " + bossHealth);
					bossFight();
				}

				if(choice == 2)
				{
					userHeal();
					System.out.println("User Health is " + userHealth);
					bossFight();
				}

				if(userHealth<=0)
				{
					gameRun = false;
				}

			}
		}
		if(userHealth <=0)
		{
			System.out.println("User health is " + userHealth);
			System.out.println("You lost");
		}

		if(bossHealth <= 0)
		{
			System.out.println("Boss health is " + bossHealth);
			System.out.println("Congratulations! You beat the boss in " + turnNum + " turns!");
		}
	}
}
