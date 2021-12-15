import java.util.Scanner;

public class EstudosLacosDeRepeticao {
    public static void main(String[]args){
        System.out.println("Digite um valor para o programa!");
        Scanner sc = new Scanner(System.in);
        int um = 1;
        int options;
        int valor = sc.nextInt();
        System.out.println("Certo a tabuada selecionada foi a do " + valor);

        for(int i = 0; i < 11 ; i++){
            int conversao = i * um;
            System.out.println("Tabuada do " + valor + " x " + i + " = " + valor * conversao);
        }
        System.out.println("Deseja visualizar outras tabuadas? Digite 1 para sim e 2 para não");
        options = sc.nextInt();

        switch (options){
            case 1:
                while (options == 1){
                    System.out.println("Digite um valor para o programa!");
                    Scanner sca = new Scanner(System.in);
                    int one = 1;
                    int ops;
                    int valores = sc.nextInt();
                    System.out.println("Certo a tabuada selecionada foi a do " + valores);

                    for(int i = 0; i < 11 ; i++){
                        int conversao = i * one;
                        System.out.println("Tabuada do " + valores + " x " + i + " = " + valores * conversao);
                    }
                    System.out.println("Deseja visualizar outras tabuadas? Digite 1 para sim e 2 para não");
                    options = sc.nextInt();
                }
                break;
            case 2:
                if (options == 2) {
                    System.out.println("Obrigado pro utilizar o nosso sistema!");
                }
                break;
            default:
                    System.out.println("Lamento não reconheço essa solicitação!");
                break;
        }

    }
}
