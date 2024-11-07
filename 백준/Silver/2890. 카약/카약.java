import java.util.*;

public class Main {
	
	private static int r, c;
	private static String[] photo;
	
	private static boolean input() {
		boolean state;
		
		try(Scanner kb = new Scanner(System.in)) {
			r = kb.nextInt();
			c = kb.nextInt();
			photo = new String[r];
			
			for(int i = 0; i < r; i++) {
				photo[i] = kb.next();
			}
			state = true;
		} catch(Exception e) {
			state = false;
		}
		return state;
	}
	
	static class Boat {
		int number;
		int location;
		int rank;
		
		Boat(int number, int location) {
			this.number = number;
			this.location = location;
		}
		
		static Boat parseBoat(String s) {
			for(int i = s.length() - 2; i > 0; i--) {
				char c = s.charAt(i);
				if(c >= '1' && c <= '9') {
					return new Boat(c - '0', i);
				}
			}
			return null;
		}
	}
	
	private static void solve() {
		List<Boat> list = new ArrayList<>();
		
		for(int i = 0; i < r; i++) {
			Boat boat = Boat.parseBoat(photo[i]);
			if(boat != null) list.add(boat);
		}
		
		list.sort(new Comparator<Boat>() {

			@Override
			public int compare(Boat a, Boat b) {
				return Integer.compare(b.location, a.location);
			}
			
		});
		
		int rank = 1;
		
		list.get(0).rank = rank;
		
		Iterator<Boat> it = list.iterator();
		Boat prev = null;
		
		if(it.hasNext()) {
			prev = it.next();

			while(it.hasNext()) {
				Boat curr = it.next();
				
				if(prev.location == curr.location) curr.rank = prev.rank;
				else curr.rank = ++rank;
				prev = curr;
			}
		}
		
		list.sort(new Comparator<Boat>() {

			@Override
			public int compare(Boat a, Boat b) {
				return Integer.compare(a.number, b.number);
			}
			
		});
		
		list.forEach(x -> { System.out.println(x.rank); });
	}

	public static void main(String[] args) {
		if(input()) solve();
	}

}
