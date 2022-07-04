package membuatpaintsederhana;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
*
* @author Anzalf
*/
public class MembuatPaintSederhana {
 
 public static void main(String[] args) {
 
 //ambil gambar
 Icon iconHitam = new ImageIcon("./src/img/black.png");
 Icon iconBiru = new ImageIcon("./src/img/blue.png");
 Icon iconCyan = new ImageIcon("./src/img/cyan.png");
 Icon iconHijau = new ImageIcon("./src/img/green.png");
 Icon iconMagenta = new ImageIcon("./src/img/magenta.png");
 Icon iconOren = new ImageIcon("./src/img/orange.png");
 Icon iconPink = new ImageIcon("./src/img/pink.png");
 Icon iconMerah = new ImageIcon("./src/img/red.png");
 Icon iconKuning = new ImageIcon("./src/img/yellow.png");
 
 JFrame frame = new JFrame("Paint Sederhana");
 Container content = frame.getContentPane(); //membuat container pada frame
 content.setLayout(new BorderLayout()); //membuat border layout
 
 final PanelGambar panelGambar = new PanelGambar(); //memanggil class method 
//PanelGambar()
 content.add(panelGambar, BorderLayout.CENTER); //mengatur posisi border
 
 //mengatur ukuran panel
 int lebarPanel = 90;
 int tinggiPanel = 68;
 JPanel panel = new JPanel();
 panel.setPreferredSize(new Dimension(lebarPanel, tinggiPanel)); //ukuran panelnya
 
 JButton tombolHapus = new JButton("Hapus"); //tombol hapus
 tombolHapus.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.hapus(); //memanggil method hapus()
 }
 });
 
 JButton tombolHapusSemua = new JButton("Hapus Semua"); //tombol hapus semua
 tombolHapusSemua.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.hapusSemua(); //memanggil method hapusSemua()
 
 JOptionPane.showConfirmDialog(null, "Berhasil Dihapus", "Peringatan",
 JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
 }
 });
 
 JButton tombolMerah = new JButton(iconMerah);
 tombolMerah.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaMerah(); //memanggil method warnaMerah()
 }
 });
 
 JButton tombolHitam = new JButton(iconHitam);
 tombolHitam.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaHitam(); //memanggil method warnaHitam()
 }
 });
 
 JButton tombolMagenta = new JButton(iconMagenta);
 tombolMagenta.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaMagenta(); //memanggil method warnaMagenta()
 }
 });
 
 JButton tombolBiru = new JButton(iconBiru);
 tombolBiru.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaBiru(); //memanggil method warnaBiru()
 }
 });
 
 JButton tombolHijau = new JButton(iconHijau);
 tombolHijau.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaHijau(); //memanggil method warnaHijau()
 }
 });
 
 JButton tombolKuning = new JButton(iconKuning);
 tombolKuning.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaKuning(); //memanggil method warnaKuning()
 }
 });
 
 JButton tombolOren = new JButton(iconOren);
 tombolOren.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaOren(); //memanggil method warnaKuning()
 }
 });
 
 JButton tombolCyan = new JButton(iconCyan);
 tombolCyan.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaCyan(); //memanggil method warnaKuning()
 }
 });
 
 JButton tombolPink = new JButton(iconPink);
 tombolPink.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 panelGambar.warnaPink(); //memanggil method warnaKuning()
 }
 });
 
 
 //mengatur ukuran button
 int lebarTombol = 16;
 int tinggiTombol = 16;
 
 tombolMerah.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolHitam.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolMagenta.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolBiru.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolHijau.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolKuning.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolOren.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolCyan.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 tombolPink.setPreferredSize(new Dimension(lebarTombol, tinggiTombol));
 
 //nambahin tombol pada panel
 panel.add(tombolHapus);
 panel.add(tombolHapusSemua);
 panel.add(tombolMerah);
 panel.add(tombolHitam);
 panel.add(tombolMagenta);
 panel.add(tombolBiru);
 panel.add(tombolHijau);
 panel.add(tombolKuning);
 panel.add(tombolOren);
 panel.add(tombolCyan);
 panel.add(tombolPink);
 
 content.add(panel, BorderLayout.WEST); //mengatur panel tombol berada disebelah kiri
 frame.setSize(600, 500); //mengatur ukuran frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //untuk close program ketika di klik 
exit
 frame.setVisible(true);
 } 
}
class PanelGambar extends JComponent {
 
 Image image;
 Graphics2D graphics2D;
 int currentX, currentY, oldX, oldY; // menyimpan koordinat mouse
 
 public PanelGambar() {
 
 setDoubleBuffered(false);
 
 //ketika mouse ditekan
 addMouseListener(new MouseAdapter() {
 public void mousePressed(MouseEvent e) {
 //mengambil koordinat x dan y mouse
 oldX = e.getX();
 oldY = e.getY();
 }
 });
 
 //ketika mouse digeser
 addMouseMotionListener(new MouseMotionAdapter() {
 public void mouseDragged(MouseEvent e) {
 currentX = e.getX(); //mengatur nilai current x sbg koordinat mouse x
 currentY = e.getY(); //mengatur nilai current y sbg koordinat mouse y
 
 if (graphics2D != null) { // kondisi jika graphics2D tidak null
 graphics2D.drawLine(oldX, oldY, currentX,currentY); //menggambar garis pada koordinat
 }
 
 repaint();
 
 oldX = currentX; //mengatur old sbg current
 oldY = currentY;
 }
 });
 }
 
 public void paintComponent(Graphics g) {
 
 if (image == null) { // kondisi jika variabel image null
 
 image = createImage(getSize().width, getSize().height); //membuat ukuran window
 graphics2D = (Graphics2D) image.getGraphics(); //mengatue nilai graphics sbg image
 graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
RenderingHints.VALUE_ANTIALIAS_ON);
 
 hapusSemua(); //menjalankan method hapussemua() 
 }
 
 g.drawImage(image,0, 0, null); //menggambar image
 }
 
 public void hapusSemua() {
 graphics2D.setPaint(Color.WHITE); //set warna putih
 graphics2D.fillRect(0, 0, getSize().width, getSize().height); // mengisi window dgn warna putih
 repaint();
 }
 
 public void hapus() {
 graphics2D.setPaint(Color.WHITE);
 repaint();
 }
 
 public void warnaMerah() {
 graphics2D.setPaint(Color.RED);
 repaint();
 }
 
 public void warnaHitam() {
 graphics2D.setPaint(Color.BLACK);
 repaint();
 }
 
 public void warnaMagenta() {
 graphics2D.setPaint(Color.MAGENTA);
 repaint();
 }
 
 public void warnaBiru() {
 graphics2D.setPaint(Color.BLUE);
 repaint();
 }
 
 public void warnaHijau() {
 graphics2D.setPaint(Color.GREEN);
 repaint();
 }
 
 public void warnaKuning() {
 graphics2D.setPaint(Color.YELLOW);
 repaint();
 }
 
 public void warnaOren() {
 graphics2D.setPaint(Color.ORANGE);
 repaint();
 }
 
 public void warnaCyan() {
 graphics2D.setPaint(Color.CYAN);
 repaint();
 }
 
 public void warnaPink() {
 graphics2D.setPaint(Color.PINK);
 repaint();
 }
 
}
