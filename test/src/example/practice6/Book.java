package example.practice6;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book(){
		super();
	}
	
	public Book(String title,String publisher,String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title,String publisher,String author,int price,double discountRate) {
		this(title,publisher,author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println("제목 : "+title+"\n"+"출판사 : "+publisher+"\n"+"작가 : "+author+
				"\n"+"가격 : "+price+"\n"+"할인율 : "+discountRate);
		
	}
	
	

}
