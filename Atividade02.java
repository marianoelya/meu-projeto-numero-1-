import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Conversor de Temperatura ---");

        // 1. Receber a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // 2. Realizar as conversões
        // Fahrenheit (°F) = (Celsius (°C) × 9/5) + 32
        double fahrenheit = (celsius * 9.0/5.0) + 32.0;

        // Kelvin (K) = Celsius (°C) + 273.15
        double kelvin = celsius + 273.15;

        // 3. Exibir os resultados
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}
