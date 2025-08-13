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
        e1.setPromedio(4.7);
        e2.setEdad(19);
        
        // 4. Mostrar la información actualizada
        e1.mostrarInformacion();
        e2.mostrarInformacion();
        
        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        Libro libro1 = new Libro("Orgullo y prejuicio", "Jane Austen", 23000);
        
        // 2. Crear un libro usando el constructor con solo titulo y autor
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // 3. Mostrar información de ambos libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(15);
        libro1.aplicarDescuento(20, 500);

        // 5. Mostrar información actualizada de los libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}