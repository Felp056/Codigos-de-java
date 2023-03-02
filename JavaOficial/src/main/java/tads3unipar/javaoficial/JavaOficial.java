/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tads3unipar.javaoficial;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class JavaOficial {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);
        int base;
        int altura;
        System.out.println("Digite o Valor da Base em cm");
        base = Ler.nextInt();
        System.out.println("Digite o valor da Altura em cm");
        altura = Ler.nextInt();
        funcoes.AreaDoTriangulo(base, altura);
        System.out.println("A area do Trinagulo em cm " + funcoes.AreaDoTriangulo(base, altura));
        System.out.println("A area do Triangulo em Mm " + funcoes.AreaDoTriangulo(base, altura) / 100);
        if (funcoes.AreaDoTriangulo(base, altura) > 10) {
            System.out.println("Hello World");
        } else {
            System.out.println("...");
        }
    }
}

