/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallapolimorfismo;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
class Falla{
    public void Golpetear(){
        System.out.println("Tin tin");
    }
}
    class Temperatura extends Falla{
        public void Golpetear(){
            System.out.println("Zzzzz...");
        }
    }
    class Presion extends Falla{
        public void Golpetear(){
            System.out.println("Din din");
        }
    }
    class Valvula extends Falla{
        public void Golpetear(){
            System.out.println("Dic dic");
        }
    }
    class FugaAire extends Falla{
        public void Golpetear(){
            System.out.println("ziii...");
        }
    }
public class FallaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Falla falla1=new Temperatura();
        Falla falla2=new Presion();
        Falla falla3=new Valvula();
        Falla falla4=new FugaAire();

        //OutPuts "Zzzz"
        System.out.println("El sensor que Falla es: Sensor de Temperatura");
        falla1.Golpetear();

        //Outputs "Din din"
        System.out.println("El sensor que falla es: Sensor de Presión");
        falla2.Golpetear();

        //Outputs "Dic dic"
        System.out.println("La válvula que falla es: Válvula EGR");
        falla3.Golpetear();

        //Outputs "ZIII"
        System.out.println("La fuga de aire es: En los conductos de refrigeración");
        falla4.Golpetear();
    }

}
