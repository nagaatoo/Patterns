package Generating.Factory;

public interface AbstractFactory {
    IDocument getDocument(DocType type);
    IReport getReport(ReportType type);
}
