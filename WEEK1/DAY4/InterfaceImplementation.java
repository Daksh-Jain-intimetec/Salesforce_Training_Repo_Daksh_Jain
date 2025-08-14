package WEEK1.DAY4;
interface Weapon{
    void speciality();
    void strength();
}
class Knife implements Weapon{
    public Knife(){
        System.out.println("this is knife Shak Shak...");
    }
    public void speciality(){
        System.out.println("speciality: Sharpness");
    }
    public void strength(){
        System.out.println("Strength: medium");
    }
}
class Flamethrower implements Weapon{
    public Flamethrower(){
        System.out.println("Flamethrower Fireee is On...");
    }
    public void speciality(){
        System.out.println("speciality: Fire");
    }
    public void strength(){
        System.out.println("Strength: Heavy");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        Knife k1 = new Knife();
        k1.speciality();
        k1.strength();
        Flamethrower f1 =new Flamethrower();
        f1.speciality();
        f1.strength();
    }
}
