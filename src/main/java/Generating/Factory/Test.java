package Generating.Factory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory documentFactory = new DocumentFactory();
        String docName = documentFactory.getDocument(DocType.DICTIONARY_DOC).getName();
        AbstractFactory reportFactory = new ReportFactory();
        String reportName = reportFactory.getReport(ReportType.GLOBAL_REPORT).getName();
        System.out.println(docName);
        System.out.println(reportName);
    }
}
