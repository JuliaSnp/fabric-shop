/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fabric.resources;

import com.mycompany.fabric.model.Fabric;
import com.mycompany.fabric.service.FabricService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Julia
 */
@Path("/fabric")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})

public class FabricResources {
    
    FabricService fabricService=new FabricService();
    
    
    @GET
    
    public List<Fabric> getFabrics(){
            return fabricService.getAllFabric();
    }
    
    @GET
    @Path("/{fabricId}")

    public Fabric getFabric (@PathParam("fabricId")int id){
  
            return fabricService.getFabricById(id);
    }

    @POST
    @Path("/newfabric/{colour}/{metres}/{material}")
    public Fabric addFabric(@PathParam("colour") String colour, 
                          @PathParam("metres") String metres, 
                          @PathParam("material") String material){
        return fabricService.createFabric(colour, metres, material);
    }
        
    
    @DELETE
    @Path("/deletion/{fabricId}")
    public String removeFabric(@PathParam("fabricId")int id){
  
            return fabricService.deleteFabric(id);
    }
}

       
    
                
    
    
    
   
   /* http://127.0.01:4900/api/fabric/fabricnew/?colour=red&metres=5&material=linen*/
    
   
