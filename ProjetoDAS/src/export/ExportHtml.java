package export;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExportHtml extends Export{

    @Override
    public void exportText(String text) {
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            fWriter = new FileWriter("name.html");
            writer = new BufferedWriter(fWriter);
            writer.write(text);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            //catch any exceptions here
        }
    }
}
