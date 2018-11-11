import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {
		String exit;

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Centennial College Multithreaded Calculator");

		do {
			System.out.print("Please enter the first integer: ");
			int firstNum = Integer.parseInt(input.nextLine());
			System.out.print("Please enter the second integer: ");
			int secondNum = Integer.parseInt(input.nextLine());

			
			Addition add = new Addition(firstNum, secondNum);
			Subtract sub = new Subtract(firstNum, secondNum);
			Mutlipication mul = new Mutlipication(firstNum, secondNum);
			Division div = new Division(firstNum, secondNum);

			
			Thread addThread = new Thread(add);
			Thread subThread = new Thread(sub);
			Thread mulThread = new Thread(mul);
			Thread divThread = new Thread(div);

			
			ExecutorService executorService = Executors.newCachedThreadPool();

			
			executorService.execute(addThread); 
			executorService.execute(subThread); 
			executorService.execute(mulThread); 
			executorService.execute(divThread); 

			
			executorService.shutdown();

			
			while (!executorService.isTerminated()) {

			}

			System.out.print("\nWould you like to run again (y/n)? ");
			
			exit = input.nextLine().toUpperCase();
			
		} while (exit.charAt(0) == 'Y');

		System.out.println("\tBye. Have a good day !");

		input.close();
	}

}
