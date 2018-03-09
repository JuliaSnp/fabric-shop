/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fabric.service;

import com.mycompany.fabric.model.Fabric;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Julia
 */
public class FabricService {
    
     List<Fabric> fabricList =new ArrayList<>();
     
     public FabricService(){
         fabricList.add(new Fabric(1, "Red", "5", "Wool"));
         fabricList.add(new Fabric(2, "Yellow", "5", "Cotton"));
         fabricList.add(new Fabric(3, "Pink", "3", "Viscose"));
         fabricList.add(new Fabric(4, "Blue", "7", "Wool"));
         fabricList.add(new Fabric(5, "Crimson","1", "Silk"));
     }
    
     
     public List<Fabric> getAllFabric(){
             return fabricList;
}
             
    public Fabric getFabricById(int id){
        
        for(Fabric fabric: fabricList){
          if (fabric.getId()==(id)) return fabric;
      }
    return null;
    }
     
    
    
     public Fabric createFabric(String colour, String metres, String material){
            int id=fabricList.size()+1;
            Fabric fabricN=new Fabric(id,colour,metres,material);
            fabricList.add(fabricN);
            return fabricN;
    }
    
     
     
     public String deleteFabric(int id){
        
        Fabric currentFabric=getFabricById(id);
        
        if (id<=0){
            return "Invalid id";
        }
        
        if  (currentFabric==null){
                return "No records";   
        }
        
        fabricList.remove(currentFabric);
        return "204 -"+currentFabric.toString()+ "with"+ String.valueOf(id)+ "deleted";
    }
}

