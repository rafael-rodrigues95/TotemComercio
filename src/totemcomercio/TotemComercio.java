package totemcomercio;

/**
 *
 * @author rfl
 * 
 * Centro Universitário de Maringá;
 * Bacharelado em Engenharia de Software;
 * Programação de Sistemas II;
 * Atividade de Estudo 03;
 * 
 * Belo Horizonte, 27 de novembro de 2021;
 * Rafael Rodrigues de Souza - Matrícula: 1907053-5
 * 
 * Descrição: Totem para classificação do atendimento de determinado 
 * comércio; Ao clicar no botão da avaliação é mostrado a quantidade 
 * de votos e a média de todas as avaliações recebidas.
 * 
 */

public class TotemComercio extends NewJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Log das operações do Totem:");
        
        // Inicialização do JFrame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
}
