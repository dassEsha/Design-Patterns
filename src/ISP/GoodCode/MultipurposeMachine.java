package ISP.GoodCode;

import ISP.BadCode.Document;

public class MultipurposeMachine implements Printer,Copier,Scanner{
    @Override
    public void print(Document doc) {
        System.out.println("Printing the document..");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning the document...");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copy the document..");
    }
}
