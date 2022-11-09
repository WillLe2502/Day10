package day10;

public class TheFeast {
	public static void main (String args[]) {
		int bar = theFeast(6,2,2);
		System.out.println("Number of Bar = " + bar);
	}

	/**
	 * n = number of money 
	 * c = cost of 1 bar 
	 * m = number of wrapper to 1 bar
	 * consume 1 bar to have 1 wrapper 
	 **/
	static int countStep = 0;
	static int numberOfBar = 0;

	public static int theFeast(int n, int c, int m) {
		countStep++;

		numberOfBar = numberOfBar + (n / c);
		
		int numberOfWrappers = numberOfBar;
		
		while (numberOfWrappers >= m) {
			countStep++;
			
			numberOfBar = numberOfBar + numberOfWrappers / m;
			numberOfWrappers = numberOfWrappers % m + numberOfWrappers / m;
		}
		
		System.out.println("Number of Step = " + countStep);
		return numberOfBar;
	}
}
