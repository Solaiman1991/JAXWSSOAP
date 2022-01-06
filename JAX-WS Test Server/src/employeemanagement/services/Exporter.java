package employeemanagement.services;

import javax.xml.ws.Endpoint;

public class Exporter {


    public static void main(String[] args) {

        // det er denne her adresse som vores clienter skal bruge
        Endpoint.publish("http://localhost:8080/netflix/employeeservice",new EmployeeServiceImpl());
        System.out.println("Server is Running now");

    }


    // http://localhost:8080/netflix/employeeservice?wsdl viser xml-filen.
}
