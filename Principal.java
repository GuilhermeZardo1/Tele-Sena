/* PROJETO TELE SENA (UNIDADE 5)
   ALUNO: Guilherme Luthemaier Zardo
   Ciências da Computação - Unisinos, Polo Porto Alegre*/

import java.util.Arrays;

public class Principal{

    public static void main( String[] args ) {

        
        /* Cria uma instância da classe "ControleTeleSena", que gerencia os sorteios
        e as informações dos ganhadores */

        ControleTeleSena controle = new ControleTeleSena(Metodos.CriaSequenciaPessoas());

        /* Faz o sorteio inical dos 25 números */

        controle.Sorteio();

        /* Caso não haja ganhadores, faz um sorteio adicional por vez, adicionando um número 
        a mais em cada sorteio, até have ganhadores (que pode ser mais de um) */
        
        if(controle.getNumeroGanhadores()==0){

            for (int i = 0; i < 35; i++) {

                if(controle.getNumeroGanhadores()==0) {

                    controle.Sorteio2();
                }

                else {

                    break;
                    
                }
                
            }

            /* Ao final do programa, exibe as informações gerais do sorteio */
            
        controle.ImprimeInformacoesFinais();

        }

        }

    }



