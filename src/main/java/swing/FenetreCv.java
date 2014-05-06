package swing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


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


        char[] tabChar = label.getText().toCharArray();
        boolean bool = true;
        boolean capteur = true;

        for(int i = 0; i< tabChar.length;i++)
        {
            if(tabChar[i] == '<' && tabChar[i+1] == 'c' && tabChar[i+2] == 'v' && tabChar[i+3] == '>' && bool)
            {//Debut des cv
                ta.setText(ta.getText()+"\t\tLISTE DES CV \n\n\n");
                bool = false;
            }
            else
            {
                if(tabChar[i] == '<' && tabChar[i+1] == 'c' && tabChar[i+2] == 'v' && tabChar[i+3] == '>')
                {
                    ta.setText(ta.getText()+"\t-CV- \n\n");
                }

                if(tabChar[i] == '<' && tabChar[i+1] == 'a' && tabChar[i+2] == 'g' && tabChar[i+3] == 'e' && tabChar[i+4] == '>')
                {
                    ta.setText(ta.getText()+"Age : ");

                    for(int j = i+5;capteur;j++)
                    {
                        if(tabChar[j] == '<' && tabChar[j+1] == '/' && tabChar[j+2] == 'a' && tabChar[j+3] == 'g' && tabChar[j+4] == 'e' && tabChar[j+5] == '>') capteur = false;
                       else ta.setText(ta.getText()+tabChar[j]);
                     }
                     capteur = true;
                     ta.setText(ta.getText()+"\n\n");

                 }
                if(tabChar[i] == '<' && tabChar[i+1] == 'e' && tabChar[i+2] == 'd' && tabChar[i+3] == 'u' && tabChar[i+4] == 'c'  && tabChar[i+5] == 'a' && tabChar[i+6] == 't' && tabChar[i+7] == 'i' && tabChar[i+8] == 'o' && tabChar[i+9] == 'n' && tabChar[i+10] == 's' && tabChar[i+11] == '>')
                {
                    ta.setText(ta.getText()+"Education : ");

                    for(int j = i+12;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }
                if(tabChar[i] == '<' && tabChar[i+1] == 'e' && tabChar[i+2] == 'x' && tabChar[i+3] == 'p' && tabChar[i+4] == 'e'  && tabChar[i+5] == 'r' && tabChar[i+6] == 'i' && tabChar[i+7] == 'e' && tabChar[i+8] == 'n' && tabChar[i+9] == 'c' && tabChar[i+10] == 'e' && tabChar[i+11] == 's' && tabChar[i+12] == '>')
                {
                    ta.setText(ta.getText()+"Experiences : ");

                    for(int j = i+13;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }
                //nom
                if(tabChar[i] == '<' && tabChar[i+1] == 'f' && tabChar[i+2] == 'i' && tabChar[i+3] == 'r' && tabChar[i+4] == 's'  && tabChar[i+5] == 't' && tabChar[i+6] == 'N' && tabChar[i+7] == 'a' && tabChar[i+8] == 'm' && tabChar[i+9] == 'e' && tabChar[i+10] == '>')
                {
                    ta.setText(ta.getText()+"nom : ");

                    for(int j = i+11;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }
                //language connu
                if(tabChar[i] == '<' && tabChar[i+1] == 'l' && tabChar[i+2] == 'a' && tabChar[i+3] == 'n' && tabChar[i+4] == 'g')
                {
                    ta.setText(ta.getText()+"langage(s) connu(s) : ");

                    for(int j = i+20;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }
                //motivations
                if(tabChar[i] == '<' && tabChar[i+1] == 'm' && tabChar[i+2] == 'o' && tabChar[i+3] == 't' && tabChar[i+4] == 'i')
                {
                    ta.setText(ta.getText()+"motivation : ");

                    for(int j = i+12;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }
                //name
                if(tabChar[i] == '<' && tabChar[i+1] == 'n' && tabChar[i+2] == 'a' && tabChar[i+3] == 'm' && tabChar[i+4] == 'e')
                {
                    ta.setText(ta.getText()+"name : ");

                    for(int j = i+6;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }

                //sexe
                if(tabChar[i] == '<' && tabChar[i+1] == 's' && tabChar[i+2] == 'e' && tabChar[i+3] == 'x' && tabChar[i+4] == 'e')
                {
                    ta.setText(ta.getText()+"sexe : ");

                    for(int j = i+6;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }

                //objectif
                if(tabChar[i] == '<' && tabChar[i+1] == 'o' && tabChar[i+2] == 'b' && tabChar[i+3] == 'j' && tabChar[i+4] == 'e')
                {
                    ta.setText(ta.getText()+"objectif : ");

                    for(int j = i+10;capteur;j++)
                    {
                        if(tabChar[j] == '<') capteur = false;
                        else ta.setText(ta.getText()+tabChar[j]);
                    }
                    capteur = true;
                    ta.setText(ta.getText()+"\n\n");
                }


                //fin cv
                if(tabChar[i] == '<' && tabChar[i+1] == '/' && tabChar[i+2] == 'c' && tabChar[i+3] == 'v' && tabChar[i+4] == '>')
                {
                        ta.setText(ta.getText()+"\t -FIN DU CV- \n\n");
                }
             }
        }

    }

    public static void main(String args[])
    {
        FenetreCv fenetrecv = new FenetreCv();
        fenetrecv.setVisible(true);

    }
}
