//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestLibro {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Titulo");
        libro.setAutor("Autor");
        libro.setAnio(2018);

        //libro.mostrarInformacion();

        System.out.println("Titulo " + libro.getTitulo());
        System.out.println("Autor " + libro.getAutor());
        System.out.println("Anio " + libro.getAnio());
    }
}