public class personagem {
    private String nome;
    private int forca;
    private int defesa;
    private int vida;
    private int nivel;


public personagem (String nome, int forca, int defesa,int vida, int nivel) {
    this.nome = nome;
    this.forca = forca;
    this.defesa = defesa;
    this.vida = vida;
    this.nivel = 1;
}
public void exibir() {
{
    System.out.println( "===" + nome + "===" );
    System.out.println("forca = " + forca);
    System.out.println("defesa= " + defesa);
    System.out.println("vida = " + vida);
    System.out.println("nivel = "+ nivel);
}
}
    public static void main(String[] args) {
        personagem p1 = new personagem("Guerreiro", 100, 20, 10, 1);
//                                                    ↑ nível
        p1.exibir();
    }
}
