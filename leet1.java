package linearSearch;

import java.util.Scanner;

//Find the number with even number of digits
public class leet1 {
//by taking input in array
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println("Enter 5 numbers: ");
    for (int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("The numbers having even numbers of digits are: ");
    for (int j = 0; j < arr.length; j++){
        int count = 0;
        int num = arr[j];
        while (num > 0) {
            num = num/10;
            count++;
        }
        if (count % 2 == 0) {
            System.out.println(arr[j]);
        }
        sc.close();
    }
}   
}
