// Remember to split when pasting into IDE

package com.company;

public class Main {

    public static void main(String[] args) {
	Car myCar = new Car("Vrooom", "Lamborghini", "12/08/24");
	myCar.setMileage(2000);
    System.out.println("Mileage: " + getMileage);
    }
}


// Split
package com.company;

public class Car {

    private String registration;
    private String make;
    private double mileage;
    private String dateoofinspection;

    public Car(String Registration, String Make, String DateOfInspection){
        this.registration = Registration;
        this.make = Make;
        this.dateoofinspection = DateOfInspection;
        this.mileage = 0;
    }

    public String getMake() {
        return make
    }
    public String getRegistration(){
        return registration
    }
    public int getMileage(){
        return mileage
    }

    public String getDateoofinspection(){
        return dateoofinspection;
    }

    public void setMileage(int Mileage){
        this.mileage = Mileage
    }

    public void setDateoofinspection(String DateOfInspection){
        this.dateoofinspection = DateOfInspection;
    }
}

