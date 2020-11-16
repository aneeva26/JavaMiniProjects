package ifelsestatements;

public class IfElseStatements {


    static void gradeChecker (){
       int grade = 49;
       
       if (grade > 50){
           System.out.println("You have passed the course.");
       } else if (grade < 50){
           System.out.println("You have not passed the course... Better luck next time.");

       }
       
       if (grade > 89) {
           System.out.println("Congrats! You have honours in this course!");
       }
       
           
           
    }
    
    public static void main(String[] args) {
        gradeChecker();  
    }
    
}
