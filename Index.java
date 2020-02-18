import java.util.Scanner;

public class Index{
    public static void main(String args[]){
        Operaciones operar = new Operaciones();
        Extensiones ext = new Extensiones();
        Scanner sc = new Scanner(System.in);

        int uno;
        int dos;
        int menu;
        
        ext.borrar();

        System.out.println("**********************************");
        System.out.println("*           Numero Uno           *");
        System.out.println("**********************************");
        uno = sc.nextInt();
        ext.borrar();
        
        System.out.println("**********************************");
        System.out.println("*           Numero Dos           *");
        System.out.println("**********************************");
        dos = sc.nextInt();
        ext.borrar();

        System.out.println("**********************************");
        System.out.println("* Menu: Escribe el numero        *");
        System.out.println("* conforme a su Opcion           *");
        System.out.println("**********************************");
        System.out.println("* 1) Suma                        *");
        System.out.println("* 2) Resta                       *");
        System.out.println("* 3) Multiplicacion              *");
        System.out.println("* 4) Division                    *");
        System.out.println("* 5) Todos                       *");
        System.out.println("**********************************");
        menu = sc.nextInt();
        ext.borrar();

        System.out.println("*****************************************************************************");
        System.out.println("* 1: " + uno + " & 2: " + dos);
        System.out.println("*");
        if(menu == 1){
            System.out.println("* El resultado es: " + operar.suma(uno, dos));
        }else if(menu == 2){
            System.out.println("* El resultado es: " + operar.resta(uno, dos));
        }else if(menu == 3){
            System.out.println("* El resultado es: " + operar.multiplicacion(uno, dos));
        }else if(menu == 4){
            System.out.println("* El resultado es: " + operar.division(uno, dos));
        }else if(menu == 5){
            operar.todo(uno, dos);
        }else{
            System.out.println("* Escribe un numero del menu no externo a los que aparecen >:v");
        }
        System.out.println("*");
        System.out.println("*****************************************************************************");

    }
}