package m02.s10;

public class While {
	public static void main(String[] args) {
		int i = 0;
		while (i < args.length) {
			System.out.println("the argument" + i + " is " + args[i]);
			i += 1;
			// i++;
			// ++i ;
			// i= i+1;

		}

		System.out.println("done!");
	}


public int hottestDay (double[]temperatures) {
	if (temperatures == null|| temperatures.length == 0) {
	throw new IllegalArgumentException ("Bad Input!");
	
	}	
		
		int indexMaxTemperature = 0;
	double MaxTemperature = temperatures[indexMaxTemperature] ;
	
	int i = 0 ; 
	while (i < temperatures.length ) { 
		if (temperatures [i] > MaxTemperature) {
			MaxTemperature =temperatures [i]; 
			indexMaxTemperature = i ; 
		}
			
	}
	
	
	return indexMaxTemperature;
}
}

	
		