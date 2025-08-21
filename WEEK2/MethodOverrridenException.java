package WEEK2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
class parent{
    public String large(String s) throws IOException{
        if(s.length()==0){
            throw new IOException("Enter the valid FileName");
        }
        return s.toUpperCase();
    }
}
class child extends parent{
    public String large(String s) throws FileNotFoundException{ // FileNotFoundException is sub class of IOExecption
        if(s.length()<4){
            throw new FileNotFoundException("File not Found, Enter More than 3 Character");
        }
        return s.toUpperCase();
    }
}
public class MethodOverrridenException {
    public static void main(String[] args) {
        System.out.println("Enter File Name(more than 3 character): ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
            child c1 = new child();
            System.out.println("File Found with Name "+ c1.large(s));
        } catch(FileNotFoundException f){
            System.out.println(f);
        } finally{
            sc.close();
        }
    }
}
