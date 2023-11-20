import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você quer digitar ");
            int n = sc.nextInt();
            int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número ");
            vetor[i] = sc.nextInt();
        }
        int quantidade = 0;
        System.out.println("Números pares ");
        for (int i = 0; i < n ; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " ");
                quantidade ++;
            }
        }
        System.out.println("Quantidade de pares " + quantidade);
        sc.close();
    }

}
