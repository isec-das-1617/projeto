package command;

import javax.swing.JTextArea;

public class Redo implements Command{
    
    private JTextArea target;
    
    public Redo(JTextArea area) {
        target = area;
    }
    
    @Override
    public void execute() {
        String redoString;
        if((redoString = Historico.getInstance().redoHist())!=null){
            target.setText(redoString);
        }
    }
}
