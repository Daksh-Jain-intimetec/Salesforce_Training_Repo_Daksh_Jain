public class Day1Code2 {
    public static void main(String[] args) {
        int number = 10;
        modifyPrimitive(number);
        System.out.println("After method call: " + number); // Output: 10
    }

    static void modifyPrimitive(int num) {
        num += num; //changes locally
        System.out.println(num);
    }
}
