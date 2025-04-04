import java.util.Scanner;
import java.util.Stack;

public class MetodosGenerales {
    Scanner sc = new Scanner(System.in);

    public Stack<ObjComputador> IngresarComputador(Stack<ObjComputador> c) {
        ObjComputador o = new ObjComputador();
        System.out.println("Por favor ingrese el serial");
        o.setSerial(sc.next());
        System.out.println("Ingrese la marca");
        o.setMarca(sc.next());
        System.out.println("Ingrese La memoria Ram");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setMemoriaRam(sc.nextInt());
        System.out.println("Ingrese la capacidad del disco duro");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setDiscoDuro(sc.nextInt());
        System.out.println("Ingrese el precio del computador");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setPrecio(sc.nextDouble());
        o.setDisponible(true);
        o.setCantidad(1);
        System.out.println("modificado con exito");
        c.push(o);
        return c;
    }

    public Stack<ObjComputador> PrestarComputador(Stack<ObjComputador> c) {
        while (c.empty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial del computador a prestar");
        serial = sc.next();
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                o.setDisponible(false);
                System.out.println("equipo prestado con exito");
            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }

    public Stack<ObjComputador> ModificarComputador(Stack<ObjComputador> c) {
        while (c.empty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial del computador a Modificar");
        serial = sc.next();
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                System.out.println("modificado con exito");

            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }

    public Stack<ObjComputador> DevolverComputador(Stack<ObjComputador> c) {
        while (c.empty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial del computador a Modificar");
        serial = sc.next();
        for (ObjComputador o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {

                o.setNombreUsuario(null);
                o.setDisponible(true);
                System.out.println("devuelto con exito");

            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }
    public Stack<ObjTablet> IngresarTablet(Stack<ObjTablet> c) {
        ObjTablet o = new ObjTablet();
        System.out.println("Por favor ingrese el serial");
        o.setSerial(sc.next());
        System.out.println("Ingrese la marca");
        o.setMarca(sc.next());
        System.out.println("Ingrese el tamaño");
        o.setTamaño(sc.nextInt());
        System.out.println("Ingrese el precio de la tablet");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese dato numericó");
            sc.next();
        }
        o.setPrecio(sc.nextDouble());
        o.setDisponible(true);
        c.push(o);
        System.out.println("ingresado con exito");
        return c;
    }

    public Stack<ObjTablet> PrestarTablet(Stack<ObjTablet> c) {
        while (c.empty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial de la tablet a prestar");
        serial = sc.next();
        for (ObjTablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                o.setDisponible(false);
                System.out.println("Equipo pretado con exito");
            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }

    public Stack<ObjTablet> ModificarTablet(Stack<ObjTablet> c) {
        while (c.empty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial de la tablet a Modificar");
        serial = sc.next();
        for (ObjTablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {
                System.out.println("Ingrese el nombre del usuario");
                o.setNombreUsuario(sc.next());
                System.out.println("modificado con exito");

            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }

    public Stack<ObjTablet> DevolverTablet(Stack<ObjTablet> c) {
        while (c.empty()) {
            System.out.println("NO hay datos por favor valide");
            break;
        }
        String serial = "";
        System.out.println("Ingrese el serial de la tablet a Modificar");
        serial = sc.next();
        for (ObjTablet o : c) {
            if (o.getSerial().equalsIgnoreCase(serial)) {

                o.setNombreUsuario(null);
                o.setDisponible(true);
                System.out.println("devuelto con exito");

            } else {
                System.out.println("el serial no se encuentra por favor valide ");
                break;
            }
        }
        return c;
    }
}