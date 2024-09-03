import java.util.Scanner;

public class bee1070 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int valorX = sc.nextInt();
        int cont = 0;

        while(cont < 6){
            if (valorX % 2 == 1){
                System.out.println(valorX);
                cont ++;
            }
        }
    }
}
