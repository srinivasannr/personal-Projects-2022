/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompressDecompressGzip;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author SRINIVASAN N R
 */
public class decompress {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        System.out.println(fileDirectory);
        
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/Decompressed.txt");
        GZIPInputStream gis=new GZIPInputStream(fis);
        
        byte[] buffer=new byte[10000];//size of character it can read
        int len;
        
        while((len=gis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        
        gis.close();
        fos.close();
        fis.close();
    }
    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\SRINIVASAN N R\\Desktop\\acciojobs projects\\Compressedfile.gz");
        method(file);
    }
}
