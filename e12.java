import java.util.Scanner;
public class e12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Factorial 2-Arm 3-Palin 4-Exit");
        String s = sc.nextLine();
        int c = sc.nextInt();

        switch(c){
            case 1:
                System.out.println("Factorial");
                break;
            case 2:
                System.out.println("Armstrong");
                break;
            case 3:
                
                System.out.println(Palindrome(s));

            default:
            System.out.println("wrong option");

        }
        sc.close();

    }

    public static String Palindrome(String s){

        String temp="";

        for (int i=0; i<s.length(); i++)
        {
            temp=temp+s.charAt(i);

        }

        return (temp);

    }
    
}
