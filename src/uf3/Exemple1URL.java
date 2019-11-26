package uf3;

import java.net.*;

public class Exemple1URL {

	public static void main(String[] args) {
		URL url;

		try {
			//Creem un objecte tipus URL amb 4 paràmetres.
			//El primer es el protocol (http, ftp, https...), el segon es el domini,
			//el tercer es el numero de port i l'últim el subdirectori de la URL.
			url = new URL(args[0].substring(0, args[0].indexOf(':')),
					args[0].substring(args[0].indexOf("//")+2,args[0].indexOf('/', args[0].indexOf("//")+2)),
					Integer.parseInt(args[1]),
					args[0].substring(args[0].indexOf('/', args[0].indexOf("//")+2), args[0].length()));
			Visualitzar(url);

		} catch (MalformedURLException e) {
			System.out.println(e);
		}

	}

	private static void Visualitzar(URL url) {

		System.out.println("\tURL complerta: " + url.toString());
		System.out.println("\tgetProtocol: " + url.getProtocol());
		System.out.println("\tgetHost: " + url.getHost());
		System.out.println("\tgetPort: " + url.getPort());
		System.out.println("\tgetFile: " + url.getFile());
		System.out.println("\tgetUserInfo: " + url.getUserInfo());
		System.out.println("\tgetPath: " + url.getPath());
		System.out.println("\tgetAuthority: " + url.getAuthority());
		System.out.println("\tgetQuery: " + url.getQuery());
		System.out.println("=====================================================");
	}

}