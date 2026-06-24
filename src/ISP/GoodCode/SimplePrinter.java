package ISP.GoodCode;

import ISP.BadCode.Document;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc){
        System.out.println("Printing the document...");
    }
}
