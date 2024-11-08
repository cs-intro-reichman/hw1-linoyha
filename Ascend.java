// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt (args[0]);
		double a = Math.random() * range;
        double b = Math.random() * range;
		double c = Math.random() * range;
		double min = Math.min(Math.min(a,b),c);
		double max = Math.max(Math.max(a,b),c);
		double middle = (a+b+c) - min - max;
		System.out.println((int)min+ " "+(int)middle+ " "+(int)max);

	}
}
