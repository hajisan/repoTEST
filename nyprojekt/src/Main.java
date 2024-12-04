public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("Filosofie");
        System.out.println("Hej jeg hedder Nima :)");

        if (Andreas.er == 0){
            System.out.println("DANS" + Andreas.abe);
        }
        createJoakim();

        System.out.println("Jeg tester lige om denne branch, automatisk bliver closed når jeg er done med den");
    }

    public static void createJoakim() {
        Joakim joakim = new Joakim();
        System.out.println("Mit navn er " + joakim.getName());
    }


}
