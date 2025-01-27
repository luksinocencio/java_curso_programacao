import java.util.Locale;

/**
 * System.out.print
 * System.out.println
 * System.out.printf %d %f %s %n
 * Locale
 **/

public class Main {
    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        /**
         * Exercicios
         * */

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf(product1 + " which price is $ %.2f", price1);
        System.out.printf(product2 + ", which price is $ %.2f %n", price2);
        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.printf("Measue with eight decimal places: " + measure);
        System.out.printf("Rouded (three decimal places) %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);
    }
}
