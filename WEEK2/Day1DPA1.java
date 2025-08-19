package WEEK2;

public class Day1DPA1 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println("Length of String: " + s.length());
        } catch(NullPointerException e){
            System.out.println("String is Null!!");
        } catch(Exception e){
            System.out.println("Exception Occure...");
        }
        finally{
            System.out.println("System sign off. ");
        }
    }
}
