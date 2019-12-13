/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jorgesys_staticinitialization;

/**
 *
 * @author jorgesys
 */
public class Initialization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Country country = new Country();
        //System.out.println("• Static vs Instance initialization | name: " + country.getName() + ", population: " + country.getPopulation());
        
        new Country();
        new Country();
        /*
        Los bloques de itialización de instancias son útiles si desea que se ejecute algún código independientemente del constructor que se use o si desea realizar alguna inicialización de instancia para clases anónimas.
        */
    }
    
}
