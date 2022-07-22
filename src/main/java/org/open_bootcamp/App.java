package org.open_bootcamp;

import Entities.Client;
import Entities.Employee;

public class App {

    public static void main(String[] args) {

        Client client = new Client();
        client.setName("Fredy");
        client.setAge(32);
        client.setTelephone("57 3118750790");
        client.setCredit(7000000);
        System.out.println("The data of client are this:");
        System.out.println("Name -> " + client.getName());
        System.out.println("Age -> " + client.getAge());
        System.out.println("Name -> " + client.getTelephone());
        System.out.println("Name -> " + client.getCredit() + "\n");

        Employee employee = new Employee();
        employee.setName("Tatiana Rojas");
        employee.setAge(27);
        employee.setTelephone("57 3221548754");
        employee.setSalary(3700000);
        System.out.println("The data of employee are this:");
        System.out.println("Name -> " + employee.getName());
        System.out.println("Age -> " + employee.getAge());
        System.out.println("Name -> " + employee.getTelephone());
        System.out.println("Name -> " + employee.getSalary());
    }
}
