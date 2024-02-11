public class fibformula {

public static int fibfrmula(int nth) {
    if (nth<=1) {
        return nth;
        
    }
    else{
        return fibfrmula(nth-1) + fibfrmula(nth-2);

    }
    
        
    }
    public static void main(String[] args) {
        fibfrmula(0);
        System.out.println(fibfrmula(8));
        
    }
}