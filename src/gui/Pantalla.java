package gui;

import datos.Anime;
import utilidad.MetodosOrdenamiento;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author criss
 */
public class Pantalla extends javax.swing.JFrame {
    private LinkedList<Anime> anime = new LinkedList<>();
    private Anime[] animeArray = new Anime[anime.size()];
    public Pantalla() {
        initComponents();
        this.setTitle("Listado de animes");
        setLocationRelativeTo(null);
        String[] generos = {"Shounen","Shoujo","Seinen","Josei","Kodomo","Mecha","Ecchi","Hentai","Isekai","Gore","Sports"};
        cbGenero.removeAllItems();
        for (String genero : generos) {
            cbGenero.addItem(genero);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        cjNombre = new javax.swing.JTextField();
        cjTemporadas = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btBSLLAsc = new javax.swing.JButton();
        btMSLLAsc = new javax.swing.JButton();
        btRSLLAsc = new javax.swing.JButton();
        btCSLLAsc = new javax.swing.JButton();
        btBSLLDesc = new javax.swing.JButton();
        btMSLLDesc = new javax.swing.JButton();
        btRSLLDesc = new javax.swing.JButton();
        btCSLLDesc = new javax.swing.JButton();
        btBSAAsc = new javax.swing.JButton();
        btMSAAsc = new javax.swing.JButton();
        btRSAAsc = new javax.swing.JButton();
        btCSAAsc = new javax.swing.JButton();
        btBSADesc = new javax.swing.JButton();
        btMSADesc = new javax.swing.JButton();
        btRSADesc = new javax.swing.JButton();
        btCSADesc = new javax.swing.JButton();
        cjSalir = new javax.swing.JButton();
        btAñadir = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cjLinkedList = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cjArray = new javax.swing.JTextArea();
        btConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Temporadas:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Genero:");

        btBSLLAsc.setText("BSAsc");
        btBSLLAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBSLLAscActionPerformed(evt);
            }
        });

        btMSLLAsc.setText("MSAsc");
        btMSLLAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMSLLAscActionPerformed(evt);
            }
        });

        btRSLLAsc.setText("RSAsc");
        btRSLLAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRSLLAscActionPerformed(evt);
            }
        });

        btCSLLAsc.setText("CSAsc");
        btCSLLAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCSLLAscActionPerformed(evt);
            }
        });

        btBSLLDesc.setText("BSDesc");
        btBSLLDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBSLLDescActionPerformed(evt);
            }
        });

        btMSLLDesc.setText("MSDesc");
        btMSLLDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMSLLDescActionPerformed(evt);
            }
        });

        btRSLLDesc.setText("RSDesc");
        btRSLLDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRSLLDescActionPerformed(evt);
            }
        });

        btCSLLDesc.setText("CSDesc");
        btCSLLDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCSLLDescActionPerformed(evt);
            }
        });

        btBSAAsc.setText("BSAsc");
        btBSAAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBSAAscActionPerformed(evt);
            }
        });

        btMSAAsc.setText("MSAsc");
        btMSAAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMSAAscActionPerformed(evt);
            }
        });

        btRSAAsc.setText("RSAsc");
        btRSAAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRSAAscActionPerformed(evt);
            }
        });

        btCSAAsc.setText("CSAsc");
        btCSAAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCSAAscActionPerformed(evt);
            }
        });

        btBSADesc.setText("BSDesc");
        btBSADesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBSADescActionPerformed(evt);
            }
        });

        btMSADesc.setText("MSDesc");
        btMSADesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMSADescActionPerformed(evt);
            }
        });

        btRSADesc.setText("RSDesc");
        btRSADesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRSADescActionPerformed(evt);
            }
        });

        btCSADesc.setText("CSDesc");
        btCSADesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCSADescActionPerformed(evt);
            }
        });

        cjSalir.setText("Salir");
        cjSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjSalirActionPerformed(evt);
            }
        });

        btAñadir.setText("Añadir");
        btAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAñadirActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("LinkedList");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Arreglos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ordenaminetos Array");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ordenamientos LinkedList");

        cjLinkedList.setColumns(20);
        cjLinkedList.setRows(5);
        jScrollPane1.setViewportView(cjLinkedList);

        cjArray.setColumns(20);
        cjArray.setRows(5);
        jScrollPane2.setViewportView(cjArray);

        btConvertir.setText("Convertir");
        btConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btRSAAsc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(btMSAAsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                                                                .addComponent(btBSAAsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(cbGenero, 0, 165, Short.MAX_VALUE)
                                                                        .addComponent(cjTemporadas)
                                                                        .addComponent(cjNombre))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(btBSLLAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(btMSLLAsc, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                                                        .addComponent(btCSLLAsc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btRSLLAsc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(19, 19, 19))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btCSAAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btBSADesc)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(btBSLLDesc)
                                                                .addComponent(btMSLLDesc)
                                                                .addComponent(btRSLLDesc)
                                                                .addComponent(btCSLLDesc))
                                                        .addComponent(btMSADesc)
                                                        .addComponent(btRSADesc)
                                                        .addComponent(btCSADesc))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2))
                                                .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btConvertir)
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel5)
                                                .addGap(168, 168, 168))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(340, 340, 340)
                                                .addComponent(cjSalir)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(176, 176, 176)
                                                .addComponent(jLabel4)
                                                .addGap(172, 172, 172))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(btBSLLAsc)
                                                        .addComponent(btBSLLDesc))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btMSLLAsc)
                                                                        .addComponent(btMSLLDesc)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(cjTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btRSLLAsc)
                                                        .addComponent(btRSLLDesc)
                                                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btCSLLAsc)
                                                        .addComponent(btCSLLDesc))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(btAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btConvertir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btBSAAsc)
                                                        .addComponent(btBSADesc))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btMSAAsc)
                                                                        .addComponent(btMSADesc))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btRSAAsc)
                                                                        .addComponent(btRSADesc)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btCSAAsc)
                                                        .addComponent(btCSADesc)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cjSalir)
                                        .addComponent(jLabel6))
                                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void btAñadirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        añadir();
    }

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        remover();
    }

    private void btBSLLAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.bubbleSortLinkedListAsc(anime);
        this.actualizarListado();
    }

    private void btBSLLDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.bubbleSortLinkedListDes(anime);
        this.actualizarListado();
    }

    private void btMSLLAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.mergeSortLinkedListAsc(anime);
        this.actualizarListado();
    }

    private void btMSLLDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.mergeSortLinkedListDes(anime);
        this.actualizarListado();
    }

    private void btRSLLAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.radixSortLinkedListAsc(anime);
        this.actualizarListado();
    }

    private void btRSLLDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.radixSortLinkedListDes(anime);
        this.actualizarListado();
    }

    private void btCSLLAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.countingSortLinkedListAsc(anime,1);
        this.actualizarListado();
    }

    private void btCSLLDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.countingSortLinkedListDes(anime,1);
        this.actualizarListado();
    }

    private void btBSAAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.bubbleSortArrayAsc(animeArray);
        this.actualizarListadoArray();
    }

    private void btBSADescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.bubbleSortArrayDes(animeArray);
        this.actualizarListadoArray();
    }

    private void btMSAAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.mergeSortArrayAsc(animeArray);
        this.actualizarListadoArray();
    }

    private void btRSAAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.radixSortArrayAsc(animeArray);
        this.actualizarListadoArray();
    }

    private void btCSAAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.countingSortArrayAsc(animeArray,1);
        this.actualizarListadoArray();
    }

    private void btMSADescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.mergeSortArrayDesc(animeArray);
        this.actualizarListadoArray();
    }

    private void btRSADescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.radixSortArrayDesc(animeArray);
        this.actualizarListadoArray();
    }

    private void btCSADescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.countingSortArrayDesc(animeArray,1);
        this.actualizarListadoArray();
    }

    private void cjSalirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        salir();
    }
    private void btConvertirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        transferir();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btAñadir;
    private javax.swing.JButton btBSAAsc;
    private javax.swing.JButton btBSADesc;
    private javax.swing.JButton btBSLLAsc;
    private javax.swing.JButton btBSLLDesc;
    private javax.swing.JButton btCSAAsc;
    private javax.swing.JButton btCSADesc;
    private javax.swing.JButton btCSLLAsc;
    private javax.swing.JButton btCSLLDesc;
    private javax.swing.JButton btConvertir;
    private javax.swing.JButton btMSAAsc;
    private javax.swing.JButton btMSADesc;
    private javax.swing.JButton btMSLLAsc;
    private javax.swing.JButton btMSLLDesc;
    private javax.swing.JButton btRSAAsc;
    private javax.swing.JButton btRSADesc;
    private javax.swing.JButton btRSLLAsc;
    private javax.swing.JButton btRSLLDesc;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JTextArea cjArray;
    private javax.swing.JTextArea cjLinkedList;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JButton cjSalir;
    private javax.swing.JTextField cjTemporadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration
    private void añadir(){
        Anime a = new Anime();
        a.setNombre(cjNombre.getText());
        int temp = Integer.parseInt(cjTemporadas.getText());
        a.setTemporadas(temp);
        String valor = (String) cbGenero.getSelectedItem();
        a.setTipo(valor);
        anime.add(a);
        this.actualizarListado();
    }
    private void remover(){
        anime.remove(0);
        eliminarPrimerElemento(animeArray);
        this.actualizarListadoArray();
        this.actualizarListado();
    }
    private void actualizarListado() {
        if (anime.isEmpty()) {
            cjLinkedList.setText("No hay elementos en la lista.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Anime elemento : anime) {
                sb.append(elemento).append("\n");
            }
            cjLinkedList.setText(sb.toString());
        }
        cjLinkedList.setEditable(false);
    }
    private void actualizarListadoArray() {
        if (animeArray.length == 0) {
            cjArray.setText("No hay elementos en la lista.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Anime elemento : animeArray) {
                sb.append(elemento).append("\n");
            }
            cjArray.setText(sb.toString());
        }
        cjArray.setEditable(false);
    }
    private void salir() {
        System.exit(0);
    }
    private void transferir(){
        animeArray = anime.toArray(new Anime[anime.size()]);
        actualizarListadoArray();
    }
    public Anime[] eliminarPrimerElemento(Anime[] arr) {
        if (arr == null || arr.length == 0) {
            // Si el arreglo está vacío o es nulo, no hay nada que eliminar
            return arr;
        }

        Anime[] newArr = new Anime[arr.length - 1];
        System.arraycopy(arr, 1, newArr, 0, arr.length - 1);

        return newArr;
    }
}




