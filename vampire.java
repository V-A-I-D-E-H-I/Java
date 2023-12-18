import java.util.*;

public class vampire {

    public static void main(String[] args) {
        
        int n =1260;int n1,n2;
        int d1=n%10;
        int d2=(n/10)%10;
        int d3=(n/100)%10;
        int d4=(n/1000)%10;


        int[] arr= {d1,d2,d3,d4};

        java.util.Arrays.sort(arr);
        //         for (int k=0; k<4; k++){
        //     System.out.println(arr[k]+" ");
        // }

        int a, b, c, d;

        int i=0;
        int j=0;
        for ( i=1; i<=n; i++){
            for ( j=1; j<=n; j++){
                if((i*j==n)&&(9<i)&&(i<100)&&(9<j)&&(j<100)){
                    // System.out.println("For i and j "+i+" "+j+"\n");
                    a=i/10;
                    b=i%10;
                    c=j/10;
                    d=j%10;
                    // System.out.println("a "+a+" b:"+b+" c:"+c+" d:"+d);
                    // System.out.println("printing the array");
                    int[] darr= {a,b,c,d};
                                
                    
                    java.util.Arrays.sort(darr);
        //             for (int k=0; k<4; k++){
        //     System.out.println(darr[k]+" ");
        // }

                    if(Arrays.equals(arr, darr)){

                        System.out.println("Vampire number");
                        n1=10*a+b;
                        n2=10*c+d;
                        System.out.println("n1 "+n1);
                        System.out.println("n2 "+n2);

                        return;
                    }


                }
            }
        }

        System.out.println("Not a vampire number");
    }
    
}
