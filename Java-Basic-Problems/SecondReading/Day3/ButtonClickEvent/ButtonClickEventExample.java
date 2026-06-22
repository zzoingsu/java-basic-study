package SecondReading.Day3.ButtonClickEvent;

public class ButtonClickEventExample {

	public static void main(String[] args) {
		Button saveButton = new Button("저장");
		Button deleteButton = new Button("삭제");

		saveButton.setClickListener(new ClickListener() {
		    @Override
		    public void onClick() {
		        System.out.println("저장 버튼을 클릭했습니다.");
		    }
		});

		deleteButton.setClickListener(new ClickListener() {
		    @Override
		    public void onClick() {
		        System.out.println("삭제 버튼을 클릭했습니다.");
		    }
		});

		saveButton.click();
		deleteButton.click();
	}

}
