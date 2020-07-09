package objectProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address = new Address("Old street", 5, 1, "London");
        Meeting meeting = new Meeting("Meeting with the author of the bestseeler.", LocalDate.now(), address, (int) (Math.random() * 50) + 30);
        System.out.println(meeting.descriptionMeeting());
        meeting.delayMeeting(5);

        Address address1 = new Address("Young street", 5, 3, "London");
        Meeting meeting1 = new Meeting("Meeting with friends.", LocalDate.now(), address1, (int) (Math.random() * 50) + 30);

        List<Meeting> manyMeetings = new ArrayList<>();
        manyMeetings.add(meeting);
        manyMeetings.add(meeting1);
        for (Meeting meetings :
                manyMeetings) {
            System.out.println(meetings.descriptionMeeting());
        }

    }
}
