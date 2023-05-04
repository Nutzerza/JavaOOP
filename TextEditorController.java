import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class TextEditorController implements ActionListener {
    private TextEditor te;
    private String str;
    public TextEditorController() {
        te = new TextEditor();
        init();
    }
    public void init() {
        te.getMenuOpen().addActionListener(this);
        te.getMenuNew().addActionListener(this);
        te.getMenuSave().addActionListener(this);
        te.getMenuClose().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(te.getMenuOpen())) {
            str = "";
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(te.getJFrame());
            File f = fc.getSelectedFile();
            try (FileInputStream fin = new FileInputStream(f)) {
                int i = fin.read();
                while (i != -1) {
                    str += (char)i;
                    i = fin.read();  
                }
                te.getTextArea().setText(str);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource().equals(te.getMenuNew())) {
            te.getTextArea().setText("");
        }
        else if (e.getSource().equals(te.getMenuSave())) {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(te.getJFrame());
            File f = fc.getSelectedFile();
            try (FileOutputStream fout = new FileOutputStream(f)) {
                for(int i=0; i<te.getTextArea().getText().length(); i++) {
                    fout.write(te.getTextArea().getText().charAt(i));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getSource().equals(te.getMenuClose())) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new TextEditorController();
    }
}
