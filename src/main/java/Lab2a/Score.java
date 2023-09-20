package Lab2a;

public class Score {
    /* A class contains constructor[C], attributes[A] and methods[M]. */
    /* [A] Attribute List */
    double Quiz, MidExam, FinalExam, Score;
    char grade;
    String comment;

    /* [C] Constructor: to initialize value to the object through parameter. */
    Score(){
        Quiz = 0;
        MidExam = 0;
        FinalExam = 0;
    }

    /* [M] Method: It cincludes procedure and function. */
    /* Below are Procedures[M1]. Procedure is a sub program to run serval process, but not return values(s) */
    void setQuiz(double x){ Quiz = x; }
    void setMidExam(double x){MidExam = 0;}
    void setFinalExam(double x){ FinalExam = 0; }

    /* Below are Functions[M2]. Function is statement that creates to run and return values(s) */
    double getScore(){ Score = 0.2*Quiz + 0.3*MidExam + 0.5*FinalExam; return Score; }
    char getGrade(){
        if(Score >= 80 && Score <= 100) grade = 'A';
        else if(Score >= 65 && Score < 80) grade = 'B';
        else if(Score > 50 && Score < 65) grade = 'C';
        else if(Score > 40 && Score < 50) grade = 'D';
        else grade = 'E';
        return grade;
    }
    String get Comment(){

    }
}
