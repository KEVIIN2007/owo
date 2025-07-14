public class Aleatorio2 {

    public static void main(String[] args) {
        System.out.println("genera al azar un dia de la semana");
        
        int mano = (int) (Math.random() *7);

        switch (mano) {
            case 0:
            System.out.println("lunes");
            break;
            case 1:
            System.out.println("martes");
            break;
            case 2:
            System.out.println("miercoles");
            break;
            case 3:
            System.out.println("jueves");
            break;
            case 4:
            System.out.println("viernes");
            break;
            case 5:
            System.out.println("sabado");
            break;
            case 6:
            System.out.println("domingo");
            default:
            break;
                
        
        }
    }
    
}
