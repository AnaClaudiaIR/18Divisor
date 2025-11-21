public class Divisor {
    private  double a;
    private double b;
    double resultado;

    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por zero");
        }else {
            System.out.println("Dividendo: " + a);
            System.out.println("Divisor: " + b);
            resultado = a / b;
            return resultado;
        }
    }
}
