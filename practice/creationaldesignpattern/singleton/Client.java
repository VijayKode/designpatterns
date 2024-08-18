package practice.creationaldesignpattern.singleton;

public class Client {
    public static void main(String args[]) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.hashCode());
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1.hashCode());
    }
}
