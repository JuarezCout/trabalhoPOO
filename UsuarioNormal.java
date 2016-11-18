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
	
	public int getLimiteItensAlugados() {
		return limiteItensAlugados;
	}
	public int getLimiteDias() {
		return limiteDias;
	}
	
	public static void PesquisarItem (){
		
	}
	
	public static void RezervaItem (){
		
	}
	
	
	public static void AvisoDevoluçao (int limiteItensAlugados){
		if(limiteItensAlugados == 3){
			System.out.println("Falta 2 dia(s) para a realizar a devoluçao gratis (Após os 5 dias de devoluçao gratis será cobrada uma taxa de devoluçao)");
		}
		if(limiteItensAlugados == 4){
			System.out.println("Falta 1 dia(s) para a realizar a devoluçao gratis (Após os 5 dias de devoluçao gratis será cobrada uma taxa de devoluçao)");
		}
		if(limiteItensAlugados == 5){
			System.out.println("Falta 0 dia(s) para a realizar a devoluçao gratis (Após os 5 dias de devoluçao gratis será cobrada uma taxa de devoluçao)");
		}
	}
}
