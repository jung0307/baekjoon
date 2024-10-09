import java.io.*;

public class Main {
	
	static class RGB {
		short r, g, b;
		
		RGB(short r, short g, short b) {
			this.r = r;
			this.g = g;
			this.b = b;
		}
		
		private int intensity_function() {
			return 2126 * (int)r + 7152 * (int)g + 722 * (int)b;
		}
		
		char ascii() {
			int v = intensity_function();
			if(v >= 0 && v < 510_000) return '#';
			else if(v >= 510_000 && v < 1_020_000) return 'o';
			else if(v >= 1_020_000 && v < 1_530_000) return '+';
			else if(v >= 1_530_000 && v < 2_040_000) return '-';
			else if(v >= 2_040_000) return '.';
			else throw new IllegalStateException();
		}
	}
	
	
	static RGB[][] color_table;
	static short N, M; // N 세로 길이, M 가로 길이
	
	static boolean input() {
		boolean status;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String t = br.readLine();
			String[] arr = t.split("\\s+");
			N = Short.parseShort(arr[0]);
			M = Short.parseShort(arr[1]);
			
			color_table = new RGB[N][M];
			for(int i = 0; i < N; i++) {
				t = br.readLine();
				arr = t.split("\\s+");
				for(int j = 0; j < M; j++) {
					int c = j * 3;
					color_table[i][j] = new RGB(Short.parseShort(arr[c]), Short.parseShort(arr[c + 1]), Short.parseShort(arr[c + 2]));
				}
			}
			
			status = true;
		} catch(ArrayIndexOutOfBoundsException e) {
			status = false;
		} catch(NumberFormatException e) {
			status = false;
		} catch(IOException e) {
			status = false;
		}
		
		return status;
	}
	
	
	static void print_ascii_art() {
		char[][] arr = new char[N][M];
		
		for(int row = 0; row < N; row++) {
			for(int col = 0; col < M; col++) {
				arr[row][col] = color_table[row][col].ascii();
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		if(input()) {
			print_ascii_art();
		}
		
	}

}
