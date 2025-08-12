import java.util.Scanner;
public class CodeDPA1 {
    public static void reverseArr(int[] arr){
        int arr2[] = new int[10];
        int j=0;
        for(int i=(arr.length)-1;i>=0;i--){
            arr2[j] = arr[i];
            j++;
        }
        for(int i=0;i<10;i++){
            System.out.print(arr2[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        reverseArr(arr);
        sc.close();
    }
}
