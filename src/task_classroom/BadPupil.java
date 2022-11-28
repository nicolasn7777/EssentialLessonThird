package task_classroom;

public class BadPupil extends Pupil{
    int studyMark = getStudyMark();
    int readMark = getReadMark();
    int writeMark = getWriteMark();
    int relaxMark = getRelaxMark();

    public BadPupil (){
    }

    public BadPupil (int studyMark){
        this.studyMark = studyMark;
    }

    public BadPupil (int studyMark, int readMark){
        this.studyMark = studyMark;
        this.readMark = readMark;
    }

    public BadPupil (int studyMark, int readMark, int writeMark){
        this.studyMark = studyMark;
        this.readMark = readMark;
        this.writeMark = writeMark;
    }

    public BadPupil (int studyMark, int readMark, int writeMark, int relaxMark){
        this.studyMark = studyMark;
        this.readMark = readMark;
        this.writeMark = writeMark;
        this.relaxMark = relaxMark;
    }
    @Override
    public void study(){
        System.out.println("Показники за навчання: " + studyMark);
    }
    @Override
    public void read(){
        System.out.println("Показники за читання: " + readMark);
    }
    @Override
    public void write(){
        System.out.println("Показники за правопис: " + writeMark);
    }
    @Override
    public void relax(){
        System.out.println("Поведінка: " + relaxMark);
    }
}
