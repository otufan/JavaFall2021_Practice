package javaProjects.book;

public class Book implements Comparable<Book> {

	private String author;
	private String title;
	private int issue;

	public Book() {

	}

	public Book(String author, String title, int issue) {

		setAuthor(author);
		setTitle(title);
		setIssue(issue);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return author + ": '" + title + "' " + " Auflage:" + issue + " Stueck";
	}

	@Override
	public int compareTo(Book o) {

		if (o == null || this.getClass() != o.getClass()) {

			return -1;
		}

		int i = getAuthor().compareTo(o.getAuthor());

		if (i != 0) {
			return i;
		} else {
			i = getTitle().compareTo(o.getTitle());
			if (i != 0) {
				return i;
			} else {
				i = getIssue() - o.getIssue();
				if (i != 0) {
					return i;
				} else {
					return i;
				}

			}

		}

	}

	@Override
	public int hashCode() {
		return getAuthor().hashCode()+getTitle().hashCode()+getIssue();
	}

	@Override
	public boolean equals(Object o) {

		if (o == null || this.getClass() != o.getClass()) {
			return false;
		} else {
			Book other = (Book) o;

			return this.getAuthor().equals(other.getAuthor()) && this.getTitle().equals(other.getTitle())
					&& this.getIssue() == other.getIssue();
		}
	}

}
