package javaee.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linki")
public class LinkEntity { //Klasa encji
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String link;
	private String autor;
	private String tekst;

	
	public LinkEntity() {
		
	}
	
	public LinkEntity(String link, String autor, String text) {
		this.link = link;
		this.autor = autor;
		this.tekst = text;		
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
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}




}
