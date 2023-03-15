/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tads3unipar.animais;

/**
 *
 * @author felip
 */
public class tipos {
      private  String nome;
        int peso;
        String sexo;
        String cor;
        String raca;
        int tamanho;
        public void construtor(String Cname){
         nome = Cname;    
        }
        public String GetNam(){
         return "Nome = "+ nome;   
        
        }
}
