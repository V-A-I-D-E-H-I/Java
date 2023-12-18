public class e55 {

    public static void main(String[] args){
        String Vu="V is the best";
        String Vp="no but she really is";

        //take input, but im defining because im lazy
        String in1= "V is the bet";
        String in2= "no but she really is";

        try{
            if(!Vu.equals(in1)|| !Vp.equals(in2)){
                throw new MyExClass("Invalid username or password");
            }
            else{
                System.out.println("Sahi hai darling");
            }
        }
        catch(MyExClass exp){
            System.out.println("Invalid baby");
        }
    }
    
}

class MyExClass extends Exception{
    public MyExClass(String a){
        System.out.println(a);
    }
}
