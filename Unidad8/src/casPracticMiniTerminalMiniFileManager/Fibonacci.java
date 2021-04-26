package casPracticMiniTerminalMiniFileManager;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fibonacci {
	public static void main(String[] args) throws IOException {
		int serie = 100;
		int n1 = 0;
		int n2 = 1;
		int suma = 1;
		
		FileWriter fw = new FileWriter("src/fibonacci/prueba.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(fw);
            pw.print(n1 + " ");
            
            for (int i = 0; i < serie; i++) {
    			if(suma % 2 == 0)
    			pw.print(suma + " ");
    			suma = n1 + n2;
    			n1 = n2;
    			n2 = suma;
    		}

        }
        
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        finally {
           try {
           if (null != fw)
              fw.close();
           }
           
           catch (Exception ex2) {
              ex2.printStackTrace();
           }
        }
	}
}
