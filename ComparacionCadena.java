public class ComparacionCadena {

   public static void main(String[] args) {
        /*
         * la sentencia if
         * if (condicion) {
         *  instrucciones si la condicion es verdadera
         * } else {
         *  instrucciones si la condicion es falsa
         * }
         */
        String miFruta;
        System.out.println("Ingrese la fruta de su preferencia: ");
        miFruta = System.console().readLine();

        if ("manzana".equals(miFruta)) {
            System.out.println("iguales");
        } else {
            System.out.println("distintas");
        }
    }
}