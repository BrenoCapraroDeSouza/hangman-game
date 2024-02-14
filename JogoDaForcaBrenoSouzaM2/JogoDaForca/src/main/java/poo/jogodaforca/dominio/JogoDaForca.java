/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.jogodaforca.dominio;
import java.util.Scanner;
/**
 *
 * @author breno
 */
public class JogoDaForca {

    private PalavraSecreta advinha;
    private char letraDigitada;
    private char letrasAcertadas[];
    private char letrasErr[];
    private int contadorLetrasAcertadas=0;
    private int contadorLetrasErr=0;
    private Tabuleiro jogo; 
    private boolean perdeu = true;
    
    
    public JogoDaForca(PalavraSecreta advinha)
    {
        this.advinha = advinha;
        this.letrasAcertadas = new char[200];
        this.letrasErr = new char[200];
        this.jogo = new Tabuleiro(this.getAdvinha().getPalavraDoJogo().toCharArray(), this.getLetrasAcertadas(), this.getLetrasErr(),this.getContadorLetrasAcertadas(), this.getContadorLetrasErr());
    }
    
    public void Tentativa(char letradigitada)
    {
        if(!this.jogo.pertence(letradigitada, this.getLetrasAcertadas()))
        {
            int i=0;
            for(char letra: this.getAdvinha().getPalavraDoJogo().toCharArray())
            {
                if(letradigitada == letra)
                {
                    this.setLetrasAcertadas(letradigitada, contadorLetrasAcertadas);
                    this.setContadorLetrasAcertadas(contadorLetrasAcertadas+1);

                }
                else if (i++ == this.getAdvinha().getPalavraDoJogo().length()-1)
                {
                    this.setLetrasErr(letradigitada, contadorLetrasErr);
                    this.setContadorLetrasErr(contadorLetrasErr+1);
                }

            }
        }
        else System.out.println("LETRA JÁ DIGITADA"); 
        if(this.jogo.getContadorTentativas() < 10 && (this.getContadorLetrasAcertadas() == this.getAdvinha().getPalavraDoJogo().length()))
        {
            this.setPerdeu(false);
        }
    }
    
    public void setTabuleiro()
    {
        this.jogo.setContadorTentativas(this.getContadorLetrasAcertadas()+this.getContadorLetrasErr());
        this.jogo.setLetrasAcertadas(this.getLetrasAcertadas());
        this.jogo.setLetrasErr(this.getLetrasErr());
    }
    
    public Tabuleiro getTabuleiro()
    {
        return this.jogo;
    }
    /**
     * @return the palavraCerta
     */
    public PalavraSecreta getAdvinha() {
        return advinha;
    }

    /**
     * @return the palavraDigitada
     */
    public char getLetraDigitada() {
        return letraDigitada;
    }

    /**
     * @return the letrasAcertadas
     */
    public char[] getLetrasAcertadas() {
        return letrasAcertadas;
    }

    /**
     * @param letrasAcertadas the letrasAcertadas to set
     * @param posicao int da posicao
     */
    public void setLetrasAcertadas(char letrasAcertadas, int posicao) {
        this.letrasAcertadas[posicao] = letrasAcertadas;
    }

    /**
     * @return the letrasErr
     */
    public char[] getLetrasErr() {
        return letrasErr;
    }

    /**
     * @param letrasErr the letrasErr to set
     *  @param posicao int da posicao
     */
    public void setLetrasErr(char letrasErr, int posicao) {
        this.letrasErr[posicao] = letrasErr;
    }

    /**
     * @return the contadorLetrasAcertadas
     */
    public int getContadorLetrasAcertadas() {
        return contadorLetrasAcertadas;
    }

    /**
     * @param contadorLetrasAcertadas the contadorLetrasAcertadas to set
     */
    public void setContadorLetrasAcertadas(int contadorLetrasAcertadas) {
        this.contadorLetrasAcertadas = contadorLetrasAcertadas;
    }

    /**
     * @return the contadorLetrasErr
     */
    public int getContadorLetrasErr() {
        return contadorLetrasErr;
    }

    /**
     * @param contadorLetrasErr the contadorLetrasErr to set
     */
    public void setContadorLetrasErr(int contadorLetrasErr) {
        this.contadorLetrasErr = contadorLetrasErr;
    }

    /**
     * @return the perdeu
     */
    public boolean isPerdeu() {
        return perdeu;
    }

    /**
     * @param perdeu the perdeu to set
     */
    public void setPerdeu(boolean perdeu) {
        this.perdeu = perdeu;
    }
    
}

