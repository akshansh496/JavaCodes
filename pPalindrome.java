// import java.util.Scanner;
// public class pPalindrome {
//     public static void main(String[] args) {
//         // Scanner sc=new Scanner(System.in);
//         // System.out.println("Enter a number");
//         // int n=sc.nextInt();
//         // int rev=0;
//         // while(n!=0){
//         //     int r=n%10;
//         //     rev=rev*10+r;
//         //     n=n/10;
//         // }
//         // System.out.println(rev);
//         String s="dbrlaxkecqlesjhsuqslravbmdvnlgfspcvimrtdqdcqqlaqxtrrqiuarjclkilbtkkenqgknuosqtrtrrduleffhgzszeczrnxdrwkjiudibnbfxtqmtcnxrpiicgvpxgnjjclyqkwitkswrfuqgsvzopfkjpnocrhifahjaaejmtrvczuzobqoatjwcixtcnpdggsfdyscqcllfdmysdtqpfpzrbltzsonkqtgvuidqszjgqeeglljokllcphfmpsduzjkjrodtfirpcyxpbbykmkhfmedfedjjrbycpdjlqiqywklfxzctrtbnuhpluvmoofxokyaxkcnkkvylnzjfuyoobtuymndyezxrtekfkldlijakaencgfkpikwfsyxtvzqdmvaexpdfwnsoblawlsycmvyvhnextjwjndapcpnvsnztibkjjhhrhyjrdsrfzyrtgetpxjxzcaaehjnpinqsgzykvraifdfaoggcyfrmbuhzctjzueqsiivwfquuwszjwhixonlklzvkkvgczskyseetcrcychdehshhpkouwstaeymviuursatmlliurcabuuxrmislauavikjuvjpdcfqnnzwflcepdvaqbfzdcogtuljvoebldxmlfhbgnxvxaagpepmzbzsmcemyxhrobkqbpwilkwnepubmdugssrwbmogezbttgxhdldqckivmponkbwkrjksfdpbsemmjdbsipxkdvfsvqmtshogqeufiolcndfdjyauwpxkogfjicxtktsuioecmlyxqwwgbuuzwwdktdktjldmptpfpzoivxzeuotzcwfuyhghjjhejuechcrjfcbchjijephldsamuqtryoovvdqhfeecertmjouhbfxlemtmvdpmymrfqwschttlplljzzpiqmydgcppfqdwtqbjxtlkseuklytzqniakliclvgvhhkalsttwsgcoqdxawdzrtvnybmgescvromhwndfzzfdnwhmorvcsegmbynvtrzdwaxdqocgswttslakhhvgvlcilkainqztylkueskltxjbqtwdqfppcgdymqipzzjllpltthcswqfrmympdvmtmelxfbhuojmtreceefhqdvvooyrtqumasdlhpejijhcbcfjrchceujehjjhghyufwcztouezxviozpfptpmdljtkdtkdwwzuubgwwqxylmceoiustktxcijfgokxpwuayjdfdncloifueqgohstmqvsfvdkxpisbdjmmesbpdfsqkjrkwbknopmvikcqdldhxgttbzegombwrssgudmbupenwkliwpbqkborhxymecmszbzmpepgaaxvxngbhflmxdlbeovjlutgocdzfbqavdpeclfwznnqfcdpjvujkivaualsimrxuubacruillmtasruuivmyeatswuokphhshedhcycrcteesykszcgvkkvzlklnoxihwjzswuuqfwviisqeuzjtczhubmrfycggoafdfiarvkyzgsqnipnjheaaczxjxptegtryzfrsdrjyhrhhjjkbitznsvnpcpadnjwjtxenhvyvmcyslwalbosnwfdpxeavmdqzvtxysfwkipkfgcneakajildlkfketrxzeydnmyutbooyufjznlyvkknckxaykoxfoomvulphunbtrtczxflkwyqiqljdpcybrjjdefdemfhkmkybbpxycpriftdorjkjzudspmfhpcllkojllgeeqgjzsqdiuvgtqknosztlbrzpfpqtdsymdfllcqcsydfsggdpnctxicwjtaoqbozuzcvrtmjeaajhafihrconpjkfpozvsgqufrwsktiwkqylcjjngxpvgciiprxnctmqtxfbnbiduijkwrdxnrzcezszghffeludrrtrtqsounkgqnekktblikljrauiqrrtxqalqqcdqdtrmivcpsfglnvdmbvarlsqushjselqcekxalrbd";
//         System.out.println(validPalindrome(s));
//     }
//     public static boolean validPalindrome(String s) {
//         int i;
//         String temp="";
//         int l=s.length();
//         for(i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             temp=ch+temp;
//         }
//         if(temp.equals(s))
//             return true;
//         else{
//             for(i=0;i<s.length();i++){
//                 String temp2="";
//                 String t=s.substring(0,i)+s.substring(i+1);
//                 for(int j=0;j<t.length();j++){
//                     char ch=t.charAt(j);
//                     temp2=ch+temp2;
//                 }
//             if(temp2.equals(t))
//             return true;
//             }
//         }
//         return false;
//     }
// }
        
public class pPalindrome {
    public static boolean check() {
        String s="abca";
        StringBuilder str=new StringBuilder(s);
        int l=str.length();
        int count=0;
        // for(int i=0;i<s.length()/2;i++){
        //     char start=s.charAt(i);
        //     char end=s.charAt(s.length()-i-1);
        //     if(start!=end)
        //     System.out.println(false);
        // }
        // System.out.println(true);
        for(int i=0;i<l;i++){
            char start=s.charAt(i);
            char end=s.charAt(s.length()-i-1);
            if(start!=end)
            count++;
        }
        if(count<=1)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check());
    }
}
