
package Aabe;

public class Employe extends person {
    String name;
    int ID;
    int age;

    public Employe(String name, int Age, String phone, String addressline, int ID, int age) {
        super(name, Age, phone, addressline);
        this.age = age;
    }
    public void displaypersonInfo(){
        System.out.println("person name:" +name );
        System.out.println("person age: " + age);
        System.out.println("person phone: " + phone);
    }
}


