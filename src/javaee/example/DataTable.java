package javaee.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
@ApplicationScoped
public class DataTable {
	private String link;
	private String autor;
	private String tekst;
	private String info;
	private List<LinkEntity> linklist = new ArrayList<LinkEntity>();
	
	{
	linklist.add(new LinkEntity("www.onet.pl", "rafal", "głupi link"));
	linklist.add(new LinkEntity("www.pless.pl", "rafal", "głupi link"));
	}
	
	public List<LinkEntity> getLinklist() {
		return linklist;
	}
	public void setLinklist(List<LinkEntity> linklist) {
		this.linklist = linklist;
	}
	
	
	public String addLink() throws IOException {
		if(checkLink() == "true") {
		LinkEntity linek = new LinkEntity(link, autor, tekst);		
		linklist.add(linek);
		//info = autor;
		FacesContext.getCurrentInstance().getExternalContext().redirect("added.xhtml");
		clean();
		}
		return null;
	}
	
	public void clean() {
		setLink(null);
		setAutor(null);
		setTekst(null);	
	}
	
	public String checkLink()	{
		String one;
		if (getLink().isEmpty()) {
			info = "Brak linku";
			one = "false";
		return one;
		}
		if (getAutor().isEmpty()) {
			info = "Brak autora";
			one = "false";
		return one;
		}
		
		
		
		one = "true";
		return one;
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
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
