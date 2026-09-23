import java.util.Scanner;

public class Validacao {

    public static void main(String[]args){

        Scanner entrada = new Scanner (System.in);

        double nota;

        do { 
            System.out.println("digite uma nota de 0 a 10: ");
            nota =entrada.nextDouble();

            if (nota < 0 || nota > 10){
                System.out.println("Nota incorreta! o valor deve erstar entre 0 e 10");
            }

        } while (nota <0 || nota >10);

        System.out.println("nota valida. registrada com sucesso: " + nota);
        
        entrada.close();
    } 
}
