public class Library {
  private int nbDoc;
  private Document[] docs;

  public Library(int capacity) {
    nbDoc = 0;
    docs = new Document[capacity];
  }

  public void streamDocuments() {
    for (int i = 0; i < this.nbDoc; i++) {
      System.out.println(this.docs[i].toString());
    }
  }

  public Document document(int x) {
    do {
      if (x < nbDoc) {
        return this.docs[x - 1];
      }
    } while (x > nbDoc);
    return this.docs[x - 1];
  }

  public boolean addDoc(Document doc) {
    if (this.nbDoc < this.docs.length) {
      this.docs[nbDoc++] = doc;
      return true;
    } else {
      return false;
    }
  }

  public boolean deleteDoc(Document doc) {
    for (int i = 0; i < nbDoc; i++) {
      if (this.docs[i] == doc) {
        return true;
      }
    }
    return false;
  }

  public void streamAuthors() {
    Book book;
    for (int i = 0; i < nbDoc; i++) {
      if (this.docs[i] instanceof Book) {
        book = (Book)this.docs[i];
        System.out.println(book.getAuthor());
      }
    }
  }

}
