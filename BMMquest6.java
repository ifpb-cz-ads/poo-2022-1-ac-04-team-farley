import java.util.Scanner;
public class BMMquest6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia =1;
        while(dia!=0){
        System.out.printf("Digite um numero de 1 a 7: ");
        dia=scan.nextInt();
        scan.close();
        switch(dia){
             case 1:
                System.out.println("domingo");
                break;
                case 2:
                System.out.println("segunda");
                break;
                case 3:
                System.out.println("terça");
                break;
                case 4:
                System.out.println("quarta");
                break;
                case 5:
                System.out.println("quinta");
                break;
                case 6:
                System.out.println("sexta");
                break;
                case 7:
                System.out.println("sábado");
                break;
                default:
                System.out.println("numero invaldio");
        }
       
    }
    }
}
