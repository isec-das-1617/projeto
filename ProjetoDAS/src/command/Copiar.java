package command;

public class Copiar implements Command{

    private String target;

    public Copiar(String area) {
        target = area;
    }
    
    @Override
    public void execute() {
        if(target!=null){
            SavedText.getInstance().setText(target);
        }
    }
    
}
