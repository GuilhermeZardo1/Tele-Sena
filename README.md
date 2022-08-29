# Tele-Sena
Programa em Java para ser rodado no terminal feito para a disciplina de "Algoritmos e Programação: Fundamentos" do curso de Ciências da Computação da Unisinos.

Através da programação orientada a objetos, o programa gerencia um sorteio de uma "Tele-Sena", um jogo de apostas em que cada bilhete tem 25 números e o sorteio de 25 números aleatórios indica se houve bilhete premiado ou não. O programa utiliza uma classe para controle e gerenciamento do sorteio, uma classe para diversos métodos utilizado pelo programa e uma classe para definir os apostadores e eventual ganhandores (Pessoas). 

O programa funciona da seguinte forma: ele sorteia 25 números (Tele-Sena premiada). Após, verifica se algum usuário previamente gerado acertou esses 25 números (cada usuário compra um número aleatório de Tele-Senas, ou seja, de conjuntos de 25 números). Se nenhum usuário acertou os números, o sistema vai sorteando um número extra até algum usuário ter acertado os 25 números.

Após, o sistma apresenta informações sobre o sorteio, como o número de Tele-Senas vendidas, o valor total arrecadado, o prêmio de cada ganhador e o lucro total do sorteio.
