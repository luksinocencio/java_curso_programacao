public class ProcessamentoDeDadosEmJava {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int a, b1;
        double resultado;

        a = 5;
        b1 = 2;
        resultado = (double) a / b1; // cast
        System.out.println(resultado);
    }
}
