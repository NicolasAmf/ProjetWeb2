package swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.EditorKit;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by jouenni1 on 06/05/14.
 */
public class FenetreCv extends JFrame
{
    public FenetreCv()
    {
        setTitle("fenetre de cv");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        char letter;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,1));
        JLabel label = new JLabel("");
        panel.add(label);
        TextArea ta = new TextArea();
        add(ta);

        try {
            //Charger la page
            URL url = new URL("http://projetweb.nicolasamf.cloudbees.net/rest/cv/truc");
            URLConnection uconnection = url.openConnection();
            InputStream input =  uconnection.getInputStream();

            while(input.available() > 0)
            {
                letter = (char) input.read();
                if(letter == '>')   label.setText(label.getText() +letter + "\n");
                else if(letter == '<') label.setText(label.getText() +"\n" + letter);
                else label.setText(label.getText()+letter);
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ta.setText(label.getText());
    }

    public static void main(String args[])
    {
        FenetreCv fenetrecv = new FenetreCv();
        fenetrecv.setVisible(true);

    }
}
