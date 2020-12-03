package day2;

public class Record {
	int min;
	int max;
	char letter;
	String sequence;

	public Record(int m, int mm, char l, String s) {
		this.min = m;
		this.max = mm;
		this.letter = l;
		this.sequence = s;
	}

	public boolean isValid() {
		int countLetter = 0;
		
		for (int i = 0; i < sequence.length(); ++i) {
			if(sequence.charAt(i) == this.letter) {
				countLetter++;
			}
		}
		if(countLetter >= this.min && countLetter <= this.max) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Record [min=" + min + ", max=" + max + ", letter=" + letter + ", sequence=" + sequence + "]";
	}
}