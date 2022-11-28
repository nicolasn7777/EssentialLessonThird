package task_printer;

public class SecondPrinter extends Printer{

    @Override
    public void print(String value){
        System.out.println((char) 27 + "[31m"+ s + (char)27 + "[0m");
    }

}
