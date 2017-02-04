package command;

import javax.swing.JTextArea;

public class Undo implements Command{
    
    private JTextArea target;
    
    public Undo(JTextArea area) {
        target = area;
    }
    
    @Override
    public void execute() {
        String undoString;
        if((undoString = Historico.getInstance().undoHist(target.getText()))!=null){
            target.setText(undoString);
        }
    }
}
