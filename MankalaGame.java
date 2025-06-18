import java.util.Random;
    import javax.swing.JOptionPane;
	public class MankalaGame {
        
        public static int dado() {
        
            Random dado = new Random ();
    	    int valorDado = dado.nextInt(6)+ 1;
            return valorDado;
        }

        public static int tablero(int[][] table) {
                
            return 4;
        }

    	public static void main(String[] args) {
    	int d;
        int [][] tablero = new int[2][6];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 4;
            }
        }


        int h = tablero(tablero);
        JOptionPane.showMessageDialog(null,"Bienvenido a Mankala Game");

        JOptionPane.showMessageDialog(null, "Las Reglas del Juego son las Sigueintes: \n 1. Se juega con un dado, el jugador con el mayor valor al lanzar el dado por primera vez empieza. \n 2. Para avanzar de posicion se debe mover segun el valor que obtenga al lanzar el dado, tomara todas las fichas");
    	
        int ID1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Presiona el numero 1 para lanzar el dado del primer jugador"));
    	d = dado();
    	JOptionPane.showMessageDialog(null,"El valor del dado es: "+ d);

        int ID2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Presiona el numero 2 para lanzar el dado del segundo jugador"));
    	d = dado();
    	JOptionPane.showMessageDialog(null,"El valor del dado es: "+ d);

        
    }
}