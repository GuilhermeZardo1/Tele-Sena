/* PROJETO TELE SENA (UNIDADE 5)
   ALUNO: Guilherme Luthemaier Zardo
   Ciências da Computação - Unisinos, Polo Porto Alegre*/

/* Classe com uma série de Métodos úteis para o programa. Poderiam ser colocados na classe
controle, mas optei por deixá-los aqui para não poluir a classe Controle */

import java.util.Arrays;

public class Metodos {

    static int quantidadevendida = 0;
    static double valorArrecadado = 0;
    static double valorPremio = 0;
    static double lucro = 0;

    /* Inicia uma array com diversos nomes para sorteio na inicialização do programa */

    static String[] clientes = new String[] {"Carlos", "Roberto", "Marcos", 
        "Beatriz", "Renata", "Juliano", "Cardoso" , "Juliana", "Maria", "José", "Francisco", "Marta", "Camila",
        "Jorge", "Marcelo", "Gabriela", "Paula", "João", "Marcos", "Priscila", "Mariana",
        "Juvenal", "Sabrina", "Sérgio", "Giovani"};

    public Metodos() {
    }

    /* Inicia as Tele Senas de cada uma das Pessoas, com no mínimo 1 TeleSena e no máximo 15 */
    
    public static TeleSena[] GeraTeleSenasPessoa(){

        int n = (int)(Math.random() * 15 + 1);
        
        TeleSena[] t = new TeleSena[n];

        for (int i = 0; i < n; i++) {

            t[i] = new TeleSena();
            
        }
        
        return t;
    }

    /* Seleciona um nome aleatório da String[] clientes. */

    public static String SelecionaNome() {

        int n = (int)(Math.random() * 24 + 1);

        return clientes[n];
    }
    
    /* Método para verificar (retornando um boolean) se uma string 
    está contida em uma array de strings. */

    public static boolean ContemString(String[] arr, String targetValue) {

        for(int i = 0; i < arr.length;) {

            if(arr[i]!=null){

            if(arr[i].equals(targetValue)) {
                return true;
            }
            else {
                i++;
                 }
                          }
        else {
            i++;
        }
    }
    return false;   
    }

    /* Método para Verificar se um inteiro está contido em uma array
    de inteiros, retornando um boolean se for um caso. */

    
    public static boolean ContemInt(int[] arr, int targetValue) {

        for(int s: arr){
            if(s==targetValue)
                return true;
        }
        return false;
    }

    /* Método para checar se uma array de inteiros possui
    espaços disponíveis para que outros elementos sejam acrescentados, 
    retornando um boolean. */


    public static boolean ChecaCheioInt(int[] array) {
        
            for(int i = 0; i < array.length;) {
                
                if (array[i]==0) {

                    return false;
                   
                }
                else if((array[i]!=0) && (i!=array.length-1)) {
                    i++;
                }

                else if ((array[i]!=0) && (i==array.length-1)) {

                    return true;
                }
                
            }
            return true;

    }

    /* Método para checar se uma array de strings possui
    espaços disponíveis para que outros elementos sejam acrescentados, 
    retornando um boolean. */

    public static boolean ChecaCheioString(String[] array) {
        
        for(int i = 0; i < array.length;) {
            
            if (array[i]==null) {

                return false;
               
            }
            else if((array[i]!=null) && (i!=array.length-1)) {
                i++;
            }

            else if ((array[i]!=null) && (i==array.length-1)) {

                return true;
            }
            
            
        }
        return true;

    }

   /* Método para gerar um número aleatório de 1 a 15. */

    public static int GeraQuantidadeTeleSenas() {

    int n = (int)(Math.random() * 15 + 1);
    return n;


    }


    /* Método que cria a sequência de 25 números, de 1 a 60, sem repetição.*/
 

    public static int[] CriaSequenciaTeleSena() {

     int[] array = new int[25];


    for (int i = 0; i < array.length; ) {

        int n = (int)(Math.random() * 60 + 1);
        if((!Metodos.ContemInt(array, n)) && (!Metodos.ChecaCheioInt(array))) {

            array[i] = n;
            i++;
 
        }
        else {

            n = (int)(Math.random() * 60 + 1);
        }

    }
    return array;

    }

    /* Método que checa para ver se a Array de Pessoas está cheia.*/
 
    public static boolean ChecaCheioArrayPessoas(Pessoa[] array) {
        
    for(int i = 0; i < array.length;) {
        
        if (array[i]==null) {

            return false;
           
        }
        else if((array[i]!=null) && (i!=array.length-1)) {
            i++;
        }

        else if ((array[i]!=null) && (i==array.length-1)) {

            return true;
        }
        
    }
    return true;

    }

    /* Método que cria a sequência de pessoas que compraram as Tele Senas para o sorteio.
    Seleciona aleatoriamente nomes da array "clientes", sem repeti-los.*/

    public static Pessoa[] CriaSequenciaPessoas(){

    Pessoa[] a = new Pessoa[20];

    for (int i = 0; i < 20;) {

        Pessoa p = new Pessoa();

        if(!Metodos.ContemPessoa(a, p.getNome())) {

            a[i] = p;
            i++;
        }

    }

    return a;

    }

