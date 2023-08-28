package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.libro;

public class Main {
    public static void main(String[] args) {
        crearLibros();


    }

    private static void crearLibros() {
        //crear los 5 libros
        Libro libro1 = new Libro();
        libro1.setNombre("calculo deiferencial");
        libro1.setEditorial("norma");
        libro1.setAutor("David Batero");
        libro1.setAnioPublicacion(2003);
        libro1.setGenero("educación");
        libro1.setNumeroPagina(567);

        Libro libro2 = new Libro();
        libro2.setNombre("mente prodigiosa");
        libro2.setEditorial("norma");
        libro2.setAutor("nicolas ceballos");
        libro2.setAnioPublicacion(1967);
        libro2.setGenero("educación");
        libro2.setnumeroPagina(500);

        Libro libro3 = new Libro();
        libro3.setNombre("el loco del parque");
        libro3.setEditorial("santillana");
        libro3.setAutor("hugo perez");
        libro3.setAnioPublicacion(1999);
        libro3.setGenero("suspenso");
        libro3.setnumeroPagina(250);

        Libro libro4 = new Libro();
        libro4.setNombre("iluminacion de jesucristo");
        libro4.setEditorial("planeta");
        libro4.setAutor("angel paez");
        libro4.setAnioPublicacion(1930);
        libro4.setGenero("religioso");
        libro4.setnumeroPagina(1000);

        Libro libro5 = new Libro();
        libro5.setNombre("mente prodigiosa");
        libro5.setEditorial("norma");
        libro5.setAutor("nicolas ceballos");
        libro5.setAnioPublicacion(1967);
        libro5.setGenero("educación");
        libro5.setnumeroPagina(500);

        //Obtener la cantidad de libros donde el título empiece por una vocal y consonante.
        calcularVocalesYConsonantes(libro1, libro2, libro3, libro4, libro5);

    }
        public static void calcularVocalesYConsonantes (Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro
        libro5){
            int cantidadVocales = 0;
            int cantidadConsonantes = 0;

            if (libro1.getNombre().charAt(0) == 'a' || libro1.getNombre().charAt(0) == 'e' || libro1.getNombre().charAt(0) == 'i'
                    || libro1.getNombre().charAt(0) == 'o' || libro1.getNombre().charAt(0) == 'u' || libro1.getNombre().charAt(0) == 'A' ||
                    libro1.getNombre().charAt(0) == 'E' || libro1.getNombre().charAt(0) == 'I' || libro1.getNombre().charAt(0) == 'O' ||
                    libro1.getNombre().charAt(0) == 'U') {
                cantidadVocales += 1;
            } else {
                cantidadConsonantes += 1;
            }


        }


}
