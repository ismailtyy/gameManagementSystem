package gameManagementSystem;

public class MemberManager implements MemberService {
	private IMemberCheckService checkService;
	
	public MemberManager(IMemberCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void add(Member member) {
		if(checkService.CheckIfRealMember(member)) {
			System.out.println("Üye Eklendi : " + " " + member.getFirstName());
		}else {
			System.out.println("Üye Eklenemedi");
		}
	}

	@Override
	public void delete(Member member) {
		System.out.println("Üye Sİlindi : " + " " + member.getFirstName());
	}

	@Override
	public void update(Member member) {
		System.out.println("Üye EBilgileri Güncellendi : " + " " + member.getFirstName());
	}
	
}
