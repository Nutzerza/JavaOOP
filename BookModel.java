import java.io.*;
import java.util.*;
public class BookModel {
    private Book data;
    private ArrayList list;
    public BookModel() {
        data = new Book("",0.0,"");
        list = new ArrayList();
    }
    public boolean loadData() {
        File f = new File("book.dat");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("book.dat");
                ObjectInputStream oin = new ObjectInputStream(fin);) {
                list = (ArrayList)oin.readObject();
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        return false;
    }
    public boolean saveData() {
        try (FileOutputStream fout = new FileOutputStream("book.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);) {
            oout.writeObject(list);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    public void addList(String name, double price, String type) {
        list.add(new Book(name, price, type));
        System.out.println(((Book)list.get(0)).getName());
        System.out.println(((Book)list.get(0)).getPrice());
        System.out.println(((Book)list.get(0)).getType());
    }
    public Book getBook(int n) {
        return (Book)list.get(n);
    }
    public void delData(int n) {
        list.remove(n);
    }
}
