public class Day1Code16 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        int size = sb.length();

        for(int i=0;i<size/2;i++){
            int front = i;
            int back = size -1 - i;

            char FrontChar = sb.charAt(front);
            char BackChar = sb.charAt(back);
            
            sb.setCharAt(front, BackChar);
            sb.setCharAt(back, FrontChar);
        }
        System.out.println(sb);
    }
}
