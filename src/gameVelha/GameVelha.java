package gameVelha;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 /* 
 * https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html 
 */

/**
 *
 * @author jailsonsantos
 */

public class GameVelha extends javax.swing.JFrame {
    /* # Game Velha */
    /* ## Jframe extends java.swing.JFrame */
    /* 
     * Objeto do pacote javax.swign que inicializa uma
     * janela vazia. 
     */
    /**
     * Creates new form GameVelha
     */
    
    /* String simb = 0 */
    // (LITERAL) Cursor do jogador, serve para definir 
    // o valor de texto dos botoes de (b1 a b9).
    String simb="O";
    
    // (VETOR DE LITERAL) que armazena os possíveis caminhos de vitoria 
    String[] caminho = new String[9];  // Declara o vetor       
    
    // (INTEIRO) Estatísticas do jogo
    int nj=0,j1=0,j2=0,emp=0;

    // (LITERAL) Nomes dos jogadores
    String nome1="",nome2="";    

    // (BOOLEANO) Variavel de encerramento do jogo
    boolean enc=false;
    
    public GameVelha() {
        // Inicializa os compontentes no Frame
        initComponents();         
    }
    public void inicializar() {
        /* Método "inicializar()":
         * Reinicia o vetor da variável caminho
         * atribuindo valores em branco "" para
         * cada índice, a fim de limpar o lixo
         */
        
        // 1. Reseta o a variavel caminho 
        for(int i=0;i<9;i++){
            caminho[i]="";            
        }
        //2. Insere valor de texto vazio em b1
        b1.setText("");
        //3. Insere valor de texto vazio em b2
        b2.setText("");
        //4. Insere valor de texto vazio em b3
        b3.setText("");
        //5. Insere valor de texto vazio em b4
        b4.setText("");
        //6. Insere valor de texto vazio em b5
        b5.setText("");
        //7. Insere valor de texto vazio em b6
        b6.setText("");
        //8. Insere valor de texto vazio em b7
        b7.setText("");
        //9. Insere valor de texto vazio em b8
        b8.setText("");
        //10. Insere valor de texto vazio em b9
        b9.setText("");  
        
        //11. Atribui ao boleano de encerramento "false"
        enc=false;
        
        // 12. Executa o método esta estatistica()
        estatistica();   

        // 13. Atribui o numero de jogadas para zero.
        nj=0;  
    }
    
    public void nomear(){
        /* Método "nomear()":
         * Abre um painel de input nas configurações default,
         * com atributos Text: "Digite o primeiro nome" e
         * Title: "Titulo da janela", sendo atribuido o valor 
         * inserido no input como nome1 e em seguida faz o mesmo
         * processo para o nome2.
         */

        // 1. Cria a variável literal que irá mostrar o jogador ativo
        /* (Literal) */ idNome = new javax.swing.JLabel();
        nome1 = JOptionPane.showInputDialog(null,"Digite o primeiro nome","Jogador 1",1);
        // 2. Recebe valor para o nome do jogador 1 na variável (nome1)
        nome2=JOptionPane.showInputDialog(null,"Digite o segundo nome ","Jogador 2",1);        
        // 3. Recebe valor para o nome do jogador 2 na variável (nome2)

        // 4. Atribui o nome do jogador 1 como jogador ativo
        idNome.setText(nome1);

        //Roda o Método estatistica()
        estatistica();
    }
    
    public void estatistica(){    
        /* Método "estatistica()":
         * Apresenta o nome e valor de pontuação dos jogoadores num campo de texto
         * além de apresentar "empates" e número total de empates na partida.
         */
        
        // 1. Define label com nome do jogador1 juntamente com sua pontuação
        estatistica1.setText(nome1 + " = "+j1);
        // 2. Define label com nome do jogador2 juntamente com sua pontuação  
        estatistica2.setText(nome2 + " = "+j2);
        // 3. Define label com empates, mostrando o total de todos os empates
        estatistica3.setText("Empate  = " + emp);
    }
    
    public String simbolo(){     
        // Define a ~label?~ ~variavel?~ simb ao proximo simbolo
        // 1. Define o texto do idNome para o Jogador Ativo 
        // 2.a Caso "0" seja o simbolo anterior
        if (simb.equals("O")){
            // 2.a1 Atribui "X" a simb
            simb="X";
            // 2.a2 Define o idNome ao nome do Jogador 2 
            idNome.setText(nome2);
        // 2.b Caso "X" seja o simbolo anterior
        }else{
            // 2.b1 Atribui "0" a simb
            simb="O";
            // 2.b2 Define o idNome ao nome do Jogador 1
            idNome.setText(nome1);
        }
        // 3. Aumenta o numero de jogadas
        nj++;

        // 4. Retorna a variável literal do simbolo (simb)
        return simb;
    }
    
