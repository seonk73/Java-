package domain;

public class UserDTO {
	private int pay; //����ڰ� ������ �ݾ� ����
	private int selectedMovieId; //����ڰ� ������ ��ȭ�� ID
	
	public UserDTO() {}
	
	public UserDTO(int pay, int selectedMovieId) {
		super();
		this.pay = pay;
		this.selectedMovieId = selectedMovieId;
	}
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSelectedMovieId() {
		return selectedMovieId;
	}
	public void setSelectedMovieId(int selectedMovieId) {
		this.selectedMovieId = selectedMovieId;
	}
	
	
	

}
