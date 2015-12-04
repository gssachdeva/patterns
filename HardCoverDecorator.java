package patterns;

public class HardCoverDecorator extends BookDecorator {
	
	HardCoverDecorator(Book book) {
		super(book);
	}
	
	@Override
	public String describe() {	
		return (super.describe() + " with Hard Cover");
	}
}
