package Salesforce_Training_Repo_Daksh_Jain.WEEK1.DAY2;

class Animal{
    public void Sound(){
        System.out.println("Animal Makes Sound");
    }
}
class Dog extends Animal{
    public void Sound(){
        System.out.println("Dogs barks");
    }
}
class Cat extends Animal{
    public void Sound(){
        System.out.println("Cats Meows");
    }
}
class Cow extends Animal{
    public void Sound(){
        System.out.println("Cows Moos");
    }
}
public class CodeInheritance {

    public static void main (String arg[]){
        Animal tuffy = new Dog();
        tuffy.Sound();
        Animal Puffy = new Cat();
        Puffy.Sound();
        Animal Moona = new Cow();
        Moona.Sound();
        tuffy = new Cat();
        System.out.print("tuffy ");
        tuffy.Sound();
    }
}