/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.receberentrada;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class ReceberEntrada {

    public static void main(String[] args) {
        Scanner l= new Scanner(System.in);
        System.out.println("Digite o raio da circunferencia: ");
        double vaL1;
        vaL1 = l.nextDouble();
        System.out.printf("Resultado: %+f",areaDoCirculo.AreaDoCirculo(vaL1),".Cm");
        System.out.print("\n");
        System.out.printf("Resultado: %+f",areaDoCirculo.AreaDoCirculo(vaL1)/100,".M");
    }
}
/*
%.2f ---- formata casas decimais em float
%,d ----- separa casa dos milhares em int
%02d ----completa num com 0 == 006 
%+f------expoem o sinal


*/