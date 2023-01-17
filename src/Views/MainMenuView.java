/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Models.FeedModel;
import Repositories.RepositoryProvider;
import java.awt.CardLayout;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class MainMenuView extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuView
     */
    
    private SimpleDateFormat sdm;
    private int FeedSelectedID;
    private enum PropType { Feed, Water, Harvest }
    
    public MainMenuView() {
        initComponents();
        
        sdm = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");
        
        ResetSelectedIDs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Topbar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Sidebar = new javax.swing.JPanel();
        FeedViewBtn = new javax.swing.JButton();
        WaterViewBtn = new javax.swing.JButton();
        HarvestViewBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DashboardViewBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        FragmentManager = new javax.swing.JPanel();
        DashboardFragment = new javax.swing.JPanel();
        FeedPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TotalFeedLabel = new javax.swing.JLabel();
        WaterPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TotalWaterLabel = new javax.swing.JLabel();
        HarvestPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TotalHarvestLabel = new javax.swing.JLabel();
        FeedFragment = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FeedsTable = new javax.swing.JTable();
        DeleteFeedBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        AddFeedAmount = new javax.swing.JTextField();
        AddFeedBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        AddFeedPrice = new javax.swing.JTextField();
        UpdateFeedID = new javax.swing.JLabel();
        UpdateFeedBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        UpdateFeedAmount = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        UpdateFeedPrice = new javax.swing.JTextField();
        RefreshFeedBtn = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        WaterFragment = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        HarvestFragment = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1850, 1030));
        setSize(new java.awt.Dimension(1850, 1030));

        Topbar.setBackground(new java.awt.Color(237, 180, 106));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(14, 79, 85));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/inventory.png"))); // NOI18N
        jLabel5.setText("Inventory Management System");

        javax.swing.GroupLayout TopbarLayout = new javax.swing.GroupLayout(Topbar);
        Topbar.setLayout(TopbarLayout);
        TopbarLayout.setHorizontalGroup(
            TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopbarLayout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopbarLayout.setVerticalGroup(
            TopbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopbarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5))
        );

        Sidebar.setBackground(new java.awt.Color(14, 79, 85));
        Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FeedViewBtn.setBackground(new java.awt.Color(14, 79, 85));
        FeedViewBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        FeedViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        FeedViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/feed.png"))); // NOI18N
        FeedViewBtn.setText("   FEED");
        FeedViewBtn.setBorder(null);
        FeedViewBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FeedViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedViewBtnActionPerformed(evt);
            }
        });
        Sidebar.add(FeedViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 40));

        WaterViewBtn.setBackground(new java.awt.Color(14, 79, 85));
        WaterViewBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        WaterViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        WaterViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/water.png"))); // NOI18N
        WaterViewBtn.setText("   WATER");
        WaterViewBtn.setBorder(null);
        WaterViewBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        WaterViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaterViewBtnActionPerformed(evt);
            }
        });
        Sidebar.add(WaterViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 290, 40));

        HarvestViewBtn.setBackground(new java.awt.Color(14, 79, 85));
        HarvestViewBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        HarvestViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        HarvestViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/harvest.png"))); // NOI18N
        HarvestViewBtn.setText("   HARVEST");
        HarvestViewBtn.setBorder(null);
        HarvestViewBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HarvestViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HarvestViewBtnActionPerformed(evt);
            }
        });
        Sidebar.add(HarvestViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");
        Sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 23, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin");
        Sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 58, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/user.png"))); // NOI18N
        Sidebar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        DashboardViewBtn.setBackground(new java.awt.Color(14, 79, 85));
        DashboardViewBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        DashboardViewBtn.setForeground(new java.awt.Color(255, 255, 255));
        DashboardViewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dashboard.png"))); // NOI18N
        DashboardViewBtn.setText("   DASHBOARD");
        DashboardViewBtn.setBorder(null);
        DashboardViewBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DashboardViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardViewBtnActionPerformed(evt);
            }
        });
        Sidebar.add(DashboardViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Sidebar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 20));

        FragmentManager.setLayout(new java.awt.CardLayout());

        DashboardFragment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FeedPanel.setBackground(new java.awt.Color(164, 196, 181));
        FeedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/total-feed.png"))); // NOI18N
        FeedPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 33, -1, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Feed");
        FeedPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 16, -1, -1));

        TotalFeedLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        TotalFeedLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalFeedLabel.setText("30");
        FeedPanel.add(TotalFeedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 63, -1, -1));

        DashboardFragment.add(FeedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 370, 170));

        WaterPanel.setBackground(new java.awt.Color(164, 196, 181));
        WaterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/total-water.png"))); // NOI18N
        WaterPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 34, -1, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Water");
        WaterPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 18, -1, -1));

        TotalWaterLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        TotalWaterLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalWaterLabel.setText("12");
        WaterPanel.add(TotalWaterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        DashboardFragment.add(WaterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 370, 170));

        HarvestPanel.setBackground(new java.awt.Color(164, 196, 181));
        HarvestPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/total-harvest.png"))); // NOI18N
        HarvestPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 39, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Harvest");
        HarvestPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 17, -1, -1));

        TotalHarvestLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 70)); // NOI18N
        TotalHarvestLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalHarvestLabel.setText("133");
        HarvestPanel.add(TotalHarvestLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        DashboardFragment.add(HarvestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 370, 170));

        FragmentManager.add(DashboardFragment, "card2");

        FeedFragment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FeedsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Amount (kg)", "Price (Php)", "Date"
            }
        ));
        FeedsTable.setPreferredSize(new java.awt.Dimension(225, 100));
        FeedsTable.getTableHeader().setReorderingAllowed(false);
        FeedsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FeedsTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(FeedsTable);

        FeedFragment.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1440, 540));

        DeleteFeedBtn.setBackground(new java.awt.Color(164, 196, 181));
        DeleteFeedBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        DeleteFeedBtn.setText("Delete Feed");
        DeleteFeedBtn.setBorder(null);
        DeleteFeedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFeedBtnActionPerformed(evt);
            }
        });
        FeedFragment.add(DeleteFeedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 200, 50));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel14.setText("Amount(kg) :");
        FeedFragment.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));
        FeedFragment.add(AddFeedAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 200, 50));

        AddFeedBtn.setBackground(new java.awt.Color(164, 196, 181));
        AddFeedBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        AddFeedBtn.setText("Add Feed");
        AddFeedBtn.setBorder(null);
        AddFeedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFeedBtnActionPerformed(evt);
            }
        });
        FeedFragment.add(AddFeedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 200, 50));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel15.setText("Price :");
        FeedFragment.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 690, -1, -1));
        FeedFragment.add(AddFeedPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 730, 200, 50));

        UpdateFeedID.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        UpdateFeedID.setText("?");
        FeedFragment.add(UpdateFeedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 730, -1, -1));

        UpdateFeedBtn.setBackground(new java.awt.Color(164, 196, 181));
        UpdateFeedBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        UpdateFeedBtn.setText("Update Feed");
        UpdateFeedBtn.setBorder(null);
        UpdateFeedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateFeedBtnActionPerformed(evt);
            }
        });
        FeedFragment.add(UpdateFeedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 800, 200, 50));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel17.setText("Amount(kg) :");
        FeedFragment.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 690, -1, -1));
        FeedFragment.add(UpdateFeedAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 730, 200, 50));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel18.setText("Price :");
        FeedFragment.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, -1, -1));
        FeedFragment.add(UpdateFeedPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 730, 200, 50));

        RefreshFeedBtn.setBackground(new java.awt.Color(164, 196, 181));
        RefreshFeedBtn.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        RefreshFeedBtn.setText("Refresh Feeds");
        RefreshFeedBtn.setBorder(null);
        RefreshFeedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshFeedBtnActionPerformed(evt);
            }
        });
        FeedFragment.add(RefreshFeedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 600, 200, 50));

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel25.setText("ID :");
        FeedFragment.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, -1, -1));

        FragmentManager.add(FeedFragment, "card3");

        WaterFragment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Date", "Amount ( L )"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        WaterFragment.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1440, 540));

        jButton8.setBackground(new java.awt.Color(164, 196, 181));
        jButton8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton8.setText("Delete Water");
        jButton8.setBorder(null);
        WaterFragment.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 200, 50));
        WaterFragment.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 370, 50));

        jLabel19.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel19.setText("Amount(L) :");
        WaterFragment.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        jButton7.setBackground(new java.awt.Color(164, 196, 181));
        jButton7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton7.setText("Add Water");
        jButton7.setBorder(null);
        WaterFragment.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 200, 50));
        WaterFragment.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 730, 290, 50));

        jLabel20.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel20.setText("ID :");
        WaterFragment.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, -1, -1));

        jButton6.setBackground(new java.awt.Color(164, 196, 181));
        jButton6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton6.setText("Update Water");
        jButton6.setBorder(null);
        WaterFragment.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 800, 200, 50));
        WaterFragment.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 730, 370, 50));

        jLabel21.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel21.setText("Amount(L) :");
        WaterFragment.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 690, -1, -1));

        FragmentManager.add(WaterFragment, "card5");

        HarvestFragment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Date", "Amount ( Per Chicken )"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        HarvestFragment.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 1440, 540));

        jButton9.setBackground(new java.awt.Color(164, 196, 181));
        jButton9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton9.setText("Delete Harvest");
        jButton9.setBorder(null);
        HarvestFragment.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 200, 50));

        jLabel22.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel22.setText("Amount(Per Chicken) :");
        HarvestFragment.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));
        HarvestFragment.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 370, 50));

        jButton10.setBackground(new java.awt.Color(164, 196, 181));
        jButton10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton10.setText("Add Harvest");
        jButton10.setBorder(null);
        HarvestFragment.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 200, 50));
        HarvestFragment.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 290, 50));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel23.setText("ID :");
        HarvestFragment.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, -1, -1));

        jButton11.setBackground(new java.awt.Color(164, 196, 181));
        jButton11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jButton11.setText("Update Harvest");
        jButton11.setBorder(null);
        HarvestFragment.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 800, 200, 50));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel24.setText("Amount(Per Chicken) :");
        HarvestFragment.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 690, -1, -1));
        HarvestFragment.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 730, 370, 50));

        FragmentManager.add(HarvestFragment, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Topbar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(FragmentManager, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FragmentManager, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetSelectedIDs() {
        FeedSelectedID = -1;
    }
    
    private void LoadTable(PropType ptype) {
        DefaultTableModel DTM = new DefaultTableModel();
                
        switch(ptype) {
            case Feed:
                DTM.setColumnIdentifiers(new Object[] {"Id", "Amount (kg)", "Price (Php)", "Date"});
                
                ArrayList<FeedModel> feeds = RepositoryProvider.getProvider().getFeedRepo().getFeeds();
                feeds.stream().forEachOrdered(feedHolder -> {
                    DTM.addRow(new Object[] {
                        feedHolder.getId(),
                        feedHolder.getAmount(),
                        feedHolder.getPrice(),
                        sdm.format(feedHolder.getTimestamp())
                    });
                });
                
                FeedsTable.setModel(DTM);
                break;
        }
    }
    
    
    private void FeedViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedViewBtnActionPerformed
        // TODO add your handling code here:
        ((CardLayout)FragmentManager.getLayout()).show(FragmentManager, "card3");
        ResetSelectedIDs();
    }//GEN-LAST:event_FeedViewBtnActionPerformed

    private void WaterViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaterViewBtnActionPerformed
        // TODO add your handling code here:
        ((CardLayout)FragmentManager.getLayout()).show(FragmentManager, "card5");
        ResetSelectedIDs();
    }//GEN-LAST:event_WaterViewBtnActionPerformed

    private void HarvestViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HarvestViewBtnActionPerformed
        // TODO add your handling code here:
        ((CardLayout)FragmentManager.getLayout()).show(FragmentManager, "card4");
        ResetSelectedIDs();
    }//GEN-LAST:event_HarvestViewBtnActionPerformed

    private void DashboardViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardViewBtnActionPerformed
        // TODO add your handling code here:
        ((CardLayout)FragmentManager.getLayout()).show(FragmentManager, "card2");
        ResetSelectedIDs();
    }//GEN-LAST:event_DashboardViewBtnActionPerformed

    private void FeedsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeedsTableMousePressed
        // TODO add your handling code here:
        int rowSelected = FeedsTable.getSelectedRow();
        
        // Update [Update Feed Information]
        UpdateFeedID.setText(FeedsTable.getValueAt(rowSelected, 0).toString());
        UpdateFeedAmount.setText(FeedsTable.getValueAt(rowSelected, 1).toString());
        UpdateFeedPrice.setText(FeedsTable.getValueAt(rowSelected, 2).toString());
        
        // Update [Delete Feed Information]
        FeedSelectedID = Integer.parseInt(FeedsTable.getValueAt(rowSelected, 0).toString());
    }//GEN-LAST:event_FeedsTableMousePressed

    private void DeleteFeedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFeedBtnActionPerformed
        // TODO add your handling code here:
        // Check Validity
        if(FeedSelectedID < 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed ID", "Delete Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Assemble Class
        FeedModel feed = new FeedModel();
        feed.setId(FeedSelectedID);
        
        // Perform Operation
        RepositoryProvider.getProvider().getFeedRepo().deleteFeed(feed);
        
        // Success Message
        JOptionPane.showMessageDialog(rootPane, "Feed Entry Deleted Successfully", "Feed Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_DeleteFeedBtnActionPerformed

    private void AddFeedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFeedBtnActionPerformed
        // TODO add your handling code here:
        double Amount, Price;
        
        try {
            Amount = Double.parseDouble(AddFeedAmount.getText().trim());
            Price = Double.parseDouble(AddFeedPrice.getText().trim());
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed Inputs", "Add Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Check Validity
        if (Amount < 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed Amount", "Add Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Price < 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed Price", "Add Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Assemble Class
        FeedModel feed = new FeedModel();
        feed.setAmount(Amount);
        feed.setPrice(Price);
        feed.setTimestamp(new Timestamp(new java.util.Date().getTime()));
        
        // Perform Operation
        RepositoryProvider.getProvider().getFeedRepo().addFeed(feed);
        
        // Success Message
        JOptionPane.showMessageDialog(rootPane, "Feed Entry Added Successfully", "Feed Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AddFeedBtnActionPerformed

    private void UpdateFeedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateFeedBtnActionPerformed
        // TODO add your handling code here:
        double Amount, Price;
        
        try {
            Amount = Double.parseDouble(UpdateFeedAmount.getText().trim());
            Price = Double.parseDouble(UpdateFeedPrice.getText().trim());
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed Inputs", "Update Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Check Validity
        if (Amount < 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed Amount", "Update Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Price < 0) {
            JOptionPane.showMessageDialog(rootPane, "Invalid Feed Price", "Update Feed Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Assemble Class
        FeedModel feed = new FeedModel();
        feed.setId(Integer.parseInt(UpdateFeedID.getText()));
        feed.setAmount(Amount);
        feed.setPrice(Price);
        feed.setTimestamp(new Timestamp(new java.util.Date().getTime()));
        
        // Perform Operation
        RepositoryProvider.getProvider().getFeedRepo().updateFeed(feed);
        
        // Success Message
        JOptionPane.showMessageDialog(rootPane, "Feed Entry Updated Successfully", "Feed Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_UpdateFeedBtnActionPerformed

    private void RefreshFeedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshFeedBtnActionPerformed
        // TODO add your handling code here:
        
        LoadTable(PropType.Feed);
    }//GEN-LAST:event_RefreshFeedBtnActionPerformed

    
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
            javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddFeedAmount;
    private javax.swing.JButton AddFeedBtn;
    private javax.swing.JTextField AddFeedPrice;
    private javax.swing.JPanel DashboardFragment;
    private javax.swing.JButton DashboardViewBtn;
    private javax.swing.JButton DeleteFeedBtn;
    private javax.swing.JPanel FeedFragment;
    private javax.swing.JPanel FeedPanel;
    private javax.swing.JButton FeedViewBtn;
    private javax.swing.JTable FeedsTable;
    private javax.swing.JPanel FragmentManager;
    private javax.swing.JPanel HarvestFragment;
    private javax.swing.JPanel HarvestPanel;
    private javax.swing.JButton HarvestViewBtn;
    private javax.swing.JButton RefreshFeedBtn;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel Topbar;
    private javax.swing.JLabel TotalFeedLabel;
    private javax.swing.JLabel TotalHarvestLabel;
    private javax.swing.JLabel TotalWaterLabel;
    private javax.swing.JTextField UpdateFeedAmount;
    private javax.swing.JButton UpdateFeedBtn;
    private javax.swing.JLabel UpdateFeedID;
    private javax.swing.JTextField UpdateFeedPrice;
    private javax.swing.JPanel WaterFragment;
    private javax.swing.JPanel WaterPanel;
    private javax.swing.JButton WaterViewBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
