package bai1;
import java.util.Scanner;

public class Bai1 {
	private void swapArray(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	 public static void main(String[] args) {
	        Bai1 sw = new Bai1();
	        Scanner scan = new Scanner(System.in);
	        int arr[] = new int[2];
	         
	        System.out.print("Nhap a = ");
	        arr[0] = scan.nextInt();
	        System.out.print("Nhap b = ");
	        arr[1] = scan.nextInt(); 
	         
	        System.out.println("Befor swap: a = " + arr[0] + " b = " + arr[1]);
	        sw.swapArray(arr, 0, 1);
	        System.out.println("After swap: a = " + arr[0] + " b = " + arr[1]);
	         
	        scan.close();
	    }
}
