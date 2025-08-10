import java.util.Scanner;

public class Day1Code3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        arr = new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int a = sc.nextInt();
            arr[i] = a;
            sum += arr[i];
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Sum Of Array " + sum);
        sc.close();
    }
    
}
