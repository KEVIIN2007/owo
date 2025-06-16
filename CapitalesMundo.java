public class CapitalesMundo {

   public static void main(String[] args) {
        String respuesta;

        System.out.println("¿Cuál es la capital de Italia?");
        respuesta = System.console().readLine();

        if (respuesta.equals("roma")) {
            System.out.println("La respuesta es correcta!!!");
        } else {
            System.out.println("Lo siento, la respuesta es incorrecta!!!");
        }
    }
}   