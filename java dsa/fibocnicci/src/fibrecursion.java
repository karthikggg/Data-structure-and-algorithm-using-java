/**
 * fibrecursion
 */
public class fibrecursion {


    static int count = 0;
    public static void fibbo(int prev1 , int prev2) {
       
        int curent_value = prev1+ prev2;
        System.out.println(curent_value);
        prev1=prev2;
        prev2= curent_value;
        count++;
        if(count<8){
            fibbo(prev1, prev2);
        }
        else{
            return;
        }
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibbo(0, 1);

    }
}