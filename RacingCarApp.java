//
// Name: Ho, Brandon
// Project: 5
// Due: 11-21-2024
// Course: cs-1400-05-f24
//
// Description:
//  Instantiates a Car array with 8 cars, changes their speeds, and outputs their model, make, and speed
//

import java.util.Random;

public class RacingCarApp
{
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        Car[] carsList = new Car[8];
        carsList[0] = new Car(1962, "Chevrolet");
        carsList[1] = new Car(2005, "Lamborghini");
        carsList[2] = new Car(2016, "Tesla");
        carsList[3] = new Car(2024, "Toyota");
        carsList[4] = new Car(2010, "Hyundai");
        carsList[5] = new Car(1984, "Ferrari");
        carsList[6] = new Car(2008, "Kia");
        carsList[7] = new Car(2006, "Honda");

        for(int i = 0; i < carsList.length; i++) {
            for(int j = 1; j <= 30 ; j++) {    
                int randomNumber = randomNumberGenerator.nextInt(20) + 1;
                if (randomNumber <= 15) {
                    carsList[i].accelerate();
                } else {
                    carsList[i].brake();
                }
            }
        }

        System.out.println("Racing Car by Brandon Ho");
        System.out.println();
        System.out.println("Model   Make                    Speed");
        System.out.println("-----   --------------------    -----");
        for(int k = 0; k < carsList.length; k++) {
            System.out.printf("%-4d    %-20s      %3d%n", carsList[k].getYearModel(), carsList[k].getMake(), carsList[k].getSpeed());
        }
    }
}
