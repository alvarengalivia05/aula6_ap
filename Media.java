import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        int contador;
        double nota,media,acumuladorNotas;
        contador=0;
        acumuladorNotas=0;

        Scanner entrada = new Scanner(System.in);

        while(contador <5){
            contador++;
            System.err.println("digite uma nota " + contador); nota=
            entrada.nextInt();
            acumuladorNotas=acumuladorNotas+nota;
        }
    
        media=acumuladorNotas/contador;//calcular media
        System.err.println("media: "+media);
        entrada.close();
    }
}
