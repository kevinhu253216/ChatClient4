
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient4 extends Frame {

    TextField tfTxt = new TextField();
    TextArea taContent = new TextArea();

    public static void main(String[] args){
        ChatClient4 cc = new ChatClient4();
        cc.launchFrame();
    }

    public void launchFrame(){
        setLocation(400,300);
        setSize(300,300);
        add(taContent, BorderLayout.NORTH);
        add(tfTxt,BorderLayout.SOUTH);
        pack();
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0){
                System.exit(0);
            }
        });
        tfTxt.addActionListener(new TFListener()); //add this inner class
        setVisible(true);
    }

    private class TFListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tfTxt.getText().trim();
            taContent.setText(s); //set Text into TextArea
            tfTxt.setText("");// delete the String at TextField
        }
    }

}
