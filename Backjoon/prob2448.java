import java.io.*;

public class prob2448 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer result = new StringBuffer();
		
		String input = br.readLine();
		int N = Integer.parseInt(input);
		int K = (int) (baseLog(2,N)- baseLog(2,3));
				
		String[] map = new String[N];
		map[0] = "  *  ";
		map[1] = " * * ";
		map[2] = "*****";
		
		//K=0 ¿∫ ¿ÃπÃ ∏∏µÎ
		for(int i = 1; i <= K; i++)
			makeBiggerStars(i,map);
			
		for(int i = 0; i < N; i++)
			result.append(map[i]+"\n");
		
		bw.write(result.toString());		
		bw.flush();
		bw.close();
	}

	public static void makeBiggerStars(int K, String[] map) {
		int currN = (int) (3 * Math.pow(2, K));
		//±‚¡ÿ ∏ ¿ª ±‚¡ÿ ∏  æ∆∑° øﬁ¬  ø¿∏•¬ ø° √‚∑¬«—¥Ÿ.
		int prevHeight = (int) (3 * Math.pow(2, K-1));
		for(int i = prevHeight; i < currN; i++) {
			map[i] = map[i-prevHeight] + " " + map[i-prevHeight];
		}
		
		//±‚¡ÿ ∏ ø° ∫Ì∑©≈© ¥ı«ÿ¡÷±‚
		int blankCount = currN / 2;	
		StringBuffer blank = new StringBuffer();
		for(int b = 0 ; b < blankCount; b++) // ±‚¡ÿ ∏  øﬁ¬  ∫Ûƒ≠ √§øÏ±‚
			blank.append(" ");
		for(int i = 0 ; i < prevHeight; i++)  //¡Ÿ
			map[i] = blank.toString() + map[i] + blank.toString();
	}
	
	public static double baseLog(double base, double x) {
		return Math.log10(x) / Math.log10(base);
	}
}

