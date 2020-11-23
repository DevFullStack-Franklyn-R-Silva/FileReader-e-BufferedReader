package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String caminho = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr); //pode colocar tudo numa mesma linha ex:
			//br = new BufferedReader(new FileReader(caminho));
			
			String line = br.readLine();
			while(line!= null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br!=null) {
					br.close();
				}
				if(fr!=null) {
					fr.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
