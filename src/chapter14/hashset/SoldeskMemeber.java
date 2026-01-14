package chapter14.hashset;

public class SoldeskMemeber {
	private int memberId;
	private String memeberName;
	
	public SoldeskMemeber() {
	}

	public SoldeskMemeber(int memberId, String memeberName) {
		this.memberId = memberId;
		this.memeberName = memeberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemeberName() {
		return memeberName;
	}

	public void setMemeberName(String memeberName) {
		this.memeberName = memeberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SoldeskMemeber) {
			SoldeskMemeber member= (SoldeskMemeber)obj;
			return this.memberId==member.memberId || this.memeberName.equals(member.memeberName);
		}
		return false;
	}

	@Override
	public String toString() {
		return memeberName + " 회원의 아이디: " + memberId;
	}
	

}
