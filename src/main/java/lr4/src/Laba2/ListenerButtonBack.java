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
// класс реализующий слушатель (ожидания нажатия кнопки)
public class ListenerButtonBack implements ActionListener {
	JFrame abc = new JFrame("subversion");	// создание графического окна
	JTextArea asd = new JTextArea(20, 30);
	
	public ListenerButtonBack() throws IOException {
		
		
	abc.setTitle ("ФИО участников с номерами зачетных книжек!!!"); // данные студентов
	abc.setBounds(500,400,480,400); //размеры окна
	abc.setResizable(false); // фиксированный размер окна
	
	
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	
	JLabel lam = new JLabel("1) Владислав Александрович, Номер зачетной книжки - 030");
	lam.setBounds(10,0,450,30);
	
	JLabel zzz = new JLabel("2) Арсений Гуннарович, Номер зачетной книжки - 600, 06.03.2021");
	zzz.setBounds(10,20,450,60);
	
	JLabel ddd = new JLabel("3) Максим Витальевич, Номер зачетной книжки - 015, 06.03.2021");
	ddd.setBounds(10,40,450,90); 
	
	JLabel ccc = new JLabel("4) Артем Николаевич, Номер зачетной книжки - 151, 06.03.2021");
	ccc.setBounds(10,60,450,120);
	
	asd.setBounds(10,150,440,140);

	try {

	List<String> lines = Files.readAllLines(Paths.get(subversion.resulturl), UTF_8);
	for (String s: lines) {

	asd.append(s+System.lineSeparator());

	}

	} catch (NoSuchFileException e) {

	System.out.println("Ошибка! Файл не найден!");
	} catch (AccessDeniedException e) {

	System.out.println("Ошибка! Файл не найден!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	main_panel.add(lam); // добавление текста на панель
	main_panel.add(zzz); // добавление текста на панель
	main_panel.add(ddd); // добавление текста на панель
	main_panel.add(ccc); // добавление текста на панель
	main_panel.add(asd); // добавление текста на панель
	abc.add(main_panel); // добавление текста на панель
	
	
	JButton button_back = new JButton("Назад"); // добавляем кнопку возврата назад
	button_back.setBounds(170,200,110,40);
	main_panel.add(button_back); // добавление кнопки на 2 панель
		
	button_back.addActionListener(this); // добавляем слушатель к кнопке
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	abc.setVisible(true); // видимость окна
	
	abc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	
}



	//@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		abc.dispose();
	
	}
	
	

	
}
