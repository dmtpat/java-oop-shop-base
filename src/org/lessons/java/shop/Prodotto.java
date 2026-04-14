package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public int prezzo;
    public int iva;

    public Prodotto(String nome, String descrizione, int prezzo, int iva) {
        Random rand= new Random();
        this.codice = rand.nextInt();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva  = iva;
    }
}
