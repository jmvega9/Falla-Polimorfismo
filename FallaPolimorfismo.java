/*
 * Diseñe e implemente un algoritmo que contenga una Super clase llamada
Falla?Vehiculo y cuatro subclases llamadas: Sensor_Temperatura, Sensor_Presion,
Valvula, FugaAire que contengan la función EmitirGolpeteo e imprima la pieza que
tiene falla junto con el tipo de golpeteo que realiza
 */
package fallapolimorfismo;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
class Falla_Vehiculo{
    public void EmitirGolpeteo(){
        System.out.println("Tin tin");
    }
}
    class Sensor_Temperatura extends Falla_Vehiculo{
        public void EmitirGolpeteo(){
            System.out.println("Zzzzz...");
        }
    }
    class Sensor_Presion extends Falla_Vehiculo{
        public void EmitirGolpeteo(){
            System.out.println("Din din");
        }
    }
    class Valvula extends Falla_Vehiculo{
        public void EmitirGolpeteo(){
            System.out.println("Dic dic");
        }
    }
    class FugaAire extends Falla_Vehiculo{
        public void EmitirGolpeteo(){
            System.out.println("ziii...");
        }
    }
public class FallaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Caratula
       System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
       System.out.println("               Ingeniería  Automotriz ");
       System.out.println("           Vega Masapanta Jessica Maribel");
       System.out.println("         Programación Orientada  a Objetos ");
       System.out.println("                        7450 ");
       System.out.println("              Ing. Luis Alberto Guerra \n");
       System.out.println("           \t Polimorfismo \n");

        Falla_Vehiculo falla1=new Sensor_Temperatura();
        Falla_Vehiculo falla2=new Sensor_Presion();
        Falla_Vehiculo falla3=new Valvula();
        Falla_Vehiculo falla4=new FugaAire();

        //OutPuts "Zzzz"
        System.out.println("El sensor que Falla es: Sensor de Temperatura");
        falla1.EmitirGolpeteo();

        //Outputs "Din din"
        System.out.println("El sensor que falla es: Sensor de Presión");
        falla2.EmitirGolpeteo();

        //Outputs "Dic dic"
        System.out.println("La válvula que falla es: Válvula EGR");
        falla3.EmitirGolpeteo();

        //Outputs "ZIII"
        System.out.println("La fuga de aire es: En los conductos de refrigeración");
        falla4.EmitirGolpeteo();
    }

}
