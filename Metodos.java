import java.util.Stack;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Stack<ObjPc> LLenarPila1() {
        Stack<ObjPc> pila1 = new Stack<>();
        Boolean bandera = true;
        int opt = 0;
        System.out.println("registrar PC");

        while (bandera) {
            ObjPc pc = new ObjPc();
            System.out.println("ingrese el serial:");
            pc.setSerial(sc.nextInt());
            System.out.println("ingrese la marca:");
            pc.setMarca(sc.next());
            System.out.println("Memoria RAM:");
            pc.setMemoriaRam(sc.nextInt());
            System.out.println("Disco Duro:");
            pc.setDiscoDuro(sc.nextInt());
            System.out.println("ingrese Precio:");
            pc.setPrecio(sc.nextInt());
            System.out.println("ingrese el nombre de usuario:");
            pc.setNomUsuario(sc.next());
            pc.setDisponible(false);
            pila1.push(pc);
            System.out.println("Desea agregar mas registros de PC 1: SI, 2: NO ");
            while (!sc.hasNextInt()) {
                System.out.println("esto no es comfama dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("esa opcion no existe por favor valide nuevo ");
                opt = sc.nextInt();
            }
            if (opt == 1) {
                System.out.println("desea registrar: 1: PC, 2: Tablet");
                // ositivo = sc.nextInt();
            } else if (opt == 2) {
                bandera = false;
            }
        }
        return pila1;
    }

    public void MostrarPila1(Stack<ObjPc> pila1) {
        for (ObjPc pc : pila1) {
            System.out.println(pc.getSerial());
            System.out.println(pc.getMarca());
            System.out.println(pc.getMemoriaRam());
            System.out.println(pc.getDiscoDuro());
            System.out.println(pc.getPrecio());
            System.out.println(pc.getNomUsuario());
            if (pc.getDisponible()) {
                System.out.println("Disponible");
            } else {
                System.out.println("No disponible");
                System.out.println("lo tiene" + pc.getNomUsuario());
            }
        }
    }

    public Stack<ObjTablet> LLenarPila2() {
        Stack<ObjTablet> pila2 = new Stack<>();
        Boolean bandera = true;
        int opt = 0;

        System.out.println("registrar Tablet");

        while (bandera) {
            ObjTablet tb = new ObjTablet();
            System.out.println("ingrese el serial:");
            tb.setSerial(sc.nextInt());
            System.out.println("ingrese la marca:");
            tb.setMarca(sc.next());
            System.out.println("ingrese Precio:");
            tb.setPrecio(sc.nextInt());
            System.out.println("ingrese el nombre de usuario:");
            tb.setNomUsuario(sc.next());
            tb.setDisponible(true);
            pila2.push(tb);
            System.out.println("Desea agregar mas registros de tablet 1: SI, 2: NO ");
            while (!sc.hasNextInt()) {
                System.out.println("esto no es comfama dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("esa opcion no existe por favor valide nuevo ");
                opt = sc.nextInt();
            }
            if (opt == 1) {
                System.out.println("desea registrar: 1: PC, 2: Tablet");
                int dispositivo;
            } else if (opt == 2) {
                bandera = false;
            }
        }
        return pila2;
    }

    public void MostrarPila2(Stack<ObjTablet> pila2) {
        for (ObjTablet tb : pila2) {
            System.out.println(tb.getSerial());
            System.out.println(tb.getTamaño());
            System.out.println(tb.getMarca());
            System.out.println(tb.getPrecio());
            System.out.println(tb.getNomUsuario());
            if (tb.getDisponible()) {
                System.out.println("Disponible");
            } else {
                System.out.println("No disponible");
            }
        }
    }

    public void ModificarRegistro(Stack<ObjPc> pila1) {
        int serial = 0;
        System.out.println("ingrese el serial del dispositivo que desea modificar");
        serial = sc.nextInt();
        for (ObjPc pc : pila1) {
            if (ObjPc.getSerial() == serial) {

                System.out.println("ingrese el precio");
                vehiculo.setPrecio(sc.nextInt());
                System.out.println("ingrese el color");
                vehiculo.setColor(sc.next());
                vehiculo.setMarca(marca);

            }
        }
        MostrarPila(pila);
    }

}
