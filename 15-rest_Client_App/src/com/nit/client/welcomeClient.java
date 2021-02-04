package com.nit.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class welcomeClient {

	public static void main(String[] args) {
		//creating URL Object
		URL url=null;
		String endPointUrl="http://localhost:8081/welcome";
		try {
			url=new URL(endPointUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();		//becouse the Url is type of Http //send the request
			//sending get request
			con.setRequestMethod("GET");											//sending the Httpget request
			//get the responce code
			int statuscode = con.getResponseCode();
			if(statuscode==200) {
				//read the data from the api
				InputStream is = con.getInputStream();
				//creating object of InputStreamReader
				InputStreamReader isr=new InputStreamReader(is);
				//create object of BurredReader to read whole line
				BufferedReader br=new BufferedReader(isr);
				String line = br.readLine();
				while(line!=null) {
					System.err.print("responce getting from resource is=");
					System.out.println(line.toUpperCase());
					//read next line
					line=br.readLine();
				}
				con.disconnect();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//why this classes having in the java.net package
//becouse these classes talk with other classes using network
//this is the real abstraction when we use restTemplate

