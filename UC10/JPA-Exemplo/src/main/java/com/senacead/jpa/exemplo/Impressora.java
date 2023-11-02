/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senacead.jpa.exemplo;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author tiluc
 */
public class Impressora {
     public static void imprimir(String arquivo) {

        Desktop desktop = Desktop.getDesktop();

        try {
            File arquivoAImprimir = new File(arquivo);
            desktop.print(arquivoAImprimir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
