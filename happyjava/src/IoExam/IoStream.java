package IoExam;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IoStream {
    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("myFriendInfo.txt"));
            String friendInfo = null;
            while ((friendInfo = br.readLine()) != null) {
                String[] info =  friendInfo.split(" ");
                Friend friend = new Friend(info[0],info[1],info[2]);
                friends.add(friend);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("======= 친구목록 =======");
        for (Friend friend : friends) {
            System.out.println(friend);
        }




    }
}
