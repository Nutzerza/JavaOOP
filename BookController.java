import java.awt.event.*;
import javax.swing.*;
public class BookController implements ActionListener, WindowListener {
    private BookModel bm;
    private BookView bv;
    private AddView av;
    public BookController() {
        bv = new BookView();
        bm = new BookModel();
        init();
    }
    public void init() {
        bv.getbAdd().addActionListener(this);
        bv.getJFrame().addWindowListener(this);
        bv.getbNext().addActionListener(this);
        bv.getbBack().addActionListener(this);
        bv.getbDelete().addActionListener(this);
    }
    public void addListenerAV() {
        av.getbInsert().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bv.getbAdd())) {
            av = new AddView();
            addListenerAV();
        }
        else if (e.getSource().equals(bv.getbNext())) {
            int n = Integer.parseInt(bv.gettfNum().getText())+1;
            try {
                bv.setData(bm.getBook(n));
                bv.settfNum(""+n);
            } catch(Exception ex) {}
        }
        else if (e.getSource().equals(bv.getbBack())) {
            int n = Integer.parseInt(bv.gettfNum().getText())-1;
            if (n>=0) {
                bv.setData(bm.getBook(n));
                bv.settfNum(""+n);
            }
        }
        else if (e.getSource().equals(bv.getbDelete())) {
            int n = Integer.parseInt(bv.gettfNum().getText());
            bm.delData(n);
            if (n>0) {
                bv.setData(bm.getBook(n-1));
                bv.settfNum((n-1)+"");
            } else if(n==0) {
                try {
                    bv.setData(bm.getBook(n));
                    bv.settfNum((n)+"");
                } catch(Exception ex) {
                    bv.setData("", 0.0, "");
                }
            }
        }
        else if (e.getSource().equals(av.getbInsert())) {
            bm.addList(av.gettfName().getText(), Double.parseDouble(av.gettfPrice().getText()), av.getCombBox().getSelectedItem().toString());
            
            JOptionPane.showMessageDialog(null, "Dont it", "Add Command", JOptionPane.INFORMATION_MESSAGE);
            av.getJFrame().dispose();
        }
     }
    public static void main(String[] args) {
        new BookController();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (bm.loadData()) {
            bv.setData(bm.getBook(Integer.parseInt(bv.gettfNum().getText())));
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        bm.saveData();
    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
