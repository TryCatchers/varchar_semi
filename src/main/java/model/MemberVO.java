package model;

public class MemberVO {
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberAddress;
	private long memberPhone;
	private String memberEmail;
	
	// 임시변수
	
	public MemberVO() {
		this("","","","",0,"");
	}
	
	public MemberVO(String memberId, String memberPw, String memberName, String memberAddress, long memberPhone, String memberEmail) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAddress = memberAddress;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public long getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(long memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	

}
