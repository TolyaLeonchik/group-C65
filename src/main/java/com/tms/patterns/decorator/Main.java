package com.tms.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(juniorDeveloper);
        TeamLead teamLead = new TeamLead(seniorDeveloper);
        TeamLead teamLead2 = new TeamLead(new SeniorDeveloper(new JuniorDeveloper()));

        teamLead.writeCode();
        teamLead2.writeCode();
    }
}
