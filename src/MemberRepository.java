import java.util.ArrayList;
import java.util.Arrays;

public class MemberRepository extends Repository{
    private ArrayList<Member> memberRepository;
    public MemberRepository(){
        this.memberRepository = new ArrayList<Member>(Arrays.asList(
                new Member("Sandali", "1", "password1"),
                new Member("Devindie", "2", "password2"),
                new Librarian("Hasith", "3", "password3")
                ));
    }
    public ArrayList<Member> getRepository(){
        return this.memberRepository;
    }
    public void addField(Member member){
        this.memberRepository.add(member);
    }
    public void removeField(){

    }

}
