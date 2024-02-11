public class App {
    public static void main(String[] args) {
       int prev2 = 0;
       int prev1 = 1;
       System.out.println(prev2);
       System.out.println(prev1);

       for(int i=0; i<8 ; i++){
        int current_value = prev2+prev1;
        System.out.println(current_value);
        prev2=prev1;
        prev1=current_value;
       }
       

    }
    }

