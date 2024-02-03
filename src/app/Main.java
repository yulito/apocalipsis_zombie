/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author yulia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
        
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        Dialogos d = new Dialogos(); 
        Main obj = new Main();
        //reproducir audio
        //deja en sonido/audio.wav al importar a .jar
        obj.ReproducirSonido("sonido/audio.wav");
        
        while(true){            
            System.out.println("********************");
            System.out.println("Apocalipsis Zombie");
            System.out.println("********************");
            System.out.println("");
            System.out.println("Selecciona: (a)Entrar (b)Salir");
            System.out.print(">");
            opcion = sc.nextLine().toLowerCase().trim();
            if(opcion.equals("a")){                  
                d.inicio();
            }else if(opcion.equals("b")){                
                break;
            }else{
                System.out.println("Dato erroneo. Vuelve a intentar");
            }
        }
        System.out.println("Has cerrado el juego...");
    }
    
    //----funcion para audio
    public void ReproducirSonido(String nombreSonido) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException{         
       try{
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File
        (nombreSonido).getAbsoluteFile());
        
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();                
       } 
       catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido.\n"+ex);
       }
       
     }
}
