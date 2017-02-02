package command;

import javax.swing.JTextArea;

public class Write implements Command{
    
    private JTextArea target;
    
    public Write(JTextArea area) {
        target = area;
    }

    @Override
    public void execute() {
        Historico.getInstance().addHist(target.getText());
    }
    
}
