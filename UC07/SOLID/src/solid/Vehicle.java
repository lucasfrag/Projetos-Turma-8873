package solid;

// Liskov Substituition Principle		= 	Princípio da Substituição de Liskov
public abstract class Vehicle {
    public abstract void start();
}

public class Car extends Vehicle {
    public void start() {
        // Lógica para iniciar um carro
    }
}

public class EletricCar extends Vehicle {
    public void start() {
        // Lógica para iniciar um carro elétrico
    }    
}

public class Moto extends Vehicle {
    public void start() {
        // Lógica para iniciar um moto
    }    
}

public class Bus extends Vehicle {
    public void start() {
        // Lógica para iniciar um ônibus
    }    
}