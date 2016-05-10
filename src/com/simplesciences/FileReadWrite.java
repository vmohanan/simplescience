/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplesciences;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/fileread")
public class FileReadWrite {
    
    @GET
    @Produces("application/json")
    public Response convertFtoC() throws JSONException {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Reads Files", "from web-inf");
        jsonObject.put("created to check security", "<ding.");

        String result = "@Produces(\"application/json\") Output: \n\n" + jsonObject;
        return Response.status(200).entity(result).build();
    }
    
    @Path("{f}")
    @GET
    @Produces("application/json")
    public Response readfile(@PathParam("f") String f) throws IOException  {
           JSONObject jsonObject = new JSONObject();
          //  File file=new File("E://file.txt");
          //  FileReader fr = new FileReader(file); 
            String text,res="";
            f="/"+f;

            InputStream  file=this.getClass().getClassLoader().getResourceAsStream(f);
            InputStreamReader isr = new InputStreamReader(file);
            BufferedReader reader = new BufferedReader(isr);
            
            while ((text = reader.readLine()) != null) {
                res = res + text;
                }
            
        jsonObject.put("file Name", f);
        jsonObject.put("file content", res);
        
        String result = "@Produces(\"application/json\") Output: \n\n" + jsonObject;
        return Response.status(200).entity(result).build();
    }
}