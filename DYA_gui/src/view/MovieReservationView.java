package emirim.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnPayHandler;
import emirim.handler.LblHandler;
import emirim.persistence.MovieDAO;

public class MovieReservationView extends JFrame {
	public JLabel lblInfo = new JLabel("선택된 내용 X");
	public JLabel lblTicket = new JLabel("", JLabel.CENTER);
	
	public MovieReservationView(MovieDAO dao) {
		displayMovies(dao); //뒤의 set어쩌고가 호출되기전에 얘가 나와야함
		displayInfo();
		displayTicket();
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("영화 예매 정보 시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(150, 170, 800, 800);
		setVisible(true);
	}
	
	public void displayMovies(MovieDAO dao) {
		
		int[] movieIds = {1111, 2222, 3333, 4444, 5555};
		String[] titles = {"말모이", "주먹왕 랄프", "내안의 그놈", "아쿠아맨", "범블비"};
		int[] overAges = {12, 12, 12, 15, 12};
		String[] genres = {"드라마", "판타지 영화", "코미디", "판타지 영화", "SF 영화"};
		int[] prices = {9000, 9000, 9000, 9000, 9000};
		String[] posterNames = {"poster1", "poster2", "poster3", "poster4", "poster5"};
		
		for (int i = 0; i < prices.length; i++) {
			dao.addMovie(new MovieVO(movieIds[i], titles[i], overAges[i], genres[i], prices[i], posterNames[i]));
		}

		ArrayList<MovieVO> mList = dao.getMovieList();
		JPanel panN = new JPanel(new GridLayout(1, 5));
//		포스터 배치하는 작은 상자 만들 때 사용하는 반복문(영화 개수 만큼 상자를 만듦)
		JPanel[] panPosters = new JPanel[5];
		JLabel[] lblIcons = new JLabel[5];
		
		for (int i = 0; i < panPosters.length; i++) {
			panPosters[i] = new JPanel();
			MovieVO movie = mList.get(i);
			ImageIcon icon = new ImageIcon("posters/"+movie.getPosterName()+".PNG");
			lblIcons[i] = new JLabel(icon);
			lblIcons[i].addMouseListener(new LblHandler(this, dao, lblIcons));
			panPosters[i].add(lblIcons[i]);
			panN.add(panPosters[i]);
			panPosters[i].setBackground(Color.WHITE);
		}
		add(panN, "North");
	}
	
	public void displayInfo() {
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 230));
		pan.setBackground(Color.lightGray);
		JButton btnPay = new JButton("결제");
		btnPay.addActionListener(new BtnPayHandler(this));
		pan.add(lblInfo);
		pan.add(btnPay);
		lblInfo.setOpaque(true);
		lblInfo.setBackground(Color.lightGray);
		add(pan, "Center");
	}
	
	public void displayTicket() {
		lblTicket.setOpaque(true);
		lblTicket.setBackground(new Color(242, 224, 140));
		lblTicket.setForeground(new Color(0, 0, 135));
		Font font = new Font("HYGraphic", Font.BOLD, 15);
		lblTicket.setFont(font);
		add(lblTicket, "South");
	}
	
	public static void main(String[] args) {
		MovieDAO dao = new MovieDAO();
		MovieReservationView view = new MovieReservationView(dao);	
	}

}
