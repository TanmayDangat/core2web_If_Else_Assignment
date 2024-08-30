package core2web.Control_Statements.If_Else_Assignment;

public class Q_4 {
    public static void main(String[] args) {
        double percentage = 77;
        if((percentage > 85.00) && (percentage <= 100.00)){
            System.out.println("Medical");
        }
        else if((percentage > 75.00) && (percentage <= 85.00)){
            System.out.println("Engineering");
        }
        else if((percentage > 65.00) && (percentage <= 75.00)){
            System.out.println("Pharmacy or bachelor of science");
        }
        else if((percentage > 34.00) && (percentage <= 65.00)){
            System.out.println("Arts");
        }
        else if((percentage > 0.00) && (percentage <= 34.00)){
            System.out.println("Appear again");
        }
        else{
            System.out.println("Please enter appropriate value");
        }
    }
}
