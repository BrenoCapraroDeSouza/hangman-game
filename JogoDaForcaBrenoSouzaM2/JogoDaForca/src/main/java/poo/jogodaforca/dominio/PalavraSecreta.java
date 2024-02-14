/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.jogodaforca.dominio;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class PalavraSecreta 
{   
    private String palavraDoJogo;
    private ListaPalavras listaDoJogo;

    
    public PalavraSecreta(ListaPalavras lista)
    {
        this.setListaDoJogo(lista);
        this.setPalavraDoJogo(lista.sortearPalavra());
    }
    /**
     * @return the palavraDoJogo
     */
    public String getPalavraDoJogo() {
        return palavraDoJogo;
    }

    /**
     * @param palavraDoJogo the palavraDoJogo to set
     */
    public void setPalavraDoJogo(String palavraDoJogo) {
        this.palavraDoJogo = palavraDoJogo;
    }

    /**
     * @return the listaDoJogo
     */
    public ListaPalavras getListaDoJogo() {
        return listaDoJogo;
    }

    /**
     * @param listaDoJogo the listaDoJogo to set
     */
    public void setListaDoJogo(ListaPalavras listaDoJogo) {
        this.listaDoJogo = listaDoJogo;
    }

    
    
    
}
