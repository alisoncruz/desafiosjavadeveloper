import java.util.Locale;
import java.util.Scanner;

public class MacPronalts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int quantidade=0;
        int numeroProduto=0;
        double resultado=0;
        double valor=0;
        int quantidadeGeralProdutos = Integer.parseInt(sc.nextLine());

        for (int x=0 ; x<quantidadeGeralProdutos ; x++){
            numeroProduto = sc.nextInt();
            quantidade  = sc.nextInt();

            if (numeroProduto == 1001){
                valor = 1.50;
            }
            else if (numeroProduto == 1002){
                valor = 2.50;
            }
            else if (numeroProduto == 1003){
                valor = 3.50;
            }
            else if (numeroProduto == 1004){
                valor = 4.50;
            }
            else if (numeroProduto == 1005){
                valor = 5.50;
            }
            resultado += valor * quantidade;
        }
        System.out.printf("%.2f\n",resultado);
        sc.close();
    }
}
