/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.jogodaforca.dominio;
import java.util.Random;

/**
 *
 * @author breno
 */
public class ListaPalavras {
    private String Topico;
    private String Lista[] = new String[50];
    private int contadorLista = 0;

    public ListaPalavras(String Topico) {
        this.setTopico(Topico);
    }

    public boolean adicionarLista(String palavra)
    {
        if (this.getContadorLista() < 50) {
            setLista(palavra,this.getContadorLista());
            setContadorLista(this.getContadorLista()+1);
            return true;
        }
        return false;
    }
    
    public void mostrarLista(String[] Lista)
    {
        System.out.println("Lista de " + this.getTopico() + ": ");
        for(String palavra:Lista)
        {
            if(palavra!=null) System.out.println(palavra);
        }
    }
    
    public String sortearPalavra()
    {
       Random r = new Random();
       int i = r.nextInt(this.getContadorLista());
       return getLista(i);
    }
    /**
     * @return the Topico
     */
    public String getTopico() {
        return Topico;
    }

    /**
     * @param Topico the Topico to set
     */
    public void setTopico(String Topico) {
        this.Topico = Topico;
    }

    /**
     * @return the Lista
     */
    public String[] getLista() {
        return Lista;
    }
    
    public String getLista(int posicao) {
        return Lista[posicao];
    }
    /**
     * @param Lista the Lista to set
     */
    public void setLista(String palavra, int posicao) {
        this.Lista[posicao] = palavra;
    }

    /**
     * @return the contadorLista
     */
    public int getContadorLista() {
        return contadorLista;
    }

    /**
     * @param contadorLista the contadorLista to set
     */
    public void setContadorLista(int contadorLista) {
        this.contadorLista = contadorLista;
    }
    
    
}

