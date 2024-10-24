package org.example.serveur;

import jakarta.xml.ws.Endpoint;
import org.example.service.EtudiantWService;

public class ServerWS {
    public static void main(String[] args) {
        String url="http://localhost:8082/";
        Endpoint.publish(url,new EtudiantWService());
        System.out.println(url);
    }
}