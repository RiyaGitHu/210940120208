package com.practise;
import java.io.*;
public class BufferedReadDemo {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub 
		
		BufferedReader br = new BufferedReader(new FileReader("bufferwr.txt")); 
		String l = br.readLine() ; 
		int count = 0;
		while( l != null) {
			System.out.println(l); 
			l = br.readLine(); 
			count++;
		}
				
		System.out.println(count); 
		br.close();

	}

}
