package SecondReading.Day3.ButtonClickEvent;

public class Button {
	private String text;
	private ClickListener clickListener;
	
	public Button(String text) {
		this.text = text;
	}
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		if(clickListener == null) {
			System.out.println("등록된 클릭 이벤트가 없습니다.");
			return;
		}
		clickListener.onClick();
	}
	
}

interface ClickListener {
	void onClick();
}
