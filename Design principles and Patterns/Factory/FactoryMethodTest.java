package Factory;

interface Document {

    void open();
}
// Concrete Product 
class WordDocument implements Document {

    public void open() {
        System.out.println("Opening Word Document...");
    }
}
// Concrete Product
class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}
// Concrete Product
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document...");
    }
}

// Creator (Abstract Factory)
 abstract class DocumentFactory {

    // Factory Method
    public abstract Document createDocument();
}
// Concrete Factory
 class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
// Concrete Factory
class PdfDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}
// Concrete Factory
 class ExcelDocumentFactory extends DocumentFactory {

    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodTest {

    public static void main(String[] args) {

        // Create Word Document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document d=wordFactory.createDocument();
        d.open();
    }
}