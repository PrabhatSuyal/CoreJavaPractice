package ComparatorComparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorComparableEG2 {

	public static void main(String[] args) {
		List PList = new ArrayList<Player>();
		PList.add(new Player("bumrah",10));
		PList.add(new Player("kohli",103));
		PList.add(new Player("rohit",40));
		PList.add(new Player("pant",25));
		System.out.println(PList.toString());
		Collections.sort(PList);
		System.out.println(PList.toString());
	}
}

class Player implements Comparable<Player>{
	String name;
	int score;
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Player obj) {	
		return obj.score-this.score;		
	}
	@Override
	public String toString() {
		return name + "-" + score;
	}
}