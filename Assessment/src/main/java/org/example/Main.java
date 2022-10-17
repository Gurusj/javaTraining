package org.example;

import java.util.*;

class Ticket implements Runnable{
    Integer ticketNumber;
    String employeeID, employeeName, issueDescription, assignedTeam, etaForFix;

    HashMap<String,String> ticketDetails = new HashMap<>();
    public Ticket(){
    }
    public String getEmployeeID() {
        return employeeID;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getIssueDescription() {
        return issueDescription;
    }
    public Integer getTicketNumber() {
        return ticketNumber;
    }
    public String getAssignedTeam() {
        return assignedTeam;
    }

    public String getEtaForFix() {
        return etaForFix;
    }

    @Override
    public void run() {

    }
    public void createTicket(String employeeID, String employeeName, String issueDescription, Integer ticketNumber, String assignedTeam, String etaForFix){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.issueDescription = issueDescription;
        this.ticketNumber = ticketNumber;
        this.assignedTeam = assignedTeam;
        this.etaForFix = etaForFix;
        ticketDetails.put("Employee ID",getEmployeeID());
        ticketDetails.put("Employee Name",getEmployeeName());
        ticketDetails.put("Issue",getIssueDescription());
    }
    String ticketFormat = "TID-"+getTicketNumber();
    public void displayTicketConfirmationDetails(){
        System.out.println("Hi "+getEmployeeName()+", your Ticket is confirmed and assigned to "+getAssignedTeam()+" with Ticket ID: "+ticketFormat);
        System.out.println("Issue will be resolved in "+getEtaForFix());
    }

    public void ticketStatus(ArrayList<String> teamIT, String ticketId){
        if(ticketFormat.equals(ticketId)){
            Random r = new Random();
            System.out.println("Team working in the issue: "+getAssignedTeam());
            System.out.println("Ticket Owner: "+r.nextInt(teamIT.size()-1));
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("***************WELCOME TO TICKET MANAGEMENT SYSTEM***************");
        Scanner sc = new Scanner(System.in);
        System.out.println("------KINDLY SELECT THE RELATED TEAM TO RESOLVE YOUR ISSUE-------");
        Ticket t = new Ticket();
        ArrayList<String> teamIT = new ArrayList<>();
        teamIT.add("Mike");
        teamIT.add("Jade");
        teamIT.add("Nicholas");
        ArrayList<String> teams = new ArrayList<>();
        teams.add("IT Team");
        teams.add("HR Team");
        teams.add("Finance Team");
        teams.add("Facility Team");
        teams.add("Quit and Exit");

        int i=1;
        for (String s : teams){
            System.out.println(i+". "+s);
            i++;
        }
        System.out.println("Enter your choice here:");
        int choice = sc.nextInt();

        String empID, empName, issue;
        Random r = new Random();
        Integer randomNumber;

        String empIdFormat = "^[AMT]+[0-9]+$";
        boolean validateEmpId;

        int choice2;

        switch (choice){
            case 1:
                System.out.println("-----Welcome to IT Team Solutions-----");
                System.out.println("Please provide the following credentials:");
                System.out.print("Employee ID: ");
                empID = sc.next();
                validateEmpId = empID.matches(empIdFormat);
                if(!validateEmpId){
                    System.out.println("Entered employee id not is valid....Please try again");
                    break;
                }
                System.out.print("Employee Name: ");
                empName = sc.next();
                System.out.print("Issue Description: ");
                issue = sc.next();
                randomNumber = r.nextInt(10000);
                t.createTicket(empID,empName,issue,randomNumber,teams.get(0),"5 working days");
                t.displayTicketConfirmationDetails();
                System.out.println("1. Check Status\n2. Exit\nEnter your choice: ");
                choice2 = sc.nextInt();
                switch (choice2){
                    case 1:
                        System.out.println("Enter your ticket ID: ");
                        String ticketId = sc.next();
                        t.ticketStatus(teamIT,ticketId);
                        break;
                    case 2: break;
                }
            case 2:
                System.out.println("-----Welcome to HR Team Solutions-----");
                System.out.println("Please provide the following credentials:\n");
                System.out.print("Employee ID: ");
                empID = sc.next();
                validateEmpId = empID.matches(empIdFormat);
                if(!validateEmpId){
                    System.out.println("Entered employee id not is valid....Please try again");
                    break;
                }
                System.out.print("Employee Name: ");
                empName = sc.next();
                System.out.print("Issue Description: ");
                issue = sc.next();
                randomNumber = r.nextInt(10000);
                t.createTicket(empID,empName,issue,randomNumber,teams.get(1),"5 working days");
                t.displayTicketConfirmationDetails();
                break;
            case 3:
                System.out.println("-----Welcome to Finance Team Solutions-----");
                System.out.println("Please provide the following credentials:");
                System.out.print("Employee ID: ");
                empID = sc.next();
                validateEmpId = empID.matches(empIdFormat);
                if(!validateEmpId){
                    System.out.println("Entered employee id not is valid....Please try again");
                    break;
                }
                System.out.print("Employee Name: ");
                empName = sc.next();
                System.out.print("Issue Description: ");
                issue = sc.next();
                randomNumber = r.nextInt(10000);
                t.createTicket(empID,empName,issue,randomNumber,teams.get(2),"5 working days");
                t.displayTicketConfirmationDetails();
                break;
            case 4:
                System.out.println("-----Welcome to Facility Team Solutions-----");
                System.out.println("Please provide the following credentials:");
                System.out.print("Employee ID: ");
                empID = sc.next();
                validateEmpId = empID.matches(empIdFormat);
                if(!validateEmpId){
                    System.out.println("Entered employee id not is valid....Please try again");
                    break;
                }
                System.out.print("Employee Name: ");
                empName = sc.next();
                System.out.print("Issue Description: ");
                issue = sc.next();
                randomNumber = r.nextInt(10000);
                t.createTicket(empID,empName,issue,randomNumber,teams.get(0),"5 working days");
                t.displayTicketConfirmationDetails();
                break;
            case 5:
                System.out.println("Exiting.....");
                break;
        }

    }
}