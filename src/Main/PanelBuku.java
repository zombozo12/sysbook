package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelBuku extends javax.swing.JPanel {
    FormContainer container;
    
    Connection conn       = null;
    ResultSet rs          = null;
    PreparedStatement pst = null;
    
    DefaultTableModel defaultTableBuku;
    
    private int id;
    
    /**
     * Creates new form PanelBuku
     * @param container
     */
    public PanelBuku(FormContainer container) {
        initComponents();
        this.container = container;
        this.conn      = MySQLConnection.ConnectDb();
        
        textUsername.setText(container.username);
        defaultTableBuku = new DefaultTableModel(new String[]{"No.", "ID Buku", "Kode Buku", 
            "Judul Buku", "Penulis", "Penerbit", "Tahun Terbit", "Stok", "Jenis Buku", "Harga Sewa"}, 0);
        getAllBook();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCrud = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        inJudul = new javax.swing.JTextField();
        labelJudul = new javax.swing.JLabel();
        labelKode = new javax.swing.JLabel();
        inKode = new javax.swing.JTextField();
        labelTahun = new javax.swing.JLabel();
        inTahun = new javax.swing.JTextField();
        inPenulis = new javax.swing.JTextField();
        labelPenulis = new javax.swing.JLabel();
        inPenerbit = new javax.swing.JTextField();
        labelPenerbit = new javax.swing.JLabel();
        inStok = new javax.swing.JTextField();
        labelStok = new javax.swing.JLabel();
        labelJenis = new javax.swing.JLabel();
        inHarga = new javax.swing.JTextField();
        labelHarga = new javax.swing.JLabel();
        inJenis = new javax.swing.JComboBox<>();
        panelTable = new javax.swing.JLayeredPane();
        panelTableHeader = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textUsername = new javax.swing.JLabel();

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(btnTambah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btnUbah, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btnHapus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(btnReset, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus)
                        .addComponent(btnReset)))
                .addGap(15, 15, 15))
        );

        inJudul.setBorder(null);
        inJudul.setCaretColor(new java.awt.Color(255, 255, 255));

        labelJudul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(57, 113, 177));
        labelJudul.setText("Judul");

        labelKode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelKode.setForeground(new java.awt.Color(57, 113, 177));
        labelKode.setText("Kode");

        inKode.setBorder(null);
        inKode.setCaretColor(new java.awt.Color(255, 255, 255));

        labelTahun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTahun.setForeground(new java.awt.Color(57, 113, 177));
        labelTahun.setText("Tahun");

        inTahun.setBorder(null);
        inTahun.setCaretColor(new java.awt.Color(255, 255, 255));

        inPenulis.setBorder(null);
        inPenulis.setCaretColor(new java.awt.Color(255, 255, 255));

        labelPenulis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPenulis.setForeground(new java.awt.Color(57, 113, 177));
        labelPenulis.setText("Penuilis");

        inPenerbit.setBorder(null);
        inPenerbit.setCaretColor(new java.awt.Color(255, 255, 255));

        labelPenerbit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPenerbit.setForeground(new java.awt.Color(57, 113, 177));
        labelPenerbit.setText("Penerbit");

        inStok.setBorder(null);
        inStok.setCaretColor(new java.awt.Color(255, 255, 255));

        labelStok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelStok.setForeground(new java.awt.Color(57, 113, 177));
        labelStok.setText("Stok");

        labelJenis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelJenis.setForeground(new java.awt.Color(57, 113, 177));
        labelJenis.setText("Jenis");

        inHarga.setBorder(null);
        inHarga.setCaretColor(new java.awt.Color(255, 255, 255));

        labelHarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHarga.setForeground(new java.awt.Color(57, 113, 177));
        labelHarga.setText("Harga");

        inJenis.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        inJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hard Back", "Paper Back" }));

        panelCrud.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inJudul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelJudul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelKode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inKode, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelTahun, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inTahun, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inPenulis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelPenulis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inPenerbit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelPenerbit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inStok, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelStok, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelJenis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inHarga, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(labelHarga, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelCrud.setLayer(inJenis, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelCrudLayout = new javax.swing.GroupLayout(panelCrud);
        panelCrud.setLayout(panelCrudLayout);
        panelCrudLayout.setHorizontalGroup(
            panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrudLayout.createSequentialGroup()
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCrudLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCrudLayout.createSequentialGroup()
                                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelKode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelTahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPenulis, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inKode, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCrudLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(inPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCrudLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelStok, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelCrudLayout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(inStok, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCrudLayout.createSequentialGroup()
                                .addComponent(labelJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelCrudLayout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(inHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(92, 92, 92))
        );
        panelCrudLayout.setVerticalGroup(
            panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJudul)
                    .addComponent(inPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPenerbit))
                .addGap(10, 10, 10)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKode)
                    .addComponent(inStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStok))
                .addGap(10, 10, 10)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inJenis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTahun)
                        .addComponent(labelJenis)))
                .addGap(10, 10, 10)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPenulis)
                    .addComponent(inHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("List Buku");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        panelTableHeader.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelTableHeader.setLayer(btnRefresh, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelTableHeaderLayout = new javax.swing.GroupLayout(panelTableHeader);
        panelTableHeader.setLayout(panelTableHeaderLayout);
        panelTableHeaderLayout.setHorizontalGroup(
            panelTableHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh)
                .addContainerGap())
        );
        panelTableHeaderLayout.setVerticalGroup(
            panelTableHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTableHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                " NO", "JUDUL", "KODE", "PENULIS", "TAHUN", "PENERBIT"
            }
        ));
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        panelTable.setLayer(panelTableHeader, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelTable.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTableHeader)
            .addComponent(jScrollPane1)
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTableHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );

        panelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("You logged in as, ");
        panelHeader.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, 30));

        textUsername.setBackground(new java.awt.Color(0, 0, 0));
        textUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textUsername.setForeground(new java.awt.Color(57, 113, 177));
        textUsername.setText("username");
        panelHeader.add(textUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTable, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelCrud)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        int baris = tblBuku.getSelectedRow();
        id = Integer.parseInt(tblBuku.getModel().getValueAt(baris, 1).toString());
        selectRow(id);
    }//GEN-LAST:event_tblBukuMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String judul = inJudul.getText(),
                kode = inKode.getText(),
                penulis = inPenulis.getText(),
                penerbit = inPenerbit.getText(),
                jenis = inJenis.getSelectedItem().toString();
        
        int tahun = Integer.parseInt(inTahun.getText()),
                stok = Integer.parseInt(inStok.getText()),
                harga = Integer.parseInt(inHarga.getText());
        tambahBuku(judul, kode, penulis, penerbit, tahun, stok, jenis, harga);
        getAllBook();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String judul = inJudul.getText(),
                kode = inKode.getText(),
                penulis = inPenulis.getText(),
                penerbit = inPenerbit.getText(),
                jenis = inJenis.getSelectedItem().toString();
        
        int tahun = Integer.parseInt(inTahun.getText()),
                stok = Integer.parseInt(inStok.getText()),
                harga = Integer.parseInt(inHarga.getText());
        editBuku(id, judul, kode, penulis, penerbit, tahun, stok, jenis, harga);
        getAllBook();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Hapus data buku", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            hapusBuku(id);
        }
        getAllBook();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        inJudul.setText("");
        inKode.setText("");
        inPenulis.setText("");
        inPenerbit.setText("");
        inJenis.setSelectedIndex(0);
        inTahun.setText("");
        inStok.setText("");
        inHarga.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        getAllBook();
    }//GEN-LAST:event_btnRefreshActionPerformed
    
    
    public void getAllBook(){
        defaultTableBuku.setRowCount(0);
        int no = 1, id, tahun, stok, harga;
        String judul, kode, penulis, penerbit, jenis;
        String query = "SELECT * FROM tbl_buku";
        try {
            pst = conn.prepareStatement(query);
            rs  = pst.executeQuery();
            while(rs.next()){
                id       = rs.getInt("buk_id");
                judul    = rs.getString("buk_judul");
                kode     = rs.getString("buk_kode");
                tahun    = rs.getInt("buk_tahun");
                penulis  = rs.getString("buk_penulis");
                penerbit = rs.getString("buk_penerbit");
                stok     = rs.getInt("buk_stok");
                jenis    = rs.getString("buk_jenis");
                harga    = rs.getInt("buk_harga");
                
                defaultTableBuku.addRow(new Object[]{no, id, kode, judul, penulis, penerbit, tahun, stok, jenis, harga});
                no++;
            }
            tblBuku.setModel(defaultTableBuku);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void selectRow(int id){
        String query = "SELECT * FROM tbl_buku WHERE buk_id = ?";
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            rs  = pst.executeQuery();
            
            if(rs.next()){
                inJudul.setText(rs.getString("buk_judul"));
                inKode.setText(rs.getString("buk_kode"));
                inTahun.setText(String.valueOf(rs.getInt("buk_tahun")));
                inPenulis.setText(rs.getString("buk_penulis"));
                inPenerbit.setText(rs.getString("buk_penerbit"));
                inStok.setText(rs.getString("buk_stok"));
                inJenis.setSelectedItem(rs.getString("buk_jenis"));
                inHarga.setText(String.valueOf(rs.getInt("buk_harga")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanelBuku.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Terjadi kesalahan sistem.");
        }
    }
    
    public void tambahBuku(String judul, String kode, String penulis, String penerbit, int tahun, int stok, String jenis, int harga){
        String query = "INSERT INTO tbl_buku(buk_kode, buk_judul, buk_penulis, buk_penerbit, buk_tahun, buk_stok, buk_jenis, buk_harga) "
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, kode);
            pst.setString(2, judul);
            pst.setString(3, penulis);
            pst.setString(4, penerbit);
            pst.setInt(5, tahun);
            pst.setInt(6, stok);
            pst.setString(7, jenis);
            pst.setInt(8, harga);
            
            if(pst.executeUpdate() != 0){
                System.out.println("input berhasil");
            }else{
                System.out.println("input gagal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan sistem.");
        }
    }
    
    public void editBuku(int id, String judul, String kode, String penulis, String penerbit, int tahun, int stok, String jenis, int harga){
        String query = "UPDATE tbl_buku SET buk_kode = ?, buk_judul = ?, buk_penulis = ?, buk_penerbit = ?, buk_tahun = ?, "
                + "buk_stok = ?, buk_jenis = ?, buk_harga = ? WHERE buk_id = ?";
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, kode);
            pst.setString(2, judul);
            pst.setString(3, penulis);
            pst.setString(4, penerbit);
            pst.setInt(5, tahun);
            pst.setInt(6, stok);
            pst.setString(7, jenis);
            pst.setInt(8, harga);
            pst.setInt(9, id);
            
            if(pst.executeUpdate() != 0){
                System.out.println("update berhasil");
            }else{
                System.out.println("update gagal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan sistem.");
        }
    }
    
    public void hapusBuku(int id){
        String query = "DELETE FROM tbl_buku WHERE buk_id = ?";
        try {
            pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            
            if(pst.executeUpdate() != 0){
                System.out.println("hapus berhasil");
            }else{
                System.out.println("hapus gagal");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERROR : terjadi kesalahan sistem.");
        }
    }
    
     /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        
//        //</editor-fold>
//        //</editor-fold>
//        
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new PanelBuku().setVisible(true);
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inHarga;
    private javax.swing.JComboBox<String> inJenis;
    private javax.swing.JTextField inJudul;
    private javax.swing.JTextField inKode;
    private javax.swing.JTextField inPenerbit;
    private javax.swing.JTextField inPenulis;
    private javax.swing.JTextField inStok;
    private javax.swing.JTextField inTahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKode;
    private javax.swing.JLabel labelPenerbit;
    private javax.swing.JLabel labelPenulis;
    private javax.swing.JLabel labelStok;
    private javax.swing.JLabel labelTahun;
    private javax.swing.JLayeredPane panelCrud;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JLayeredPane panelTable;
    private javax.swing.JLayeredPane panelTableHeader;
    private javax.swing.JTable tblBuku;
    private javax.swing.JLabel textUsername;
    // End of variables declaration//GEN-END:variables
}
