package handler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.domain.MovieVO;
import emirim.view.MovieInfoView;
import emirim.view.MovieReservationView;

public class BtnSelectHandler implements ActionListener {
	private MovieReservationView mainView;
	private MovieVO movie;
	private MovieInfoView info;
	
	public BtnSelectHandler(MovieReservationView mainView, MovieVO movie, MovieInfoView info) {
		super();
		this.mainView = mainView;
		this.movie = movie;
		this.info = info;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eo = e.getSource();
		if(eo == info.getBtnSelect()) {
			String text = "<html>"
					+ "* ��ȭ ���� : <font size = '5'>"+movie.getMovieTitle()+"</font><br>"
					+ "* ��ȭ �帣 : "+movie.getGenre()+"<br>"
					+ "* ���� ���� : "+movie.getOverAge()+"<br>"
					+ "* ��ȭ ���� : "+movie.getPrice()+"<br>"
			        + "</html>";
			mainView.lblInfo.setBackground(Color.LIGHT_GRAY);
			mainView.lblInfo.setForeground(Color.white);
			mainView.lblInfo.setText(text);
		}
		else {
			info.setVisible(false); //â�� ������ �ʰԵ�. ���α׷� ���� X
		}
	}

}
