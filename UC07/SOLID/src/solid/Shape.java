package solid;

// Opend-closed Principle = Princípio Aberto-Fechado
public abstract class Shape {
    public abstract double calculateArea();
}

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    // Construtores, getters e setters
    
    public double calculateArea() {
        return width * height;
    }
}

public class Circle extends Shape {
    private double radius;
    
    // Construtores, getters e setters
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}