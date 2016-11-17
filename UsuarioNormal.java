package bibliotecaDigital;

public class UsuarioNormal extends Usuario {
	protected String nome;
	protected int tel;
	protected String email;
	protected String end;
	protected int cpf;
	protected int limiteItensAlugados;
	protected int limiteDias;
	
	
	public UsuarioNormal(String nome, int tel, String email, String end, int limiteItensAlugados, int limiteDias,int cpf,int codigo,String senha) {
		super(codigo, senha);
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.end = end;
		this.cpf = cpf;
		this.limiteItensAlugados = limiteItensAlugados;
		this.limiteDias = limiteDias;
	}


	public int getLimiteItensAlugados() {
		return limiteItensAlugados;
	}
	public int getLimiteDias() {
		return limiteDias;
	}
	
}
