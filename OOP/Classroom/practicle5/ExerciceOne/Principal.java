public class Principal {

  public static void main(String[] args) {
    Library lib = new Library(20);
    Book lib1 = new Book("Yann hackl", 605, 1, "java");
    Roman lib2 = new Roman(Price.GONCOURT, "Michel Guenassia", 770, 2, "Le Club des incorrigibles optimistes");
    Manuel lib3 = new Manuel(1, "mark vale", 60, 3, "junior tennis");
    lib.addDoc(lib1);
    lib.addDoc(lib2);
    lib.addDoc(lib3);
    System.out.println("\n\n\n");
    System.out.println("Author Name : \n");
    lib.streamAuthors();
    System.out.println("\n\n\n");
    System.out.println("les Documents valables : \n");

    lib.streamDocuments();

    System.out.println("\n\n\n");
  }

}
