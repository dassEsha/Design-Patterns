package ISP.BadCode;

import ISP.BadCode.Document;
import ISP.BadCode.Machine;

public class MultipurposeMachine implements Machine {
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
