package Generating.Factory;

public class DocumentFactory implements AbstractFactory {
    public IDocument getDocument(DocType type) {
        switch (type) {
            case FIN_PER_DOC: return new IDocument() {
                public String getName() {
                    return "Document fin. per.";
                }
            };
            case DICTIONARY_DOC: return new IDocument() {
                public String getName() {
                    return "Document dictionary";
                }
            };
            default: throw new RuntimeException("Not defined type");
        }
    }

    public IReport getReport(ReportType type) {
        throw new RuntimeException("Not correct factory");
    }
}
