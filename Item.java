package bibliotecaDigital;

public class Itens {
	
	// Codigos : 1 - Livros , 2 - Revistas e 3 - Periodicos .
	
	protected String titulo;
	protected int codigo;
	protected int dataEmprestimo;
	protected int entregaReal;
	protected int entregaPrevista;
	
	public Itens(String titulo, int codigo, int dataEmprestimo, int entregaReal, int entregaPrevista) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.dataEmprestimo = dataEmprestimo;
		this.entregaReal = entregaReal;
		this.entregaPrevista = dataEmprestimo + 5;
	}
	
	public static double calcularMulta(int diasExcedidos){
		return diasExcedidos * 1.50;
	}
	
	public static void calcularDiaEntrega(int entregaPrevista){
		System.out.println("Dia de entrega :" + entregaPrevista);
	}
}

