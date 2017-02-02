package command;

import javax.swing.JTextArea;

public class Cortar implements Command{
    private JTextArea target;

    public Cortar(JTextArea area) {
        target = area;
    }
    
    @Override
    public void execute() {
        if(target.getSelectedText()!=null){
            Historico.getInstance().addHist(target.getText());
            SavedText.getInstance().setText(target.getSelectedText());
            target.setText(target.getText().substring(0, target.getSelectionStart()) +
                    target.getText().substring(target.getSelectionEnd()));
        }
    }
}
