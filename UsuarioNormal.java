package bibliotecaDigital;

public class UsuarioNormal extends Usuario{
	protected String nome;
	protected int tel;
	protected String email;
	protected String end;
	protected int tipoUsuario;
	protected int cpf;
	protected int limiteItensAlugados;
	protected int limiteDias;
	
	
	
	public UsuarioNormal(int codigo, String senha, String nome, int tel, String email, String end, int tipoUsuario,
			int cpf, int limiteItensAlugados, int limiteDias) {
		super(codigo, senha);
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.end = end;
		this.tipoUsuario = tipoUsuario;
		this.cpf = cpf;
		this.limiteItensAlugados = limiteItensAlugados;
		this.limiteDias = limiteDias;
	}
	
}
