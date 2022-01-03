package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.*;
import visao.ConexaoBD;

public class EntradaUsuario {

    public boolean inserir(Usuario usuario) {
        Scanner leitura = new Scanner(System.in);

        String sql = "insert into usuario (nome,  email, senha) values (?, ?, ?)";
        Connection conn = ConexaoBD.getConnection();
        System.out.println("Digite seu nome: ");
        usuario.setNome(leitura.nextLine());
        System.out.println("Digite seu email: ");
        usuario.setEmail(leitura.nextLine());
        System.out.println("Digite sua senha: ");
        usuario.setSenha(leitura.nextLine());
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            System.out.println("Salvo com sucesso no banco!");
            stmt.execute();
            stmt.close();
            conn.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Parametros errados");
            e.printStackTrace();
            return false;
        }

    }

    public boolean alterar(Usuario usuario) {
        Scanner leitura = new Scanner(System.in);
        String sql = "update usuario set nome = ?, email = ?, senha = ? where idUsuario = ? ";
        Connection conn = ConexaoBD.getConnection();

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, usuario.getIdUsuario());
            stmt.execute();
            stmt.close();
            conn.close();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(Usuario usuario) {
        Scanner leitura = new Scanner(System.in);
        String sql = "delete from usuario where email = ?";
        Connection conn = ConexaoBD.getConnection();
        System.out.println("Confirme seu email: ");
        usuario.setEmail(leitura.nextLine());
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getEmail());
            stmt.execute();
            stmt.close();
            conn.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Email invalido");
            e.printStackTrace();
            return false;
        }
    }

    public List<Usuario> ObterTodos() {
        String sql = "select * from usuario";
        Connection conn = ConexaoBD.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            List<Usuario> usuarios = new ArrayList<Usuario>();
            while(resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultado.getInt("idUsuario"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setEmail(resultado.getString("email"));
                usuario.setSenha(resultado.getString("senha"));
                usuarios.add(usuario);

            }
            stmt.execute();
            stmt.close();
            conn.close();

            return usuarios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean acharNome(List<Usuario> usuarios,String usuario1) {
        boolean a = false;
        Scanner leitura = new Scanner(System.in);
        for(Usuario usuario : usuarios) {
            if(usuario.getNome().equals(usuario1)) {
                a = true;
            }
        }
        return a;
    }

    public boolean acharSenha(List<Usuario> usuarios,String senha) {
        boolean a = false;
        Scanner leitura = new Scanner(System.in);
        for(Usuario usuario : usuarios) {
            if(usuario.getSenha().equals(senha)) {
                a = true;
            }
        }
        return a;
    }

}
