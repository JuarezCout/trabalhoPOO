package bibliotecaDigital;

public class Usuario {
	protected int codigo ;
	protected String senha ;

	public Usuario(int codigo, String senha) {
		super();
		this.codigo = codigo;
		this.senha = senha;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getSenha() {
		return senha;
	}
}
