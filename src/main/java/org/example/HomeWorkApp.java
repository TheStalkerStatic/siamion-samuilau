package org.example;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employees NewEmp = new Employees(
                "Siamion Samuilau",
                "QA",
                "s.samuilau@andersenlab.com",
                "+375228228",
                100,
                22);


        NewEmp.inLine();


        Employees[] EmpArray = new Employees[5];
        EmpArray[0] = new Employees("Leha", "Admin", "leha@mail.com", "88005553535", 300, 21);
        EmpArray[1] = new Employees("Vanya", "QA", "vanya@mail.ru", "37513371337", 1, 30);
        EmpArray[2] = new Employees("Dimasik", "Lead", "dimasik@mai.com", "88005553555", 40, 41);
        EmpArray[3] = new Employees("Stas", "SRM", "stas@mai.com", "80085", 1, 18);
        EmpArray[4] = new Employees("VladIsLove", "HRM", "vladislove@mail.com", "1234567890", 0, 98);

        for (int i = 0; i < EmpArray.length; i++) {
            if (EmpArray[i].getAge() > 40) {
               EmpArray[i].inLine();
            }
        }
    }
}
