package command;

public class SavedText {
    private static SavedText instance;
    private String text;

    private SavedText() {
        text = "";
    }

    public static SavedText getInstance(){
        if( instance == null ){
            instance = new SavedText();
        }
        return instance;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
