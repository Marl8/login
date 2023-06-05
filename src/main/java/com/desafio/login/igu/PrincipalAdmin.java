
package com.desafio.login.igu;

import com.desafio.login.logica.Controladora;
import com.desafio.login.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {

    Controladora control;
    Usuario user;
 
    public PrincipalAdmin(Controladora control, Usuario user) {
        initComponents();
        this.control = control;
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txNombreUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Sistema de Administración de Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 24, -1, -1));

        txNombreUser.setForeground(new java.awt.Color(204, 204, 204));
        txNombreUser.setText("jLabel2");
        jPanel1.add(txNombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 77, 560, 380));

        btnCrear.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 15)); // NOI18N
        btnCrear.setText("Crear Nuevo Usuario");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 199, 46));

        btnEditar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 15)); // NOI18N
        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 199, 46));

        btnEliminar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 15)); // NOI18N
        btnEliminar.setText("Eliminar Usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 199, 46));

        btnRecargar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 15)); // NOI18N
        btnRecargar.setText("Recargar Tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRecargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 199, 46));

        btnSalir.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 199, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\PROGRAMACION\\JAVA\\Proyectos\\JAVA TodoCode\\proyectos\\Login\\src\\main\\java\\com\\desafio\\login\\Imagenes\\02.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Para poner el nombre del usuario a la derecha usamos el evento opened que se utiliza
    para setear datos en los elementos cuando se abre la ventana. 
    Se accede al evento haciendo click derecho sobre el 
    Jframe -> events -> windows -> windows opened
    */
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txNombreUser.setText("Usuario: " + user.getNombreUsuario());
        cargartabla();
    }//GEN-LAST:event_formWindowOpened

    public void cargartabla() {
         // definir el modelo de tabla
         DefaultTableModel modeloTabla = new DefaultTableModel(){
         
         // Que las filas y columnas no sean editables
         @Override
         public boolean isCellEditable (int row, int column) {
             return false;
            }
       };
         
       /*
         1. Se establecen los nombres de las columnas
         2. Se asigna las columnas a nuestro modelo de tablas
           2.1 se cargan los usuarios de la base de datos
         3. Se asigna el modelo de tabla a nuestra tabla
         */
       String titulos[] = {"id", "Usuario", "Rol"};
       modeloTabla.setColumnIdentifiers(titulos);
       
       List<Usuario> listaUsuarios = control.traerUsuarios();
       
       if (listaUsuarios != null) {
           
           // recorrer lista de usuarios
           
           for (Usuario us : listaUsuarios) {
               
               Object objeto [] = {us.getId(), us.getNombreUsuario(), us.getRol().getRolName()};
               modeloTabla.addRow(objeto);
           }
       }
       
       tablaUsuarios.setModel(modeloTabla);
       
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        LoginInicial login = new LoginInicial();
         
        int opciones =JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
        
        switch (opciones) {
            case 1 -> {
                JOptionPane.showMessageDialog(null,"Programa  Finalizado");
                System.exit(0);
            }
            case 2 -> {
                this.setVisible(true);
                this.setLocationRelativeTo(null);
            }
            default -> {
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargartabla();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
         
        AltaUsuarios altaUs = new AltaUsuarios(control, user);
        altaUs.setVisible(true);
        altaUs.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        // Valida que la tabla tenga elementos
        if (tablaUsuarios.getRowCount() > 0) {
            // Validar que se haya seleccionado un elemento a eliminar (si No hay ningun elemento marcado por default devuelve -1)
            if (tablaUsuarios.getSelectedRow() != -1) {
                
               // Obtener el id del elemento a eliminar
               
               /*
               Con el tablablaUsuarios.getValue() obtengo el id -> con el getSelectedRow() accedo a la fila y
               con indice 0 a la columna id.
               Con esto devuelve un Tipo Object se hace una doble conversión primero a String y finalmente a Entero.
               */
               
               int idUsuario = Integer.parseInt(String.valueOf( tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
            
               // Invoco al metodo eliminar
               
               control.borrarUsuario(idUsuario);
               mostrarMensaje("Usuario eliminado con exito", "Info", "Eliminación correcta");
               
               // cargar nuevamente la tabla
               
               cargartabla();
            }else{
                mostrarMensaje("Error no se selecciono ningun registro", "Error","error al borrar");
            }
        }else{
            mostrarMensaje("Error la tabla esta vacia", "Error", "error al eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         // Valida que la tabla tenga elementos
        if (tablaUsuarios.getRowCount() > 0) {
            // Validar que se haya seleccionado un elemento a eliminar (si No hay ningun elemento marcado por default devuelve -1)
            if (tablaUsuarios.getSelectedRow() != -1) { 
               
               int idUsuario = Integer.parseInt(String.valueOf( tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
            
               EditarUsuarios edit = new EditarUsuarios(control, idUsuario);
               edit.setVisible(true);
               edit.setLocationRelativeTo(null);  
               this.dispose();
               
            }else{
                mostrarMensaje("Error no se selecciono ningun registro", "Error","error al editar");
            }
        }else{
            mostrarMensaje("Error la tabla esta vacia", "Error", "error al editar");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel txNombreUser;
    // End of variables declaration//GEN-END:variables

 public void mostrarMensaje (String mensaje, String tipo, String titulo) {
      
        JOptionPane optionPane = new JOptionPane (mensaje);
        
        if (tipo.equalsIgnoreCase("Info")){
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (tipo.equalsIgnoreCase("Error")) {
             optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);    
    
    }     
}
