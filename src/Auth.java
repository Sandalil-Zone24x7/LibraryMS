import java.util.ArrayList;

public class Auth {

    public Member login(String memberId, String password){
        ArrayList<Member> members = Library.getInstance().getMembers();
        for(Member member: members){
            if((member.getMemberId().equals(memberId)) && (member.getPassword().equals(password))){
                member.setAuthenticated(true);
                System.out.println("Authenticated");
                return member;
            }
        }
        System.out.println("Authentication failed");
        return null;
    }

    public void signup(){}
    public void changePassword(){};
}







