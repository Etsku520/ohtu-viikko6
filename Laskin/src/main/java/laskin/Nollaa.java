package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Nollaa implements Komento{
    TextField tuloskentta;
    TextField syotekentta;
    Button nollaa;
    Button undo;
    Sovelluslogiikka sovellus;

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        nollaa.disableProperty().set(true);
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos());
    }

    @Override
    public void peru() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
