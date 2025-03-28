
import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        int opt2 = 0;
        int dispositivo = 0;

        System.out.println("desea registrar: 1: PC, 2: Tablet");
        while (!sc.hasNextInt()) {
            System.out.println("esto no es comfama dato numerico");
            sc.next();
        }
        dispositivo = sc.nextInt();
        while (dispositivo < 1 || dispositivo > 2) {
            System.out.println("esa opcion no existe por favor valide nuevo ");
            while (!sc.hasNextInt()) {
                System.out.println("esto no es comfama dato numerico");
                sc.next();
            }
            dispositivo = sc.nextInt();
        }

        switch (dispositivo) {
            case 1:
                Stack<ObjPc> pila1 = m.LLenarPila1();
                m.MostrarPila1(pila1);
                break;
            case 2:
                Stack<ObjTablet> pila2 = m.LLenarPila2();
                m.MostrarPila2(pila2);
                break;
            default:
                System.out.println("Pagina en mantenimiento");
                break;
        }

        int opt = 0;

        while (continuar) {
            System.out.println("ingrese 1 si desea devolver, 2 si desea modificar");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                case 2:

                    break;
                case 3:
                    m.ModificarRegistro(pila1);
                    break;
                default:
                    System.out.println("pagina en mantenimiento ");
                    break;
            }

            System.out.println("desea continuar con otra accion 1: si ,2: no");
            opt2 = sc.nextInt();
            if (opt2 == 2) {
                continuar = false;
            }
        }

    }
}
