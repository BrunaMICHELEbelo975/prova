import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a Quantidade de alinhamentos ?");
        int[] vetor = new int[10];
        vetor[0] = 3;
        vetor[1] = 6;
        vetor[2] = 9;
        vetor[3] = 7;
        vetor[4] = 8;
        vetor[5] = 2;
        vetor[6] = 9;
        vetor[7] = 5;
        vetor[8] = 0;
        vetor[9] = 1;


        Scanner sc = new Scanner(System.in);
        Integer nota = 0;
        System.out.println("Informe sua nota: ");
        nota = sc.nextInt();
        if (nota >= 6) {
            System.out.println("Bons");
        }
        else if (nota < 6) {
            System.out.println("Ruins");


        }
    }}