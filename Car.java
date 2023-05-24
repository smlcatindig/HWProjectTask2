package HWProjectTask2;
/* Create a Class Car that would have the following fields:
carPrice and color and method calculateSalePrice() which should be returning a price of the car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as following:
if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does its own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public abstract class Car {
    double carPrice;
    String color;

    Car(double price, String color){
        this.carPrice=carPrice;
        this.color=color;
    }

    abstract double calculateSalePrice();

}
class Sedan extends Car {
    double length;
    Sedan(double carPrice, String color, double length){
        super(carPrice, color);
        this.length=length;
    }
    double calculateSalePrice(){
        if(length>20){
            carPrice=carPrice-(carPrice*0.05);
        }else {
            carPrice=carPrice-(carPrice*0.1);
        }
        System.out.println("Sedan discounted price: ");
        return carPrice;
    }
}
class Truck extends Car {
    double weight;

    Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice = carPrice - (carPrice * 0.1);
        } else {
            carPrice = carPrice - (carPrice * 0.2);
        }
        System.out.println("Truck discounted price: ");
        return carPrice;
    }
}