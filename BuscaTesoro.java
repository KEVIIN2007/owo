import java.util.Arrays;

public class BuscaTesoro {
    public static void main(String[] args) {
final int VACIO = 0;
final int MINA = 1;
final int TESORO = 2;
final int INTENTO = 3;

int x;
int y;
int[][] cuadrante = new int[5][4];

for(x = 0; x < 4; x++) {
for(y = 0; y < 3; y++) {
cuadrante[x][y] = VACIO;
}
}

int minaX = (int)(Math.random() * 5);
int minaY = (int)(Math.random() * 4);
cuadrante[minaX][minaY] = MINA;0

int tesoroX;
int tesoroY;
do {
tesoroX = (int)(Math.random() * 5);
tesoroY = (int)(Math.random() * 4);
} while ((minaX == tesoroX) && (minaY == tesoroY));
cuadrante[tesoroX][tesoroY] = TESORO;

System.out.println("¡BUSCA EL TESORO!");

boolean salir = false;
String c = "";
do {
// pinta el cuadrante
for(y = 3; y >= 0; y--) {
System.out.print(y + "|");
for(x = 0; x < 5; x++) {
if (cuadrante[x][y] == INTENTO) {
System.out.print("X ");
} else {
System.out.print(" ");
}
}
System.out.println();
}
System.out.println(" ----------\n 0 1 2 3 4\n");

System.out.print("Coordenada x: ");
x = Integer.parseInt(System.console().readLine());
System.out.print("Coordenada y: ");
y = Integer.parseInt(System.console().readLine());


switch(cuadrante[x][y]) {
case VACIO:
cuadrante[x][y] = INTENTO;
break;
case MINA:
System.out.println("Lo siento, has perdido.");
salir = true;
break;
case TESORO:
System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
salir = true;
break;
default:
}
} while (!salir);


for(y = 3; y >= 0; y--) {
System.out.print(y + " ");
for(x = 0; x < 5; x++) {
switch(cuadrante[x][y]) {
case VACIO:


break;
case MINA:
c = "* ";
break;
case TESORO:
c = "€ ";
break;
case INTENTO:
c = "X ";
break;
default:
}
System.out.print(c);
}
System.out.println();
}
System.out.println(" ----------\n 0 1 2 3 4\n");
}
}
    

