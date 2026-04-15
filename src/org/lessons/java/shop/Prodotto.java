package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    public int codice;
    public String nome;
    public String descrizione;
    public BigDecimal prezzo; //? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
    public BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    
    public BigDecimal showBasePrice() {//? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
        return this.prezzo;
    }

    public BigDecimal showFullPrice() { //? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
        return (this.prezzo.add(this.prezzo.multiply(this.iva))).setScale(2,RoundingMode.DOWN);
    }

    public String showFullName(){
        return (this.codice + "-" + this.nome);
    }
}
