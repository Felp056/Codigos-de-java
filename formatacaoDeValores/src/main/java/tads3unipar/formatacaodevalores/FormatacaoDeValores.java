/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.formatacaodevalores;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class FormatacaoDeValores {

    public static void main(String[] args) {
        int n;
         int soma = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos numeros vc deseja somar: ");
        n = s.nextInt();
        int a[] = new int[n];
        for (int i =0; i < n ; i++){
        System.out.println("Informe o "+(i+1)+" numero: ");
        a[i] = s.nextInt();
         }
        for(int i = 0 ;i < n; i++){
           soma += (a[i]);
        }
        System.out.println("O Resultado da soma dos "+n+" numeros é : "+soma);
    }
}
/*
 int a;
        int b;
       
        System.out.println("Digite primeiro valor");
        a = s.nextInt();
        System.out.println("Digite segundo valor: ");
        b = s.nextInt();
         System.out.printf("\nResultados:\n");
         System.out.printf("%d + %d = %3d\n", a , b, (a + b));
         System.out.printf("%d - %d = %3d\n", a , b, (a - b));
         System.out.printf("%d * %d = %3d\n", a , b, (a * b));
         System.out.printf("%d / %d = %3d(divisao inteira)\n ", a , b, (a / b));
         System.out.printf("%d / %d = %6.2f (divisao exata)\n ", a , b, ((double) a / b));
         for (a = 0; a <= b ; a++) {
            System.out.printf("Informe o %2d° valor: ", (a +1), b);
            System.out.println(a);
*/