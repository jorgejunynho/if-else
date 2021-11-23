import java.util.Scanner;

public class Bissexto {
    int ano;
    static Scanner leia = new Scanner(System.in);
    
    public static void main(String[] args) {

    System.out.println("Digite o ano: ");
    int ano = leia.nextInt();

    if(ano % 4 == 0 && ano % 100 != 0 ){
       System.out.println("O ano é BIXESSTO! ");    
    }else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
       System.out.println("O ano é BIXESSTO! ");  
    }else{
       System.out.print("O ano NÃO é bissexto. ");
    }
}
}