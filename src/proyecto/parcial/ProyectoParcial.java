/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.parcial;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class ProyectoParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        int opEntrada;
        Scanner kb = new Scanner (System.in);
        double l,g,cm, pul,m,pie,km,mi,ce,f,gra,li; // l=litros g=galones cm=centímetros
        //pul= pulgadas m=metros pie=pie km= kilometros mi=millas ce= Celsius f= fahrenheit
        //gra=gramos li=libra 
        
        //Desplegar primer menú
        System.out.println("Conversor de medidas");
        System.out.println("Elige una ");
        System.out.println("1. Conversión de líquidos");
        System.out.println("2. Conversión de distancias");
        System.out.println("3. Conversión de temperaturas");
        System.out.println("4. Conversión de pesos");
        System.out.println("5. Salir");
        opEntrada = kb.nextInt(); 
        
        switch (opEntrada){
            case 1:
                    System.out.println("Conversor de líquidos");
                    System.out.println("¿Qué desea convertir?");
                    System.out.println("1. Litros a Galones");
                    System.out.println("2. Galones a Litros");
                    opEntrada= kb.nextInt();
                    
                    switch(opEntrada){
                        case 1:
                            System.out.println("Introduce los litros que deseas convertir");
                            l= kb.nextDouble();
                            g= (0.2641720512415584)*l;
                            System.out.println("Tus litros son"+g+"galones");
                            break;  
                        case 2:
                            System.out.println("Introduce los galones que deseas convertir");
                            g= kb.nextDouble();
                            l=  3.7854118*g;
                            System.out.println("Tus galones son"+l+"litros");
                            break;
                            
                            
                           
                            
                        
                    }
                    break;
                    
            case 2:
                System.out.print("Conversor de distancias");
                System.out.print("¿Qué deseas convertir");
                System.out.print("1. Centímetros a Pulgadas");
                System.out.print("2. Pulgadas a centimetros");
                System.out.print("3. Metros a pies");
                System.out.print("4. Pies a Metros");
                System.out.print("5. Kilometros a Millas");
                System.out.print("6. Millas a Kilometros");
                opEntrada= kb.nextInt();
                
                switch (opEntrada){
                    case 1:
                        System.out.print("Introduce los centímetros que deseas convertir");
                        cm= kb.nextDouble();
                        pul= cm/2.54;
                        System.out.print("Tus centímetros son"+pul+"pulgadas");
                        break;
                    case 2:
                        System.out.println("Introduce las pulgadas que deseas convertir");
                        pul= kb.nextDouble();
                        cm= pul*2.54;
                        System.out.print("Tus pulgadas son"+cm+"centímetros");
                        break;
                    case 3:
                        System.out.print("Introduce los metros que deseas convertir");
                        m= kb.nextDouble();
                        pie= m*3.28084; 
                        System.out.println("Tus metros son"+pie+"pies");
                        break;
                    case 4:
                        System.out.println("Introduce los pies que deseas convertir");
                        pie= kb.nextDouble();
                        m= pie/3.28084;
                        System.out.println("Tus pies son"+m+"metros");
                        break;
                    case 5:
                        System.out.println("Introduce los Kilometros que deseas convertir");
                        km= kb.nextDouble();
                        mi= km*0.621371;
                        System.out.println("Tus kilomeros son"+mi+"millas");
                        break;
                    case 6:
                        System.out.print("Introduce las millas que deseas convertir");
                        mi=kb.nextDouble();
                        km=mi/0.621371;
                        System.out.println("Tus millas son"+km+"kilometros");
                        break;
                        
                        
                                
                }
               break;
            case 3: 
                System.out.println("Conversor de temperaturas");
                System.out.println("¿Qué deseas convertir?");
                System.out.println("1.Celsius a Fahrenheit");
                System.out.println("2. Fahrenheit a Celsius");
                opEntrada= kb.nextInt();
                
                switch (opEntrada){
                    case 1: 
                        System.out.println("Introduce los grados Celsius que deseas convertir");
                        ce= kb.nextDouble();
                        f= ce*1.8+32;
                        System.out.println("Tus grados Celsius son"+f+"Fahrenheit");
                        break;
                    case 2:
                        System.out.println("Introduce los grados Fahrenheit que deseas convertir");
                        f= kb.nextDouble();
                        ce= (f-32)/1.8;
                        System.out.println("Tus grados Fahrenheit son"+ce+"Celsius");
                        break;
                        
                                
                        
                        
                }
                break;
                
            case 4:
                System.out.println("Conversor de pesos");
                System.out.println("¿Qué deseas convertir?");
                System.out.println("1. Gramos a Libras");
                System.out.println("2. Libras a Gramos");
                opEntrada= kb.nextInt();
                
                switch (opEntrada){
                    case 1:
                        System.out.println("Introduce los Gramos que deseas convertir");
                        gra= kb.nextDouble(); 
                        li= gra*0.00220462;
                        System.out.println("Tus Gramos son"+li+"libras");
                        break;
                    case 2:
                        System.out.println("Introduce las Libras que deseas convertir");
                        li= kb.nextDouble();
                        gra= li/0.00220462;
                        System.out.println("Tus Libras son"+gra+"Gramos");
   
                        break;
                }
                break;
            default: 
                System.out.println("¡Vuelve pronto!"); 
                    
        }
        
                
        
        
               
                
    }
    
}
