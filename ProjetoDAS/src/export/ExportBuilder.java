package export;

public interface ExportBuilder {
    public ExportBuilder exportText(final String text,final String path);
    Export build();
}
