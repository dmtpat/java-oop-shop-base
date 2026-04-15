package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo; //? Why not float?? err: The constructor Prodotto(String, String, double, int) is undefined
    private BigDecimal iva;

    //! constructors
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    public Prodotto(String nome, String descrizione, BigDecimal prezzo) {
        Random rand = new Random();
        this.codice = rand.nextInt();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.04);
    }
    //! Getter setter

    public int GetCodice() {
        return this.codice;
    }

    public String GetNome() {
        return this.nome;
    }
    public void SetNome( String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }
    public String GetDescrizione() {
        return this.descrizione;
    }
    public void SetDescrizione( String descrizione) {
        if (descrizione != null) {
            this.descrizione = descrizione;
        }
    }
    public BigDecimal GetPrezzo() {
        return this.prezzo;
    }
    public void SetPrezzo( String prezzo) {
        if (prezzo != null) {
            this.prezzo = new BigDecimal(prezzo);
        }
    }
    public BigDecimal GetIva() {
        return this.iva;
    }
    public void SetIva( String iva) {
        if (iva != null) {
            this.iva = new BigDecimal(iva);
        }
    }

    //! Other methods
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
