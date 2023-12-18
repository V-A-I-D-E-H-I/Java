import java.util.*;

public class e52 {

    public static void main(String[]args){

        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int temp, vc=0, ivc=0;
        

        for (int i=0; i<n; i++){

            try{
                temp=sc.nextInt();
                vc+=1;
            }

            catch(Exception e){
                System.out.println("Invalid Integer");
                ivc+=1;
            }            
        }

        System.out.println("Valid count"+vc+" "+"Invalid Count"+ivc);

    }
    
}
