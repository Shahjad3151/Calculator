import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        int a,b,c;
        char ch;
        System.out.println("enter the first number");      //calculator
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the second number");      
        b=sc.nextInt();
        System.out.println("enter the choice operator  + ,- ,*, /,% ");  
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':c=a+b; 
                   System.out.println(c);   
                   break;                           
            case '-':c=a-b; 
                   System.out.println(c);   
                   break; 
            case '*':c=a*b; 
                   System.out.println(c);   
                   break;  
            case '/':c=a/b; 
                   System.out.println(c);   
                   break;  
            case '%':c=a%b; 
                   System.out.println(c);   
                   break;   
            default:System.out.println("invalid choice");
               break;
        }
}
}
