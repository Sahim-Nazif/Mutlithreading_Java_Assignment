
public class Subtract implements Runnable
{
	private int firstNum;
	private int secondNum;

	public Subtract(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	@Override
	public void run() {
		System.out.println("The result of the subtraction operation on " + firstNum + "and " + secondNum + " is"
				+ (firstNum - secondNum));

	}

}
