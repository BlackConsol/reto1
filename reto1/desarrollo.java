import java.util.Scanner;

public class desarrollo {
    

    public static String cuenta = "sin cuenta";
    public static int selector;
    public static boolean loop = true;
    public static boolean verificacioncuenta = false;


    public static void ejercicio(){
        System.out.println("Una persona reto a un estudiante de ingeniería de sistemas para crear un programa con metodos, \n dónde el programa debe tener para crear una cuenta, poder mirar un menú, \n un portal de trabajo y si tiene una cuenta pueda entrar al portal de trabajo.");
        System.out.println('\n');
    }    


    public static void nueva_cuenta(Scanner creacion){
        if (!verificacioncuenta) {
            System.out.println("Accion exitosa, porfavor ingresa los datos solicitados");
            System.out.println("nombre del titular de la cuenta");
            cuenta = creacion.nextLine();
            verificacioncuenta = true;
            System.out.println("cuenta creada exitosamente");
            selector_menu(creacion); 
        } else {
            System.out.println("Ya tienes una cuenta activa. No puedes crear otra cuenta.");
            System.out.println("Tu cuenta actual es: " + cuenta);
        }
    }


    public static void cuenta_actual(String cuenta){
        System.out.println("======       CUENTA ACTUAL       ======");
        System.out.println("Tu cuenta actual es:  " + " > " + cuenta);
        System.out.println('\n');


    }


    public static void b_cuenta(Scanner account, int validar){
        loop = true;
        System.out.println("**********************************");
        System.out.println("*     BIENVENIDO AL SISTEMA      *");
        System.out.println("*      REGISTROS DE CUENTA       *");
        System.out.println("**********************************");
            
            System.out.println("deseas crear una cuenta? ");
            System.out.println("Ingrese 1 para SÍ o 0 para NO: ");
            validar = account.nextInt();
            account.nextLine();

            if (validar == 1) {
                nueva_cuenta(account);
                verificacioncuenta = false;
                
            } else if (validar == 0) {
                bienvenida();
                
            }
    }


    public static void portalvalidation(Scanner portal, boolean verificacioncuenta){
        if (!verificacioncuenta) {
            verificarCuenta(verificacioncuenta);
            loop = true;
        } else {
            portaltrabajo(portal);
        }
    }

    public static void portaltrabajo(Scanner portaltrabajo){
        System.out.println("\n====== PORTAL DE TRABAJO ======");
        System.out.println("Bienvenido " + cuenta + " al portal de trabajo");
        System.out.println("\nOfertas de trabajo disponibles:");
        System.out.println("1. Desarrollador Java - $3000");
        System.out.println("2. Desarrollador Python - $2800");
        System.out.println("3. Desarrollador Web - $2500");
        System.out.println("\nSelecciona una oferta (1-3) o 0 para salir: ");
        
        int opcion = portaltrabajo.nextInt();
        if (opcion >= 1 && opcion <= 3) {
            System.out.println("\nHas aplicado exitosamente a la oferta seleccionada!");
            System.out.println("Te contactaremos pronto.");
        } else if (opcion == 0) {
            System.out.println("\nVolviendo al menú principal...");
            loop = true;
        } else {
            System.out.println("\nOpción no válida");
            loop = true;
        }
    }


    public static void verificarCuenta(boolean verificarCuenta){
        if (!verificarCuenta) {
            System.out.println("======++++++NOTIFICACION++++++======");
            System.out.println("Debes crear una cuenta para poder trabajar \ny/o buscar trabajo en el portal");
            System.out.println("Por favor, crea una cuenta primero.");
            loop = true;
        }
    }
    

    public static void selector_menu(Scanner sys){

        while (loop) {

        System.out.println("=> " + " 1. Crear cuenta");
        System.out.println("=> " + " 2. Ver cuenta");
        System.out.println("=> " + " 3. Trabajos => portal de trabajos");

        System.out.println("selecciona una opcion relevante para ti");

        selector = sys.nextInt();
        sys.nextLine();
        funcion_menu(sys);

    }

            





    }

    public static void funcion_menu(Scanner menu){

        if (selector == 1) {
            b_cuenta(menu, selector);
            loop = true;
        } else if (selector == 2) {
            cuenta_actual(cuenta);
            loop = true;
        } else if (selector == 3) {
            portalvalidation(menu, verificacioncuenta);
        }
    }





    public static void menu(Scanner menu){
        b_menu();
        selector_menu(menu);



      
    }




    public static void bienvenida(){
        System.out.println("(+) " + " ******** BIENVENIDO AL PROGRAMA ********");
        System.out.println("ejercicio principal que se resolvio dentro del programa");
        System.out.println('\n');

    }    

    public static void b_menu(){
        System.out.println("======== BIENVENIDO AL MENU PRINCIPAL DEL PROGRAMA ========");
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner main = new Scanner(System.in);


        bienvenida();
        ejercicio();
        menu(main);;



    }






}
