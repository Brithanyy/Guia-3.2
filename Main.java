//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        autor.infoAutor();
        Libro libro = new Libro("Effective Java", 450,150,autor);
        libro.mostrarInfoLibro();
        libro.modificarPrecioLibro();
        libro.modificarStockLibro();
        libro.mostrarSoloInfoAutor();
        libro.mostrarInfoLibro();
        libro.precioLibro();
    }
}