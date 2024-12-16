import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num = Scan.nextInt();
        if (num<10000 && num >= 1000){
            if (num/100==31) {
                System.out.println(num-8);
            }
            else System.out.println("Not a valid year");
        }
        else {
            System.out.println("Not a valid number");
        }
    }
}
