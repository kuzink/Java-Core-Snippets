package streams;

import java.util.*;

public class Book {

	private Integer price;
	private String name;
	private List<Tag> tags;

	public Book(Integer price, String name, List<Tag> tags) {
		this.price = price;
		this.name = name;
		this.tags = tags;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return Objects.equals(price, book.price) &&
			Objects.equals(name, book.name) &&
			Objects.equals(tags, book.tags);
	}

	@Override
	public int hashCode() {

		return Objects.hash(price, name, tags);
	}

	@Override
	public String toString() {
		return "Book{" + "price=" + price + ", name='" + name + '\'' + ", tags=" + tags + '}';
	}
}
