/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pri;

import common.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author hp
 */
public class NewExam extends javax.swing.JFrame {

    /**
     * Creates new form NewExam
     */
    private java.util.Timer timer;
    private  int m = 0;
    private  int s = 60;
    private int Sid;
    private int Test_id;
    private int count;
    private int qNo;
    private int Qid;
    private int Tid;
    public NewExam(int Sid,int Test_id,int count,int qNo,int Tid) {
        initComponents();
        this.Sid = Sid;
        this.Test_id = Test_id;
        this.count = count;
        this.qNo = qNo;
        this.Tid = Tid;
    }
    public NewExam() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonOp1 = new javax.swing.JRadioButton();
        jRadioButtonOp3 = new javax.swing.JRadioButton();
        jRadioButtonOp2 = new javax.swing.JRadioButton();
        jRadioButtonOp4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelTimer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaQuestion = new javax.swing.JTextArea();
        jLabelop1 = new javax.swing.JLabel();
        jLabelop2 = new javax.swing.JLabel();
        jLabelop4 = new javax.swing.JLabel();
        jLabelop3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Q.");

        jRadioButtonOp1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonOp1);
        jRadioButtonOp1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jRadioButtonOp1.setText("  1.");

        jRadioButtonOp3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonOp3);
        jRadioButtonOp3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jRadioButtonOp3.setText("  3.");

        jRadioButtonOp2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonOp2);
        jRadioButtonOp2.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jRadioButtonOp2.setText("  2.");

        jRadioButtonOp4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonOp4);
        jRadioButtonOp4.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jRadioButtonOp4.setText("  4.");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1/images/EC_Candidate.png"))); // NOI18N

        jLabelTimer.setFont(new java.awt.Font("Marker Felt", 0, 18)); // NOI18N
        jLabelTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTimer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextAreaQuestion.setEditable(false);
        jTextAreaQuestion.setColumns(20);
        jTextAreaQuestion.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jTextAreaQuestion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaQuestion);

        jLabelop1.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jLabelop1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelop2.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jLabelop2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelop4.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jLabelop4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelop3.setFont(new java.awt.Font("Marker Felt", 0, 14)); // NOI18N
        jLabelop3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 649, Short.MAX_VALUE)
                .addComponent(jLabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonOp1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelop1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonOp3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelop3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonOp2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelop2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonOp4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelop4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabelTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButtonOp1)
                                    .addComponent(jRadioButtonOp2)
                                    .addComponent(jLabelop1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelop2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jRadioButtonOp3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonOp4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelop3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabelop4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       if(qNo > 0)
       {
        try{
            Connect con = new Connect();
            ResultSet rs = con.getQuestion(count);
            while(rs.next())
            {
                jTextAreaQuestion.setText(rs.getString("Que"));
                jLabelop1.setText(rs.getString("Op1"));
                jLabelop2.setText(rs.getString("Op2"));
                jLabelop3.setText(rs.getString("Op3"));
                jLabelop4.setText(rs.getString("Op4"));
                Qid = rs.getInt("Qid");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewExam.class.getName()).log(Level.SEVERE, null, ex);
        }
         timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                
                String time = String.format("%02d:%02d",m,s);
                jLabelTimer.setText(time);
                System.out.println(time);
                s--;
                
                
                if(m > 0 && s == 0)
                {
                    s = 60;
                    m--;
                }
                if(m == 0 && s == 0 )
                {
                    cancel();
                    Connect con =new Connect();
                    con.insertAnswer(Test_id,Sid,Qid,0,0,Tid);
                    count++;
                    qNo--;
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        dispose();
                    }
                   
                    
                }
                
            }
        },1000,1000);
      } 
      else
       {
                Connect con = new Connect();
                int score  = con.getScore(Tid);
                con.insertResult(Tid, Sid, score*4, Test_id);
                con.dropTestTemp();
                JOptionPane.showMessageDialog(this, "You have secured : " + score * 4 + " marks.");
                //JOptionPane.showMessageDialog(this, "You have entered the Answers");
                //JOptionPane.showMessageDialog(this, "please login again");
                StudentDashboard sd = new StudentDashboard(Sid);
                sd.setVisible(true);
                this.dispose();
       }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
            Connect con = new Connect();
            int result = con.getResultOf(Qid);
            timer.cancel();
            if(jRadioButtonOp1.isSelected())
            {
                int response = 1;
                if(result == response)
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 1, Tid);
                    count++;
                    qNo--;
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4+ " marks.");
                        //JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                    
                }
                else
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 0, Tid);
                    count++;
                    qNo--;
                    
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4 + " marks.");
                        //JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }

            }
            if(jRadioButtonOp2.isSelected())
            {
                int response = 2;
                if(result == response)
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 1, Tid);
                    count++;
                    qNo--;
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4+ " marks");
                        //JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }
                else
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 0, Tid);
                    count++;
                    qNo--;
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4 + " marks.");
                       // JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }
            }
            if(jRadioButtonOp3.isSelected())
            {
                int response = 3;
                if(result == response)
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 1, Tid);
                    count++;
                    qNo--;
                   if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4+" marks");
                        //JOptionPane.showMessageDialog(this, "You have entered the Answer");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }
                else
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 0, Tid);
                    count++;
                    qNo--;
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4 + " marks.");
                        //JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }
            }
            if(jRadioButtonOp4.isSelected())
            {
                int response = 4;
                if(result == response)
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 1, Tid);
                    
                    count++;
                    qNo--;
                    
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : "+score*4+" marks.");
                        //JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }
                else
                {
                    con.insertAnswer(Test_id, Sid, Qid, response, 0, Tid);
                    count++;
                    qNo--;
                    if(qNo > 0)
                    {
                        NewExam ne = new NewExam(Sid,Test_id,count,qNo,Tid);
                        ne.setVisible(true);
                        this.dispose();
                    }
                      else
                    {
                        int score  = con.getScore(Tid);
                        con.insertResult(Tid, Sid, score*4, Test_id);
                        con.dropTestTemp();
                        JOptionPane.showMessageDialog(this, "You have secured : " + score*4 + " marks.");
                       //  JOptionPane.showMessageDialog(this, "You have entered the Answers");
                             //JOptionPane.showMessageDialog(this, "please login again");
                        StudentDashboard sd = new StudentDashboard(Sid);
                        sd.setVisible(true);
                        this.dispose();
                    }
                }
            }
            
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JLabel jLabelop1;
    private javax.swing.JLabel jLabelop2;
    private javax.swing.JLabel jLabelop3;
    private javax.swing.JLabel jLabelop4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonOp1;
    private javax.swing.JRadioButton jRadioButtonOp2;
    private javax.swing.JRadioButton jRadioButtonOp3;
    private javax.swing.JRadioButton jRadioButtonOp4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaQuestion;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
