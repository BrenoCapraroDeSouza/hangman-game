/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.jogodaforca.dominio;

/**
 *
 * @author breno
 */
public class Tabuleiro {
    private char palavracorreta[];
    private char letrasAcertadas[];
    private char letrasErr[];
    private int contadorTentativas;

    public Tabuleiro(char palavracorreta[], char[] letrasAcertadas, char[] letrasErr, int contadorLetrasAcertadas, int contadorLetrasErr) 
    {
        this.palavracorreta = palavracorreta;
        this.letrasAcertadas = letrasAcertadas;
        this.letrasErr = letrasErr;
        this.contadorTentativas = contadorLetrasAcertadas+contadorLetrasErr;
    }
    
    public void construirTabuleiro()
    {
        System.out.println("\t\t------ JOGO DA FORCA ------\t\t");
        System.out.println("\n\n\t\t PALAVRA SECRETA =>");
        System.out.print("\t\t\t\t\t\t");
        for(char letra:this.getPalavracorreta())
        {
            if(pertence(letra,this.getLetrasAcertadas()))
            {
                System.out.print(letra);
            }

            else System.out.print(" _ ");
        }
        
        System.out.println("\n\nTENTATIVAS => "+ this.getContadorTentativas());
        System.out.println("\n\t\tLETRAS ACERTADAS =>");
        for(char letra:this.getLetrasAcertadas())
        {
            if(letra!= '\0') System.out.print(letra+"- ");
        }
        
        System.out.println("\n\t\t LETRAS ERRADAS =>");
        for(char letra:this.getLetrasErr())
        {
            if(letra!='\0') System.out.print(letra+"- ");
        }
    }

    
    
    public boolean pertence(char c, char[] array) 
    {
    for (char x : array) {
        if (x == c) {
            return true;
        }
    }
    return false;
    }
    /**
     * @return the palavracorreta
     */
    public char[] getPalavracorreta() {
        return palavracorreta;
    }

    /**
     * @param palavracorreta the palavracorreta to set
     */
    public void setPalavracorreta(char palavracorreta[]) {
        this.palavracorreta = palavracorreta;
    }

    /**
     * @return the letrasAcertadas
     */
    public char[] getLetrasAcertadas() {
        return letrasAcertadas;
    }

    /**
     * @param letrasAcertadas the letrasAcertadas to set
     */
    public void setLetrasAcertadas(char[] letrasAcertadas) {
        this.letrasAcertadas = letrasAcertadas;
    }

    /**
     * @return the letrasErr
     */
    public char[] getLetrasErr() {
        return letrasErr;
    }

    /**
     * @param letrasErr the letrasErr to set
     */
    public void setLetrasErr(char[] letrasErr) {
        this.letrasErr = letrasErr;
    }

    /**
     * @return the contadorTentativas
     */
    public int getContadorTentativas() {
        return contadorTentativas;
    }

    /**
     * @param contadorTentativas the contadorTentativas to set
     */
    public void setContadorTentativas(int contadorTentativas) {
        this.contadorTentativas = contadorTentativas;
    }

    
}
