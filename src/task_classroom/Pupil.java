package task_classroom;

public class Pupil {
    private int studyMark;
    private int readMark;
    private int writeMark;
    private int relaxMark;

    public Pupil (){
    }

    public Pupil (int studyMark){
        this.studyMark = studyMark;
    }

    public Pupil (int studyMark, int readMark){
        this.studyMark = studyMark;
        this.readMark = readMark;
    }

    public Pupil (int studyMark, int readMark, int writeMark){
        this.studyMark = studyMark;
        this.readMark = readMark;
        this.writeMark = writeMark;
    }

    public Pupil (int studyMark, int readMark, int writeMark, int relaxMark){
        this.studyMark = studyMark;
        this.readMark = readMark;
        this.writeMark = writeMark;
        this.relaxMark = relaxMark;
    }

    public int getStudyMark() {
        return studyMark;
    }

    public void setStudyMark(int studyMark) {
        this.studyMark = studyMark;
    }

    public int getReadMark() {
        return readMark;
    }

    public void setReadMark(int readMark) {
        this.readMark = readMark;
    }

    public int getWriteMark() {
        return writeMark;
    }

    public void setWriteMark(int writeMark) {
        this.writeMark = writeMark;
    }

    public int getRelaxMark() {
        return relaxMark;
    }

    public void setRelaxMark(int relaxMark) {
        this.relaxMark = relaxMark;
    }

    public void study(){
        System.out.println("Показники за навчання: " + studyMark);
    }
    public void read(){
        System.out.println("Показники за читання: " + readMark);
    }
    public void write(){
        System.out.println("Показники за правопис: " + writeMark);
    }
    public void relax(){
        System.out.println("Поведінка: " + relaxMark);
    }
}
