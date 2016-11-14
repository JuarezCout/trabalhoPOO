package bibliotecaDigital;

public class UsuarioNormal extends Usuario {
	protected String nome;
	protected int tel;
	protected String email;
	protected String end;
	protected int limiteItensAlugados;
	protected int limiteDias;
	
	
	public UsuarioNormal(String nome, int tel, String email, String end, int limiteItensAlugados, int limiteDias) {
		super();
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.end = end;
		this.limiteItensAlugados = limiteItensAlugados;
		this.limiteDias = limiteDias;
	}
	
	
}
