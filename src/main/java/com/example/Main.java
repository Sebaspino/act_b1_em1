package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante e1 = new Estudiante("Juan", 20, 3.50);
        Estudiante e2 = new Estudiante("Maria", 10, 4.30);

        // 2. Mostrar la información de ambos estudiantes
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        
        // 3. Modificar algún atributo usando un setter

        
        // 4. Mostrar la información actualizada

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        // 2. Crear un libro usando el constructor con solo titulo y autor
        // 3. Mostrar información de ambos libros
        // 4. Aplicar descuento usando ambas versiones del método
        // 5. Mostrar información actualizada de los libros
    }
}