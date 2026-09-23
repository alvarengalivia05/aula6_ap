import java.util.Scanner;

public class controle {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resp; //declara varialve de controle 
        String nome;
        int idade;
        resp =1;//inicializa a variavel controle

        while(resp==1){System.err.println("Digite o sue nome: ");
        nome = entrada.nextLine();

        System.out.println("Digite sua idade"); idade=
        entrada.nextInt();

        if (idade >=18){
            System.out.println("deseja continuar? digite 1(sim) 2(não): " );
            resp=entrada.nextInt();
            entrada.nextLine();
        }
        
     }
     entrada.close();

   }
}
