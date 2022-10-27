package MyNewProject;

import java.net.*;
import java.util.Scanner;

public class NewClass {
	public static void main(String args[]) throws UnknownHostException{
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Введите адрес: ");
	       String addrTo = sc.nextLine();
	       InetAddress addr = InetAddress.getByName(addrTo);
	       System.out.println(addr);
		}
	}
