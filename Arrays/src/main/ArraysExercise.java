package main;

public class ArraysExercise {

	public static void main(String[] args) {

		System.out.println("+--+--+--+--+--+--+--+--+--+---+");
		int[] integerArray = new int[10];
		{
			for (int i = 0; i < integerArray.length; i++) {
				integerArray[i] = i + 1;
			}

			for (int k = 0; k < integerArray.length; k++) {
				System.out.print("|" + integerArray[k] + " ");
			}
			System.out.println("|");
		}
		System.out.println("+--+--+--+--+--+--+--+--+--+---+");
		int[] integerArray2 = new int[10];
		for (int i = 0; i < integerArray2.length; i++) {
			integerArray2[i] = integerArray[i] * 2;
		}

		for (int k = 0; k < 4; k++) {
			System.out.print("|" + integerArray2[k] + " ");

		}
		for (int k = 4; k < 10; k++) {
			System.out.print("|" + integerArray2[k]);
		}
		System.out.print(" |\n+--+--+--+--+--+--+--+--+--+---+\n|...                           |\n+--+--+--+--+--+--+--+--+--+---+\n");

		int[] integerArray10 = new int[10];
		{
			for (int i = 0; i < integerArray10.length; i++) {
				integerArray10[i] = integerArray[i] * 10;
			}

			for (int k = 0; k < integerArray10.length; k++) {
				System.out.print("|" + integerArray10[k]);

			}
			System.out.print("|\n+--+--+--+--+--+--+--+--+--+---+");
		}
	}
}