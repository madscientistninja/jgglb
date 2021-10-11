/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninja.madscientist.jgglb;

import java.net.*;
import java.io.*;

/**
 *
 * @author masterninja
 */
public class GopherGET {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) return;
        
        URL url;
        
        try {
            url = new URL(args[0]);
        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();
            return;
        }
        
        String hostname = url.getHost();
        int port = url.getPort();
        
        if (port == -1){
            port = 70;
        }
        
        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output= socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            
            writer.println(url.getPath());
            writer.println();
            
            InputStream input = socket.getInputStream();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
