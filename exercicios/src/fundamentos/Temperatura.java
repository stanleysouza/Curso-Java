package fundamentos;


public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final int a = 32;
		final double b = 5.0/9.0;
		
		double tempf = 18;
		double tempc = (tempf - a) * b;
		System.out.println(tempc);
		
		
		tempf = 86;
		tempc = (tempf - 32) * b;
		System.out.println(tempc);
	}
}
