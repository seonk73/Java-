package emirim.handler;

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
					+ "* 영화 제목 : <font size = '5'>"+movie.getMovieTitle()+"</font><br>"
					+ "* 영화 장르 : "+movie.getGenre()+"<br>"
					+ "* 연령 제한 : "+movie.getOverAge()+"<br>"
					+ "* 영화 가격 : "+movie.getPrice()+"<br>"
			        + "</html>";
			mainView.lblInfo.setBackground(Color.LIGHT_GRAY);
			mainView.lblInfo.setForeground(Color.white);
			mainView.lblInfo.setText(text);
		}
		else {
			info.setVisible(false); //창이 보이지 않게됨. 프로그램 종료 X
		}
	}

}
