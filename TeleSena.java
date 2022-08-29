/* PROJETO TELE SENA (UNIDADE 5)
   ALUNO: Guilherme Luthemaier Zardo
   PROFESSOR: Mateus Raeder
   Ciências da Computação - Modalidade Híbrida, Unisinos, Polo Porto Alegre*/

/* Método de declaração da classe TeleSena */

import java.util.Arrays;

public class TeleSena {

    /* Declaração dos atributos */

    private double valor = 10.00;
    private int[] conjunto1 = new int[25];
    private int[] conjunto2 = new int[25];

    /* Declaração do construtor*/

    public TeleSena() {

        this.conjunto1 = Metodos.CriaSequenciaTeleSena();
        this.conjunto2 = Metodos.CriaSequenciaTeleSena();

    }

    /* INÍCIO DA DECLARAÇÃO DOS GETTERS AND SETTERS. NEM TODOS FORAM UTILIZADOS. */
    
    public double getValor() {
        return this.valor;
    }

    public int[] getConjunto1() {
        return this.conjunto1;
    }

    public int[] getConjunto2() {
        return this.conjunto2;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Valor:" + valor + "\n"; 
       }
    
    /* FIM DA DECLARAÇÃO DOS GETTERS AND SETTERS*/

    /* Método que imprime os dois conjuntos de números da TeleSena */

    public void ImprimeConjuntos() {

        System.out.println(Arrays.toString(this.conjunto1));
        System.out.println(Arrays.toString(this.conjunto2));

    }
    
}