package command;

import javax.swing.JTextArea;

public class Colar implements Command{

    private JTextArea target;
    
    public Colar(JTextArea area) {
        target = area;
    }
    
    @Override
    public void execute() {
        Historico.getInstance().addHist(target.getText());
        target.setText(new StringBuilder(target.getText()).insert( target.getCaretPosition(), SavedText.getInstance().getText()).toString()); 
    }
}
