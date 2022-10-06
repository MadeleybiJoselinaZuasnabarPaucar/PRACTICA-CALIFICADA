//PROPUESTO: Un cliente realiza la siguiente compra de artefactos, plancha, licuadora, lavadora y cocina, si la compra supera los 1200, recibe un descuento 
//de 17 %, mostrar el precio de cada artefacto, así como el monto, el descuento y 
//el pago total si le corresponde un descuento
package practicacalificada;

/**
 *
 * @author USER
 */
public class Ejercicio8 {
      
public static void main(String[] args) {
        String[] productos={"plancha","licuadora","lavadora","cocina"};
        double[] precios={85,120,590,700};
        double suma=0,descuento=1;
        for(int i=0;i<precios.length;i++)
            suma+=precios[i];
        if(suma>1200){
            descuento=(17*suma)/100;
            System.out.println("aaaaa");
        }
            
        System.out.println("Productos");
        for(int i=0;i<precios.length;i++)
            System.out.print(productos[i]+" => "+precios[i]+"\n");
        System.out.println("Precio total  => "+suma);
        System.out.println("Descuento de  => "+descuento);
        suma=suma-descuento;
        System.out.println("Monto a pagar => "+suma);
    }
}