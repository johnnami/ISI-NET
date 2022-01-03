package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class Test {
    private JFrame frame;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Test window = new Test();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Test() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Usuarios");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(168, 11, 138, 23);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblDisciplina = new JLabel("Nome");
        lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDisciplina.setBounds(64, 54, 47, 23);
        frame.getContentPane().add(lblDisciplina);


        JList list = new JList();
        list.setBounds(110, 135, 1, 1);
        frame.getContentPane().add(list);
    }
}