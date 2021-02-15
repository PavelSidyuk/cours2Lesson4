import javax.swing.*;
import javax.swing.text.html.parser.Entity;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class NewChat extends JFrame {



    public  NewChat(){

        this.setTitle("Chat");
        this.setSize(500,500);
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(TheChatWindow());
        this.setVisible(true);

    }



    private JPanel TheChatWindow(){// окно чата

        JPanel theChatWindow = new JPanel();
        theChatWindow.setBackground(Color.white);
        theChatWindow.setLayout( new FlowLayout());
        theChatWindow.setPreferredSize(new Dimension(450,350));
        theChatWindow.setBorder(BorderFactory.createTitledBorder("История чата"));
        theChatWindow.setVisible(true);

        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPreferredSize(new Dimension(300,200));
        theChatWindow.add(textArea);


        JPanel inputString =new JPanel();
        inputString.setBackground(Color.white);
        inputString.setLayout( new FlowLayout());
        inputString.setPreferredSize(new Dimension(450,300));
        inputString.setBorder(BorderFactory.createTitledBorder("Поле ввода"));
        theChatWindow.add(inputString);
        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(400,20));
        inputString.add(input);
        inputString.setVisible(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(300,105));
        buttonPanel.setBackground(Color.white);

        JButton sendButton = new JButton("Отправить");
        buttonPanel.add(sendButton);
        buttonPanel.setVisible(true);

        sendButton.addActionListener(new ActionListener() {
            @Override
          public void actionPerformed (ActionEvent e) {

                    textArea.append(input.getText());


           }

        });

        inputString.add(buttonPanel);



        return theChatWindow;}



}

