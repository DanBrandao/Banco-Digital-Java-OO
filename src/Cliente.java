public class Cliente {
    public String nome;
    public int cpf;
    public Banco banco;
    public String endereco;
    public String telefone;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    public Cliente(String nome, int cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }
}
