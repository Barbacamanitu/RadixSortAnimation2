import java.util.Random;

public class RadixMain {

	private static int[] numbers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers = new int[20];
		
		//Fill numbers with random
		Random randGen = new Random();
		for (int i = 0; i < 20; i++)
		{
			numbers[i] = randGen.nextInt(1000);
		}
		
		int test = 1;
		

	}

}
