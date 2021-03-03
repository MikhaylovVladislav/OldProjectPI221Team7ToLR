package lr4.src.Laba2;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.IOException;

// класс реализующий слушатель (ожидания нажатия кнопки)
public class ListenerButtonInfo implements ActionListener {

	//@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0){
		// TODO Auto-generated method stub
			
		try {
			ListenerButtonBack vevo = new ListenerButtonBack();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}


			}
	}

	
