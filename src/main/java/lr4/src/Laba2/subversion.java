package lr4.src.Laba2;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)
import java.awt.event.*;//���������� ��� ������� ���������
public class subversion {
	
	static JComboBox combo; //���������� JComboBox
	JLabel button_logo = new JLabel("");//���������� JLabel
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	static String resulturl="C:\\Users\\Username\\Desktop\\test.txt";
		
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,300);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	

	
	
	
	
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	

	JButton button_information = new JButton("����������"); // ������� ������ "����������"
	button_information.setBounds(15,200,110,40); // ������ ������� ������
	ActionListener qqq = new ListenerButtonInfo(); // �������� ���������	
	button_information.addActionListener(qqq); // ��������� ��������� � ������
	main_panel.add(button_information); // ���������� ������ �� ������� ������
	
	
	
	
	
	JLabel vvod = new JLabel("������� a"); // ����������� ������
	vvod.setBounds(10,115,150,30);
	main_panel.add(vvod);
	
	final JTextField vvod1 = new JTextField(); //���� ��� ����� �
	vvod1.setBounds(10,140,50,20);
	main_panel.add(vvod1);
	
	JLabel vivod = new JLabel("s"); // ����������� ������
	vivod.setBounds(100,115,150,30);
	main_panel.add(vivod);
	
	final JTextField vivod1 = new JTextField(); //���� ��� ����� s
	vivod1.setBounds(100,140,50,20);
	
	
	main_panel.add(vivod1);
	
	
	class rasch implements ActionListener {
	     public void actionPerformed(ActionEvent e) {
	    	 int a = Integer.parseInt(vvod1.getText());
	    	 double j=Math.pow(a,2)*Math.sqrt(3)/4;
	    	 String s=Double.toString(j);
	    	 vivod1.setText(s);
	     }
	}
	JButton button = new JButton("������");
	ActionListener actionListener1 = new rasch();
	button.setBounds(270,120,100,40);
	button.addActionListener(actionListener1);	
	main_panel.add(button);
	
	
	
		
	
	
	
	JMenuBar bar = new JMenuBar();         // �������� JMenuBar
	main_GUI.setJMenuBar(bar);             // ���������� JMenuBar � ����������� ����
    JMenu GL = new JMenu("�������");       // �������� ������ ������� 
	JMenuItem logo = new JMenuItem("���������� ������� �����"); // �������� ������ ���������� ������� �����
	JMenuItem download = new JMenuItem("��������� ���� � ������7"); // �������� ������ ��������� ���� � ������7
	JMenuItem exit = new JMenuItem("�����");                    // �������� ������ �����
	
	class ListenerLogo implements ActionListener { 

		//@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			main_panel.add(button_logo);  // ��������� Label �� ������ 
			button_logo.setBounds(220,30,150,73); // ��������� ���� � ������ ��������
			 button_logo.setIcon(new ImageIcon("image/������� �����1.png")); //������� ��������
		}

		
	}

	class Listenerdl implements ActionListener {

		//@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
		public void actionPerformed(ActionEvent arg0) {

		// String result = JOptionPane.showInputDialog(subversion.this );
		resulturl=JOptionPane.showInputDialog(subversion.this, "C:\\New\\123.txt");

		}

		}
	
	
	
	
	
	
	
    exit.addActionListener(actionListener); // ��������� ��������� � ������ �����
	
    ActionListener logot = new ListenerLogo(); //������� ��������� ��� ������ ���������� ������� �����
	logo.addActionListener(logot); // ��������� ��������� � ������ ���������� ������� �����	
	
	ActionListener downloadt = new Listenerdl(); //������� ��������� ��� ������ ���������� ������� �����
	download.addActionListener(downloadt); // ��������� ��������� � ������ ���������� ������� �����
	
	
	
    bar.add(GL);                                      //���������� ������ ������� JMenuBar
    GL.add(logo);                                     //���������� ������ ��������� ������� ����� � JMenu
    GL.add(download);                                     //���������� ������ ��������� ���� � ������7 � JMenu
    GL.add(exit);                                     //���������� ������ ����� � JMenu
    
    String[] itemsa = { //���������� ������� ������
		    "����������� ������� ����� � ������� ������ ����",
		    "����������� ������� ����� � ��������",
		    "����������� ������� ����� � ����� ������� ����",
		    "������������� ������ � �������7"
		};
	
	class comb implements ActionListener { 

		//@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
		public void actionPerformed(ActionEvent e)
		{
		    if (e.getSource() == combo) {//�������� ��� ��������� JComboBox
		    	main_panel.remove(button_logo);
		    	if (combo.getSelectedItem()=="����������� ������� ����� � ������� ������ ����") {
		    		
					main_panel.add(button_logo);  // ��������� Label �� ������ 
					button_logo.setBounds(220,30,150,73); // ��������� ���� � ������ ��������
					 button_logo.setIcon(new ImageIcon("image/������� �����1.png")); //������� ��������
		    	}
		    	if (combo.getSelectedItem()=="����������� ������� ����� � ��������") {
		    		
					main_panel.add(button_logo);  // ��������� Label �� ������ 
					button_logo.setBounds(110,30,150,73); // ��������� ���� � ������ ��������
					 button_logo.setIcon(new ImageIcon("image/������� �����1.png")); //������� ��������
			    	}
		    	if (combo.getSelectedItem()=="����������� ������� ����� � ����� ������� ����") {
		    		
					main_panel.add(button_logo);  // ��������� Label �� ������ 
					button_logo.setBounds(22,30,150,73); // ��������� ���� � ������ ��������
					  button_logo.setIcon(new ImageIcon("image/������� �����1.png")); //������� ��������
			    	}
		   }
		}
	}
	combo = new JComboBox(itemsa); // ����������� �������� JComboBox
	combo.setBounds(50,170,310,20); // ������ ������� JComboBox
	ActionListener c = new comb(); // �������� ���������	
	combo.addActionListener(c); // ��������� ��������� � JComboBox
	main_panel.add(combo); // ���������� JComboBox �� ������� ������
    
    
   
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	
	
		
	}
	    
	
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}
}
