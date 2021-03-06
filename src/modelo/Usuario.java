package modelo;

public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String email;
    private String senha;

    public Usuario() {
    }
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int id) {
        this.idUsuario = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%s", this.idUsuario, this.nome, this.email, this.senha);
    }

}
