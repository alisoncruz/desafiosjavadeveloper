import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    for (int i = 0; i < N; i++) {
      StringBuilder sb = new StringBuilder();
      int numero = leitor.nextInt();
      if (numero == 0) {
        sb.append("NULL");
      } else {

        if (numero % 2 == 0) {
          sb.append("EVEN");
        } else {
          sb.append("ODD");
        }

        sb.append(" ");

        if (numero > 0) {
          sb.append("POSITIVE");
        } else {
          sb.append("NEGATIVE");
        }
      }
      System.out.println(sb.toString());
    }
  }
}
