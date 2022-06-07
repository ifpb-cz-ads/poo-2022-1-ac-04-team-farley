import java.util.Scanner;
public class BMMquest7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor=scan.nextInt();
        scan.close();
        int y;
        while(valor!=1){
            if((valor%2) == 1){
                y=3*valor+1;
                valor = y;
                System.out.println("valor: "+ y);
    
            }else{
                y=valor/2;
                valor = y;
                System.out.println("valor: "+ y);
            }
        }
    
    }
}
