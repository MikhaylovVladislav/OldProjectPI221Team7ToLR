package lr4.src.Laba2;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import java.awt.event.*;//библиотека для события слушателя
public class subversion {
	
	static JComboBox combo; //добавление JComboBox
	JLabel button_logo = new JLabel("");//добавление JLabel
	JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	static String resulturl="C:\\Users\\Username\\Desktop\\test.txt";
		
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,300);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	

	
	
	
	
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	

	JButton button_information = new JButton("Информация"); // создаем кнопку "Информация"
	button_information.setBounds(15,200,110,40); // задаем размеры кнопки
	ActionListener qqq = new ListenerButtonInfo(); // создание слушателя	
	button_information.addActionListener(qqq); // добавляем слушатель к кнопке
	main_panel.add(button_information); // добавление кнопки на главную панель
	
	
	
	
	
	JLabel vvod = new JLabel("Введите a"); // Отображение текста
	vvod.setBounds(10,115,150,30);
	main_panel.add(vvod);
	
	final JTextField vvod1 = new JTextField(); //Поле для ввода а
	vvod1.setBounds(10,140,50,20);
	main_panel.add(vvod1);
	
	JLabel vivod = new JLabel("s"); // Отображение текста
	vivod.setBounds(100,115,150,30);
	main_panel.add(vivod);
	
	final JTextField vivod1 = new JTextField(); //Поле для ввода s
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
	JButton button = new JButton("расчёт");
	ActionListener actionListener1 = new rasch();
	button.setBounds(270,120,100,40);
	button.addActionListener(actionListener1);	
	main_panel.add(button);
	
	
	
		
	
	
	
	JMenuBar bar = new JMenuBar();         // создание JMenuBar
	main_GUI.setJMenuBar(bar);             // Добавление JMenuBar в графическое окно
    JMenu GL = new JMenu("Главная");       // Создание кнопки Главная 
	JMenuItem logo = new JMenuItem("Отобразить логотип УГАТУ"); // Создание кнопки Отобразить логотип УГАТУ
	JMenuItem download = new JMenuItem("Загрузить файл в проект7"); // Создание кнопки Загрузить файл в проект7
	JMenuItem exit = new JMenuItem("Выход");                    // Создание кнопки Выход
	
	class ListenerLogo implements ActionListener { 

		//@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			main_panel.add(button_logo);  // Вставляем Label на панель 
			button_logo.setBounds(220,30,150,73); // Положение окна и размер логотипа
			 button_logo.setIcon(new ImageIcon("image/Логотип УГАТУ1.png")); //Вставка логотипа
		}

		
	}

	class Listenerdl implements ActionListener {

		//@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
		public void actionPerformed(ActionEvent arg0) {

		// String result = JOptionPane.showInputDialog(subversion.this );
		resulturl=JOptionPane.showInputDialog(subversion.this, "C:\\New\\123.txt");

		}

		}
	
	
	
	
	
	
	
    exit.addActionListener(actionListener); // добавляем слушатель к кнопке Выход
	
    ActionListener logot = new ListenerLogo(); //создаем слушатель для кнопки Отобразить логотип УГАТУ
	logo.addActionListener(logot); // добавляем слушатель к кнопке Отобразить логотип УГАТУ	
	
	ActionListener downloadt = new Listenerdl(); //создаем слушатель для кнопки Отобразить логотип УГАТУ
	download.addActionListener(downloadt); // добавляем слушатель к кнопке Отобразить логотип УГАТУ
	
	
	
    bar.add(GL);                                      //Добавление кнопку Главная JMenuBar
    GL.add(logo);                                     //Добавление кнопки Ообразить логотип УГАТУ в JMenu
    GL.add(download);                                     //Добавление кнопки Загрузить файл в проект7 в JMenu
    GL.add(exit);                                     //Добавление кнопки Выход в JMenu
    
    String[] itemsa = { //добавление массива данных
		    "Переместить логотип УГАТУ в верхний правый угол",
		    "Переместить логотип УГАТУ в середину",
		    "Переместить логотип УГАТУ в левый верхний угол",
		    "Отсортировать данные в проекте7"
		};
	
	class comb implements ActionListener { 

		//@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
		public void actionPerformed(ActionEvent e)
		{
		    if (e.getSource() == combo) {//проверка при изменении JComboBox
		    	main_panel.remove(button_logo);
		    	if (combo.getSelectedItem()=="Переместить логотип УГАТУ в верхний правый угол") {
		    		
					main_panel.add(button_logo);  // Вставляем Label на панель 
					button_logo.setBounds(220,30,150,73); // Положение окна и размер логотипа
					 button_logo.setIcon(new ImageIcon("image/Логотип УГАТУ1.png")); //Вставка логотипа
		    	}
		    	if (combo.getSelectedItem()=="Переместить логотип УГАТУ в середину") {
		    		
					main_panel.add(button_logo);  // Вставляем Label на панель 
					button_logo.setBounds(110,30,150,73); // Положение окна и размер логотипа
					 button_logo.setIcon(new ImageIcon("image/Логотип УГАТУ1.png")); //Вставка логотипа
			    	}
		    	if (combo.getSelectedItem()=="Переместить логотип УГАТУ в левый верхний угол") {
		    		
					main_panel.add(button_logo);  // Вставляем Label на панель 
					button_logo.setBounds(22,30,150,73); // Положение окна и размер логотипа
					  button_logo.setIcon(new ImageIcon("image/Логотип УГАТУ1.png")); //Вставка логотипа
			    	}
		   }
		}
	}
	combo = new JComboBox(itemsa); // присваиваем значения JComboBox
	combo.setBounds(50,170,310,20); // задаем размеры JComboBox
	ActionListener c = new comb(); // создание слушателя	
	combo.addActionListener(c); // добавляем слушатель к JComboBox
	main_panel.add(combo); // добавление JComboBox на главную панель
    
    
   
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	
	
		
	}
	    
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}
}
