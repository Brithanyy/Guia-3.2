 public class Libro {
    private String titulo;
    private int precio;
    private int stock;
    private Autor autor;

     public Libro(String titulo, int precio, int stock, Autor autor) {
         this.titulo = titulo;
         this.precio = precio;
         this.stock = stock;
         this.autor = autor;
     }

     public String getTitulo() {
         return titulo;
     }

     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }

     public int getPrecio() {
         return precio;
     }

     public void setPrecio(int precio) {
         this.precio = precio;
     }

     public int getStock() {
         return stock;
     }

     public void setStock(int stock) {
         this.stock = stock;
     }

     public Autor getAutor() {
         return autor;
     }

     public void setAutor(Autor autor) {
         this.autor = autor;
     }

     public void mostrarInfoLibro(){
         System.out.println("-----------------------------------------");
         System.out.println("Libro: " + this.titulo);
         System.out.println("Precio: " + this.precio);
         System.out.println("Stock: " + this.stock);
         System.out.println("Nombre Autor: " + this.autor.getNombre());
         System.out.println("Apellido Autor: " + this.autor.getApellido());
         System.out.println("Mail Autor: " + this.autor.getEmail());
         System.out.println("Genero Autor: " + this.autor.getGenero());
         System.out.println("-----------------------------------------");
     }
     public void modificarPrecioLibro(){
         this.precio = 500;
     }
     public void modificarStockLibro(){
         this.stock = 50;
     }
     public void mostrarSoloInfoAutor(){
         System.out.println("-----------------------------------------");
         System.out.println("Nombre Autor: " + this.autor.getNombre());
         System.out.println("Apellido Autor: " + this.autor.getApellido());
         System.out.println("Mail Autor: " + this.autor.getEmail());
         System.out.println("Genero Autor: " + this.autor.getGenero());
         System.out.println("-----------------------------------------");
     }

     public void precioLibro(){
         System.out.println("El libro,  " + this.titulo + " de " + this.autor.getNombre() + this.autor.getApellido() + " Se vende a " + this.precio + " Pesos");
     }
 }
