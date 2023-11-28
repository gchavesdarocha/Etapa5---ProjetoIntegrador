package com.projetointegrador.service;

import com.projetointegrador.data.UsuarioEntity;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public static UsuarioEntity validarUsuarioSeguro(UsuarioEntity usuario) throws NoSuchAlgorithmException {
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        UsuarioEntity usuarioEncontrado = null;

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemaBilheteria", "root", "teste123");
            PreparedStatement statement = conexao.prepareStatement(sql);

            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenhaMD5());
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new UsuarioEntity();
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setTipo_usuario(rs.getString("tipo_usuario"));

            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }
}
