import java.util.Scanner;

public class Lab2P1_PaolaMontoya {

    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
       int menu=1;
       
       while(menu!=4){
           
           System.out.println("~~~~Menu~~~~");
           System.out.println("1) Numero Perfecto");
           System.out.println("2) Sumatoria");
           System.out.println("3) Serie");
           System.out.println("4) Cerrar Menu");
           menu=leer.nextInt();
           
           if (menu<1 || menu>4){
               System.out.println("Esa opcion no es valida");
           }
           
           switch (menu){
               case 1:
                   //variables
                   int N=1, d, cont=1;
                   
                   //entrada
                   System.out.println("Ingrese un numero entero:");
                   N= leer.nextInt();
                   
                   //estuve intentando y no me salio bien. lo siento :,
                   while (cont<=N){
                       if(N%cont==0){
                           System.out.print(cont+" ");
                       }
                       
                       cont++;
                   }
                   
                   
                   break;
                   
               case 2: //Sumatoria
                   //variable
                   int K = 0, n=1;
                   float output=0, O1, F1, F2;
                   
                   //entrada
                   System.out.println("Ingrese un numero entero: ");
                   K= leer.nextInt();
                   
                  //Separe el numerador (F1) y el denominador (F2) para que la ecuacion no fuera muy confusa
   
                   //ecuacion
                   while (n<=K){
                   F1=(2*n)-1;
                   F2=n*(n+1);   
                   O1 = F1/F2;
                   output=output+O1;
                       //para que se repita hasta llegar al limite
                       n++;
                   }
  
                   //salida
                   System.out.println(output);
                   
                   break;

                   
               case 3:
                   //variables. i como contador
                   int Nu, X=0, i=0, ng=-1;
                   
                   //entradas
                   System.out.println("Ingrese un numero entero: ");
                   Nu=leer.nextInt();
                   System.out.println("Ingrese otro numero entero: ");
                   X= leer.nextInt();
                   
                   
                  while (i<X){
                      i++;
                      
                      //salido con formula
                      System.out.print(i*Nu*ng+" ");
   
                      //para que cambie de negativo a positivo y vise versa
                      ng=ng*-1;
                      
                      
                  }
                  break;
                   
               
           }
        
           
           
           
           
           
       } 
    }
}
