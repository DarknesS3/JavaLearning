// Enter Array and Find Max, min and average value
public class MaxMinAvg {

	public static void main(String[] args) {
		int arrLenght = 100;
		double[] array = new double[arrLenght];
		for(int i = 0; i < array.length; i++) {
			array[i] = Math.random();
			System.out.print(" ¹ "+ i + " " + array[i]  );
			if(i%5 == 0 )
				System.out.println();
			
			
		}
			
		double maxE = array[0];
		double minE = array[0];
		double avg = 0;
		int maxPos = 0;  // position of max value
		int minPos = 0;  // position of min value
		for(int i = 0; i < array.length; i++) {
			if(maxE < array[i]) {
				maxE = array[i];
				maxPos = i;	
			}
			if(minE > array[i]) {
				minE = array[i];
				minPos = i;
			}
			avg += array[i]/array.length;
		}
		System.out.println();
		System.out.println("Position ¹ " + maxPos + "max = " + maxE);
		System.out.println("Position ¹ " + minPos + "min = " + minE);
		System.out.println("average = " + avg);
	}

}
