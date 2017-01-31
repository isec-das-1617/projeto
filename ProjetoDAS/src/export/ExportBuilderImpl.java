package export;

public class ExportBuilderImpl implements ExportBuilder{

    private Export export;

    public ExportBuilderImpl(String file) {
        if(file.equals("txt")){
            export = new ExportTxt();
        }
        if(file.equals("html")){
            export = new ExportHtml();
        }
    }
    
    @Override
    public ExportBuilder exportText(final String text) {
        export.exportText(text);
        return this;
    }

    @Override
    public Export build() {
        return export;
    }
    
}
