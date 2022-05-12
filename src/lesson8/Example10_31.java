package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.applet.*;
public class Example10_31 {
    public static void main(String args[]){
        new MusicWindow();
    }
}
class MusicWindow31 extends JFrame {
    Police listener;
    JButton [] musicButton;
    File musicFile;
    URI uri;
    URL url;
    AudioClip clip;
    String [] musicName={"1.au","2.au","3.au","4.au","5.au","6.au","7.au"};
    MusicWindow31(){
        musicButton=new JButton[7];
        Box musicBox=Box.createHorizontalBox();
        listener=new Police();
        for(int i=0;i<musicButton.length;i++){
            musicButton[i]=new JButton(""+(i+1));
            musicBox.add(musicButton[i]);
            InputMap inputmap =
                    musicButton[i].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            inputmap.put(KeyStroke.getKeyStroke(""+(i+1)),"dog");
            ActionMap actionmap=musicButton[i].getActionMap();
            actionmap.put("dog",listener);    // 指定listener是按钮键盘操作的监视器
        }
        setLayout(new FlowLayout());
        add(musicBox);
        setBounds(120,125,290,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class Police extends AbstractAction { //Police是内部类
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
}