import java.util.Scanner;
public class TesteJava {
    public static void main (String[] args) {
        int a,b, resultado;
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite um número\n");
        a = leitor.nextInt();
        
        System.out.printf("Digite outro número:\n");
        b = leitor.nextInt();
        
        resultado = a + b;
        
        System.out.printf("%d + %d  = %d",a,b,resultado);
        
        
        leitor.close();
    }
}