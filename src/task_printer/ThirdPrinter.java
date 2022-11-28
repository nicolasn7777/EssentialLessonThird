package task_printer;

public class ThirdPrinter extends Printer{
    @Override
    public void print(String value){
        System.out.println((char) 27 + "[33m"+ s + (char)27 + "[0m");
    }
}
