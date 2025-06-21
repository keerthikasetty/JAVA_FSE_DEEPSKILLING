package FSE_WEEK1_DESIGN_PATTERNS.factorypattern;
interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Word Document opened.");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("PDF Document opened.");
    }
}

abstract class DocumentFactory {
    abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new PdfFactory(); 
        Document doc = factory.createDocument();
        doc.open();
    }
}
