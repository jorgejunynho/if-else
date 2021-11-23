import java.util.Scanner;

public class Gasolina {
        static Scanner leia = new Scanner(System.in);
        public static void main(String[] args) { 
    
        System.out.println("Qual o tipo de combustível? \n A - álcool / G - gasolina");
        String combus = leia.nextLine();
        System.out.println("Qual a quantia?");
        int litro = leia.nextInt();

        if(combus == "A" && litro < 20){
           System.out.println("Total a pagar: " + (litro * 3.30) / 0.03 );
        }else  if(combus == "A" && litro > 20){
           System.out.println("Total a pagar: " + (litro * 3.50)  / 0.05);
        }else  if(combus == "G" && litro < 20){ 
           System.out.println("Total a pagar: " + (litro * 3.50) / 0.04);
        }else{
           System.out.println("Total a pagar: " + (litro * 3.50) / 0.06);
}
}
}

 
