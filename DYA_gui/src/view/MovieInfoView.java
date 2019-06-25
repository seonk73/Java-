package emirim.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnSelectHandler;
import emirim.persistence.MovieDAO;

public class MovieInfoView extends JFrame {
	private MovieDAO dao;
	private int selectedIndex;
	private JButton btnSelect = new JButton("����");
	private JButton btnCancel = new JButton("���");
	private MovieReservationView mainView;
	
	public MovieInfoView(MovieReservationView mainView, MovieDAO dao, int selectedIndex) {
		this.dao = dao;
		this.selectedIndex = selectedIndex;
		this.mainView = mainView;
		setLayout(new GridLayout(1, 3));
		displayInfo();
		setTitle("영화 예매");
		setBounds(170, 70, 600, 300);
		setVisible(true);
	}
	
	public JButton getBtnSelect() {
		return btnSelect;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void displayInfo() {
		ArrayList<MovieVO> mList = dao.getMovieList();
		MovieVO movie = mList.get(selectedIndex);
		ImageIcon image = new ImageIcon("posters/"+movie.getPosterName()+".PNG");
		String infoStr = "<html>"
						+ "* ��ȭ ���� : <font size = '5' color = 'green'>"+movie.getMovieTitle()+"</font><br>"
						+ "* ��ȭ �帣 : "+movie.getGenre()+"<br>"
						+ "* ���� ���� : "+movie.getOverAge()+"<br>"
						+ "* ��ȭ ���� : "+movie.getPrice()+"<br>"
				        + "</html>";
		JLabel lblPoster = new JLabel(image);
		JLabel lblInfo = new JLabel(infoStr);
		JPanel pan = new JPanel();
		btnSelect.addActionListener(new BtnSelectHandler(mainView, movie, this));
		btnCancel.addActionListener(new BtnSelectHandler(mainView, movie, this));		
		add(lblPoster);
		add(lblInfo);
		pan.add(btnSelect);
		pan.add(btnCancel);
		add(pan);
	}

}
