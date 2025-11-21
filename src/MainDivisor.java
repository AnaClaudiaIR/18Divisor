public class Main {
    public static void main(String[] args) {
        Divisor d = new Divisor();
        d.setA(3.5);
        d.setB(2.0);

        System.out.println("Dividendo: "+ d.getA());
        System.out.println("Divisor: " + d.getB());

        Divisor d2 = new Divisor();
        d2.setA(3.5);
        d2.setB(0);

        System.out.println("Dividendo: " + d2.getA());
        System.out.println("Divisor: " + d2.getB());
    }
}