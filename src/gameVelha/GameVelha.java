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
    
    /* Array de String caminho = 9 casas de Array */
    String[] caminho = new String[9];  // Declara o vetor       
    
    
    int nj=0,j1=0,j2=0,emp=0;

    // (LITERAL) Nomes dos jogadores
    String nome1="",nome2="";    

    
    boolean enc=false;
    
    public GameVelha() {
        // Inicializa os compontentes no Frame
        initComponents();         
    }
    public void inicializar(){              
        // Define o texto vazio para todos os botões 
        // Reseta o a variavel caminho 
        for(int i=0;i<9;i++){
            caminho[i]="";            
        }
        /* --- Botões --- */
        /* Defini Texto Vazio */
        //1. Insere valor de texto vazio em b1
        b1.setText("");
        //2. Insere valor de texto vazio em b2
        b2.setText("");
        //3. Insere valor de texto vazio em b3
        b3.setText("");
        //4. Insere valor de texto vazio em b4
        b4.setText("");
        //5. Insere valor de texto vazio em b5
        b5.setText("");
        //6. Insere valor de texto vazio em b6
        b6.setText("");
        //7. Insere valor de texto vazio em b7
        b7.setText("");
        //8. Insere valor de texto vazio em b8
        b8.setText("");
        //9. Insere valor de texto vazio em b9
        b9.setText("");  
        
        //10.
        enc=false;
        // 11. Executa o método esta estatistica()
        estatistica();   
        // *rodada
        nj=0;  
    }
    
    public void nomear(){
        //Abre Painel de input e nas configurações default,
        //com os atributos: 
        //Texto: "Digite o primeiro nome" 
        //Title: "Titulo da janela"
        //e atribui a variavel _nome1_ 

        /* idNome */
        // > Recebe valor para label do nome1
        /* Define label para o JogadorAtivo */ 
        /* (Literal) */ idNome = new javax.swing.JLabel();
        nome1 = JOptionPane.showInputDialog(null,"Digite o primeiro nome","Jogador 1",1);
        //Recebe valor para label do jogador2
        nome2=JOptionPane.showInputDialog(null,"Digite o segundo nome ","Jogador 2",1);        
        //e atribui a variavel _nome2_ 

        // atribui o Nome do do Jogador Ativo
        // a Label idNome, mostrando qual jogador 
        // deve jogar.
        idNome.setText(nome1);

        //Roda o Método estatistica()
        estatistica();
    }
    
    public void estatistica(){    
        // Define label com nome do jogador1 
        // juntamente com seu resultado
        estatistica1.setText(nome1 + " = "+j1);
        // Define label com nome do jogador2 
        // juntamente com seu resultado    
        estatistica2.setText(nome2 + " = "+j2);
        // Define label com empates, mostrando
        // o total de todos os empates
        estatistica3.setText("Empate  = " + emp);
    }
    
    public String simbolo(){     
        // Define a ~label?~ ~variavel?~ simb ao proximo simbolo
        //Define o text do idNome com o Jogador Ativo 
        if (simb.equals("O")){
            // Caso "0" seja o simbolo anterior
            // atribui "X" a simb
            simb="X";
            // define o idNome ao nome do Jogador 2 
            idNome.setText(nome2);
        }else{
            // Caso "X" seja o simbolo anterior
            // atribui "0" a simb
            simb="O";
            // define o idNome ao nome do Jogador 1
            idNome.setText(nome1);
        }
        //Aumenta o numero de jogadas
        nj++;
        //Retorna a String simbolo
        return simb;
    }
    
    public void resultado(){        
        // inicia o contador
        int id=1;
        // sendo o contador id = 1;
        // enquanto el for menor que 9,
        // resultando em 8 iterações,
        // e enc seja falso
        while((id<9)&&(enc==false)){

            if (caminho[id].length()==3){
                if ((caminho[id].equals("XXX"))){
                    JOptionPane.showMessageDialog(null,nome1 + ", você ganhou","Resultado",1);
                    j1++;
                    enc=true;
                    inicializar();                    
                }else if ((caminho[id].equals("OOO"))){
                    JOptionPane.showMessageDialog(null,nome2 + ", você ganhou","Resultado",1);
                    j2++;     
                    enc=true;
                    inicializar();
                }                
            }
            id++;            
        }
        if ((nj==9)&&(enc==false)){
            JOptionPane.showMessageDialog(null,"O jogo empatou","Resultado",1);
            emp++;
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
        // Inicia todos os botões da interface (b1)
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

        // Define label para texto 
        estatistica = new javax.swing.JLabel();
        identificador = new javax.swing.JLabel();
        estatistica1 = new javax.swing.JLabel();
        estatistica2 = new javax.swing.JLabel();
        estatistica3 = new javax.swing.JLabel();

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

        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 80, 70));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 70));

        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 70));

        b6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 80, 70));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 80, 70));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 70));

        b9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 80, 70));

        b8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 70));

        b7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 70));

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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if (b1.getText().equals("")){
            b1.setText(simbolo());
            caminho[1]+=b1.getText(); //caminho[1]+=b1.getText();
            caminho[4]+=b1.getText();
            caminho[7]+=b1.getText();
        }  
        if (nj>=5)resultado();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
         if (b2.getText().equals("")){
            b2.setText(simbolo());
            caminho[2]+=b2.getText();
            caminho[4]+=b2.getText();            
        }
        if (nj>=5)resultado();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:]
         if (b3.getText().equals("")){
            b3.setText(simbolo());
            caminho[3]+=b3.getText(); //caminho[1]=caminho[1]+b1.getText();
            caminho[4]+=b3.getText();
            caminho[8]+=b3.getText();
        } 
        if (nj>=5)resultado();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if (b4.getText().equals("")){
            b4.setText(simbolo());
            caminho[1]+=b4.getText(); 
            caminho[5]+=b4.getText();            
        } 
        if (nj>=5)resultado();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        if (b5.getText().equals("")){
            b5.setText(simbolo());
            caminho[2]+=b5.getText(); 
            caminho[5]+=b5.getText(); 
            caminho[7]+=b5.getText(); 
            caminho[8]+=b5.getText(); 
        }
        if (nj>=5)resultado();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if (b6.getText().equals("")){
            b6.setText(simbolo());
            caminho[3]+=b6.getText(); 
            caminho[5]+=b6.getText();       
        }
        if (nj>=5)resultado();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if (b7.getText().equals("")){
            b7.setText(simbolo());
            caminho[1]+=b7.getText(); 
            caminho[6]+=b7.getText(); 
            caminho[8]+=b7.getText();             
        }
        if (nj>=5)resultado();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if (b8.getText().equals("")){
            b8.setText(simbolo());
            caminho[2]+=b8.getText(); 
            caminho[6]+=b8.getText();            
        }
        if (nj>=5)resultado();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if (b9.getText().equals("")){
            b9.setText(simbolo());
            caminho[3]+=b9.getText(); 
            caminho[6]+=b9.getText(); 
            caminho[7]+=b9.getText();              
        }
        if (nj>=5)resultado();
    }//GEN-LAST:event_b9ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        nomear();
        inicializar();
    }//GEN-LAST:event_formWindowOpened

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