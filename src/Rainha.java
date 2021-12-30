import java.util.Scanner;

public class Rainha {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numeroCasosTeste = sc.nextInt();
    for (int i = 0; i < numeroCasosTeste; i++) {
      double numeroCasas = sc.nextInt();
      double quantidadeGraos = Math.pow(2, numeroCasas) - 1;
      double totalGramas = quantidadeGraos / 12;
      long kgs = (long) totalGramas / 1000;
      System.out.println(kgs + " kg");
    }
    sc.close();
  }
}
