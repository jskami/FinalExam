import java.util.*;
public class ManageBoard {
	//������� - �迭��ҷ� �����
	ArrayList<Board> boardList;
	//������
	public ManageBoard() {
		boardList = new ArrayList<Board>();
	}
	//�޼���
	
	//����Ʈ�� �߰�
	public void addboard(Board board) {
		boardList.add(board);
	}
	//����Ʈ���� ����
	public boolean removeBoard(int bNum) {
		for (Board tmp : boardList) { // ����: �ӽú��� / ������: ���⼭ ���� ��ü
			if (tmp.getbNum() == bNum) //�⺻ Ÿ���� int�� equals�� ���� �� �����ϱ� �̷��� �����
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
