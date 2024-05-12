import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("_______________CONTADOR_______________");
        System.out.println("Digite um inteiro:");
        int n1 = scan.nextInt();
        System.out.println("Digite outro inteiro");
        int n2 = scan.nextInt();

        try{

            contar(n1, n2);
            
        } catch( ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        } 
    }

    static void contar(int n1, int n2 ) throws ParametrosInvalidosException {
            
        if (n1 >= n2){
            throw new ParametrosInvalidosException();
        }

        for(int i = n1; i <= n2; i++){
            System.out.println("Imprimindo o numero "+i);
        }
    }
}
