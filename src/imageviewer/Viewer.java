/*
 * Viewer.java
 *
 * Created on 26 Apr, 2011, 11:30:46 AM
 */

package imageviewer;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
/**
 *
 * @author Chinmay
 */
public class Viewer extends javax.swing.JFrame {
    
    BufferedImage image1,image2,image3,image4; //images for thumbnails that are updated every time an image is opened
    BufferedImage lImage1,lImage2,lImage3,lImage4; //images that are set as thumbnails on user's actions
    
    /** Creates new form Viewer */
    public Viewer() {
        initComponents();
        BufferedImage image;
        this.setSize(1060, 705);   //default window size
        this.setLocation(100,20); //center of the screen
        jRadioButton1.setSelected(Boolean.TRUE); //default selection
        
        try{
            //load images for previews
            File file=new File("a.jpg");
            image1=ImageIO.read(file);
            file=new File("b.jpg");
            image2=ImageIO.read(file);
            file=new File("c.jpg");
            image3=ImageIO.read(file);
            file=new File("d.jpg");
            image4=ImageIO.read(file);

            //generate thumbnails
            file=new File("a.jpg");
            image=ImageIO.read(file);
            Image thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel1.setSize(new Dimension(14,14));
            ImageIcon icon=new ImageIcon(thumb);
            jLabel1.setIcon(icon);
            jLabel1.setText("");
            //jInternalFrame1.setFrameIcon(icon);

            file=new File("b.jpg");
            image=ImageIO.read(file);
            thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel2.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel2.setIcon(icon);
            jLabel2.setText("");

            file=new File("c.jpg");
            image=ImageIO.read(file);
            thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel3.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel3.setIcon(icon);
            jLabel3.setText("");

            file=new File("d.jpg");
            image=ImageIO.read(file);
            thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel4.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel4.setIcon(icon);
            jLabel4.setText("");
        }catch(Exception e){System.out.println(e);}
    }

