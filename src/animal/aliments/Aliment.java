/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.aliments;

/**
 *
 * @author diginamic05
 */
public abstract class Aliment {

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    private String type;
    public Aliment(String t)
    {
        this.type = t;
    }
}
