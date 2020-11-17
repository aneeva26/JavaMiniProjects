package ifelsestatements;

public class IfElseStatements {


    static void gradeChecker (){
       int grade = 49;
       
       if (grade<50){
           System.out.println("You have not passed the course... Better luck next time.");
       } else {
           System.out.println("You have passed the course.");

       }
       
       if (grade>100) {
            System.out.println("Invalid grade.");
       
       if (grade > 90) {
           System.out.println("Congrats! You have honours in this course!");
       }
       
       }    
           
    }
    
        public static void main(String[] args) {
        gradeChecker();  
    }
    
}
