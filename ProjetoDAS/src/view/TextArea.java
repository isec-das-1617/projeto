package view;

import command.Colar;
import command.Command;
import command.Copiar;
import command.Cortar;
import javax.swing.JTextArea;

public class TextArea extends JTextArea{

    @Override
    public void cut() {
        final Command cm = new Cortar(this);
        cm.execute();
    }

    @Override
    public void paste() {
        final Command cm = new Colar(this);
        cm.execute();
    }

    @Override
    public void copy() {
        final Command cm = new Copiar(this.getSelectedText());
        cm.execute();
    }
    
}
