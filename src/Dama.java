import java.util.Scanner;

public class Dama {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int linha1, coluna1, linha2, coluna2;

    while (true) {
      linha1 = sc.nextInt();
      coluna1 = sc.nextInt();
      linha2 = sc.nextInt();
      coluna2 = sc.nextInt();

      if (linha1 == 0 && coluna1 == 0 && linha2 == 0 && coluna2 == 0) break;

      if (linha1 == linha2 && coluna1 == coluna2) {
        System.out.println("0");
      } else if ((linha1 == linha2)
          || (coluna1 == coluna2)
          || mesmaDiagonal(linha1, coluna1, linha2, coluna2)) {
        System.out.println("1");
      } else {
        System.out.println("2");
      }
    }
    sc.close();
  }

  static boolean mesmaDiagonal(int linha1, int coluna1, int linha2, int coluna2) {
    int a = linha1 - linha2;
    int b = coluna1 - coluna2;
    if (a < 0) a *= -1;
    if (b < 0) a *= -1;
    return a == b;
  }
}
