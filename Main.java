abstract class Libraryitem{
	private String title;
	private String itemid;
	private boolean checkout;
	
	public Libraryitem(String title,String itemid){
		this.title=title;
		this.itemid=itemid;
		this.checkout=false;
	}
	
	public void settitle(String title){
		this.title=title;
	}
	public void setitemid(String itemid){
		this.itemid=itemid;
	}
	
	public void checkout(){
		if(checkout!=checkout){
			checkout=true;
			System.out.println(title+" checked out.");
		}
		else{
			System.out.println(title+" is already cheaked out.");
		}
	}
	public void checkin(){
		if(checkout=checkout){
			checkout=false;
			System.out.println(title+" checked in");
		}
		else{
			System.out.println(title+" is already checked in.");
		}
	}
	public void displayitemdetails(){
		System.out.println("Item: "+title);
		System.out.println("Item ID: "+itemid);
		System.out.println("Check out: "+checkout);
	}
}
class Book extends Libraryitem{
	private String author;
	private int numpages;
	
	public Book(String title,String itemid,String author,int numpages){
		super(title,itemid);
		this.author=author;
		this.numpages=numpages;
	}
	public void setauthor(String author){
		this.author=author;
	}
	public void setnumpages(int numpages){
		this.numpages=numpages;
	}
	public void displayItemDetails() {
        super.displayitemdetails();
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numpages);
    }
	
}
class Magazine extends Libraryitem{
	private String issuedate;
	private String publisher;
	
	public Magazine(String title,String itemid,String issuedate,String publisher){
		super(title,itemid);
		this.issuedate=issuedate;
		this.publisher=publisher;
	}
	public void setissuedate(String issuedate){
		this.issuedate=issuedate;
    }
	public void setpublisher(String publisher){
		this.publisher=publisher;
	}
	public void displayItemDetails() {
        super.displayitemdetails();
        System.out.println("Issue Date: " + issuedate);
        System.out.println("Publisher: " + publisher);
    }
	
}
class Librarymember{
	private String memberid;
	private String name;
	
	public Librarymember(String memberid,String name){
		this.memberid=memberid;
		this.name=name;
	}
	public void setmemberid(String memberid){
		this.memberid=memberid;
	}
	public void setname(String name){
		this.name=name;
	}
	public void displayMemberDetails(){
		System.out.println("Member ID: " + memberid);
        System.out.println("Name: " + name);
	}
}
class Main{
	public static void main(String args[]){
		Book b1=new Book("The Catcher in the Rye","B001","J.D.Salinger",240);
		Book b2=new Book("To Kill a Mockingbird","B002","Harper Lee",281);
		Book b3=new Book("1984","B003","George Orwell",328);
		Book b4=new Book("Pride and Perjudice","B004","Jane Austen",432);
		Book b5=new Book("The Hobbit","B005","J.R.R.Tolkien",320);
		
		Magazine m1 =new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		Magazine m2 =new Magazine("Time","M002","September 2023","Time USA,LLC");
		Magazine m3 =new Magazine("Forbes","M003","June 2023","Forbes Media");
		Magazine m4 =new Magazine("Vogue","M004","July 2023","Conde Nast");
		Magazine m5 =new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		Librarymember l1=new Librarymember("L001","John Doe");
		Librarymember l2=new Librarymember("L002","Jane Smith");
		Librarymember l3=new Librarymember("L003","David Johnson");
		Librarymember l4=new Librarymember("L004","Sarah Williams");
		Librarymember l5=new Librarymember("L005","Michael Brown");
		
		b1.checkout();
		b1.checkin();
		
		System.out.println("Books:");
        b1.displayItemDetails();
        b2.displayItemDetails();
        b3.displayItemDetails();
        b4.displayItemDetails();
        b5.displayItemDetails();
		
		System.out.println("\nMagazines:");
        m1.displayItemDetails();
        m2.displayItemDetails();
        m3.displayItemDetails();
        m4.displayItemDetails();
        m5.displayItemDetails();
		
		System.out.println("\nLibrary Members:");
        l1.displayMemberDetails();
        l2.displayMemberDetails();
        l3.displayMemberDetails();
        l4.displayMemberDetails();
        l5.displayMemberDetails();
	}
}