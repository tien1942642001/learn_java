import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap 1: ");
        String sourceStr = scan.nextLine();
        System.out.print("nhap 2: ");
        String searchStr = scan.nextLine();
        int n = searchStr.length();
        int count = 0;
        for (int i = 0; i <= sourceStr.length() - n; i++) {
            String x = sourceStr.substring(i, i+n);
            if (x.equals(searchStr)) {
                count++;
            }
        }
        System.out.println("so lan: " + count);
    }
}