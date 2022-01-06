
public class TestManageBoard {

	public static void main(String[] args) {
		//데이터 추가 및 삭제 과정을 해보자!
		ManageBoard boardList = new ManageBoard(); // new 생성자로 객체 생성

		// 보드 클래스의 인스턴스 객체를 정의하고 new Board로 사용
		Board b1 = new Board();
		b1.setbNum(1);
		b1.setbSub("안녕하세요");
		b1.setbName("홍길동");
		boardList.addboard(b1);
		
		Board b2 = new Board();
		b2.setbNum(2);
		b2.setbSub("안녕하세요");
		b2.setbName("김삿갓");
		boardList.addboard(b2);

		Board b3 = new Board();
		b3.setbNum(3);
		b3.setbSub("안녕하세요");
		b3.setbName("성춘향");
		boardList.addboard(b3);
		
		boardList.showAllBoard();
		boardList.removeBoard(2);
		System.out.println("=================");
		boardList.showAllBoard();
		// 생성자에서 처리 하기 싫어서 이렇게 만듦
		
	}

}