    public void resultado(){        
        // 1. Inicia o contador
        int id=1;

        /* Contador "id":
         * Esse contar irá começar em 1 
         * e terminará em 9, resultando em
         * oito iterações caso enc seja falso
         */
        
        while((id<9)&&(enc==false)){
            /* Enquanto o id for menor que nove e enc for falso */
            if (caminho[id].length()==3){
                //1. Verifica se índice atual (id) de caminho já foi preenchido (3 literais)
                if ((caminho[id].equals("XXX"))){
                    // 1.a Se nesse índice houver um literal igual "XXX" 
                    /* 1.a.1 Aparece dialog com o texto com o nome do
                    *  jogador 1 com o "você ganhou" e titulo "Resultado" */ 
                    JOptionPane.showMessageDialog(null,nome1 + ", você ganhou","Resultado",1);
                    // 1.a.2 Aumenta o número de vitórias do jogador 1
                    j1++;
                    // 1.a.3 Encerra a partida alterando o booleano "enc"
                    enc=true;
                    // 1.a.4 Reinicia o jogo
                    inicializar();                    
                }else if ((caminho[id].equals("OOO"))){
                    // 1.b Se nesse índice houver um literal igual "OOO" 
                    /* 1.b.1 Aparece dialog com o texto com o nome do
                    *  jogador 2 com o "você ganhou" e titulo "Resultado" */ 
                    JOptionPane.showMessageDialog(null,nome2 + ", você ganhou","Resultado",1);
                    // 1.b.2 Aumenta o número de vitórias do jogador 2
                    j2++;     
                    // 1.b.3 Encerra a partida alterando o booleano "enc"
                    enc=true;
                    // 1.b.4 Reinicia o jogo
                    inicializar();
                }                
            }
            //2. Aumenta do índice do contador "id"
            id++;            
        }
        //3. Se em oito iterações o jogo não tiver sido encerrado, é um empate
        if ((nj==9)&&(enc==false)){
            // 3.a.1 Apresenta uma janela dialog com a mensagem de empate
            JOptionPane.showMessageDialog(null,"O jogo empatou","Resultado",1);
            // 3.a.2 Aumenta o número de empates na partida
            emp++;
            // 3.a.3 Reinicia o jogo
            inicializar();
        }
    }
        
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        // Inicia todos os botões da interface (b1 a b9)
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();

        /* Define label para o JogadorAtivo */ 
        /* (Literal) */ idNome = new javax.swing.JLabel();

        // Define label paras os texto, nome do jogador, pontuação e empates 
        estatistica = new javax.swing.JLabel();
        identificador = new javax.swing.JLabel();
        estatistica1 = new javax.swing.JLabel();
        estatistica2 = new javax.swing.JLabel();
        estatistica3 = new javax.swing.JLabel();

