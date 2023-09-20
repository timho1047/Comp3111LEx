package Lab2a;
import java.util.*;

public class Score {
    /* A class contains constructor[C], attributes[A] and methods[M]. */
    /* [A] Attribute List */
    double Quiz, MidExam, FinalExam, Score;
    char grade;
    String comment;
    Map<Character, String> commentMap= createCommentMap();

    private Map<Character, String> createCommentMap(){
        char[] gradeArray = {'A', 'B', 'C', 'D', 'E'};
        String[] commentArray = {"Very Good", "Good", "Not Bad", "Bad", "Very Bad"};
        Map<Character, String> commentMap = new HashMap<>();
        for (int i = 0; i < 5; i++){
            commentMap.put(gradeArray[i], commentArray[i]);
        }
        return commentMap;
    }

    /* [C] Constructor: to initialize value to the object through parameter. */
    Score(){
        Quiz = 0;
        MidExam = 0;
        FinalExam = 0;
    }

    /* [M] Method: It includes procedure and function. */
    /* Below are Procedures[M1]. Procedure is a sub program to run serval process, but not return values(s) */
    void setQuiz(double x){ Quiz = x; }
    void setMidExam(double x){MidExam = x;}
    void setFinalExam(double x){ FinalExam = x; }

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
    String getComment(){
//        if(grade == 'A') comment = "Very Good";
//        else if(grade == 'B') comment = "Good";
//        else if(grade == 'C') comment = "Not Bad";
//        else if(grade == 'D') comment = "Bad";
//        else comment = "Very Bad";
        comment = commentMap.get(grade);
        return comment;
    }
}
