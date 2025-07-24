public class Array05 {
    public static void main(String[] args) {
        double[] nota = new double[4];
System.out.println("Para calcular la nota media necesito saber la ");
System.out.println("nota de cada uno de tus exámenes.");
for (int i = 0; i < 4; i++) {
System.out.print("Nota del examen no " + (i + 1) + ": ");
nota[i] = Double.parseDouble(System.console().readLine());
}
    }
    
}
