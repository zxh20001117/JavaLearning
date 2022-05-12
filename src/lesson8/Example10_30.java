package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.applet.*;
public class Example10_30{
    public static void main(String args[]){
        new MusicWindow();
    }
}
class MusicWindow extends JFrame implements ActionListener{
    JButton [] musicButton;
    File musicFile;
    URI uri;
    URL url;
    AudioClip clip;
    String [] musicName={"1.au","2.au","3.au","4.au","5.au","6.au","7.au"};
    MusicWindow(){
        musicButton=new JButton[7];
        Box musicBox=Box.createHorizontalBox();
        for(int i=0;i<musicButton.length;i++){
            musicButton[i]=new JButton(""+(i+1));
            musicButton[i].addActionListener(this);
            musicBox.add(musicButton[i]);
        }
        setLayout(new FlowLayout());
        add(musicBox);
        setBounds(120,125,250,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        JButton button=(JButton)e.getSource();
        if(clip!=null) clip.stop();
        for(int i=0;i<musicButton.length;i++){
            if(button==musicButton[i]){
                musicFile=new File(musicName[i]);
                uri=musicFile.toURI();
                try { url=uri.toURL();
                }
                catch(Exception exp){}
            }
        }
        clip=Applet.newAudioClip(url);
        clip.play();
    }
}
