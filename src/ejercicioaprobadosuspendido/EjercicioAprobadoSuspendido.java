package ejercicioaprobadosuspendido;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author JUAN
 */
public class EjercicioAprobadoSuspendido {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Escribe una nota");
        int nota = Integer.parseInt(br.readLine());
        
        if( nota >=0 && nota <=10 ){ // aqui contemplamos solo entre el 0 y el 10
            
            // Nota correcta
            switch(nota){
                case 5:
                    System.out.println("Aprobado");
                    break;
                case 6:
                    System.out.println("Suficiente");
                    break;
                case 7:
                    System.out.println("Bien");
                    break;
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                    System.out.println("Sobresaliente");
                    break;
                case 10:
                    System.out.println("Matrícula de Honor");
                    break;
                default: // pondremos default para los casos no contemplados que son los suspensos
                    System.out.println("Suspendido");
                    break;
            }
        }
        else // contemplamos cuando no se introduce un valor entre 0 y 10
            System.out.println("ERROR, el valor introducido es incorrecto");
    }
    
}
