public class DimeTuNombre {

    public static void main(String[] args) {
       //variable para almacenar el nombre
        String nombre;
        //Mensaje
        System.out.println("Por favor, escribe tu nombre");
        //
        nombre = System.console().readLine();
        System.out.println("Hola "+nombre+", es un gusto conocerte!!!");
    }
}