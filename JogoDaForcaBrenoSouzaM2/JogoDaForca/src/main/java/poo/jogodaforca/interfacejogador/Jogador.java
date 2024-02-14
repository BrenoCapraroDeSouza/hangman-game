/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.jogodaforca.interfacejogador;

import java.util.Scanner;
import poo.jogodaforca.dominio.JogoDaForca;
import poo.jogodaforca.dominio.ListaPalavras;
import poo.jogodaforca.dominio.PalavraSecreta;
import poo.jogodaforca.dominio.Tabuleiro;

/**
 *
 * @author breno
 */
public class Jogador {
    
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int opcao=0;
        while(opcao != 3)
        {
            System.out.println("\t\t-------- BEM VINDO JOGADOR -------- ");
            System.out.println("\n\n\t\t\t 1. INCLUIR LISTA DE PALAVRAS");
            System.out.println("\t\t\t 2. JOGAR");
            System.out.println("\t\t\t 3. SAIR");
            opcao = cin.nextInt();
            ListaPalavras cozinha = new ListaPalavras("cozinha");
            cozinha.adicionarLista("faca");
            cozinha.adicionarLista("garfo");
            cozinha.adicionarLista("colher");
            cozinha.adicionarLista("panela");
            switch(opcao)
            {
                case 1:
                    cin.nextLine();
                    System.out.println("Digite o nome do topico da lista");
                    String aux = cin.nextLine();
                    ListaPalavras teste = new ListaPalavras(aux);
                    cin.nextLine();
                    System.out.println("Quantas palavras deseja adicionar ?");
                    int num = cin.nextInt();
                    int i = 0;
                    do
                    {
                        cin.nextLine();
                        System.out.println("Digite a palavra que você quer inserir na lista: "+ aux);
                        String palavraLista = cin.nextLine();
                        teste.adicionarLista(palavraLista);
                        i++;
                    }while(i<num);
                    break;
                    
                    
                case 2:
                    PalavraSecreta advinha = new PalavraSecreta(cozinha);
                    JogoDaForca forca = new JogoDaForca(advinha);
                    forca.getTabuleiro().construirTabuleiro();
                    while(forca.isPerdeu()==true && forca.getTabuleiro().getContadorTentativas()<10)
                    {
                        char c = cin.next().charAt(0);
                        forca.Tentativa(c);
                        forca.setTabuleiro();
                        forca.getTabuleiro().construirTabuleiro();
                        System.out.println("");
                    }

                    if(forca.isPerdeu()==false) System.out.println("\t\t PARABENS VOCE GANHOU");
                    else System.out.println("\t\t NAO FOI DESSA VEZ, TENTE NOVAMENTE");
                    break;
                    
                case 3:
                    break;
                default:    
                    System.out.println("Digite uma das opcoes validas");
                    
            } 
        }
    }
}
