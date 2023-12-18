import java.util.Scanner;

public class e53 {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        Double m=sc.nextDouble();
        try{
            
            if(m<0||m>100){
                throw new MyErrorClass("Error: Marks out of bound");
            }
        }
   
        catch(MyErrorClass exp){

            System.out.println("Invalid Marks");

        }


    }
    
}

    class MyErrorClass extends Exception{
        public MyErrorClass(String a){
            super(a);
        }
    }
