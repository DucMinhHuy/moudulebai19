package thuchanh2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String [] validAc=new String[]{"123abc_","_c123","_acd125","______","12345","sfgds"};
    public static final String[]invalidAc=new String[]{".@","dsf","333","__"};

    public static void main(String[] args) {
        accountExample =new AccountExample();
        for(String account:validAc){
            boolean isvalid=accountExample.validate(account);
            System.out.println("account is"+account+"isvalid"+isvalid);
        }
        for(String acount:invalidAc){
            boolean isvalid1=accountExample.validate(acount);
            System.out.println("acount is"+acount+"isvalid1"+isvalid1);
        }
    }
}
