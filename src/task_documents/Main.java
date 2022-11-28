package task_documents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int pro = 1111;
        final int exp = 2222;

        System.out.println("Введіть ключ активації:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case pro->{
                System.out.println("Pro доступ! ");
                DocumentWorker proDocument = new ProDocumentWorker();
                proDocument.openDocument();
                proDocument.editDocument();
                proDocument.saveDocument();
            }
            case exp->{
                System.out.println("Expert доступ!");
                DocumentWorker expertDocument = new ExpertDocumentWorker();
                expertDocument.openDocument();
                expertDocument.editDocument();
                expertDocument.saveDocument();
            }
            default->{
                System.out.println("Free доступ!");
                DocumentWorker freeDocument = new DocumentWorker();
                freeDocument.openDocument();
                freeDocument.editDocument();
                freeDocument.saveDocument();
            }
        }
    }
}
