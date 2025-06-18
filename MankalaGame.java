import java.util.Random;
import javax.swing.JOptionPane;
public class MankalaGame { 
	//Declaracion de variables globales
	static int [][] tablero = new int[2][6];
	
	public static int dado() {
            Random dado = new Random ();
    	    int valorDado = dado.nextInt(6)+ 1;
            return valorDado;
        }

        public static void moverTablero(int turno) {
	int d=0;
	bool validacion = false;
	//Impresion del tablero
	String impreT = "__________Tablero__________\n" + 
	"___"+ 1 +"_____|_____"+ 2 +"_____|_____"+ 3 +"_____|_____"+ 4 +"_____|_____"+ 5 +"_____|_____"+ 6+"\n" + 	
        "___"+ tablero[0][0] +"_____|_____"+ tablero[0][1] +"_____|_____"+ tablero[0][2] +"_____|_____"+ tablero[0][3] +"_____|_____"+ tablero[0][4] +"_____|_____"+ tablero[0][5]+"\n" + 
        "___"+ tablero[1][0] +"_____|_____"+ tablero[1][1] +"_____|_____"+ tablero[1][2] +"_____|_____"+ tablero[1][3] +"_____|_____"+ tablero[1][4] +"_____|_____"+ tablero[1][5]+"\n" + 
	"___"+ 7 +"_____|_____"+ 8 +"_____|_____"+ 9 +"_____|_____"+ 10 +"_____|_____"+ 11 +"_____|_____"+ 12+"\n" + 	
        "----------------------------------------------------------------------------------------------"; 
	JOptionPane.showMessageDialog(null, impreT , "TABLERO", JOptionPane.INFORMATION_MESSAGE);

	do{
		int m1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Presiona eL espacio que desea mover"));
		if(t == 1 && (m1 >= 1 && m<=6)){
			validacion = false;
		}else if(t == 2 && (m >= 7 && m<=12){
			validacion = false;
		}else{
			JOptionPane.showMessageDialog(null,"Opcion equivocada, vuelva a introducirlo");
			validacion = true;
		}
	}while(validacion);
    	int d = dado();
	m1 = m1 + d
	if(m1 )
	
	}

    	public static void main(String[] args) {
	
	int j1=0, j2=0,t=0;
		
	//Llenado de los espacios con las fichas
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 4;
            }
        }

	//Bienvenida y reglas
        int h = tablero(tablero);
        JOptionPane.showMessageDialog(null,"Bienvenido a Mankala Game");

        JOptionPane.showMessageDialog(null, "Las Reglas del Juego son las Sigueintes: \n 1. Se juega con un dado, el jugador con el mayor valor al lanzar el dado por primera vez empieza. \n 2. Para avanzar de posicion se debe mover segun el valor que obtenga al lanzar el dado, tomara todas las fichas");
    	
        int ID1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Presiona el numero 1 para lanzar el dado del primer jugador"));
    	j1 = dado();
    	JOptionPane.showMessageDialog(null,"El valor del dado es: "+ d);

        int ID2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Presiona el numero 2 para lanzar el dado del segundo jugador"));
    	j2 = dado();
    	JOptionPane.showMessageDialog(null,"El valor del dado es: "+ d);
	
	if(j1 > j2){
		t = 1;
		JOptionPane.showMessageDialog(null,"El jugador 1 empieza");
	}else{
		t = 2;
		JOptionPane.showMessageDialog(null,"El jugador 2 empieza");
	}
		
	do{
		
	}while();
    }
}
