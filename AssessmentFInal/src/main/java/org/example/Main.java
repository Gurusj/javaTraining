package org.example;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {

    String department, assignedGroup;
    static String owner;
    static String assignedTeam;
    public static Map<Integer, Ticket> ticketDetails = new HashMap<>();
    public static Map<String, Main> finalMap = new HashMap<>();


    public Main(){

    }
    public Main(String department, String assignedGroup){
        this.department = department;
        this.assignedGroup = assignedGroup;
        //this.
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Ticket Management System");
        Scanner sc = new Scanner(System.in);
        int ticketNumber;
        Random r = new Random();
        boolean flag1 = true;
        while (flag1) {
            System.out.println("1. Create Ticket\n2. Show Ticket\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice1 = sc.nextInt();
            switch (choice1) {
                case 1:
                    boolean flag2 = true;
                    while (flag2){
                        System.out.println("-------Select the team to raise your ticket-------");
                        System.out.println("1. IT Team\n2. HR Team\n3. Finance Team\n4. Main Menu\n5. Exit");
                        System.out.print("Enter your choice: ");
                        int choice2 = sc.nextInt();
                        switch (choice2){
                            case 1:
                                System.out.println("----------Welcome to IT Team----------");
                                System.out.print("Enter your ID: ");
                                String empId = sc.next();
                                System.out.print("Enter your Name: ");
                                String empName = sc.next();
                                System.out.print("Enter your Issue: ");
                                String isssue = sc.next();
                                ticketNumber = r.nextInt(10000);
                                Main mobj = new Main();
                                mobj.getExcelData();
                                List<String> teamIT = new ArrayList<>();
                                for (Map.Entry<String, Main> m: finalMap.entrySet()){
                                    Main value = m.getValue();
                                    String departmentValue = value.department;
                                    if(departmentValue.equals("IT")){
                                        teamIT.add(m.getKey());
                                        //owner = m.getKey();
                                        assignedTeam = m.getValue().assignedGroup;
                                    }
                                }
                                owner = teamIT.get(r.nextInt(3));
                                Ticket t1 = new Ticket(empId, empName, isssue, ticketNumber,assignedTeam,owner);
                                ticketDetails.put(t1.ticketNumber, t1);
                                System.out.println("Hello "+t1.empName+"("+t1.empId+"),\nYour ticket is raised successfully...\nYour ticket number: "+t1.ticketNumber);
                                break;
                            case 2:
                                System.out.println("----------Welcome to HR Team----------");
                                System.out.print("Enter your ID: ");
                                String empId2 = sc.next();
                                System.out.print("Enter your Name: ");
                                String empName2 = sc.next();
                                System.out.print("Enter your Issue: ");
                                String isssue2 = sc.next();
                                ticketNumber = r.nextInt(10000);
                                Main mobj1 = new Main();
                                mobj1.getExcelData();
                                List<String> teamHr = new ArrayList<>();
                                for (Map.Entry<String, Main> m: finalMap.entrySet()){
                                    Main value = m.getValue();
                                    String departmentValue = value.department;
                                    if(departmentValue.equals("HR")){
                                        teamHr.add(m.getKey());
                                        //owner = m.getKey();
                                        assignedTeam = m.getValue().assignedGroup;
                                    }
                                }
                                owner = teamHr.get(r.nextInt(3));
                                Ticket t2 = new Ticket(empId2, empName2, isssue2, ticketNumber,assignedTeam,owner);
                                ticketDetails.put(t2.ticketNumber, t2);
                                System.out.println("Hello "+t2.empName+"("+t2.empId+"),\nYour ticket is raised successfully...\nYour ticket number: "+t2.ticketNumber);
                                break;
                            case 3:
                                System.out.println("----------Welcome to Finance Team----------");
                                System.out.print("Enter your ID: ");
                                String empId3 = sc.next();
                                System.out.print("Enter your Name: ");
                                String empName3 = sc.next();
                                System.out.print("Enter your Issue: ");
                                String isssue3 = sc.next();
                                ticketNumber = r.nextInt(10000);
                                Main mobj3 = new Main();
                                mobj3.getExcelData();
                                List<String> teamFinance = new ArrayList<>();
                                for (Map.Entry<String, Main> m: finalMap.entrySet()){
                                    Main value = m.getValue();
                                    String departmentValue = value.department;
                                    if(departmentValue.equals("Finance")){
                                        teamFinance.add(m.getKey());
                                        //owner = m.getKey();
                                        assignedTeam = m.getValue().assignedGroup;
                                    }
                                }
                                owner = teamFinance.get(r.nextInt(3));
                                Ticket t3 = new Ticket(empId3, empName3, isssue3, ticketNumber,assignedTeam,owner);
                                ticketDetails.put(t3.ticketNumber, t3);
                                System.out.println("Hello "+t3.empName+"("+t3.empId+"),\nYour ticket is raised successfully...\nYour ticket number: "+t3.ticketNumber);
                                break;
                            case 4:
                                flag2 = false;
                                break;
                            case 5:
                                flag1 = false;
                                flag2 = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter ticket ID: ");
                    Integer ticketID = sc.nextInt();
                    Ticket obj = ticketDetails.get(ticketID);
                    System.out.println("-------Ticket Details--------");
                    System.out.println("Ticket ID: "+obj.ticketNumber);
                    System.out.println("Raised By: "+obj.empName+"("+obj.empId+")");
                    System.out.println("Team working on the issue: "+obj.assignedTeam);
                    System.out.println("Ticket Owner: "+obj.ticketOwner);
                    System.out.println("Issue: "+obj.issue);
                    System.out.println("Severity: "+r.nextInt(5));
                    break;
                case 3:
                    flag1 = false;
                    break;
            }
        }

    }

    public void getExcelData() throws IOException {
        FileInputStream fis = new FileInputStream(new File("/home/amantya/Downloads/Pre-Table-1.xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("Sheet1");
        XSSFRow row;
        Map<String, String> teamDetails = new HashMap<>();
        String name, department;
        for (int i = 2; i< sh.getLastRowNum()+1; i++){
            row = sh.getRow(i);
            name = row.getCell(1).getStringCellValue();
            int cellNum = row.getLastCellNum();
            for(int j=2; j<cellNum;j++){
                department = row.getCell(j).getStringCellValue();
                teamDetails.put(name,department);
            }
        }

        FileInputStream fis2 = new FileInputStream(new File("/home/amantya/Downloads/Pre-Table-2.xlsx"));
        XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
        XSSFSheet sh2 = wb2.getSheet("Sheet1");
        XSSFRow row2;
        Map<String, String> teamDetails2 = new HashMap<>();
        String name2, department2;
        for (int i = 3; i< sh2.getLastRowNum()+1; i++){
            row2 = sh2.getRow(i);
            name2 = row2.getCell(1).getStringCellValue();
            int cellNum2 = row2.getLastCellNum();
            for(int j=2; j<cellNum2;j++){
                department2 = row2.getCell(j).getStringCellValue();
                teamDetails2.put(name2,department2);
            }
        }

        for (Map.Entry<String, String> en : teamDetails.entrySet()) {
            finalMap.put(en.getKey(), new Main(en.getValue(),teamDetails2.get(en.getKey())));
        }
        fis.close();
        fis2.close();
    }
}