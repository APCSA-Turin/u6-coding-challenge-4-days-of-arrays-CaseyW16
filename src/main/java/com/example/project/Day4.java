package com.example.project;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int distanceTraveled;
        private int runTime;
        private int restTime;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
        }

        public int getDistanceTraveled() { // this method is required
            return distanceTraveled;
        }

        public String getName() {
            return name;
        }

        public void simulateSecond() { // this method is required but not tested
            if (runTime == runDuration) {
                restTime++;
                if (restTime > restDuration) {
                    runTime = 0;
                }
            }
            if (runTime != runDuration) {
                restTime = 0;
                distanceTraveled += speed;
                runTime++;
            }
        }
    }

    public static String simulateRace(int time, Reindeer[] reindeers){ // you will be tested on this method
        int maxDistance = 0;
        String maxDeer = "";
        for (int t = 0; t < time; t++) {
            for (int i = 0; i < reindeers.length; i++) {
                Reindeer deer = reindeers[i];
                deer.simulateSecond();
                int dist = deer.getDistanceTraveled();
                if (dist > maxDistance) {
                    maxDistance = dist;
                    maxDeer = deer.name;
                }
            }
        }
        return maxDeer;
    }
    
    public static void main(String[] args) { 
        Reindeer reindeer = new Day4.Reindeer("Dasher", 100, 1, 1);

        // Simulate 5 seconds of running
        for (int i = 0; i < 5; i++) {
            reindeer.simulateSecond();
        }
        System.out.println(reindeer.getDistanceTraveled());

        // Simulate 2 seconds of resting
        for (int i = 0; i < 2; i++) {
            reindeer.simulateSecond();
        }
        System.out.println(reindeer.getDistanceTraveled());
    }
}
