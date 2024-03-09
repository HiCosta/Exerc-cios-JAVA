import java.util.Scanner;

public class MediaSISD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //solicitando quantidade de numeros ao usuario
        System.out.println("Digite a quantidade de numeros:  ");
        int quantNumeros = scanner.nextInt();

        //inicializa variavel para armazenar a soma de dois numeros
        int soma = 0;

        //loop para receber numeros do usuario e somar
        for (int i = 0; i < quantNumeros; i++){
            System.out.println("Digite o numero " + (i + 1) + ":  ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        //calcula a media dos numeros
        double media = (double) soma / quantNumeros;

        //exibe resultado
        System.out.println("A media dos numeros e:  " + media);

        //fecha scanner
        scanner.close();
    }

}