import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class SwingOtomat {

	private JFrame frame;
	private JTextField txtToplam;
	double toplam = 0;
	int countCola = 0;
	int countFanta = 0;
	int countSprite = 0;
	double kalan;
	private JButton btn10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingOtomat window = new SwingOtomat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingOtomat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 950, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btn5Krs = new JButton("");
		btn5Krs.setForeground(Color.LIGHT_GRAY);
		btn5Krs.setBackground(Color.LIGHT_GRAY);
		btn5Krs.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\50.png"));
		btn5Krs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\coindrop.wav";    
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				txtToplam.setText("0.5");
				toplam += 0.5;
				txtToplam.setText(String.valueOf(toplam));

			}
		});
		btn5Krs.setBounds(620, 36, 75, 75);
		frame.getContentPane().add(btn5Krs);

		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\1.png"));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\coindrop.wav";    
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				txtToplam.setText("1");
				toplam += 1;
				txtToplam.setText(String.valueOf(toplam));
			}
		});
		btn1.setBounds(772, 31, 80, 80);
		frame.getContentPane().add(btn1);

		btn10 = new JButton("");
		btn10.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\10TL.png"));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\money.wav";    
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				txtToplam.setText("10");
				toplam += 10;
				txtToplam.setText(String.valueOf(toplam));
			}
		});
		btn10.setBounds(574, 142, 121, 68);
		frame.getContentPane().add(btn10);

		JButton btn20 = new JButton("");
		btn20.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\20.png"));
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\money.wav";    
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				txtToplam.setText("20");
				toplam += 20;
				txtToplam.setText(String.valueOf(toplam));
			}
		});
		btn20.setBounds(737, 124, 160, 82);
		frame.getContentPane().add(btn20);

		txtToplam = new JTextField();
		txtToplam.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtToplam.setEditable(false);
		txtToplam.setText("0");
		txtToplam.setBounds(690, 255, 116, 22);
		frame.getContentPane().add(txtToplam);
		txtToplam.setColumns(10);

		JLabel lblNewLabel = new JLabel("Toplam Para");
		lblNewLabel.setBounds(586, 258, 84, 16);
		frame.getContentPane().add(lblNewLabel);

		JButton btnBuy1 = new JButton("Buy");
		btnBuy1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				if (Double.parseDouble(txtToplam.getText()) > 2.5) {
					try {
						String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\vending.wav";    
						AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
						Clip clip = AudioSystem.getClip();
						clip.open(audioInputStream);
						clip.start();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					kalan = Double.parseDouble(txtToplam.getText()) - 2.5;
					txtToplam.setText(String.valueOf(kalan));
					countCola++;
				} else
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye!");

			}
		});
		btnBuy1.setBounds(46, 350, 97, 30);
		frame.getContentPane().add(btnBuy1);

		JButton btnBuy2 = new JButton("Buy");
		btnBuy2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (Double.parseDouble(txtToplam.getText()) > 3) {
					try {
						String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\vending.wav";    
						AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
						Clip clip = AudioSystem.getClip();
						clip.open(audioInputStream);
						clip.start();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					kalan = Double.parseDouble(txtToplam.getText()) - 3;
					txtToplam.setText(String.valueOf(kalan));
					countFanta++;
				} else
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye!");
			}
		});
		btnBuy2.setBounds(200, 350, 97, 30);
		frame.getContentPane().add(btnBuy2);

		JButton btnBuy3 = new JButton("Buy");
		btnBuy3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				if (Double.parseDouble(txtToplam.getText()) >= 12) {
					try {
						String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\vending.wav";    
						AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
						Clip clip = AudioSystem.getClip();
						clip.open(audioInputStream);
						clip.start();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					kalan = Double.parseDouble(txtToplam.getText()) - 12;
					txtToplam.setText(String.valueOf(kalan));
					countSprite++;
				} else
					JOptionPane.showMessageDialog(null, "Yetersiz Bakiye!");
			}
		});
		btnBuy3.setBounds(357, 350, 97, 30);
		frame.getContentPane().add(btnBuy3);

		JButton btnTake = new JButton("Take Drinks");
		btnTake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\vending.wav";    
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,
						countCola + " Coca Cola, " + countFanta + " Fanta, " + countSprite + " Sprite satýn aldýnýz!");
			}
		});
		btnTake.setBounds(187, 449, 123, 30);
		frame.getContentPane().add(btnTake);

		JButton btnGetMoney = new JButton("Get Money");
		btnGetMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String soundName = "C:\\Users\\Asus\\Desktop\\Otomat Materyal\\coindrop.wav";    
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(null, kalan + " Tl Geri Aldýnýz!");
				txtToplam.setText("0");
				toplam = 0;

			}
		});
		btnGetMoney.setBounds(620, 384, 97, 37);
		frame.getContentPane().add(btnGetMoney);

		JButton btnAddMoney = new JButton("Add Money");
		btnAddMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Para Eklemek Ýster Misiniz?", "Select an Option...",
						JOptionPane.YES_NO_OPTION);

				if (input == JOptionPane.YES_OPTION) {
					
					JOptionPane.showMessageDialog(null, "Para Eklemeye Devam Edebilirsiniz!");
					if(btn5Krs.isEnabled()==false)
						btn5Krs.setEnabled(true);
					if(btn1.isEnabled()==false)
						btn1.setEnabled(true);
					if(btn10.isEnabled()==false)
						btn10.setEnabled(true);
					if(btn20.isEnabled()==false)
						btn20.setEnabled(true);
				}
					
				
				else {
					/*
					 * btnBuy1.setVisible(false); btnBuy2.setVisible(false);
					 * btnBuy3.setVisible(false);
					 */
					btn5Krs.setEnabled(false);
					btn1.setEnabled(false);
					btn10.setEnabled(false);
					btn20.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Çýkýþ Yapabilirsiniz!");
				}
			}
		});
		btnAddMoney.setBounds(620, 467, 97, 37);
		frame.getContentPane().add(btnAddMoney);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnExit.setBounds(755, 416, 97, 55);
		frame.getContentPane().add(btnExit);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 36, 447, 301);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(12, 39, 116, 221);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\spritep.png"));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\fp.png"));
		lblNewLabel_2.setBounds(168, 39, 116, 221);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Asus\\Desktop\\Otomat Materyal\\cp.png"));
		lblNewLabel_4.setBounds(319, 39, 116, 221);
		panel.add(lblNewLabel_4);
		
				JLabel lblNewLabel_1 = new JLabel("2,5 TL");
				lblNewLabel_1.setBounds(47, 273, 42, 16);
				panel.add(lblNewLabel_1);
				
						JLabel lblTl = new JLabel("3 TL");
						lblTl.setBounds(211, 273, 42, 16);
						panel.add(lblTl);
						
								JLabel lblTl_1 = new JLabel("12 TL");
								lblTl_1.setBounds(365, 273, 42, 16);
								panel.add(lblTl_1);
	}
}
