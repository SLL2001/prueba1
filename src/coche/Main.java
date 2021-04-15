
package coche;

/**
 *
 * @author Santiago
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = Venta();
        
        Compra(miCoche);
        stockActual = miCoche.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void Compra(Coche miCoche) {
        try
        {
            System.out.println("Compra de Coches");
            miCoche.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    public static Coche Venta() {
        Coche miCoche;
        miCoche = new Coche("Opel",12000,500);
        try
        {
            System.out.println("Venta de Coches");
            miCoche.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        return miCoche;
    }

}
    
