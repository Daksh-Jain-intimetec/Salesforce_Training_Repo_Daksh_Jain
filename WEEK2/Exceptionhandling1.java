package WEEK2;

public class Exceptionhandling1 {
    public static void main(String[] args) {
        int[] Numinator = {0, 10, 30, 40};
        int[] Denominator = {1, 2, 0, 4};
        for(int i=0;i<Numinator.length;i++)
        System.out.println(divide(Numinator[i],Denominator[i]));

        System.out.println("Program Ends Successfully");
        
    }
    public static int divide(int n, int m){
            try{
                return n/m;
            } catch(ArithmeticException e){
                System.out.print("Arithmetic Exception Occure ");
                return -1;
            }
            
    }
}
