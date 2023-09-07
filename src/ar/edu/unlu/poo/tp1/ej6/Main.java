package ar.edu.unlu.poo.tp1.ej6;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("9789500397988", "Alicia en el pais de las maravillas", "Lewis Carrol",
        176, 10);
        biblioteca.agregarLibro("9789506441746", "El nombre del viento", "Patrick Rothfuss",
                872, 1);

        System.out.println("\n--- Libros ingresados ---");
        System.out.println(biblioteca.mostrarLibro("Alicia en el pais de las maravillas"));
        System.out.println();
        System.out.println(biblioteca.mostrarLibro("El nombre del viento"));
        System.out.println();

        int paginas1 = biblioteca.consultarPaginasLibro("Alicia en el pais de las maravillas");
        int paginas2 = biblioteca.consultarPaginasLibro("El nombre del viento");

        System.out.println("--- Consultando páginas ---");
        if ((paginas1 != -1) && (paginas2 != -1)) {
            if (paginas1 > paginas2) {
                System.out.printf("<Alicia en el pais de las maravillas> tiene más páginas: %d \n\n",paginas1);
            } else {
                System.out.printf("<El nombre del viento> tiene más páginas: %d \n\n",paginas2);
            }
        }

        System.out.println("--- Prestando libros ---");
        System.out.println(biblioteca.prestarLibro("ALicia en el pais de las maravillas"));
        System.out.println(biblioteca.prestarLibro("El nombre del viento"));
        System.out.println();

        System.out.println("--- Libros luego de los préstamos ---");
        System.out.println(biblioteca.mostrarLibro("Alicia en el pais de las maravillas"));
        System.out.println();
        System.out.println(biblioteca.mostrarLibro("El nombre del viento"));
        System.out.println();
    }
}
