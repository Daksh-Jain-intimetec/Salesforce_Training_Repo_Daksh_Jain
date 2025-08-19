package WEEK2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ThrowException {
    public static List<String> readfile(String filepath) throws IOException{
        Path path = Paths.get(filepath);
        System.out.println("Attempting to read file from: " + path.toAbsolutePath());
        return Files.readAllLines(path);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name: ");
        String Nofilepath = sc.nextLine();
        try{
            List<String> lines = readfile(Nofilepath);
            System.out.println("Reading File Content...");
            for(String line : lines){
                System.out.println(line);
            }
            System.out.println("reading file..");
        } catch(IOException i){
            System.out.println(i);
        }
        finally{
            sc.close();
        }
    }
}
