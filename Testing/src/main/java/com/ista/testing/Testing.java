/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ista.testing;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author camil
 */
public class Testing {

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        
        String carpetas = System.getProperty("user.dir")+"\\Nueva";
        String archivo = "\\Archivo1.jpg";
        File crea_carpeta = new File(carpetas);
        File crea_archivo = new File(carpetas+archivo);
        
        if(crea_archivo.exists()){
            System.out.println("El archivo ya existe");
        }else{
            try {
                System.out.println("No existe, se creará");
                crea_carpeta.mkdirs();
                if (crea_archivo.createNewFile()){
                    System.out.println("Se creo");
                }else{
                    System.out.println("No se creo");
                }
            } catch (IOException ex) {
                Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
