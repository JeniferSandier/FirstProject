import java.util.*;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int left = 0;
        while(left<=str.length()-1-left){
            if((str.charAt(left)) != (str.charAt(str.length()-1-left)))
                break;
            left++;

        }  
        if(left<=str.length()-1-left){
            System.out.println("no");
        }  
        else{
            System.out.println("yes");
        }  
            

    }
}
