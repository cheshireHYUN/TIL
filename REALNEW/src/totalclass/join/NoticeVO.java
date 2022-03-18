package totalclass.join;

import java.util.Objects;

public class NoticeVO {
	
	private String takeclassId;
	private int noticeNum;
	private String noticeTitle;
	private String noticeContent;
	
	public NoticeVO() {
		
	}
	
	public NoticeVO(String takeclassId, String noticeContent) {
		super();
		this.takeclassId = takeclassId;
		this.noticeContent = noticeContent;
	}

	public NoticeVO(String takeclassId, int noticeNum, String noticeTitle, String noticeContent) {
		this.takeclassId = takeclassId;
		this.noticeNum = noticeNum;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
	}

	public String getTakeclassId() {
		return takeclassId;
	}

	public void setTakeclassId(String takeclassId) {
		this.takeclassId = takeclassId;
	}

	public int getNoticeNum() {
		return noticeNum;
	}

	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	@Override
	public int hashCode() {
		return Objects.hash(takeclassId, noticeNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoticeVO other = (NoticeVO) obj;
		return Objects.equals(takeclassId, other.takeclassId) && Objects.equals(noticeNum, other.noticeNum);
	}
	@Override
	public String toString() {
		return "NoticeVO [takeclassId=" + takeclassId + ", noticeNum=" + noticeNum + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + "]";
	}
	
	

}
