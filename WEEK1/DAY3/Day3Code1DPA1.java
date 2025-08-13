package WEEK1.DAY3;

interface Network {
    void speed(); // method to show network speed
}

class TwoG implements Network {
    public void speed() {
        System.out.println("2G Network Speed: ~100 Kbps");
    }
}

class ThreeG implements Network {
    public void speed() {
        System.out.println("3G Network Speed: ~2 Mbps");
    }
}

class FourG implements Network {
    public void speed() {
        System.out.println("4G Network Speed: ~100 Mbps");
    }
}

class FiveG implements Network {
    public void speed() {
        System.out.println("5G Network Speed: ~10 Gbps");
    }
}
public class Day3Code1DPA1 {
    public static void main(String[] args) {
        Network net; // interface reference

        net = new TwoG();
        net.speed();

        net = new ThreeG();
        net.speed();

        net = new FourG();
        net.speed();

        net = new FiveG();
        net.speed();
    }
}
