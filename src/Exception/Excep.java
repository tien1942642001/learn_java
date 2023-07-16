package Exception;

import java.util.Scanner;

public class Excep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        try {
            float c = (float) a / b;
            System.out.println("gia tri cua: " + c);
        } catch (Exception ex) {
           // System.out.println("loi: " + ex);
            ex.printStackTrace();
        }
    }
}
