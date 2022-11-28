package task_classroom;

public class ClassRoom {

    public static void main(String[] args) {
        Pupil pupilFirst = new Pupil(2, 5, 4, 3);
        Pupil pupilSecond = new ExcelentPupil(5, 5);
        Pupil pupilThird = new GoodPupil(4, 4, 4);
        Pupil pupilFourth = new BadPupil(2, 2);

        System.out.println("Показники першого учня: ");
        pupilFirst.study();
        pupilFirst.read();
        pupilFirst.write();
        pupilFirst.relax();

        System.out.println("--------------------------------");

        System.out.println("Показники другого учня: ");
        pupilSecond.study();
        pupilSecond.read();
        pupilSecond.write();
        pupilSecond.relax();

        System.out.println("--------------------------------");

        System.out.println("Показники третього учня: ");
        pupilThird.study();
        pupilThird.read();
        pupilThird.write();
        pupilThird.relax();

        System.out.println("--------------------------------");

        System.out.println("Показники четвертого учня: ");
        pupilFourth.study();
        pupilFourth.read();
        pupilFourth.write();
        pupilFourth.relax();
    }


}
