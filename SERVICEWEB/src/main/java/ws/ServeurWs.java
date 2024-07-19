package ws;

import jakarta.xml.ws.Endpoint;

public class ServeurWs {
    public static void main (String[] args){
 String url="http://0.0.0.0:8787/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("service publié sur: "+url);

    }
}
