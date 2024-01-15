import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {
        //int arr[]={0, 1, 1, 2, 3, 5, 8, 13};
int n;
        Scanner scanner = new Scanner(System.in);
      do{
                System.out.println("podaj n (większe od zera)");
            n = scanner.nextInt();
      }while (n < 1);
      
            int c = 0;
            if (n == 1 || n == 2) {
              c = 1;
            } else {
                int a = 1, b = 1, temp;
                for (int i = 3; i <= n; i++) {
                    temp = a + b;
                    a = b;
                    b = temp;
                }
                c = b;}
    
        
        System.out.println(c);

    }
}