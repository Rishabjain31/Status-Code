package com.qait.automation.status_code;

import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;

public class get_code {
	WebDriver driver;

	public get_code(WebDriver driver) {
		this.driver = driver;
	}

	public int Box() {
	 try {
	 String url = "http://10.0.31.161:9292/status_codes/404";
	 URL obj = new URL(url);
	 HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 // optional default is GET
	 //con.setRequestMethod("GET");
	 // add request header
	 //con.setRequestProperty("User-Agent", "Chrome/67.0.3396.99");
	 int responseCode = con.getResponseCode();
	 System.out.println("\nSending 'GET' request to URL : " + url);
	 System.out.println("Response Code : " + responseCode);
	 return responseCode;
	 }
	     catch (Exception e) {
	  System.out.println(e);
	  return 0;
	     }
	 }
	 }