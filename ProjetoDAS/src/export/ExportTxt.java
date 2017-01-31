
package export;

import java.io.IOException;
import java.io.PrintWriter;

public class ExportTxt extends Export{

    @Override
    public void exportText(String text, String path) {
        try{
            PrintWriter writer = new PrintWriter(path, "UTF-8");
            writer.println(text);
            writer.close();
        } catch (IOException e) {
            return;
        }
    }
    
}
