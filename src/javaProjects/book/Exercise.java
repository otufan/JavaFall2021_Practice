package javaProjects.book;

import java.util.*;

public class Exercise {

	Book[] arrBook = new Book[6];

	public Exercise() {

	}

	public Exercise(String part) {

		Book b1 = new Book("AAA", "Aaaa", 20000);
		Book b2 = new Book("GGG", "GGaa", 10000);
		Book b3 = new Book("UUU", "Uuuu", 15000);
		Book b4 = new Book("KKK", "Kkkk", 50000);
		Book b5 = new Book("YYY", "Yyy", 20000);
		Book b6 = new Book("OOO", "Ooo", 10000);

		arrBook[0] = b1;
		arrBook[1] = b2;
		arrBook[2] = b3;
		arrBook[3] = b4;
		arrBook[4] = b5;
		arrBook[5] = b6;

		if (part.equals("6")) {
			part6();
		}
		if (part.equals("7")) {
			part7();
		}
		if (part.equals("8")) {
			part8();
		}
	}

	public static void main(String[] args) {
		Exercise e = new Exercise(args[0]);

	}

	public void part6() {
		System.out.println("unsortiert");
		List<Book> bA = new LinkedList<>(List.of(arrBook));
		aus(bA);

		System.out.println("----------------------------------");
		System.out.println("sortiert");
		Collections.sort(bA);
		aus(bA);
		System.out.println("----------------------------------");
		System.out.println("umgekehrte");
		Collections.sort(bA, Collections.reverseOrder());
		aus(bA);
	}

	public void part7() {
		
		System.out.println("---------------HashMap----------------------");
		HashMap<Integer, Book> hashMap = new HashMap<>();

		for (int i = 0; i < arrBook.length; i++) {
			hashMap.put(i, arrBook[i]);
		}

		for (Map.Entry<Integer, Book> book : hashMap.entrySet()) {
			System.out.println("HashMap - > " + book.getValue().getAuthor() + ": " + book.getValue().getTitle() + " "
					+ book.getValue().getIssue());
		}

		System.out.println("---------------TreeMap----------------------");

		TreeMap<Integer, Book> treeMap = new TreeMap<>(hashMap);

		for (Map.Entry<Integer, Book> tree : treeMap.entrySet()) {
			System.out.println("TreeMap - > " + tree.getValue().getAuthor() + ": " + tree.getValue().getTitle() + " "
					+ tree.getValue().getIssue());
		}

	}

	public void part8() {
		
		System.out.println("---------------HashSet----------------------");
		HashSet<Book> hashSet = new HashSet<>();

		for (int i = 0; i < arrBook.length; i++) {
			hashSet.add(arrBook[i]);
		}
		
		Book b1=new Book("KKK", "Kkkk", 50000);
		Book b2 = new Book("AAA", "Aaaa", 20000);
		Book b3 = new Book("GGG", "GGaa", 10000);
		hashSet.add(b1);
		hashSet.add(b2);
		hashSet.add(b3);
		
		Iterator iterHash = hashSet.iterator();

		while (iterHash.hasNext()) {
			System.out.println(iterHash.next().toString());

		}
		System.out.println("---------------TreeSet----------------------");
		TreeSet<Book> treeSet = new TreeSet<>(hashSet);
		
		Iterator iterTree = hashSet.iterator();

		while (iterTree.hasNext()) {
			System.out.println(iterTree.next().toString());

		}

	}

	public void aus(List<Book> arr) {

		Iterator iter = arr.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next().toString());

		}
	}

}
