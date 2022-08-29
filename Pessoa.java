/* PROJETO TELE SENA (UNIDADE 5)
   ALUNO: Guilherme Luthemaier Zardo
   Ciências da Computação - Unisinos, Polo Porto Alegre*/

/* Método que cria uma classe do tipo "Pessoa" */

import java.util.Arrays;

public class Pessoa {

  /* Declaração de atributos */

  private String nome;
  private TeleSena[] array;
  private double valor;
  private int quantidade;
  private double valorgasto;

  
  /* INICIO DA DECLARAÇÃO DOS CONSTRUTORES. NEM TODOS FORAM UTILIZADOS.*/

  public Pessoa () {

        
      this.nome = Metodos.SelecionaNome();
      this.array = Metodos.GeraTeleSenasPessoa();
      this.valor = 0;
      this.quantidade = array.length;
      this.valorgasto = Metodos.CalculaValorArrecadado(this.quantidade);
      
  }

  public Pessoa (String nome) {

      this.nome = nome;
      this.array = Metodos.GeraTeleSenasPessoa();
      this.valor = 0;
      this.quantidade = array.length;
      
   }

   /* FIM DA DECLARAÇÃO DOS CONSTRUTORES*/

   /* INÍCIO DA DECLARAÇÃO DOS GETTERS E SETTERS. NEM TODOS FORAM UTILIZADOS. */

  public void setValorGasto(double v){
      this.valorgasto = v;
  }

  public double getValorGasto(){
    return this.valorgasto;
  }

  public TeleSena[] getArray() {
      return array;
  }
     
  public int getQuantidade() {
      return this.quantidade;
  }
    
  public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }
    
  public String getNome() {
      return this.nome;
  }
    
  public void setNome(String nome) {
      this.nome = nome;
  }

  public double getValor() {
      return this.valor;
  }
    
  public void setValor(double valor) {
      this.valor = valor;
  }
  
  public String toString(){
      return "quantidade" + quantidade + "Valor:" + valor + "nome:" + valor + "\n"; 
  }

  /* FIM DA DECLARAÇÃO DOS GETTERS E SETTERS */

  /* Método que imprime as informações da pessoa. Foi utilizado
  na elaboração do programa para fins de eliminação de bugs. */

  public void ImprimeInformacoes() {

          System.out.println("Nome:" + getNome() + "\n");
          System.out.println("Valor:" + getValor() + "\n");
          for (int i = 0; i < getQuantidade(); i++) {

            this.array[i].ImprimeConjuntos();

          }

          System.out.println("Quantidade:" + getQuantidade() + "\n");

        }
    
}