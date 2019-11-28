package uf3;

import java.net.*;
import java.io.*;

public class Exemple2URL {
	public static void main (String[] args) {
		URL url=null;
		
		try {
			
			url = new URL(args[0].substring(0, args[0].indexOf(':')),
					args[0].substring(args[0].indexOf("//")+2,args[0].indexOf('/', args[0].indexOf("//")+2)),
					Integer.parseInt(args[1]),
					args[0].substring(args[0].indexOf('/', args[0].indexOf("//")+2), args[0].length()));
			
		} catch (MalformedURLException e) {e.printStackTrace(); }
		
		BufferedReader in;
		
		try {
			
			InputStream inputStream = url.openStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			
			String inputLine;
			
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
			
		} catch (IOException e) {e.printStackTrace(); }

	}
}
