package m02.s10.ex;

public class Exercise1 {

	public static void main(String[] args) {
		// (1) for loop

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
		// print all values in [0 .. 9]

		// (2) while loop

		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

	}

// (3) do while loop 
	int i = 0;
	{
		do {
			System.out.println(i);
			i++; 
		} while (i < 10);
	}
}
