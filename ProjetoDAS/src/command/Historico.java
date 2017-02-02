package command;

import java.util.ArrayList;

public class Historico {
    private static Historico instance;
    private int index;
    private ArrayList<String> hist;

    private Historico() {
        index=0;
        hist = new ArrayList<>();
    }

    public static Historico getInstance(){
        if( instance == null ){
            instance = new Historico();
        }
        return instance;
    }

    public ArrayList<String> getHist() {
        return hist;
    }

    public void addHist(String alt) {
        if(index < hist.size()-1){
            for(int i=index+1;i<hist.size();i++){
                hist.remove(i);
            }
        }
        hist.add(alt);
        index++;
    }
    
    public String undoHist(String alt) {
        if(index > 0){
            hist.add(alt);
            index--;
            System.out.println(index);
            return hist.get(index);
        }
        return null;
    }
    
    public String redoHist() {
        //System.out.println(index + "," + hist.size());
        if(index < hist.size()-1){
            index++;
            return hist.get(index);
        }
        return null;
    }
}
