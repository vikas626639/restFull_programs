package com.nit.erail_Client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nit.request.PassangerInfo;

public class Erail_Client {
	public static void main(String[] args) {
		PassangerInfo info=null;
		ObjectMapper mapper=null;
		URL url=null;
		String endpointUrl="http://localhost:8080/bookticket";
		try {
			//create requested class object
			System.err.println("************************Creating Request class object*********************");
			info=new PassangerInfo();
			System.err.println("************************Setting data to the object*********************");
			//set information of passanger
			info.setFirstName("vikas");
			info.setFrom("shahdol");
			info.setJourneyDate("02-02-2020");
			info.setLastname("yadav");
			info.setTo("jabalpur");
			info.setTrainNumber("02853");
			
			//convert that object to json
			System.err.println("************************converting object data into the form of json*********************");
			mapper=new ObjectMapper();
			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(info);
			System.out.println(json);
			
			//create connection of url
			url=new URL(endpointUrl);
			System.err.println("************************establish the connection with resource*********************");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("POST");
			con.setRequestProperty("content-Type", "application/json");    //content type specified in which format client sending data to the server
			con.setRequestProperty("Accept", "application/xml");			//accept i want the responce in the xml format
			//set the data to request body
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();
			os.write(json.getBytes());										//set json data to body and send via network in the form of bytes
			os.flush();

			//get responce status code
			int code = con.getResponseCode();
			if(code==201) {
				//read the responce
				InputStream is = con.getInputStream();
				//read the stream by creating InPutStreamReaderObject
				InputStreamReader isr=new InputStreamReader(is);
				//create bufferReader object to read Data line by line
				BufferedReader br=new BufferedReader(isr);
				String line = br.readLine();
				while(line!=null) {
					//print the response getting from the client
					System.out.println(line+"\n");
					line=br.readLine();
				}
			}
			con.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
