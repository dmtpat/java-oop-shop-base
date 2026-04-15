package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public Double prezzo; //? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
    public int iva;

    public Prodotto(String nome, String descrizione, Double prezzo, int iva) {
        Random rand = new Random();
        this.codice = rand.nextInt();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    
    public Double showBasePrice() {//? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
        return this.prezzo;
    }

    public Double showFullPrice() { //? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
        return (this.prezzo + (this.prezzo * this.iva / 100));
    }

    public String showFullName(){
        return (this.codice + "-" + this.nome);
    }
}
