import java.util.Scanner;

public class Triangulos {
static Scanner leia = new Scanner(System.in) ;
   
public static void main(String[] args) {

System.out.println("Digite o primeiro lado: ");
int lado1 = leia.nextInt() ;

System.out.println("Digite o segundo lado: ");
int lado2 = leia.nextInt();

System.out.println("Digite o terceiro lado: ");
int lado3 = leia.nextInt();

if(lado1 == 0 || lado2 == 0 || lado3 == 0){
 System.out.println("Não é um triangulo"); 
}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ){ 
 System.out.println("É um triangulo Escaleno"); 
}else if (lado1 == lado2 && lado1 == lado3 ){
 System.out.println("É um tringulo Equilatero");   
} else {
 System.out.println("É um triangulo Isósceles");
}
}
}



