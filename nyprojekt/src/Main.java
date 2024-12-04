public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        createJoakim();
    }

    public static void createJoakim() {
        Joakim joakim = new Joakim();
        System.out.println("Mit navn er " + joakim.getName());
    }
}
