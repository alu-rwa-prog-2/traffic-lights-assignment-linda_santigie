//Author Linda Ikireza Pacifique & Santigie Sankoh

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TrafficLight {
    public static void main(String[] args) {
        // Random variable Creation
        Random rand = new Random();

        ArrayList<Integer> car_collection = new ArrayList<Integer>();

        // 1st Red light: 15 cars in and wait for 20secs
        System.out.println("1st Red light: \n");
        System.out.println("Status: 15 cars in, No cars out");
        System.out.println("Time: Will last 20 sec\n");

        // Adding 15 cars randomly to the car collection
        for(int i = 0; i < 15; i++) {
            int newcar;
            do newcar = rand.nextInt(15) + 1;
            while (car_collection.contains(newcar));
            car_collection.add(newcar);
        }

        // starting the timer to calculate the time taken
        long startTime0 = System.currentTimeMillis();

        // Loop for executing 15 added cars in 15 seconds
        for(int i = 0; i < car_collection.size(); i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("CarModel-" + car_collection.get(i));
            System.out.print(" (Added)");
            System.out.println("         Time: " + (i + 1) + " sec");
        }

        // Loop for executing the remaining 5 seconds
        for(int t= 16; t < 21; t++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("Waiting .....          ");
            System.out.println("     Time: " + t + " sec");
        }

        // stopping the timer and calculating the time taken
        long stopTime0 = System.currentTimeMillis();
        long TimeTakenInSec0 = (stopTime0 - startTime0)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec0 + " seconds");
        System.out.println("Total cars: " + car_collection.size() + " cars");

        // 1st yellow light: 15 cars in, 5 cars out and wait for 10secs
        System.out.println("\n---------------------------------------");
        System.out.println("\n1st yellow light: \n");
        System.out.println("Status: 15 cars in, 5 cars out");
        System.out.println("Time: Will last 10 sec\n");

        // Adding 15 cars randomly to the car collection
        for(int i = 0; i < 15; i++) {
            int newcar;
            do newcar = rand.nextInt(30 + 1 - 16) + 16;
            while (car_collection.contains(newcar));
            car_collection.add(newcar);
        }

        // starting the timer to calculate the time taken
        long startTime = System.currentTimeMillis();
        int counttime = 1;

        // Loop for executing 15 added cars and removing 1 car all in 2 seconds
        for(int i = 15; i < car_collection.size(); i++) {
            int rando = (int) ((Math.random() * car_collection.size()));
            System.out.print("CarModel-" + car_collection.get(i));
            System.out.println(" (Added) ");

            if (counttime % 15 == 0) {
                // Removing cars
                int removed = car_collection.remove(rando);
                System.out.print("CarModel-" + removed);
                System.out.print(" (Removed)");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // printing time
                System.out.println("        Time: " + 2 + " secs");
            }
            counttime = counttime + 1;
        }
        counttime = 4;

        // Loop for removing other remaining 4 cars - each car in 2 seconds
        for(int re = 1; re < 5; re++) {
            int rando = (int) ((Math.random() * car_collection.size()));
            // removing cars
            int removed = car_collection.remove(rando);
            System.out.print("CarModel-" + removed);
            System.out.print(" (Removed)");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("        Time: " + counttime  + " secs");
            counttime = counttime + 2;
        }

        // stopping the timer and calculating the time taken
        long stopTime = System.currentTimeMillis();
        long TimeTakenInSec = (stopTime - startTime)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec + " seconds");
        System.out.println("Remaining cars: " + car_collection.size() + " cars");

        // 1st green light: 20 cars in, 30 cars out and wait for 30secs
        System.out.println("\n---------------------------------------");
        System.out.println("\n1st green light: \n");
        System.out.println("Status: 20 cars in, 30 cars out");
        System.out.println("Time: Will last 30 sec\n");

        // Adding 20 cars randomly to the car collection
        for(int i = 0; i < 20; i++) {
            int newcar;
            do newcar = rand.nextInt(50 + 1 - 31) + 31;
            while (car_collection.contains(newcar));
            car_collection.add(newcar);
        }

        // starting the timer to calculate the time taken
        long startTime2 = System.currentTimeMillis();
        int greentime = 1;

        // Loop for executing the 20 cars added and removing 1 car in 1 second
        for(int i = 25; i < car_collection.size(); i++) {
            int grando = (int) ((Math.random() * car_collection.size()));
            System.out.print("CarModel-" + car_collection.get(i));
            System.out.println(" (Added) ");
            if (greentime % 20 == 0) {

                // Removing cars
                int removed;
                do  removed= car_collection.remove(grando);
                while (car_collection.contains(removed));
                System.out.print("CarModel-" + removed);
                System.out.print(" (Removed)");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // printing time
                System.out.println("        Time: " + 1 + " sec");
            }
            greentime = greentime + 1;
        }
        greentime = 2;

        // Loop for removing 29 other cars - each in 1 second
        for(int re = 1; re < 30; re++) {
            int grando = (int) ((Math.random() * car_collection.size()));
            int removed;
            do  removed= car_collection.remove(grando);
            while (car_collection.contains(removed));
            System.out.print("CarModel-" + removed);
            System.out.print(" (Removed)");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("        Time: " + greentime  + " secs");
            greentime = greentime + 1;
        }


        // stopping the timer and calculating the time taken
        long stopTime2 = System.currentTimeMillis();
        long TimeTakenInSec2 = (stopTime2 - startTime2)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec2 + " seconds");
        System.out.println("Remaining cars: " + car_collection.size() + " cars");


        // 2nd Red light: 15 cars in and wait for 20secs
        System.out.println("\n---------------------------------------");
        System.out.println("\n2nd Red light: \n");
        System.out.println("Status: 15 cars in, No cars out");
        System.out.println("Time: Will last 20 sec\n");

        // Loop for adding 15 cars randomly in the car collection
        for(int i = 0; i < 15; i++) {
            int newcar;
            do newcar = rand.nextInt(65 + 1 - 51) + 51;
            while (car_collection.contains(newcar));
            car_collection.add(newcar);
        }

        // starting the timer to calculate the time taken
        long startTime3 = System.currentTimeMillis();
        int redtime = 1;

        // Loop for executing the 15 cars added in 15 seconds
        for(int i = 15; i < car_collection.size(); i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("CarModel-" + car_collection.get(i));
            System.out.print(" (Added)");
            System.out.println("         Time: " + redtime + " sec");
            redtime = redtime + 1;
        }

        // Loop for executing the remaining 5 seconds
        for(int t= 16; t < 21; t++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("Waiting .....          ");
            System.out.println("     Time: " + t + " sec");
        }

        // stopping the timer and calculating the time taken
        long stopTime3 = System.currentTimeMillis();
        long TimeTakenInSec3 = (stopTime3 - startTime3)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec3 + " seconds");
        System.out.println("Remaining cars: " + car_collection.size() + " cars");

        // 2nd yellow light: 15 cars in, 5 out and wait for 10sec
        System.out.println("\n2nd yellow light: \n");
        System.out.println("Status: 15 cars in, 5 cars out");
        System.out.println("Time: Will last 10 sec\n");

        // Adding 15 cars randomly to the car collection
        for(int i = 0; i < 15; i++) {

            int newcar;

            do newcar = rand.nextInt(80 + 1 - 66) + 66;
            while (car_collection.contains(newcar));

            car_collection.add(newcar);
        }

        // starting the timer
        long startTime4 = System.currentTimeMillis();
        int yellowtime2 = 1;

        // Loop for executing 15 cars added and removing 1 car in 2 seconds
        for(int i = 30; i < car_collection.size(); i++) {
            int rando = (int) ((Math.random() * car_collection.size()));
            System.out.print("CarModel-" + car_collection.get(i));
            System.out.println(" (Added) ");
            if (yellowtime2 % 15 == 0) {
                // Removing cars
                int removed = car_collection.remove(rando);
                System.out.print("CarModel-" + removed);
                System.out.print(" (Removed)");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // printing time
                System.out.println("        Time: " + 2 + " secs");
            }
            yellowtime2 = yellowtime2 + 1;

        }
        yellowtime2 = 4;

        // Loop for removing the remaining 5 seconds - each in 2 seconds
        for(int re = 1; re < 5; re++) {
            int rando = (int) ((Math.random() * car_collection.size()));
            int removed = car_collection.remove(rando);
            System.out.print("CarModel-" + removed);
            System.out.print(" (Removed)");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("        Time: " + yellowtime2  + " secs");
            yellowtime2 = yellowtime2 + 2;
        }

        // stopping the timer and calculating the time taken
        long stopTime4 = System.currentTimeMillis();
        long TimeTakenInSec4 = (stopTime4 - startTime4)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec4 + " seconds");
        System.out.println("Remaining cars: " + car_collection.size() + " cars");


        // 2nd green light: 20 cars in, 30 cars out and wait for 30secs
        System.out.println("\n---------------------------------------");
        System.out.println("\n2nd green light: \n");
        System.out.println("Status: 20 cars in, 30 cars out");
        System.out.println("Time: Will last 30 sec\n");

        // Adding 20 cars randomly in the car collection
        for(int i = 0; i < 20; i++) {
            int newcar;
            do newcar = rand.nextInt(100 + 1 - 81) + 81;
            while (car_collection.contains(newcar));
            car_collection.add(newcar);
        }

        // starting the timer for calculating the time taken
        long startTime5 = System.currentTimeMillis();
        int greentime2 = 1;

        // Loop for executing the 20 cars added and removing 1 car all in 1 second
        for(int i = 40; i < car_collection.size(); i++) {
            int grando = (int) ((Math.random() * car_collection.size()));
            System.out.print("CarModel-" + car_collection.get(i));
            System.out.println(" (Added) ");

            if (greentime2 % 20 == 0) {
                // Removing cars
                int removed;
                do  removed= car_collection.remove(grando);
                while (car_collection.contains(removed));
                System.out.print("CarModel-" + removed);
                System.out.print(" (Removed)");

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // printing time
                System.out.println("        Time: " + 1 + " sec");
            }
            greentime2 = greentime2 + 1;
        }
        greentime2 = 2;

        // Loop for removing other 30 cars each in 1 second
        for(int re = 1; re < 30; re++) {
            int grando = (int) ((Math.random() * car_collection.size()));
            int removed;
            do  removed= car_collection.remove(grando);
            while (car_collection.contains(removed));
            System.out.print("CarModel-" + removed);
            System.out.print(" (Removed)");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("        Time: " + greentime2  + " secs");
            greentime2 = greentime2 + 1;
        }

        // stopping the timer and calculating the time taken
        long stopTime5 = System.currentTimeMillis();
        long TimeTakenInSec5 = (stopTime5 - startTime5)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec5 + " seconds");
        System.out.println("Remaining cars: " + car_collection.size() + " cars");


        // 3rd Red light: No car in and wait for 20 secs
        System.out.println("\n---------------------------------------");
        System.out.println("\n3rd Red light: \n");
        System.out.println("Status: No cars in, No cars out");
        System.out.println("Time: Will last 20 sec\n");

        // starting the timer
        long startTime6 = System.currentTimeMillis();

        // Loop for printing the waiting till 20 seconds are finished
        for(int t= 1; t < 21; t++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("Waiting .....          ");
            System.out.println("Time: " + t + " sec");
        }

        // stopping the time and calculating the time taken
        long stopTime6 = System.currentTimeMillis();
        long TimeTakenInSec6 = (stopTime6 - startTime6)/1000;
        System.out.println("\nIt took: " + TimeTakenInSec6 + " seconds");
        System.out.println("Total cars: " + car_collection.size() + " cars");


        // 3rd Yellow light: No car in, 5 cars out and wait for 10sec
        System.out.println("\n---------------------------------------");
        System.out.println("\n3rd yellow light: \n");
        System.out.println("Status: 0 cars in, 5 cars out");
        System.out.println("Time: Will last 10 sec\n");

        // starting the timer
        long startTime7 = System.currentTimeMillis();
        int yellowtime3 = 2;

        // Loop for removing 5 cars each in 2 seconds
        for(int re = 0; re < 5; re++) {
            int rando = (int) ((Math.random() * car_collection.size()));
            int removed = car_collection.remove(rando);
            System.out.print("CarModel-" + removed);
            System.out.print(" (Removed)");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("        Time: " + yellowtime3  + " secs");
            yellowtime3 = yellowtime3 + 2;

        }


        // stopping the timer and calculating the time taken
        long stopTime7 = System.currentTimeMillis();
        long TimeTakenInSec7 = (stopTime7 - startTime7)/1000;

        System.out.println("\nIt took: " + TimeTakenInSec7 + " seconds");
        System.out.println("Remaining cars: " + car_collection.size() + " cars");


        // 3rd Green light: No cars in, 25 cars out and wait for 30secs
        System.out.println("\n---------------------------------------");
        System.out.println("\n3rd green light: \n");
        System.out.println("Status: No cars in, 25 cars out");
        System.out.println("Time: Will last 30 sec\n");

        // starting the timer
        long startTime8 = System.currentTimeMillis();
        int greentime3 = 1;

        // Loop for removing 25 remaining cars in 25 seconds
        for(int re = 0; re < 25; re++) {
            int rando = (int) ((Math.random() * car_collection.size()));
            // removing car
            int removed = car_collection.remove(rando);
            System.out.print("CarModel-" + removed);
            System.out.print(" (Removed)");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("        Time: " + greentime3  + " secs");
            greentime3 = greentime3 + 1;
        }

        // Loop for executing other 5 remaining seconds
        for(int t= 26; t < 31; t++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.print("Waiting .....          ");
            System.out.println("     Time: " + t + " secs");
        }

        // stopping the timer
        long stopTime8 = System.currentTimeMillis();
//        long TimeTakenInSec8 = (stopTime8 - startTime8)/1000;x
        System.out.println("ALL CARS HAVE PASSED!!!");
    }

}