package core2web.Control_Statements.If_Else_Assignment;

public class Q_7 {
    public static void main(String[] args) {
        int sp = 1200;
        int cp = 900;
        if(sp > cp){
            System.out.println("Profit is : " + (sp - cp));
        }
        else if(sp < cp){
            System.out.println("Loss is : " + (sp - cp));
        }else{
            System.out.println("No profit no loss");
        }
    }
}
