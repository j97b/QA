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
		int[] newIntegerArray = new int[10];
		for (int i = 0; i < newIntegerArray.length; i++) {
			newIntegerArray[i] = integerArray[i] * 10;
		}

		for (int k = 0; k < newIntegerArray.length; k++) {
			System.out.print("|" + newIntegerArray[k]);

		}
		System.out.print("|\n+--+--+--+--+--+--+--+--+--+---+");
	}
}