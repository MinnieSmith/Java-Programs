package com.minniesmith;

public class Main {

    public static void main(String[] args) {

        BankAccount minhsAccount = new BankAccount("213-0457", 2000, "Minh Smith", "jacta-alea-est@hotmail.com", "0452237774");
        minhsAccount.withdrawal(500);


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Dan Shi", 500000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Minh Thu", 200000.00, "miissythu@hotamil.com");
        System.out.println(person3.getName());
    }
}
