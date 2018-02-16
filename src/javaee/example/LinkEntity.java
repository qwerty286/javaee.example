package javaee.example;



public class LinkEntity {
	
	private String link;
	private String autor;
	private String text;

	
	public LinkEntity() {
		
	}
	
	public LinkEntity(String link, String autor, String text) {
		this.link = link;
		this.autor = autor;
		this.text = text;		
	}
	
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}




}
