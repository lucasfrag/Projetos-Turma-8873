/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.factory;


public class FabricaHeroi implements FabricaPersonagem {
    @Override
    public Personagem criarPersonagem() {
        return new Heroi();
    }
}
