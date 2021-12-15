import java.util.Scanner;

public class EstudoUmSwitchCase {

    public static void main(String[] args){
        System.out.println("Digite o dia da semana!");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 2:
                System.out.println("Segunda");
            break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            default:
                if(x > 7){
                    System.out.println("erro, dia inválido");
                }
                break;
        }
    }
}
