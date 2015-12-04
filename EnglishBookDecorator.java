package patterns;

public class EnglishBookDecorator extends BookDecorator {

	EnglishBookDecorator(Book book) {
		super(book);
	}
	
	@Override
	public String describe() {
		return ("English " + super.describe());
	}
}
