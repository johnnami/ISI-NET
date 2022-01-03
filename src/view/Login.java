package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login {
    private JFrame frame;
    private JTextField tfNome;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblBemVindo = new JLabel("Bem vindo!");
        lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblBemVindo.setBounds(168, 11, 127, 40);
        frame.getContentPane().add(lblBemVindo);

        JLabel lblNome = new JLabel("Id do usuario:");
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNome.setBounds(12, 89, 102, 15);
        frame.getContentPane().add(lblNome);

        tfNome = new JTextField();
        tfNome.setBounds(108, 87, 249, 19);
        frame.getContentPane().add(tfNome);
        tfNome.setColumns(10);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSenha.setBounds(12, 117, 78, 15);
        frame.getContentPane().add(lblSenha);

        JButton btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println();
            }
        });
        btnLogin.setBounds(240, 185, 117, 25);
        frame.getContentPane().add(btnLogin);

        JRadioButton rdbtnUsuario = new JRadioButton("Usuario");
        rdbtnUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rdbtnUsuario.setBounds(130, 142, 78, 23);
        frame.getContentPane().add(rdbtnUsuario);

        JRadioButton rdbtnEmpresa = new JRadioButton("Empresa");
        rdbtnEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rdbtnEmpresa.setBounds(240, 142, 113, 23);
        frame.getContentPane().add(rdbtnEmpresa);

        JLabel lblEntrarComo = new JLabel("Entrar como:");
        lblEntrarComo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEntrarComo.setBounds(12, 145, 102, 15);
        frame.getContentPane().add(lblEntrarComo);

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnRegistrar.setBounds(108, 185, 117, 25);
        frame.getContentPane().add(btnRegistrar);

        passwordField = new JPasswordField();
        passwordField.setBounds(108, 114, 249, 18);
        frame.getContentPane().add(passwordField);

    }
}