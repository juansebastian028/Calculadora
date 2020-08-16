package JFrames;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JLabel;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Calculadora");
        getContentPane().setBackground(new Color(50, 52, 54));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lblMostrarOperacion.setHorizontalAlignment(JLabel.RIGHT);
        lblPantalla.setHorizontalAlignment(JLabel.RIGHT);
        btnBorrarDig.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnSignoMult = new javax.swing.JButton();
        btnSignoDiv = new javax.swing.JButton();
        btnSignoResta = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSignoSuma = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblPantalla = new javax.swing.JLabel();
        btnBorrarDig = new javax.swing.JButton();
        btnSignoMenosAdelante = new javax.swing.JButton();
        lblMostrarOperacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSignoMult.setBackground(new java.awt.Color(0, 0, 0));
        btnSignoMult.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnSignoMult.setForeground(new java.awt.Color(255, 255, 255));
        btnSignoMult.setText("*");
        btnSignoMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoMultActionPerformed(evt);
            }
        });

        btnSignoDiv.setBackground(new java.awt.Color(0, 0, 0));
        btnSignoDiv.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnSignoDiv.setForeground(new java.awt.Color(255, 255, 255));
        btnSignoDiv.setText("/");
        btnSignoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoDivActionPerformed(evt);
            }
        });

        btnSignoResta.setBackground(new java.awt.Color(0, 0, 0));
        btnSignoResta.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnSignoResta.setForeground(new java.awt.Color(255, 255, 255));
        btnSignoResta.setText("-");
        btnSignoResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoRestaActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(240, 117, 39));
        btnIgual.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSignoSuma.setBackground(new java.awt.Color(0, 0, 0));
        btnSignoSuma.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnSignoSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSignoSuma.setText("+");
        btnSignoSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoSumaActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnBorrarTodo.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarTodo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBorrarTodo.setForeground(new java.awt.Color(240, 117, 15));
        btnBorrarTodo.setText("C");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPunto.setBackground(new java.awt.Color(0, 0, 0));
        btnPunto.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        lblPantalla.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblPantalla.setForeground(new java.awt.Color(255, 255, 255));

        btnBorrarDig.setBackground(new java.awt.Color(0, 0, 0));
        btnBorrarDig.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btnBorrarDig.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarDig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminarDig.png"))); // NOI18N
        btnBorrarDig.setBorder(null);
        btnBorrarDig.setContentAreaFilled(false);
        btnBorrarDig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarDigActionPerformed(evt);
            }
        });

        btnSignoMenosAdelante.setBackground(new java.awt.Color(0, 0, 0));
        btnSignoMenosAdelante.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnSignoMenosAdelante.setForeground(new java.awt.Color(255, 255, 255));
        btnSignoMenosAdelante.setText("+/-");
        btnSignoMenosAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoMenosAdelanteActionPerformed(evt);
            }
        });

        lblMostrarOperacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblMostrarOperacion.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSignoMenosAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSignoMult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSignoResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSignoSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSignoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBorrarDig)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMostrarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMostrarOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarDig, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignoMenosAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignoSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSignoResta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoDivActionPerformed

        if (!lblPantalla.getText().equals("")) {
            desactivarBtnOperaciones();
            lblPantalla.setText(lblPantalla.getText() + "/");

        }

    }//GEN-LAST:event_btnSignoDivActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        lblPantalla.setText(lblPantalla.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSignoMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoMultActionPerformed

        if (!lblPantalla.getText().equals("")) {
            desactivarBtnOperaciones();
            lblPantalla.setText(lblPantalla.getText() + "*");

        }

    }//GEN-LAST:event_btnSignoMultActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed

        if (!lblPantalla.getText().equals("")) {
            lblMostrarOperacion.setText(lblPantalla.getText() + "=");

            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Object result;
            try {
                result = engine.eval(lblPantalla.getText());
                lblPantalla.setText(result.toString());
            } catch (ScriptException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnBorrarDigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDigActionPerformed
        activarBtnOperaciones();
        
        if (lblPantalla.getText().equals("")) {
            
            btnBorrarDig.setEnabled(false);
            
        } else {
            
            btnBorrarDig.setEnabled(true);
        }
        
        if (lblMostrarOperacion.getText().equals("") && !lblPantalla.getText().equals("")) {
            
            borrarUltimoDig(lblPantalla);
            
        } 
        
        if (!lblMostrarOperacion.getText().equals("") && !lblPantalla.getText().equals("")) {
            
            borrarUltimoDig(lblMostrarOperacion);
        }

        if (lblPantalla.getText().equals("")) {
            btnBorrarDig.setEnabled(false);
            btnSignoMenosAdelante.setEnabled(true);
        }
    }//GEN-LAST:event_btnBorrarDigActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        lblPantalla.setText("");
        lblMostrarOperacion.setText("");
        activarBtnOperaciones();
        btnBorrarDig.setEnabled(false);
        btnSignoMenosAdelante.setEnabled(true);
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

    private void btnSignoRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoRestaActionPerformed

        if (!lblPantalla.getText().equals("")) {
            desactivarBtnOperaciones();
            lblPantalla.setText(lblPantalla.getText() + "-");

        }
    }//GEN-LAST:event_btnSignoRestaActionPerformed

    private void btnSignoSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoSumaActionPerformed
        if (!lblPantalla.getText().equals("")) {
            desactivarBtnOperaciones();
            lblPantalla.setText(lblPantalla.getText() + "+");

        }
    }//GEN-LAST:event_btnSignoSumaActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        desactivarBtnOperaciones();
        btnBorrarDig.setEnabled(true);
        if (lblPantalla.getText().equals("")) {
            lblPantalla.setText("0.");

        } else {
            lblPantalla.setText(lblPantalla.getText() + ".");
        }

    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnSignoMenosAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoMenosAdelanteActionPerformed

        if (!lblPantalla.getText().equals("")) {
            lblPantalla.setText("-" + lblPantalla.getText());
            btnSignoMenosAdelante.setEnabled(false);
        }
    }//GEN-LAST:event_btnSignoMenosAdelanteActionPerformed

    public void borrarUltimoDig(JLabel lbl) {
        lbl.setText(lbl.getText().substring(0, lbl.getText().length() - 1));
    }

    public void desactivarBtnOperaciones() {
        this.btnSignoSuma.setEnabled(false);
        this.btnSignoResta.setEnabled(false);
        this.btnSignoMult.setEnabled(false);
        this.btnSignoDiv.setEnabled(false);
        this.btnPunto.setEnabled(false);
        this.btnIgual.setEnabled(false);
    }

    public void activarBtnOperaciones() {
        this.btnSignoSuma.setEnabled(true);
        this.btnSignoResta.setEnabled(true);
        this.btnSignoMult.setEnabled(true);
        this.btnSignoDiv.setEnabled(true);
        this.btnPunto.setEnabled(true);
        this.btnIgual.setEnabled(true);
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrarDig;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnSignoDiv;
    private javax.swing.JButton btnSignoMenosAdelante;
    private javax.swing.JButton btnSignoMult;
    private javax.swing.JButton btnSignoResta;
    private javax.swing.JButton btnSignoSuma;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMostrarOperacion;
    private javax.swing.JLabel lblPantalla;
    // End of variables declaration//GEN-END:variables
}
