package notGeneric;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Archive {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "JK Rowling", "isbn123");

        Box box = new Box();

        box.putBook(book);
        box.printContents();

        Fossil fossil = new Fossil("Diplodocus", 145000000, false);
        Fossil fossil2 = new Fossil("Brachiosaurus", 179000000, false);
        FossilBox fossilBox = new FossilBox();
        fossilBox.putFossil(fossil);
        fossilBox.putFossil(fossil2);
        fossilBox.printContents();

    }
}