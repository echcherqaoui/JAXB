package khalid.echcherqaoui;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String address = "http://0.0.0.0:8080/";
        Endpoint.publish(address, new BanqueService());
        System.out.println("running on port: 8080");
    }
}