import java.util.Scanner;
class e11 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String empname=sc.nextLine();
        double empno=sc.nextInt();
        double basic =sc.nextInt();

        double da = 0.7*basic;
        System.out.println(da);

        sc.close();

        

    }
    
}
