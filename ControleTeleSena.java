/* PROJETO TELE SENA (UNIDADE 5)
   ALUNO: Guilherme Luthemaier Zardo
   Ciências da Computação - Unisinos, Polo Porto Alegre*/

/* Método que declara a classe ControleTeleSena */

import java.util.Arrays;

public class ControleTeleSena {

  /* Início da declaração dos atributos. Talvez nem todos tenham sido utilizados. */

   private int quantidadetelesenas = 0;
   private int quantidadepessoas;
   private Pessoa[] array = new Pessoa[20];
   private TeleSena telesenasorteio  = new TeleSena();
   private int[] conjuntosorteado;
   private Pessoa[] ganhadores = new Pessoa[20];
   private int numeroganhadores = 0;
   private double lucro = 0;
   private double valorarrecadado = 0;
   private int numerodesorteios = 0;
   private int[] numerodetelesenascompradas = new int[20];
   public int[] teste1 = new int[25];
   private String[] nomesganhadores;

   /* Fim da declaração dos atributos */

   /* Início da declaração dos construtores. Nem todos foram utilizados. */

   public ControleTeleSena (Pessoa[] arr) {

      this.array = arr;
      conjuntosorteado = getConjuntoSorteado();
      Arrays.sort(conjuntosorteado);
      this.quantidadetelesenas = Metodos.CalculaQuantidadeVendida(arr);
      this.valorarrecadado = Metodos.CalculaValorArrecadado(quantidadetelesenas);
      
    }

   public ControleTeleSena () {

    }

    /* Fim da declaração dos construtores */

    /* Início da declaração dos "getters" e "setters". Nem todos foram utilizados. */

    public void setNomesGanhadoresString(String[] arr) {

        this.nomesganhadores = new String[arr.length];
        this.nomesganhadores = arr;
    }

    public int getQuantidadeTeleSenas() {

        return quantidadetelesenas;
    }

    public void setNumeroGanhadores() {

        this.numeroganhadores++;
    }

    public void setConjuntoSorteado(int[] a) {

        this.conjuntosorteado = a;
    }

    public int getNumeroGanhadores() {

        return numeroganhadores;
    }

    public void AumentaContadorSorteio() {

        numerodesorteios++;
    }

    public int GetContadorSorteio() {

        return numerodesorteios;
    }

    public double getValorArrecadado() {

        return valorarrecadado;
    }

    public void setValorArrecadado(double valor) {

        this.valorarrecadado = valor;
    }

    public TeleSena getTeleSenaSorteio() {

        return telesenasorteio;
    }
    
    public int[] getConjuntoSorteado() {

        return telesenasorteio.getConjunto1();
    }

    public int[] getConjuntoPremiado() {

        return conjuntosorteado;
    }

    public Pessoa getPessoa(int pos) {
        return array[pos];
        }

    public void setPessoa(Pessoa pessoa, int pos) {
        array[pos] = pessoa;

    }
    public Pessoa[] getArray() {

    return array;

    }
    
    public void setGanhador(Pessoa[] ganhador) {

        this.ganhadores = ganhador;
    }

    public Pessoa[] getGanhador() {

       return ganhadores;

    }
               
    public double getLucro(){

        return lucro;
    }

    public void setLucro(double lucro){

     this.lucro = lucro;

    }
  
    public int getQuantidadePessoas() {

        return quantidadepessoas;
    }

    public void setQuantidadePessoas(int quant) {

        this.quantidadepessoas = quant;

    }

    public int getQuantidadetelesenas() {

         return this.quantidadetelesenas;

    }
        
    public void setQuantidadetelesenas(int quantidadetelesenas) {

        this.quantidadetelesenas = quantidadetelesenas;

    }
    
    public String toString(){
        
         return "quantidade de pessoas" + quantidadepessoas + "quantidade de telesenas:" + quantidadetelesenas +"\n"; 
    }

    /* Fim da declaração dos "getters" e "setters" */

    /* Método que imprime informações de uma array. Utilizado na elaboração do 
    programa, para testes. */

    public void ImprimeInformacoes() {

        for (int i = 0; i < 20; i++) {

            array[i].ImprimeInformacoes();
                
            }

    }

    /* Método que faz o primeiro sorteio, com os 25 números iniciais. Caso não haja ganhadores,
    o que é extremamente provável, utiliza-se o segundo método, que acrescenta 1 número
    a mais na array de números sorteados.*/

