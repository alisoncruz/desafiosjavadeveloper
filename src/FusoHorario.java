import java.util.Scanner;

public class FusoHorario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int horasaida = 22;
    int tempoviagem = 6;
    int fuso = -2;

    int resultado = horasaida + tempoviagem + fuso;
    System.out.println(resultado);

    if (resultado > 24) {
      resultado = resultado - 24;

    } else if (resultado < 0) {
      resultado *= -1;
      resultado = 24 - resultado;
    }

    if (resultado == 24) {
      resultado = 0;
    }

    System.out.println(resultado);

    sc.close();
  }
}
