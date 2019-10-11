import java.util.concurrent.ThreadLocalRandom;

//
public class BubbleSort {
	public static void main(String[] arg) {
		int length = 10;  // length of array
		int iteration = 1; //for stop sort if array are already sorted
		int sumnum = 0;  // too  know how many steps were done for sorted
		int[] array = new int[length];
		for(int i = 0; i < array.length; i++) {
			 array[i] = ThreadLocalRandom.current().nextInt(1,99); // create random int from 1 tp 99
			System.out.print(" || "+i + ".= " + array[i]);
			if(i%5 == 0)
				System.out.println();
		}
		//BubbleSort
		for(int i=0; i<array.length; i++) {
			if(iteration == 0) {  
			System.out.println();	
			System.out.println("Stop Sort!");
			break;
			}
			else iteration = 0;
			for(int j = array.length - 1; j > i; j--)
				if(array[j-1] > array[j]) {
				int temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
				iteration++;
				sumnum++;
				}
		}
		System.out.println();
		System.out.println("Sorted");
		for(int i = 0; i < array.length; i++) {
			System.out.print(" || "+i + ".= " + array[i]);
			if(i%5 == 0)
				System.out.println();
			}
			System.out.println();
			System.out.println("sorted by " + sumnum + " steps.");
	}
}