    public boolean Sorteio(){
   
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].getArray().length; j++) {

                    Arrays.sort(array[i].getArray()[j].getConjunto1());
                    if(Arrays.equals(array[i].getArray()[j].getConjunto1(), conjuntosorteado)){
                        
                        Metodos.InsereGanhador(ganhadores, getPessoa(i));
                        setNumeroGanhadores();
                        return true;
                    }

                    else if (Arrays.equals(array[i].getArray()[j].getConjunto2(), conjuntosorteado)) {

                        Metodos.InsereGanhador(ganhadores, getPessoa(i));
                        setNumeroGanhadores();
                        return true;
                    }
  
                }
                
            }
            
            return false;
    }
    
    /* Método que atualiza a array de números sorteados, aumentando sua capacidade
    em 1. Foi utilizado na elaboração do programa.*/

    public void AtualizaNumerosSorteados() {

            this.conjuntosorteado=Metodos.AumentaArraySorteio(conjuntosorteado);
    }

    /* Segundo método para Sorteio. É utilizado se o primeiro método não retorna
    ganhadores (o que é muito provável).Este método acrescenta um número a mais na array
    de números sorteados no início de sua execução.*/

    public void Sorteio2(){

            int numerodeganhadores = 0;
            AumentaContadorSorteio();
            setConjuntoSorteado(Metodos.AumentaArraySorteio(conjuntosorteado));

            boolean[] compara1 = new boolean[25];
            boolean[] compara2 = new boolean[25];

            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].getArray().length; j++) {

                   for (int j2 = 0; j2 < 25; j2++) {

                    if(Metodos.ContemInt(conjuntosorteado, array[i].getArray()[j].getConjunto1()[j2])){

                        compara1[j2] = true;
                        
                    }

                    else {

                        compara1[j2] = false;
                    }
                    
                    //System.out.println(Arrays.toString(compara));

                   }

                   for (int j2 = 0; j2 < 25; j2++) {

                    if(Metodos.ContemInt(conjuntosorteado, array[i].getArray()[j].getConjunto2()[j2])){

                        compara2[j2] = true;
                        
                    }

                    else {

                        compara2[j2] = false;
                    }
                   
                    //System.out.println(Arrays.toString(compara));

                   }

                   if(Metodos.TodosTrue(compara1)){
                       
                        setNumeroGanhadores();
                        Metodos.InsereGanhador(ganhadores, getPessoa(i));
                        
                   }

                   else if(Metodos.TodosTrue(compara2)){
                       
                    setNumeroGanhadores();
                    Metodos.InsereGanhador(ganhadores, getPessoa(i));
                    
                }
                  
                }
                
            }

            //Metodos.ImprimeInformacoesGanhadores(ganhadores);
    }

    /* Método utilizado na impressão final das informações para saber o número comprado
    de Tele Senas de cada um dos ganhadores.*/

    public void ImprimeNumeroTeleSenasCompradas(Pessoa[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=null){

            System.out.println("O (A) ganhador (a) " + arr[i].getNome() + " ganhou com " + arr[i].getQuantidade() +
            " Tele Senas compradas, sendo que o lucro obtido (descontando-se o valor gasto nos " +
            "bilhetes) foi de R$" + (((getValorArrecadado()*0.80)/ getNumeroGanhadores()) - arr[i].getValorGasto()) +";\n");
            
        }
        
    }

    }

    /* Método para imprimir as informações finais, no final da execução do programa.*/
    
    public void ImprimeInformacoesFinais() {

        if(getNumeroGanhadores()==0) {

            System.out.println("Infelizmente foram realizados mais 35 acréscimos de numeros e mesmo" + 
             "assim ninguém ganhou. Como não é possível acrescentar mais números, ficaremos por aqui." + 
            "Até a semana que vem!");

         }

        else{
       
        
            System.out.println("Houve Ganhadores! Abaixo estão as informações do sorteio:\n");
            System.out.println("////////////////////////////////////////////////////////////\n");
            System.out.println("A Tele Sena sorteada foi a de número:" + Arrays.toString(conjuntosorteado) + ";\n");
            if(GetContadorSorteio()!=0) {
                System.out.println("Como não houve ganhadores no primeiro sorteio, tivemos que sortear " + 
                GetContadorSorteio() + " números extras;\n");
            }
            System.out.println("O número de ganhadores é:" + getNumeroGanhadores() +";\n");
            System.out.println("Os ganhadores foram (se um nome se repetir é porque esta pessoa ganhou com mais de um bilhete):" + Arrays.toString(Metodos.ImprimeNomeGanhadores(ganhadores, numeroganhadores)) + ";\n");
            ImprimeNumeroTeleSenasCompradas(ganhadores);
            System.out.println("O número total de Tele Senas vendidas foi:" + getQuantidadeTeleSenas() +";\n");
            System.out.println("O valor total arrecadado foi: R$" + getValorArrecadado() +";\n");
            System.out.println("Cada ganhador levou: R$" + ((getValorArrecadado()*0.80)/ getNumeroGanhadores()) + ";\n");
            System.out.println("O lucro total do sorteio foi: R$" + (getValorArrecadado()*0.20) + ";\n");
            System.out.println("////////////////////////////////////////////////////////////\n");

    }
    


    
}
}