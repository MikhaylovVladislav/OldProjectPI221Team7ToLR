package lr4.src.Laba2;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.awt.event.*;
import javax.swing.*;

import java.nio.file.AccessDeniedException;
import java.nio.file.FileVisitResult;
import static java.nio.charset.StandardCharsets.UTF_8;
// ����� ����������� ��������� (�������� ������� ������)
public class ListenerButtonBack implements ActionListener {
	JFrame abc = new JFrame("subversion");	// �������� ������������ ����
	JTextArea asd = new JTextArea(20, 30);
	
	public ListenerButtonBack() throws IOException {
		
		
	abc.setTitle ("��� ���������� � �������� �������� ������!!!"); // ������ ���������
	abc.setBounds(500,400,480,400); //������� ����
	abc.setResizable(false); // ������������� ������ ����
	
	
	JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	
	JLabel lam = new JLabel("1) ��������� �������������, ����� �������� ������ - 030");
	lam.setBounds(10,0,450,30);
	
	JLabel zzz = new JLabel("2) ������� ����������, ����� �������� ������ - 600, 06.03.2021");
	zzz.setBounds(10,20,450,60);
	
	JLabel ddd = new JLabel("3) ������ ����������, ����� �������� ������ - 015, 06.03.2021");
	ddd.setBounds(10,40,450,90); 
	
	JLabel ccc = new JLabel("4) ����� ����������, ����� �������� ������ - 151, 06.03.2021");
	ccc.setBounds(10,60,450,120);
	
	asd.setBounds(10,150,440,140);

	try {

	List<String> lines = Files.readAllLines(Paths.get(subversion.resulturl), UTF_8);
	for (String s: lines) {

	asd.append(s+System.lineSeparator());

	}

	} catch (NoSuchFileException e) {

	System.out.println("������! ���� �� ������!");
	} catch (AccessDeniedException e) {

	System.out.println("������! ���� �� ������!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	main_panel.add(lam); // ���������� ������ �� ������
	main_panel.add(zzz); // ���������� ������ �� ������
	main_panel.add(ddd); // ���������� ������ �� ������
	main_panel.add(ccc); // ���������� ������ �� ������
	main_panel.add(asd); // ���������� ������ �� ������
	abc.add(main_panel); // ���������� ������ �� ������
	
	
	JButton button_back = new JButton("�����"); // ��������� ������ �������� �����
	button_back.setBounds(170,200,110,40);
	main_panel.add(button_back); // ���������� ������ �� 2 ������
		
	button_back.addActionListener(this); // ��������� ��������� � ������
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	abc.setVisible(true); // ��������� ����
	
	abc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // �������� ���� JFrame � �������� Java
	
	
}



	//@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		abc.dispose();
	
	}
	
	

	
}
