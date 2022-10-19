package org.example;

public class Ticket {
    String empId, empName, issue, assignedTeam, ticketOwner;
    Integer ticketNumber;

    public Ticket(String empId, String empName, String issue, Integer ticketNumber, String assignedTeam, String ticketOwner) {
        this.empId = empId;
        this.empName = empName;
        this.issue = issue;
        this.ticketNumber = ticketNumber;
        this.assignedTeam = assignedTeam;
        this.ticketOwner = ticketOwner;
    }
}



