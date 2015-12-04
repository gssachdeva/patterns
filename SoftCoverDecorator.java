package patterns;

public class SoftCoverDecorator extends BookDecorator {

	SoftCoverDecorator(Book book) {
		super(book);
	}
	
	@Override
	public String describe() {	
		return (super.describe() + " with Soft Cover");
	}
}
