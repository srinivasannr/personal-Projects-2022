/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompressDecompressGzip;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author SRINIVASAN N R
 */
public class compress {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();//it outputs the file path where it exist
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file);//it is used to take input of the file argument as file object
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/Compressedfile.gz");// to make the file.
        
        
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);//main part
        
        byte[] buffer=new byte[10000];//text length
        int len;
        while((len=fis.read(buffer))!=-1){//read the file at once//runs only onces
            gzipOS.write(buffer,0,len);//write the compress file in gz format
        }
        //System.out.println(Arrays.toString(buffer));
        gzipOS.close();
        fos.close();
        fis.close();
    }
    public static void main(String[] args) throws IOException{
        File path=new File("C:\\Users\\SRINIVASAN N R\\Desktop\\acciojobs projects\\newcom.txt");
        method(path);
    }
}
