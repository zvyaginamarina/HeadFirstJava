public class Animal {
    public Animal(){
        System.out.println("Creating Animal");
    }
}

class Hippo extends Animal{
    public Hippo(){
        System.out.println("Creating Hippo");
    }
}

class TestHippo{
    public static void main(String[] args) {
        System.out.println("The beginnings...");
        Hippo h = new Hippo();
    }
}