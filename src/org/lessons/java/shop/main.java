package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main{
    
    public static void main(String[] args) {
    Prodotto Pane = new Prodotto("pane", "Prodotto a uso alimentare a base di farina di grano duro, utilizzato per accompagnare i pasti.", new BigDecimal(2.0) , new BigDecimal(0.04));
                        
    System.out.println("Il prodotto " + Pane.showFullName() + " ha un prezzo base di " + Pane.showBasePrice()
            + " euro e un prezzo totale di " + Pane.showFullPrice() + " euro dopo l'aggiunta del " + Pane.iva
            + "% di iva.");
    System.out.println( Pane.showFullName());
    }
}
