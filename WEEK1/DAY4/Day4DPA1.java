package WEEK1.DAY4;

interface Builder {
    int i = 111; // by default - public static final 
    
}
class Build implements Builder{
    void methodB(){
    // i = 222; // i Cannot be changed due to final declared inside interface.
    }
}
public class Day4DPA1 {
    public static void main(String[] args) {
        Build a = new Build();
        System.out.println("Cannot Compile " + a);
    }
}
// give compile time error "The final field A.i cannot be assigned"