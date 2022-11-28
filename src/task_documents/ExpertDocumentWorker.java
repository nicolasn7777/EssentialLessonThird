package task_documents;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument(){
        System.out.println("Документ збережений в новому форматі");
    }
}
