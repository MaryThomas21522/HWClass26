package HWClass26;

import java.util.TreeMap;

public class Employee {

    public static void main(String[] args) {
        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Duncan Dooky", 110000);
        employee.put("Kara Beltran", 150000);
        employee.put("Pepper Solis", 210000);
        employee.put("Mimo Lim", 120000);

        int highSalary = 0;
        String hEmployee = "";

        for (var v : employee.entrySet()) {
            if (v.getValue() > highSalary) {
                highSalary = v.getValue();
                hEmployee = v.getKey();
            }
        }

        System.out.println(hEmployee + "=$" + highSalary);

    }
}

/*
/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets
the highest salary. Output should be in the below format John Smith=$100000
 */