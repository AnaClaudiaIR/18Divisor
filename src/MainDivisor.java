public class MainDivisor {
    public static void main(String[] args) {
    Divisor divisor = new Divisor();
        try {
            double resultado1 = divisor.dividir(3.5,2);
            System.out.println("El resultado es: " + resultado1);
        } catch  (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------");

        try {
            double resultado2 = divisor.dividir(3.5,0);
            System.out.println("El resultado es: " + resultado2);
        } catch  (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}