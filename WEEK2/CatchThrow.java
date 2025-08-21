package WEEK2;

class CatchThrow{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println("A/B : " + a/b);
        }catch(RuntimeException e){
            System.out.println("RuntimeException Occure...");
            try{
                throw new Exception("throwing another exception from catch..");
                
            } catch(Exception e2){
                System.out.println("caught exception.." + e2);
            }
        }finally{
            System.out.println("System sign off. ");
        }
    }
}