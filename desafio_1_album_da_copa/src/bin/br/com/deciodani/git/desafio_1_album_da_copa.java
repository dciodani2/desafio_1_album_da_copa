package bin.br.com.deciodani.git;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class desafio_1_album_da_copa {

	public static void main(String[] args) {
	
		 	Scanner scan = new Scanner(System.in);

	        //System.out.print("Digite o número de espaços no álbum: ");
	        int numTotal = scan.nextInt();

	        //System.out.print("Digite o número de figurinhas compradas: ");
	        int numFigCompradas = scan.nextInt();

	        Set<Integer> setFig = new HashSet<>();

	        for (int i = 0; i < numFigCompradas; i++) {
	            //System.out.print("Digite o número da Figurinha: ");
	            setFig.add(scan.nextInt());
	        }
	        
	        int faltam_n_figurinhas = numTotal - setFig.size();
	        System.out.println(faltam_n_figurinhas);
	        
	        scan.close();
	}

}
