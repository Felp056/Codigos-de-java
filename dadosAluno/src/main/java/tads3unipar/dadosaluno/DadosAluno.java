/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tads3unipar.dadosaluno;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class DadosAluno {

    public static void main(String[] args) {
        String nome;
        char sexo;
        System.out.printf("Digite nome do(a) aluno(a): ");
        Scanner l= new Scanner(System.in);
        nome = l.next();
        System.out.printf("Digite o sexo: ");
        sexo = l.next().charAt(0);
        String sexVal;
        switch (sexo) {
            case 'M' ,'m' -> sexVal = "Homem";
            case 'F' ,'f' -> sexVal = "Feminino";
            case 'G' ,'g' -> sexVal = "Gasoso";
            case 'L' ,'l' -> sexVal = "Liquido";
            default       -> sexVal = "Programador";
           
        }
        System.out.print("Aluno "+nome+"\n sexo : "+sexVal);
    }
}
