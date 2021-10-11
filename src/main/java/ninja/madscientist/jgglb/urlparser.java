/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninja.madscientist.jgglb;

/**
 *
 * @author masterninja
 */

import java.net.*;
import java.io.*;

public class urlparser {
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
        String path = url.getPath();
    }
}
