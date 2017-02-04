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
    public ExportBuilder exportText(final String text, final String path) {
        export.exportText(text,path);
        return this;
    }

    @Override
    public Export build() {
        return export;
    }
    
}