    //Netbeans generated code:
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        label1 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Browse Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        label1.setFont(new java.awt.Font("Tahoma", 1, 12));
        label1.setText("Preview:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Default");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Recent Images");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(874, 874, 874)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BufferedImage image;
        try{
            //prompt user to choose a file
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION){
                File file=fileChooser.getSelectedFile();
                image=ImageIO.read(file);
                ImageIcon icon;
                float width=image.getWidth();
                float height=image.getHeight();
                
                //Determine how the image has to be scaled if it is large:
                if(image.getHeight()>500 && (width/height)>1){
                    Image thumb = image.getScaledInstance(-1, 620, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else if(image.getHeight() > 500 && (width / height) <= 1)
                {
                    Image thumb = image.getScaledInstance(470, -1, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else {icon = new ImageIcon(image);}
                jLabel5.setIcon(icon);
                //update
                image4=image3;
                image3=image2;
                image2=image1;
                image1=image;
                jRadioButton1.setSelected(Boolean.TRUE);
                //if(jRadioButton2.isSelected()){setPreviews();}
                jLabel5.setText("");
            }
            
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    public void refresh(){
        //Refresh thumbnails
        lImage1=image1;
        lImage2=image2;
        lImage3=image3;
        lImage4=image4;
    }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
         try{
             //determine which thumbnails to display: recent or default
             BufferedImage image;
             if(jRadioButton1.isSelected()){
                 File file=new File("b.jpg");
                 image=ImageIO.read(file);
             }
             else if(jRadioButton2.isSelected()){
                 image=lImage2;
             }
             else{
                 File file=new File("b.jpg");
                 image=ImageIO.read(file);
             }

                ImageIcon icon;
                float width=image.getWidth();
                float height=image.getHeight();
                
                //Determine how the image has to be scaled if it is large:
                if(image.getHeight()>500 && (width/height)>1){
                    //System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(-1, 620, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else if(image.getHeight() > 500 && (width / height) <= 1)
                {
                    //System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(470, -1, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else {icon = new ImageIcon(image);}
            jLabel5.setIcon(icon);
                image4=image3;
                image3=image2;
                image2=image1;
                image1=image;
                
                //if(jRadioButton2.isSelected()){setPreviews();}
            jLabel5.setText("");
        }catch(Exception e){System.out.println(e);}
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         try{
             //determine which thumbnails to display: recent or default
             BufferedImage image;
             if(jRadioButton1.isSelected()){
                 File file=new File("a.jpg");
                 image=ImageIO.read(file);
             }
             else if(jRadioButton2.isSelected()){
                 image=lImage1;
             }
             else{
                 File file=new File("a.jpg");
                 image=ImageIO.read(file);
             }
                ImageIcon icon;
                float width=image.getWidth();
                float height=image.getHeight();
                
                //Determine how the image has to be scaled if it is large:
                if(image.getHeight()>500 && (width/height)>1){
                    //System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(-1, 620, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else if(image.getHeight() > 500 && (width / height) <= 1)
                {
                    Image thumb = image.getScaledInstance(470, -1, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else {icon = new ImageIcon(image);}            jLabel5.setIcon(icon);
                image4=image3;
                image3=image2;
                image2=image1;
                image1=image;
                jLabel5.setText("");
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         try{
             //determine which thumbnails to display: recent or default
             BufferedImage image;
             if(jRadioButton1.isSelected()){
                 File file=new File("c.jpg");
                 image=ImageIO.read(file);
             }
             else if(jRadioButton2.isSelected()){
                 image=lImage3;
             }
             else{
                 File file=new File("c.jpg");
                 image=ImageIO.read(file);
             }
                ImageIcon icon;
                float width=image.getWidth();
                float height=image.getHeight();
                
                //Determine how the image has to be scaled if it is large:
                if(image.getHeight()>500 && (width/height)>1){
                    //System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(-1, 620, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else if(image.getHeight() > 500 && (width / height) <= 1)
                {
                    //System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(470, -1, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else {icon = new ImageIcon(image);}            jLabel5.setIcon(icon);
                image4=image3;
                image3=image2;
                image2=image1;
                image1=image;
                //if(jRadioButton2.isSelected()){setPreviews();}
            jLabel5.setText("");
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         try{
             //determine which thumbnails to display: recent or default
             BufferedImage image;
             if(jRadioButton1.isSelected()){
                 File file=new File("d.jpg");
                 image=ImageIO.read(file);
             }
             else if(jRadioButton2.isSelected()){
                 image=lImage4;
             }
             else{
                 File file=new File("d.jpg");
                 image=ImageIO.read(file);
             }
                ImageIcon icon;
                float width=image.getWidth();
                float height=image.getHeight();
                
                //Determine how the image has to be scaled if it is large:
                if(image.getHeight()>500 && (width/height)>1){
                    //System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(-1, 620, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else if(image.getHeight() > 500 && (width / height) <= 1)
                {
                    System.out.println(image.getHeight());
                    Image thumb = image.getScaledInstance(470, -1, Image.SCALE_SMOOTH);
                    icon=new ImageIcon(thumb);
                }
                else {icon = new ImageIcon(image);}
            jLabel5.setIcon(icon);
                image4=image3;
                image3=image2;
                image2=image1;
                image1=image;
                //if(jRadioButton2.isSelected()){setPreviews();}
            jLabel5.setText("");
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] arg={"hello"};//dummy arguments
        Help.main(arg);//display help window
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        //determine which thumbnails to display: recent or default
        BufferedImage image;
        try{
            jRadioButton1.setSelected(Boolean.TRUE);
            File file=new File("a.jpg");
            image=ImageIO.read(file);
            Image thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel1.setSize(new Dimension(14,14));
            ImageIcon icon=new ImageIcon(thumb);
            jLabel1.setIcon(icon);
            jLabel1.setText("");
            //jInternalFrame1.setFrameIcon(icon);

            file=new File("b.jpg");
            image=ImageIO.read(file);
            thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel2.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel2.setIcon(icon);
            jLabel2.setText("");

            file=new File("c.jpg");
            image=ImageIO.read(file);
            thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel3.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel3.setIcon(icon);
            jLabel3.setText("");

            file=new File("d.jpg");
            image=ImageIO.read(file);
            thumb = image.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel4.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel4.setIcon(icon);
            jLabel4.setText("");
        }catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        setPreviews();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    public void setPreviews(){
        try{
            refresh();
            //generate thumbnails:
            jRadioButton2.setSelected(Boolean.TRUE);
            Image thumb = lImage1.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel1.setSize(new Dimension(14,14));
            ImageIcon icon=new ImageIcon(thumb);
            jLabel1.setIcon(icon);
            jLabel1.setText("");
            //jInternalFrame1.setFrameIcon(icon);

            thumb = lImage2.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel2.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel2.setIcon(icon);
            jLabel2.setText("");

            thumb = lImage3.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel3.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel3.setIcon(icon);
            jLabel3.setText("");

            thumb = lImage4.getScaledInstance(100, -1, Image.SCALE_SMOOTH);
            jLabel4.setSize(new Dimension(14,14));
            icon=new ImageIcon(thumb);
            jLabel4.setIcon(icon);
            jLabel4.setText("");
        }catch(Exception e){System.out.println(e);}
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