        // Define atributos da janela da aplicação em Java
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setName("gameVelha"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        /* Atribui fonte e action para o botão b3 */
        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, 70));

        /* Atribui fonte e action para o botão b2 */
        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 70));

        /* Atribui fonte e action para o botão b1*/
        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 70));

        /* Atribui fonte e action para o botão b6 */
        b6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 80, 70));

        /* Atribui fonte e action para o botão b5 */
        b5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, 70));

        /* Atribui fonte e action para o botão b4 */
        b4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 70));

        /* Atribui fonte e action para o botão b9 */
        b9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 80, 70));

        /* Atribui fonte e action para o botão b8 */
        b8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 70));

        /* Atribui fonte e action para o botão b7 */
        b7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 70));

        /* Atribui fonte, cor e texto para o identificador de jogador */
        idNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idNome.setForeground(new java.awt.Color(255, 0, 51));
        idNome.setText("Vez do jogador: ");
        getContentPane().add(idNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 140, -1));

        estatistica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica.setText("Estatística");
        estatistica.setToolTipText("");
        getContentPane().add(estatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 100, 40));

        identificador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        identificador.setText("Vez do jogador: ");
        getContentPane().add(identificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, -1));

        estatistica1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica1.setText("Estatistica");
        estatistica1.setToolTipText("");
        getContentPane().add(estatistica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 170, 40));

        estatistica2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica2.setText("Estatistica");
        estatistica2.setToolTipText("");
        getContentPane().add(estatistica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 170, 40));

        estatistica3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica3.setText("Estatistica");
        estatistica3.setToolTipText("");
        getContentPane().add(estatistica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 170, 40));

        // Atribui todos os componentes anteriores a Janela
        pack();
        // Define a posição inicial da Janela como central
        setLocationRelativeTo(null);
    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1.O botão b1 é acionado
        // 2. Se o botão estiver em branco
        if (b1.getText().equals("")){
            // 2.1. Atribui a ele o valor do simbolo
            b1.setText(simbolo());
            // 2.2. Adiciona o valor do simbolo nos indices 1,4 e 7
            caminho[1]+=b1.getText(); 
            caminho[4]+=b1.getText();
            caminho[7]+=b1.getText();
        }  
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // 1. O botão b2 é acionado
        // 2. Se o botão estiver em branco
        if (b2.getText().equals("")){
            // 2.1 Atribui a ele o valor do simbolo
            b2.setText(simbolo());
            // 2.2 Adiciona o valor do simbolo nos indices 2 e 4
            caminho[2]+=b2.getText();
            caminho[4]+=b2.getText();            
        }
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b3 é acionado
        // 2. Se o botão estiver em branco
        if (b3.getText().equals("")){
            // 2.1 Atribui a ele o valor do simbolo
            b3.setText(simbolo());
            // 2.2 Adiciona o valor do simbolo nos indices 3, 4 e 8
            caminho[3]+=b3.getText(); 
            caminho[4]+=b3.getText();
            caminho[8]+=b3.getText();
        } 
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b4 é acionado
        // 2. Se o botão estiver em branco 
        if (b4.getText().equals("")){
            // 2.1. Atribui a ele o valor do simbolo
            b4.setText(simbolo());
            // 2.2. Adiciona o valor do simbolo nos indices 1 e 5
            caminho[1]+=b4.getText(); 
            caminho[5]+=b4.getText();            
        } 
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b5 é acionado
        // 2. Se o botão estiver em branco
        if (b5.getText().equals("")){
            // 2.1. Atribui a ele o valor do simbolo
            b5.setText(simbolo());
            // 2.2. Adiciona o valor do simbolo nos indices 2, 5, 7 e 8
            caminho[2]+=b5.getText(); 
            caminho[5]+=b5.getText(); 
            caminho[7]+=b5.getText(); 
            caminho[8]+=b5.getText(); 
        }
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b6 é acionado
        // 2. Se o botão estiver em branco
        if (b6.getText().equals("")){
            // 2.1. Atribui a ele o valor do simbolo
            b6.setText(simbolo());
            // 2.2. Adiciona o valor do símbolo nos indices, 3 e 5
            caminho[3]+=b6.getText(); 
            caminho[5]+=b6.getText();       
        }
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b7 é acionado
        // 2. Se o botão estiver em branco
        if (b7.getText().equals("")){
            // 2.1. Atribui a ele o valor do simbolo
            b7.setText(simbolo());
            // 2.2.. Adiciona o valor do símbolo nos indices 1, 6 e 7
            caminho[1]+=b7.getText(); 
            caminho[6]+=b7.getText(); 
            caminho[8]+=b7.getText();             
        }
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b8 é acionado
        // 2. Se o botão estiver em branco
        if (b8.getText().equals("")){
            // 2.1 Atribui a ele o valor do simbolo
            b8.setText(simbolo());
            // 2.2. Adiciona o valor do símbolo nos indices 2 e 6
            caminho[2]+=b8.getText(); 
            caminho[6]+=b8.getText();            
        }
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. O botão b9 é acionado
        // 2. Se o botão estiver em branco
        if (b9.getText().equals("")){
            // 2.1 Atribui a ele o valor do símbolo
            b9.setText(simbolo());
            // 2.2. Adiciona o valor do símbolo nos indices 3, 6 e 7
            caminho[3]+=b9.getText(); 
            caminho[6]+=b9.getText(); 
            caminho[7]+=b9.getText();              
        }
        // 3. Se o numero de jogos for maior do que 5 verifica os caminhos e encerra a partida
        if (nj>=5)resultado();
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // Ao abrir a janela 
        // 1. Roda o método nomeando os jogadores
        nomear();
        // 2. Reinicia todas os botões e estatisticas
        inicializar();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */      
        
        java.awt.EventQueue.invokeLater(new Runnable() {            
            public void run() {                
                new GameVelha().setVisible(true);                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel estatistica;
    private javax.swing.JLabel estatistica1;
    private javax.swing.JLabel estatistica2;
    private javax.swing.JLabel estatistica3;
    private javax.swing.JLabel idNome;
    private javax.swing.JLabel identificador;
    // End of variables declaration//GEN-END:variables

}