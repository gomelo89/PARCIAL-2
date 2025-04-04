import java.util.Scanner;
import java.util.Stack;

public class MenuTablet {
    public Stack<ObjTablet> Tablet(Stack<ObjTablet> p, Scanner sc) {
        boolean bandera = true;
        MetodosGenerales m = new MetodosGenerales();
        int opt = 0;
        while (bandera) {
            System.out.println("1: Ingresar tablet");
            System.out.println("2: Prestar tablet");
            System.out.println("3: Modificar tablet");
            System.out.println("4: Devolver tablet");
            System.out.println("5: Volver al menú Principal");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor ingrese un dato numerico");
                sc.next();

            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt < 1 || opt > 5) {
                System.out.println("Por favor Ingrese un valor de 1 a 5 muchas Gracias");
                continue;
            }
            switch (opt) {
                case 1:
                p = m.IngresarTablet(p);
                System.out.println("registro con exito");
                break;
            case 2:
                p = m.PrestarTablet(p);
                break;
            case 3:
                p = m.ModificarTablet(p);
                break;
            case 4:
                p = m.DevolverTablet(p);
                break;
            case 5:
                System.out.println("chao");
                bandera = false;
                break;

            default:
                break;
            }
        }
        return p;
    }
}