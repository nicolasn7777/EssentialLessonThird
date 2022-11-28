package task_printer;

public class Main extends Printer {
    public static void main(String[] args) {
        Printer colorOne = new Printer();
        Printer colorTwo = new SecondPrinter();
        Printer colorThree = new ThirdPrinter();

        colorOne.print(s);
        colorTwo.print(s);
        colorThree.print(s);

    }
}
