package core2web.Control_Statements.If_Else_Assignment;

public class Q_8 {
    public static void main(String[] args) {
        double percent = 88.00;
        if((percent > 84.00) && (percent <= 100.00)){
            System.out.println("Passed : first class with distinction");
        }
        else if((percent > 74.00) && (percent <= 84.00)){
            System.out.println("Passed : first class with distinction");
        }
        else if((percent > 59.00) && (percent <= 74.00)){
            System.out.println("Passed : first class");
        }
        else if((percent > 53.00) && (percent <= 59.00)){
            System.out.println("Passed : second class");
        }
        else if((percent > 46.00) && (percent <= 53.00)){
            System.out.println("Passed");
        }
        else if((percent > 0.00) && (percent <= 46)){
            System.out.println("Failed");
        }
        else{
            System.out.println("Enter valid percentage");
        }
    }
}
