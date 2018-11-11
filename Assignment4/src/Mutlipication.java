
public class Mutlipication implements Runnable{
	private int firstNum;
	private int secondNum;
	
 public Mutlipication (int firstNum, int secondNum) {
	 this.firstNum=firstNum;
	 this.secondNum=secondNum;
 }

@Override
public void run() {
	System.out.println("The result of the multipication operation on " + firstNum + "and " + secondNum + " is"
			+ (firstNum *secondNum));
	
}
 
}
