package gui;

import datos.Anime;
import java.util.LinkedList;

import utilidad.MetodosOrdenamiento;

/**
 *
 * @author Cristopher Soto
 */
public class Pantalla extends javax.swing.JFrame {
    private LinkedList<Anime> anime = new LinkedList<>();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cjMostrar = new javax.swing.JTextArea();
        cjSalir = new javax.swing.JButton();
        cjAñadir = new javax.swing.JButton();
        cjRemover = new javax.swing.JButton();
        cjNombre = new javax.swing.JTextField();
        cjTemporadas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btBubbleAsc = new javax.swing.JButton();
        btBubbleDesc = new javax.swing.JButton();
        btMergeAsc = new javax.swing.JButton();
        btMergeDesc = new javax.swing.JButton();
        btRadixAsc = new javax.swing.JButton();
        btRadixDesc = new javax.swing.JButton();
        btCountingAsc = new javax.swing.JButton();
        btCountingDesc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de animes");
        setBackground(new java.awt.Color(255, 51, 51));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(153, 0, 51));

        cjMostrar.setColumns(20);
        cjMostrar.setRows(5);
        jScrollPane1.setViewportView(cjMostrar);

        cjSalir.setText("Salir");
        cjSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjSalirActionPerformed(evt);
            }
        });

        cjAñadir.setText("Añadir");
        cjAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjAñadirActionPerformed(evt);
            }
        });

        cjRemover.setText("Remover");
        cjRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjRemoverActionPerformed(evt);
            }
        });

        cjNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del anime:");

        jLabel2.setText("Temporadas:");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        jLabel3.setText("Genero:");

        jLabel5.setText("Listado");

        btBubbleAsc.setText("BubbleSort Ascendente");
        btBubbleAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBubbleAscActionPerformed(evt);
            }
        });

        btBubbleDesc.setText("BubbleSort Descendente");
        btBubbleDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBubbleDescActionPerformed(evt);
            }
        });

        btMergeAsc.setText("MergeSort Ascendente");
        btMergeAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMergeAscActionPerformed(evt);
            }
        });

        btMergeDesc.setText("MergeSort Descendente");
        btMergeDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMergeDescActionPerformed(evt);
            }
        });

        btRadixAsc.setText("RadixSort Ascendente");
        btRadixAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRadixAscActionPerformed(evt);
            }
        });

        btRadixDesc.setText("RadixSort Descendente");
        btRadixDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRadixDescActionPerformed(evt);
            }
        });

        btCountingAsc.setText("CountingSort Ascendente");
        btCountingAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCountingAscActionPerformed(evt);
            }
        });

        btCountingDesc.setText("CountingSort Descendente");
        btCountingDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCountingDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(cjAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cjRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cjTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btCountingAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btRadixAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btMergeAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btBubbleAsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btCountingDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btRadixDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btMergeDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btBubbleDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(247, 247, 247))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cjSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cjNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cjTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(73, 73, 73)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btBubbleAsc)
                                                        .addComponent(btBubbleDesc))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btMergeAsc)
                                                        .addComponent(btMergeDesc))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btRadixDesc)
                                                        .addComponent(btRadixAsc))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btCountingDesc)
                                                        .addComponent(btCountingAsc))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cjAñadir)
                                                        .addComponent(cjRemover))
                                                .addGap(52, 52, 52))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                                .addComponent(cjSalir)
                                                .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void cjNombreActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cjSalirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        salir();
    }

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cjAñadirActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        añadir();
    }

    private void cjRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        remover();
    }

    private void btBubbleAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.bubbleSortArrayListAsc(anime);
        this.actualizarListado();
    }

    private void btBubbleDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.bubbleSortArrayListDes(anime);
        this.actualizarListado();
    }

    private void btMergeAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.mergeSortArrayListAsc(anime);
        this.actualizarListado();
    }

    private void btMergeDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.mergeSortArrayListDes(anime);
        this.actualizarListado();
    }

    private void btRadixAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.radixSortAsc(anime);
        this.actualizarListado();
    }

    private void btRadixDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.radixSortDes(anime);
        this.actualizarListado();
    }

    private void btCountingAscActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.countingSortAsc(anime,1);
        this.actualizarListado();
    }

    private void btCountingDescActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        MetodosOrdenamiento metodos = new MetodosOrdenamiento();
        metodos.countingSortDes(anime,1);
        this.actualizarListado();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btBubbleAsc;
    private javax.swing.JButton btBubbleDesc;
    private javax.swing.JButton btCountingAsc;
    private javax.swing.JButton btCountingDesc;
    private javax.swing.JButton btMergeAsc;
    private javax.swing.JButton btMergeDesc;
    private javax.swing.JButton btRadixAsc;
    private javax.swing.JButton btRadixDesc;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JButton cjAñadir;
    private javax.swing.JTextArea cjMostrar;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JButton cjRemover;
    private javax.swing.JButton cjSalir;
    private javax.swing.JTextField cjTemporadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
        this.actualizarListado();
    }
    private void actualizarListado() {
        if (anime.isEmpty()) {
            cjMostrar.setText("No hay elementos en la lista.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (Anime elemento : anime) {
                sb.append(elemento).append("\n");
            }
            cjMostrar.setText(sb.toString());
        }
        cjMostrar.setEditable(false);
    }
    private void salir() {
        System.exit(0);
    }
}