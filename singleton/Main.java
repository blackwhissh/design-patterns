package singleton;

public class Main {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance("blackwhissh");

        System.out.println(instance.hashCode() + " " + instance.getData());

        Singleton instance1 = Singleton.getInstance("hssihwkcalb");

        System.out.println(instance1.hashCode() + " " + instance1.getData());

    }
}
