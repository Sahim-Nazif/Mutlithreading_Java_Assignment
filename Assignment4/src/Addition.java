
public class Addition implements Runnable {
	private int firstNum;
	private int secondNum;

	public Addition(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	@Override
	public void run() {
		
		System.out.println("The result of the addition operation on " +
		firstNum +"and " +secondNum +" is  " + (firstNum +secondNum));

	}
}