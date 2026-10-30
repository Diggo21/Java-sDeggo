/**
 * 🧙‍♂️ Grimório de Testes Mágicos
 *
 * No Laboratório de Magia, cada teste é um feitiço.
 * Se passar: ✨ Magia bem-sucedida!
 * Se falhar: 💥 Poção explodiu!
 *
 * "O código que se testa a si mesmo é o mais poderoso de todos."
 * — Mestre do Debug Antigo
 */

public class GrimorioDeTestes {

    public static void main(String[] args) {
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│   🧪 LABORATÓRIO DE MAGIA v1.0      │");
        System.out.println("│   Grimório de Testes Iniciado...    │");
        System.out.println("└─────────────────────────────────────┘\n");

        // Feitiço 1: Invocação de Variáveis
        invocarVariaveis();

        // Feitiço 2: Transmutação de Strings
        transmutarStrings();

        // Feitiço 3: Alquimia de Loops
        alquimiaDeLoops();

        // Feitiço Final: Revelação do Resultado
        revelarResultado();
    }

    static void invocarVariaveis() {
        System.out.println("🔮 Feitiço 1: Invocação de Variáveis");
        int mana = 100;
        double poder = 99.9;
        boolean feiticoCompleto = true;
        String nomeMago = "Deggo, o Arquiteto";

        System.out.printf("   Mana: %d | Poder: %.1f%% | Status: %s | Mago: %s%n%n",
            mana, poder, feiticoCompleto ? "✅ Pronto" : "❌ Falhou", nomeMago);
    }

    static void transmutarStrings() {
        System.out.println("📜 Feitiço 2: Transmutação de Strings");
        String codigoBruto = "public class Teste {}";
        String codigoPolido = codigoBruto
            .replace("Teste", "ObraPrima")
            .replace("{}", "{ /* mágica aqui */ }");

        System.out.println("   Antes: " + codigoBruto);
        System.out.println("   Depois: " + codigoPolido + "\n");
    }

    static void alquimiaDeLoops() {
        System.out.println("⚗️ Feitiço 3: Alquimia de Loops (Poção de Fibonacci)");
        int a = 0, b = 1;
        System.out.print("   Sequência: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(a + " ✨ ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("\n");
    }

    static void revelarResultado() {
        System.out.println("🏆 Feitiço Final: Revelação");
        System.out.println("   ┌─────────────────────────────────┐");
        System.out.println("   │  TODOS OS FEITIÇOS FUNCIONARAM! │");
        System.out.println("   │  O Laboratório está estável ✨  │");
        System.out.println("   └─────────────────────────────────┘");
        System.out.println("\n   \"Que seus builds sejam sempre verdes!\" 🍀");
    }
}