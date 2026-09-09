import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder feeling = new StringBuilder();
        for(int i = 1; i <= n ; i++){
            if(i%2 == 0){
                feeling.append("I love");
            }else{
                feeling.append("I hate");
            }
            if(i == n){
                feeling.append(" it");
            }else{
                feeling.append(" that ");
            }
        }
        System.out.println(feeling.toString());
        sc.close();
    }
}