
public class Division implements Runnable {

	private int firstNum;
	private int secondNum;

	public Division(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;

	}

	@Override
	public void run() {
		System.out.println("The result of the division operation on " + firstNum + "and " + secondNum + " is"
				+ (firstNum / secondNum));

	}

}
