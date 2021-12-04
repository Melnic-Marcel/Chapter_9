package com.company;

public class Ch914BaseTest {
    public static void main(String[] args){
        Ch914Base mat = new Ch914Base("Nicolae", "Filip", "4564554", 1000, 0.05, 900);
        System.out.print(mat.toString());
        System.out.println();
        mat.setBaseSalary(950);
        mat.setCommissionRate(0.2);
        mat.setGross(800);
        mat.setLastName("Filip");
        System.out.print(mat.toString());
        System.out.println();
        double earning = mat.earnings();
        System.out.printf("Mat gets %.2f this month!", earning);
        System.out.println();
    }
}