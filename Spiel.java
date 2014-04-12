import ea.*; //Diese Zeile macht dir alle Klassen der Engine Alpha zugaengig

/**
 * Dies ist eine einfache Spiel-Klasse, die keinen besonderen Inhalt hat.<br />
 * Sie soll dir zeigen, wie der erste Schritt des Spieleprogrammierens mit der EA - naemlich 
 * das schreiben der spielsteuernden Klasse - aussieht.<br />
 * Hierbei sieht man noch <b>gar kein</b> Spielgeschehen.
 * @version 2.0
 * @author  Michael Andonie
 */
public class Spiel 
extends Game { //Die Klasse MUSS sich aus der ea-Klasse Game ableiten!
    //Keine Attribute
    
    /**
     * Konstruktor-Methode ohne Parameter.<br />
     * Hierdrin werden alle Ressourcen ueber den Konstruktor der uebergeordneten Klasse Game gemacht.
     */
    public Spiel() {
        super(300, 500, "Fenster-Titel"); // Breite: 300, Hoehe: 500, Titel: Fenster-Titel
    }
    
    /**
     * Diese Methode wird immer dann aufgerufen, wenn eine Taste heruntergedrueckt wird.<br />
     * Als Parameter wird eine Zahl mitgegeben, mit der man den Tastendruck eindeutig einer Tastte zuordnen kann.<br /><br />
     * 
     * In diesem Beispiel wird der Tastencode nicht direkt verarbeitet, sonder einfach ueber die Konsole ausgegeben.
     * @param   tastencode  Der Code der heruntergedrueckten Taste.
     */
    @Override //<- Dies hat fuer den Quellcode keine direkte Bedeutung. Es heisst "Ich ueberschreibe diese Methode!!"
    public void tasteReagieren(int tastencode) {
        System.out.println("Taste mit Code "+tastencode+ " wurde gedrueckt");
    }
}