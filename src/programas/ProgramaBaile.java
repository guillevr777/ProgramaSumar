package programas;

public class ProgramaBaile {
	public static void main(String[] args) throws InterruptedException {
		 String[] poses = {
	                "    O     \n   /|\\   \n   / \\   \n",
	                "   \\O/    \n    |     \n   / \\   \n",
	                "    O/    \n   /|     \n   / \\   \n",
	                "   \\O     \n    |\\    \n   / \\   \n"
	        };
      
       // Animación en bucle
       while (true) {
           for (String pose : poses) {
               // Limpiar pantalla
               System.out.print("\033[H\033[2J");
               System.out.flush();

               // Mostrar la pose
               System.out.println(pose);

               // Pausa entre cada frame (animación)
               Thread.sleep(300); // 300 ms de pausa
           }
       }
   }
}

