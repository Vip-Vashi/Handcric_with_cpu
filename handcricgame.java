package psna;
import  java.util.*;
public class handcricgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		

		int ran= r.nextInt(1,7);

		System.out.println("choose odd or even");

		String s = sc.next(); 

		int choose=0,flag=0,score=0,score1=0;

		int n = sc.nextInt();

		if(n<6 && (s.equalsIgnoreCase("odd")||s.equalsIgnoreCase("even")))

		{

			if(s.equalsIgnoreCase("odd") && (n+ran)%2!=0)

			{

				System.out.println("1.bat or 2.bowl");

				choose = sc.nextInt();

			}	

			else if(s.equalsIgnoreCase("even") && (n+ran)%2==0)

			{

				System.out.println("1.bat or 2.bowl");

				choose = sc.nextInt();

			}	

			else

			{

				choose = r.nextInt(1,3);

				if(choose==1) System.out.println("Computer bowls");

				else System.out.println("Computer bats");

			}		

		}

		else

			System.out.println("enter less than 6 or enter a correct input");

		if(choose ==1)

		{

			while(flag!=1)

			{

				System.out.println("Enter your run (1-6): ");

				int run=sc.nextInt();

				int bowl=r.nextInt(1,7);

				System.out.println("CPU bowls "+bowl);

				if(run<=6 && run>=1)

				{

					if(run==bowl)

					{

						System.out.println("You are out with score: "+score);

						flag=1;

					}

					else

						score+=run;

				}

				else

					System.out.println("enter less than or equal to 6");

			}

			flag=0;

			while(flag!=1)

			{

				System.out.println("Enter your bowl(1-6): ");

				int bowl=sc.nextInt();

				int run=r.nextInt(1,7);

				System.out.println("CPU hits "+run);

				if(bowl<=6 && bowl>=1)

				{

					if(run==bowl)

					{

						System.out.println("You Won by "+(score-score1));

						flag=1;

					}

					score1+=run;

					if(score1>score && flag==0)

					{

						System.out.println("You Lose by "+(score1-score));

						flag=1;

					}

				}

				else

					System.out.println("enter less than or equal to 6");

			}

		}

		else if(choose==2)

		{

			while(flag!=1)

			{

				System.out.println("Enter your bowl (1-6): ");

				int bowl=sc.nextInt();

				int run=r.nextInt(1,7);

				System.out.println("CPU hits "+run);

				if(bowl<=6 && bowl>=1)

				{

					if(run==bowl)

					{

						System.out.println("CPU out with score: "+score);

						flag=1;

					}

					else

						score+=run;

				}

				else

					System.out.println("enter less than or equal to 6");

			}

			flag=0;

			while(flag!=1)

			{

				System.out.println("Enter your runs(1-6): ");

				int run=sc.nextInt();

				int bowl=r.nextInt(1,7);

				System.out.println("CPU bowls "+bowl);

				if(run<=6 && run>=1)

				{

					if(run==bowl)

					{

						System.out.println("You lose by "+(score-score1));

						flag=1;

					}

					score1+=run;

					if(score1>score  && flag==0)

					{

						System.out.println("You Won by "+(score1-score));

						flag=1;

					}

				}

				else

					System.out.println("enter less than or equal to 6");

			}

		}

		

	}

}
