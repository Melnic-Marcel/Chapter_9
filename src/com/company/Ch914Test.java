package com.company;

public class Ch914Test {

        public static void main(String[] args){

            Ch914 employee = new Ch914("Alexandru", "Djundiet", "564367", 600, 0.01);
        System.out.print(employee.toString());
        System.out.println();
        employee.setFirstName("Alexandru");
        employee.setLastName("Djundiet");
        employee.setSocialSecurityNumber("564367");
        employee.setGross(720);
        System.out.print(employee.toString());
    }
}
