package com;

import java.io.FileWriter;

public class ayuda {

	public static void main(String args[])
    {
        try
        {
            String filePath = "C:\\Users\\danny\\OneDrive\\Escritorio\\notasimple2.txt";
            FileWriter fw = new FileWriter(filePath, true);    
            String lineToAppend = "\r\nThe quick brown fox jumps over the lazy dog";    
            fw.write(lineToAppend);
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
     }
}