    /* Método que imprime todos os nomes das pessoas em uma array de pessoas.*/

    public static void ImprimeNomes(Pessoa[] arr) {

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=null) {

        System.out.println(arr[i].getNome());
        }
        
    }
    
    }

    /* Método que verifica se uma array de pessoas contém um pessoa determinada, 
    retornando um boolean.*/

    public static boolean ContemPessoa(Pessoa[] arr, String targetValue) {
    for(int i = 0; i < arr.length;) {

        if(arr[i]!=null){

        if(arr[i].getNome().equals(targetValue)) {

            return true;
        }
        else {
            i++;
        }
    }

    else {

        i++;
    }

    }

    return false;

    }

    /* Método que retorna a quantidade total de bilhetes de Tele Sena vendidos a partir da
    array de clientes.*/

    public static int CalculaQuantidadeVendida(Pessoa[] str) {


    for (int i = 0; i < 20; i++) {

        Metodos.quantidadevendida = Metodos.quantidadevendida + str[i].getQuantidade();
        
    }

    return Metodos.quantidadevendida;

    }

    /* Método que calcula o valor total arrecadado no sorteio, recebendo a quantidade
    de bilhetes vendidos e retornando um valor do tipo double.*/

    public static double CalculaValorArrecadado(int quant) {

    double valor = quant * 10.00;
    return valor;

    }

    /* Método que retorna o valor total do prêmio (80% do valor arrecadado)*/

    public static double ValorPremio(double valor) {

    valorPremio = valor * 0.80;
    return valorPremio;

    }

    /* Método que retorna o valor total do lucro na venda (20% do valor arrecadado)*/

    public static double valorLucro(double valor) {

    double lucro = valor * 0.20;
    return lucro;

    }

    /* Método que aumenta a array de valores sorteados em 1, caso não haja ganhadores.
    O método retorna uma nova array de inteiros*/

    public static int[] AumentaArraySorteio(int[] arr) {

    int[] copia = new int[arr.length + 1];

    for (int i = 0; i < arr.length; i++) {

        copia[i] = arr[i];
        
    }

    int n = (int)(Math.random() * 60 + 1);

    for (int i = 0; i < 1;) {
        
    if((!Metodos.ContemInt(copia, n)) && (!Metodos.ChecaCheioInt(copia))) {
    
        copia[copia.length-1] = n;

        i++;

        }
            else {

                n = (int)(Math.random() * 60 + 1);
            }
            
    }

    return copia;

    }

    /* Método checa se todos os valores em uma array de booleans são do tipo "true", 
    retornando "true" se for o caso e "false" caso contrário (caso haja ao menos um false).
    O método é utilizado para checar se há ganhadores.*/

    public static boolean TodosTrue(boolean[] array)

    {

    for(boolean b : array) if(!b) return false;
    return true;

    }

    /* Método que insere um objeto do tipo "Pessoa" em uma array de objetos
    do mesmo tipo.*/

    public static void InsereGanhador(Pessoa[] arr, Pessoa obj) {

    for(int i = 0; i < arr.length; i++)

    if(arr[i] == null) {
        arr[i] = obj;
        break;
    }

    }

    /* Método para imprimir informações dos ganhadores. Não foi utilizado na execução final.*/

    public static void ImprimeInformacoesGanhadores(Pessoa[] arr) {

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=null){

        arr[i].ImprimeInformacoes();

        }    
    }
    }

    /* Método para verificar se uma array de pessoas contém algum valor do tipo "null".*/

    public static boolean ContemGanhador(Pessoa[] arr) {

    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=null) {

            return true;
        }
        
    }
    return false;
    }

    /* Método que conta o número de ganhadores, retornando um inteiro.*/

    public static int ContaGanhadores(Pessoa[] arr) {

    int contador = 0;

    for (int i = 0; i < arr.length; i++) {

    if(arr[i]!=null) {

        contador++;

    }

    
    }
    return contador;
    
    }

    /* Método que imprime as informações de todos os clientes, ganhadores ou não.
    Foi utilizado na elaboração do programa para fins de checagem.*/

    public static void ImprimeInformacoesTodoMundo(Pessoa[] arr) {

    for (int i = 0; i < arr.length; i++) {

        arr[i].ImprimeInformacoes();
        
    }
    }

    /* Método que retorna os nomes de todos os ganhadores em uma array de "Strings".*/

    public static String[] ImprimeNomeGanhadores(Pessoa[] arr, int n) {

    String[] a = new String[n];


    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=null){

        a[i] = arr[i].getNome();

        }
        
    }

    return a;

    }

     /* Método que retorna um array de inteiros que representa o número de Tele Senas
     compradas de cada ganhador, na ordem da array de nomes dos ganhadores.*/

    public static int[] ImprimeNumeroTeleSenasCompradas(Pessoa[] arr, int n) {

    int[] a = new int[n];


    for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=null){

        a[i] = arr[i].getQuantidade();
        
        }
        
    }

    return a;
    
    }

}


