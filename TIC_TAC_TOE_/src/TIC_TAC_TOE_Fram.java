
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author kaust
 */
public class TIC_TAC_TOE_Fram extends javax.swing.JFrame {

    private String startGame="O";
    private int XCount=0;
    private int OCount=0;
    private int TotalCount=0;
    
    /**
     * Creates new form TIC_TAC_TOE_Fram
     */
    public TIC_TAC_TOE_Fram() {
        initComponents();
    }
    private void gameScore(){
        ScoreO.setText(String.valueOf(OCount));
        ScoreX.setText(String.valueOf(XCount));

    }
    private void choose_Player(){ 
        TotalCount++;
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        } 
        else startGame="X";
    }
    private void winGame(){
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        
        String b4=jButton4.getText();
        String b5=jButton5.getText();
        String b6=jButton6.getText();
        
        String b7=jButton7.getText();
        String b8=jButton8.getText();
        String b9=jButton9.getText();
        
           if(b1==("X") && b2==("X") && b3 ==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton1.setBackground(Color.yellow);
              jButton2.setBackground(Color.yellow);
              jButton3.setBackground(Color.yellow);
          } 
           else if(b4==("X") && b5==("X") && b6 ==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton4.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton6.setBackground(Color.yellow);
          } 
           else  if(b7==("X") && b8==("X") && b9==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton7.setBackground(Color.yellow);
              jButton8.setBackground(Color.yellow);
              jButton9.setBackground(Color.yellow);
          } 
           else   if(b1==("X") && b4==("X") && b7==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton1.setBackground(Color.yellow);
              jButton4.setBackground(Color.yellow);
              jButton7.setBackground(Color.yellow);
          } 
             else  if(b2==("X") && b5==("X") && b8 ==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton2.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton8.setBackground(Color.yellow);
          } 
            else    if(b3==("X") && b6==("X") && b9==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton3.setBackground(Color.yellow);
              jButton6.setBackground(Color.yellow);
              jButton9.setBackground(Color.yellow);
          } 
              else   if(b1==("X") && b5==("X") && b9==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton1.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton9.setBackground(Color.yellow);
          } 
               else   if(b3==("X") && b5==("X") && b7==("X"))
          {
              JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              XCount++;
              gameScore();
              jButton3.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton7.setBackground(Color.yellow);
          } 
                  
                  
                  
            else       if(b1==("O") && b2==("O") && b3 ==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton1.setBackground(Color.yellow);
              jButton2.setBackground(Color.yellow);
              jButton3.setBackground(Color.yellow);
          } 
          else  if(b4==("O") && b5==("O") && b6 ==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton4.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton6.setBackground(Color.yellow);
          } 
           else  if(b7==("O") && b8==("O") && b9==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton7.setBackground(Color.yellow);
              jButton8.setBackground(Color.yellow);
              jButton9.setBackground(Color.yellow);
          } 
            else  if(b1==("O") && b4==("O") && b7==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton1.setBackground(Color.yellow);
              jButton4.setBackground(Color.yellow);
              jButton7.setBackground(Color.yellow);
          } 
            else   if(b2==("O") && b5==("O") && b8 ==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton2.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton8.setBackground(Color.yellow);
          } 
            else    if(b3==("O") && b6==("O") && b9==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton3.setBackground(Color.yellow);
              jButton6.setBackground(Color.yellow);
              jButton9.setBackground(Color.yellow);
          } 
              else   if(b1==("O") && b5==("O") && b9==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton1.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton9.setBackground(Color.yellow);
          } 
              else if(b3==("O") && b5==("O") && b7==("O"))
          {
              JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
              OCount++;
              gameScore();
              jButton3.setBackground(Color.yellow);
              jButton5.setBackground(Color.yellow);
              jButton7.setBackground(Color.yellow);
          }
           
              else if(TotalCount==9)
              { 
                  JOptionPane.showMessageDialog(this,"Draw!","Tic Tac Toe",
                      JOptionPane.INFORMATION_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PlayerX = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        ScoreX = new javax.swing.JLabel();
        ScoreO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE_GAME");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton6.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton7.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton8.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jButton9.setPreferredSize(new java.awt.Dimension(90, 90));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(255, 255, 204));
        RESET.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        RESET.setText("RESET");
        RESET.setPreferredSize(new java.awt.Dimension(110, 90));
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(255, 51, 51));
        EXIT.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setPreferredSize(new java.awt.Dimension(110, 90));
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 198));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(206, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PlayerX.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        PlayerX.setText("PLAYER X");

        PlayerO.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        PlayerO.setText("PLAYER O");

        ScoreX.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ScoreX.setText("0");

        ScoreO.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        ScoreO.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScoreX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScoreX))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION); 
        { 
            System.exit(0);
        }
        
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
    
    TotalCount=0;  
    jButton1.setText(""); 
    jButton2.setText(""); 
    jButton3.setText(""); 
    
    jButton4.setText(""); 
    jButton5.setText(""); 
    jButton6.setText(""); 
    
    jButton7.setText(""); 
    jButton8.setText(""); 
    jButton9.setText(""); 
    
    jButton1.setBackground(Color.LIGHT_GRAY);
    jButton2.setBackground(Color.LIGHT_GRAY);
    jButton3.setBackground(Color.LIGHT_GRAY);
    
    jButton4.setBackground(Color.LIGHT_GRAY);
    jButton5.setBackground(Color.LIGHT_GRAY);
    jButton6.setBackground(Color.LIGHT_GRAY);
    
    jButton7.setBackground(Color.LIGHT_GRAY);
    jButton8.setBackground(Color.LIGHT_GRAY);
    jButton9.setBackground(Color.LIGHT_GRAY);
    
    }//GEN-LAST:event_RESETActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(!jButton1.getText().equals("")){
            return;
        }
        jButton1.setText(startGame);
     
        if(startGame.equalsIgnoreCase("O"))
        {
            jButton1.setForeground(Color.green);
           
        } 
        else {
            jButton1.setForeground(Color.blue);
            
        }  
        choose_Player();
        winGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        if(!jButton2.getText().equals("")){
            return;
        }
        jButton2.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        { 
            jButton2.setForeground(Color.green);
           
        } 
        else {
            jButton2.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        if(!jButton3.getText().equals("")){
            return;
        }
        jButton3.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        {
            jButton3.setForeground(Color.green);
           
        } 
        else {
            jButton3.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if(!jButton4.getText().equals("")){
            return;
        }
        jButton4.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        { jButton4.setForeground(Color.green);
           
        } 
        else {
            jButton4.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         
        if(!jButton5.getText().equals("")){
            return;
        }
        jButton5.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        {
            jButton5.setForeground(Color.green);
           
        } 
        else {
            jButton5.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        if(!jButton6.getText().equals("")){
            return;
        }
         jButton6.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        { 
            jButton6.setForeground(Color.green);
           
        } 
        else {
            jButton6.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
        if(!jButton7.getText().equals("")){
            return;
        }
        jButton7.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        { 
            jButton7.setForeground(Color.green);
           } 
        else {
            jButton7.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         
        if(!jButton8.getText().equals("")){
            return;
        }
        jButton8.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        { 
            jButton8.setForeground(Color.green);
        } 
        else {
            jButton8.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         
        if(!jButton9.getText().equals("")){
            return;
        }
        jButton9.setText(startGame);

             if(startGame.equalsIgnoreCase("O"))
        { 
            jButton9.setForeground(Color.green);
             } 
        else {
            jButton9.setForeground(Color.blue);
            
        }  
        choose_Player();
         winGame();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_Fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_Fram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JButton RESET;
    private javax.swing.JLabel ScoreO;
    private javax.swing.JLabel ScoreX;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
