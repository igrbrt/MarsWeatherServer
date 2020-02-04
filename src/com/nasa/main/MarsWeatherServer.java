package com.nasa.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nasa.model.AverageTemperature;

@Path("nasa")
public class MarsWeatherServer {
		
	@GET
	@Path("temperature")
	@Produces(MediaType.APPLICATION_JSON)
	
	public String AverageTemperature(@QueryParam("sol") String sol) throws IOException{
		String aURL = "https://api.nasa.gov/insight_weather/?api_key=KpnE5UYreYlHxOCcndSSHrHRkrZyn1hdWG0rSIZv&feedtype=json&ver=1.0";
		
		URL url = new URL(aURL);
		URLConnection request = url.openConnection();
	    request.connect();
		
	    JsonParser json = new JsonParser();
	    JsonElement root = json.parse(new InputStreamReader((InputStream) request.getContent()));
	    JsonObject obj = root.getAsJsonObject();
	    
	    AverageTemperature avTemperature = new AverageTemperature();
	    Gson gson = new Gson();
	    
	    if(sol != null) {
	    	JsonObject aSol = obj.get(sol).getAsJsonObject();
	 	    
	 	    JsonObject s = aSol.get("AT").getAsJsonObject();
	 	    
	 	   avTemperature.setAverageTemperature(s.get("av").getAsDouble());
	    }else {
	    
	    	JsonArray sol_keys = obj.get("sol_keys").getAsJsonArray();
			
			double average = 0.0;
			
			for(int i = 0; i < sol_keys.size(); i++) {
				
				JsonObject day = obj.get(sol_keys.get(i).getAsString()).getAsJsonObject();
				JsonObject temperature = day.get("AT").getAsJsonObject();			
				average += temperature.get("av").getAsDouble();
				
			}
			
			DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.UK));
			
			String finalAverage = df.format(average/sol_keys.size());
			
			avTemperature.setAverageTemperature(Double.parseDouble(finalAverage));
	    }
		
		String response = gson.toJson(avTemperature);
	    
		return response;
	    
	}
}
