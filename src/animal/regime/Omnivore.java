/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.regime;

import animal.aliments.Aliment;

/**
 *
 * @author diginamic05
 */
public class Omnivore extends Regime {
    
    public Omnivore()
    {
        
    }
    
    public void manger(Aliment a)
    {
        System.out.println("Je mange comme un omnivore");
    }
}
