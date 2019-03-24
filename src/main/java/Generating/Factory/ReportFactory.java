package Generating.Factory;

public class ReportFactory implements AbstractFactory{
    public IDocument getDocument(DocType type) {
        throw new RuntimeException("Not correct factory");
    }

    public IReport getReport(ReportType type) {
        switch (type) {
            case LOCAL_REPORT: return new IReport() {
                public String getName() {
                    return "Report local";
                }
            };
            case GLOBAL_REPORT: return new IReport() {
                public String getName() {
                    return "Report global";
                }
            };
            default: throw new RuntimeException("Not defined type");
        }
    }
}
