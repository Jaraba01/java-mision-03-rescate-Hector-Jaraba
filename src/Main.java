import java.util.Random;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    char[][] matriz = new char[10][10];
    int vidas = 10;
    for(int fila = 0;fila< matriz.length; fila++){
      for(int columna = 0; columna< matriz.length; columna++){
        matriz[fila][columna] = '*';
      }
    }


    char ROBOT = 'R';
    matriz[0][0] = ROBOT;


    char META = 'M';
    matriz[9][9]= META;


    char BATERIA = 'B';
    Random aleatorio = new Random();
    int filaaleatoria = aleatorio.nextInt(10);
    int columnaaleatoria = aleatorio.nextInt(10);
    matriz[filaaleatoria][columnaaleatoria] = BATERIA;


    char OBSTACULO = 'X';
    int filaaleatoria2;
    int columnaaleatoria2;
    for(int i =0; i<5; i++){
      do{
        filaaleatoria2 = aleatorio.nextInt(10);
        columnaaleatoria2 = aleatorio.nextInt(10);
      } while(matriz[filaaleatoria2][columnaaleatoria2] != '*');
      matriz[filaaleatoria2][columnaaleatoria2] = OBSTACULO;
    }
    System.out.println();
    System.out.println();


    for(int fila = 0;fila<matriz.length; fila++){
      for(int columna = 0; columna< matriz.length; columna++){
        System.out.print(matriz[fila][columna] + " ");
      }
      System.out.println();
    }
    System.out.println("Tu jugador se encuentra en la casilla 0,0");
    System.out.println(" Y te puedes desplazar con las letras W A S D");
    int filarobot= 0;
    int columnarobot = 0;
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Dime una letra: ");
      char desplazamiento = sc.next(). charAt(0);
      System.out.println("La letra elegida es " + desplazamiento);
      matriz[filarobot][columnarobot] = ROBOT;
      if (desplazamiento == 'W') {
        matriz[filarobot][columnarobot] = '*';
        filarobot = filarobot - 1;
        if (matriz[filarobot][columnarobot] == 'X') {
          System.out.println("Movimiento bloqueado");
          columnarobot--;
        }
        if (matriz[filarobot][columnarobot] == 'B') {
          vidas = vidas + 2;
          System.out.println("Ahora tienes " + vidas + " vidas");
        }
        if (matriz[filarobot][columnarobot] == 'M') {
          System.out.println("Rescate completado!!!");
        }
       matriz[filarobot][columnarobot] = ROBOT;
      }
      if (desplazamiento == 'A') {
        matriz[filarobot][columnarobot] = '*';
        columnarobot = columnarobot - 1;
        if (matriz[filarobot][columnarobot] == 'X') {
          System.out.println("Movimiento bloqueado");
          columnarobot--;
        }
        if (matriz[filarobot][columnarobot] == 'B') {
          vidas = vidas + 2;
          System.out.println("Ahora tienes " + vidas + " vidas");
        }
        if (matriz[filarobot][columnarobot] == 'M') {
          System.out.println("Rescate completado!!!");
        }
        matriz[filarobot][columnarobot] = ROBOT;
      }
      if (desplazamiento == 'S') {
        matriz[filarobot][columnarobot] = '*';
        filarobot = filarobot + 1;
        if (matriz[filarobot][columnarobot] == 'X') {
          System.out.println("Movimiento bloqueado");
          columnarobot--;
        }
        if (matriz[filarobot][columnarobot] == 'B') {
          vidas = vidas + 2;
          System.out.println("Ahora tienes " + vidas + " vidas");
        }
        if (matriz[filarobot][columnarobot] == 'M') {
          System.out.println("Rescate completado!!!");
        }
        matriz[filarobot][columnarobot] = ROBOT;
      }
      if (desplazamiento == 'D') {
        matriz[filarobot][columnarobot] = '*';
        columnarobot = columnarobot + 1;
        if (matriz[filarobot][columnarobot] == 'X') {
          System.out.println("Movimiento bloqueado");
          columnarobot--;
        }
        if (matriz[filarobot][columnarobot] == 'B') {
          vidas = vidas + 2;
          System.out.println("Ahora tienes " + vidas + " vidas");
        }
        if (matriz[filarobot][columnarobot] == 'M') {
          System.out.println("Rescate completado!!!");
        }

        matriz[filarobot][columnarobot] = ROBOT;

      }
      matriz[filarobot][columnarobot] = ROBOT;
      if((columnarobot+1)>9){
        System.out.println("¡¡EHH!! QUE TE VAS DEL LIMITE DEL TABLERO!!");
      }
      if((filarobot+1)>9){
        System.out.println("¡¡EHH!! QUE TE VAS DEL LIMITE DEL TABLERO!!");
      }
      if (desplazamiento != 'D' && desplazamiento != 'S' && desplazamiento != 'W' && desplazamiento != 'A') {
        System.out.println("Letra equivocada");
      }
      System.out.println("Tienes "+vidas+" vidas");
      for(int fila = 0;fila<matriz.length; fila++){
        for(int columna = 0; columna< matriz.length; columna++){
          System.out.print(matriz[fila][columna] + " ");
        }
        System.out.println();
      }
    }while(vidas!=0);
  }
}
