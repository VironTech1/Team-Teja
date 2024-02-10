package Assignment4;

public class MeetingMain {
    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        meeting.url = "virontec@zoom.com123";
        meeting.time = 10.00;
        meeting.Host = "Virontech";

        System.out.println("Meeting Details::*******");
        meeting.getMeetingDetails();
        System.out.println();

        Participant p = new Participant();
        p.pName = "Akhil";
        p.pCellNumber = 123456;
        p.pAddress = "Kansas";
        System.out.println("Meeting Details::*******");
        p.getParticipantDetails();
    }
}
