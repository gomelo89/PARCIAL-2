import java.util.Scanner;
import java.util.Stack;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        Stack<ObjComputador> c = new Stack<>();
        Stack<ObjTablet> t = new Stack<>();
        while (bandera) {
            System.out.println("Binevenidos Al departamento de sistemas");
            System.out.println("Seleccione la Opcion que desea:");
            System.out.println("1 : prestar Computador");
            System.out.println("2 : Prestar Tablet");
            System.out.println("3 : Salir");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese por favor un valoir numericó");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 3) {
                System.out.println("Por favor ingrese una opcion del 1 al 3");
                continue;
            }
            switch (opt) {
                case 1:
                    MenuComputador mc = new MenuComputador();
                    c = mc.Computador(c, sc);
                    break;
                case 2:
                    MenuTablet mt = new MenuTablet();
                    t = mt.Tablet(t, sc);
                    break;

                default:
                    System.out.println("Hasta Pronto");
                    bandera = false;
                    break;

            }

        }
    }

}