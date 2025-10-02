package org.example.tour;

import org.example.tour.utility.TourRepository;

public class Main {
    public static void main(String[] args) {
        // Must create Repo First
        TourRepository repo = new TourRepository();
        TravelAgentService agent = new TravelAgentService(repo);

        new TourManagementService(repo); //Creates tours in constructor

        // Do not invoke agent method before manager creates base tours
        System.out.println("\n******Explore California Tour Catalogue******");
        agent.displayTours();

        System.out.println("\n******Explore California Tour Kid Friendly Tours******");
        agent.displayToursBy(true);
    }
}