import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz:");
        a = input.nextInt();
        System.out.print("2.Sayıyı giriniz:");
        b = input.nextInt();
        System.out.print("3.Sayıyı giriniz:");
        c = input.nextInt();

        if(a < b && a <c){
            if(b < c){
                System.out.println("a < b < c");
            }else{
                System.out.println("a < c < b");
            }
        }else if( b < c && b < a){
            if(c < a){
                System.out.println("b < c < a");
            }else{
                System.out.println("b < a < c");
            }
        }else{
            if(a < b){
                System.out.println(" c < a < b");
            }
            else{
                System.out.println("c < b < a");
            }
        }

    }
}
