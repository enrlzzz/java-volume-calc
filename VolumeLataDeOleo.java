package volumelatadeoleo;

import java.util.Scanner;

public class VolumeLataDeOleo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Digite o raio da lata (em cm): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata (em cm): ");
        double altura = scanner.nextDouble();

        scanner.close();

        double volume = PI * (raio * raio) * altura;

        System.out.printf("O volume da lata é de %.2f cm³.%n", volume);

    }
    
}
