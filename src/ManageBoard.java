import java.util.*;
public class ManageBoard {

	ArrayList<Board> boardList;
	
	public ManageBoard() {
		boardList = new ArrayList<Board>();
	}
	
	
	public void addboard(Board board) {
		boardList.add(board);
	}
	
	
	public boolean removeBoard(int bNum) {
		for (Board tmp : boardList) {
			if (tmp.getbNum() == bNum)
				boardList.remove(tmp);
				return true;
		}
		return false;
	}
	public void showAllBoard() {
		for (Board tmp : boardList) {
			System.out.print(tmp.getbNum() + " : ");
			System.out.print(tmp.getbSub() + " : ");
			System.out.println(tmp.getbName());
			//tmp.action();
		}
	}

}
