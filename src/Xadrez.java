import java.util.Scanner;

public class Xadrez {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int c = sc.nextInt();
    if (((l * c) % 2) == 0) {
      System.out.println("0");
    } else {
      System.out.println("1");
    }

    sc.close();
  }
}
