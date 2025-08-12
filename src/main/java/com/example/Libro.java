package com.example;

public class Libro {
    // TODO: Declarar atributos privados para titulo, autor y precio
    private String titulo;
    private String autor;
    private double precio;

    // TODO: Crear constructor con todos los atributos (titulo, autor, precio)
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // TODO: Crear constructor con solo titulo y autor (precio = 0.0)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0.0;
    }

    // TODO: Implementar métodos getter para cada atributo
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    // TODO: Implementar métodos setter para cada atributo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Nota: Validar que el precio no sea negativo
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Valor invalido");
        }

    }

    // TODO: Crear método aplicarDescuento que reciba porcentaje
    // Nota: Calcular descuento y actualizar precio
    public void aplicarDescuento(double porcentaje){
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = (porcentaje / 100) * precio;
            this.precio = precio - descuento;
            System.out.println("Se aplicó un descuento del " + porcentaje + "%. Nuevo precio: " + this.precio);
        } else {
            System.out.println("Porcentaje inválido.");
        }        
    }

    // TODO: Crear método aplicarDescuento que reciba porcentaje y monto máximo
    // Nota: Aplicar descuento solo si no excede el monto máximo
    public void aplicarDescuento(double porcentajeDescuento, double montoMaximo) {
        double montoDescuento = this.precio * (porcentajeDescuento / 100);
        if (montoDescuento <= montoMaximo) {
            this.precio -= montoDescuento;
        }else{
            System.out.println("Valor excedido");
        }
    }

    // TODO: Crear método mostrarInformacion que imprima los datos del libro
    public void mostrarInformacion() {
        System.out.println("Título del libro: " + this.titulo);
        System.out.println("Autor del libro: " + this.autor);
        System.out.println("Precio del libro: " + this.precio);
    }
}
