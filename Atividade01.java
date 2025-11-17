import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("--- Simulação de Sistema Escolar - Cálculo de Médias ---");

        // 1. Receber as 8 notas anuais
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota (N" + (i + 1) + "): ");
            notas[i] = scanner.nextDouble();
        }

        // 2. Calcular as médias bimestrais
        double mediaBim1 = (notas[0] + notas[1]) / 2.0;
        double mediaBim2 = (notas[2] + notas[3]) / 2.0;
        double mediaBim3 = (notas[4] + notas[5]) / 2.0;
        double mediaBim4 = (notas[6] + notas[7]) / 2.0;

        // 3. Calcular as médias semestrais
        double mediaSem1 = (mediaBim1 + mediaBim2) / 2.0;
        double mediaSem2 = (mediaBim3 + mediaBim4) / 2.0;

        // 4. Calcular a média final
        double mediaFinal = (mediaSem1 + mediaSem2) / 2.0;

        // 5. Apresentar os resultados
        System.out.println("\n--- Resultados ---");

        // 1º Semestre
        System.out.printf("1º Bimestre: %.1f\n", mediaBim1);
        System.out.printf("2º Bimestre: %.1f\n", mediaBim2);
        System.out.println("----------------------");
        System.out.printf("1º Semestre: %.1f\n", mediaSem1);

        System.out.println("\n");

        // 2º Semestre
        System.out.printf("3º Bimestre: %.1f\n", mediaBim3);
        System.out.printf("4º Bimestre: %.1f\n", mediaBim4);
        System.out.println("-----------------------");
        System.out.printf("2º Semestre: %.1f\n", mediaSem2);

        System.out.println("\n");

        // Média Final
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
