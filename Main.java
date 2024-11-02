import Aabe.Employe;
import Aabe.person;

public class Main {
    public static void main(String[] args) {
        person per= new person("ham", 54, "8558578", "8778gf");
        Employe emp = new Employe("han", 26, "638885","AD#$AD",27373, 47);
        System.out.println("public name :" + per.name);
        emp.displaypersonInfo();
    }


}

