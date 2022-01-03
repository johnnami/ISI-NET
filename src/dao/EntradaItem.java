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


public class EntradaItem {

    public boolean inserir() {
        Item item = new Item();
        Scanner read = new Scanner(System.in);

        String sql = "insert into item (iddono, nome, descricao, categoria) values (?, ?, ?, ?)";
        Connection conn = ConexaoBD.getConnection();
        System.out.println("Digite o ID do Dono: ");
        item.setIdDono(read.nextInt());
        System.out.println("Digite nome do item: ");
        item.setNome(read.nextLine());
        read.nextLine();
        System.out.println("Digite a descrição do item: ");
        item.setDescricao(read.nextLine());
        System.out.println("Digite a categoria do item: ");
        item.setCategoria(read.nextLine());
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(3, item.getIdDono());
            stmt.setString(1, item.getNome());
            stmt.setString(2, item.getDescricao());
            stmt.setString(3, item.getCategoria());
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
}