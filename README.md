# java-oop-shop-base

Nel progetto `java-oop-shop`, package `org.lessons.java.shop`, creare la classe Prodotto che gestisce i prodotti dello shop. 

Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva

Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

Nota:
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

Inside the folder `src` there is a package `org.lessons.java.shop`, it contains two java class:
- `Prodotto.java` where is the "blueprint;
- `main.java` where is the sorce code.