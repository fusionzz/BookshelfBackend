package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private String author;
	private String s3location;
	
	Book() {}
	
	public Book(String title, String author, String s3Location){
		this.title = title;
		this.author = author;
		this.s3location = s3Location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getS3location() {
		return s3location;
	}

	public void setS3location(String s3location) {
		this.s3location = s3location;
	}

	@Override
	public String toString() {
		return "Book{" + this.id + " Title: " + this.title + " by " + this.author + "}";
	}
	
	

}
