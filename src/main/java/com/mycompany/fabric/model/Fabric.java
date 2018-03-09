/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fabric.model;

/**
 *
 * @author Julia
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Fabric {
    
    private int id;
    private String colour;
    private String metres;
    private String material;
    
    public Fabric(){
    }
    
    
    public Fabric(int id, String colour, String metres, String material){
            this.id=id;
            this.colour=colour;
            this.metres=metres;
            this.material=material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMetres() {
        return metres;
    }

    public void setMetres(String metres) {
        this.metres = metres;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
