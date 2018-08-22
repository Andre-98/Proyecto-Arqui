/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

import java.io.BufferedReader;
import java.io.FileReader;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import javax.swing.JOptionPane;

/**
 *
 * @author JoelSVM
 */
public class Datos {
    public Datos(){
    
    }
    
    String encriptado="";
    String libro="";
    String direccion="";
    double difE;
    double difD;

    
    
    public void leerTxt(String direccion){ 
        direccion=Ventana.TextIngresar.getText();

        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
               
                temp = temp + bfRead; 
            }
            JOptionPane.showMessageDialog(null, "El TXT se cargo correctamente", "CORRECTO", JOptionPane.WARNING_MESSAGE);
            libro = temp;
            
        }catch(Exception e){ 
            JOptionPane.showMessageDialog(null, "No se Encontro el Archivo TXT", "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    
    }
    
    
    
    public String  Encriptar(){
        long inicio = System.nanoTime();

        char array[]=libro.toCharArray();
        
        for(int i=0; i<array.length;i++){
            
            array[i]=(char)(array[i]+(char)5);

        }
        encriptado=String.valueOf(array);
        long fin = System.nanoTime();
        difE = (double)(fin - inicio);
        NANOSECONDS.toSeconds((long) difE);

        

    return encriptado;
    
    }
    
    public String  Desencriptar(){
        long inicio = System.nanoTime();
        
        char arrayD[]=encriptado.toCharArray();
        
        for(int i=0; i<arrayD.length;i++){
            
            arrayD[i]=(char)(arrayD[i]-(char)5);

        }
       String desencriptar=String.valueOf(arrayD);
       long fin = System.nanoTime();
       difD= (double)(fin - inicio);
       NANOSECONDS.toSeconds((long) difD);
       
       

    return desencriptar;
    
    }
    
}
