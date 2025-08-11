public class Day1Code15 {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        
        // compareTo to return
        // if s1>s2; return +ve value
        // if s1=s2; return 0
        // if s1<s2; return -ve value
        if(s1.compareTo(s2) == 0){
            System.out.println("both Strings are equal.");
        }
        else{
            System.out.println("Strings are not equal.");
        }
    }
}
