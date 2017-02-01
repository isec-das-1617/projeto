
package export;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExportTxt extends Export{

    @Override
    public void exportText(String text, String path) {
        ArrayList<String> refer = new ArrayList<>();
        int n = 1;
        Pattern p = Pattern.compile("\\\\cite\\{(.*?)\\}");
        Matcher m = p.matcher(text);
        while (m.find()) {
            if(!refer.contains(m.group(1))){
                text = text.replace("\\cite{" + m.group(1) + "}", "[" + n + "]");
                refer.add(m.group(1));
                n++;
            }
        }
        
        try{
            PrintWriter writer = new PrintWriter(path, "UTF-8");
            writer.println(text);
            writer.close();
        } catch (IOException e) {
            return;
        }
    }
    
}
