package patterns;

public class ScienceBookDecorator extends BookDecorator {
	
	ScienceBookDecorator(Book book) {
		super(book);
	}
	
	@Override
	public String describe() {	
		return ("Science " + super.describe());
	}
}
