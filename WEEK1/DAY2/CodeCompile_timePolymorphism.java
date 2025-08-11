package Salesforce_Training_Repo_Daksh_Jain.WEEK1.DAY2;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class CodeCompile_timePolymorphism {
    public static void main(String[] args) {
        MathOperations sum = new MathOperations();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(2.4,4.6));
        System.out.println(sum.add(34,45,36));
    }
}
