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
public class Country {
    
    //Non static variable
    private String name;
    //Static variable
    static int population;    
    
    // Instance initialization block:
    {  
       System.out.println("Instance initalization.");
        //Initialization of non static variable
        name = "Russia";        
        population = 1259333445;        
    }
    
    //Static initialization Block, called first!
    static {   
        System.out.println("Static initalization.");
        //Initialization of static variable
        //name = "Argentina"; //*E: non-static variable name cannot be referenced from a static context       
        population = 1;        
    }
    
    public Country() {
        System.out.println("Constructor.");
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
