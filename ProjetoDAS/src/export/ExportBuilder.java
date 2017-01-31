package export;

public interface ExportBuilder {
    public ExportBuilder exportText(final String text);
    Export build();
}
