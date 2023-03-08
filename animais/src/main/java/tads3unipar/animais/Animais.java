/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.animais;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class Animais {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        tipos m = new tipos();
        System.out.println("Digite o nome:");
        m.nome = s.next();
         System.out.println("Digite a cor dele :");
        m.cor = s.next();
         System.out.println("Digite o peso:");
        m.peso = s.nextInt();
         System.out.println("Digite a raça:");
        m.raca = s.next();
         System.out.println("Digite o sexo:");
        m.sexo = s.next();
        System.out.println(m.nome+" de cor"+m.cor+" da raça "+m.raca+" do sexo"+m.sexo+" pesa "+m.peso+"KG");
    }
}
