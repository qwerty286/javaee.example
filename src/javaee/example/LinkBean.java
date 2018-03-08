package javaee.example;

import java.io.IOException;
import java.util.List;
import javaee.example.*;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LinkBean { //Bean do polaczenia z facetem (jsf)
	private int id;
	public String link;
	public String autor;
	public String tekst;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String text) {
		this.tekst = text;
	}
	
	public List getLinksDB() {
		return DataTable.getAllLinks();
	}
	
	public void insertLinkToDB(LinkBean lb) throws IOException {
		DataTable.insertIntoDB(lb.getLink(), lb.getAutor(), lb.getTekst());
		FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "added.xhtml");
		
	}
	
}
