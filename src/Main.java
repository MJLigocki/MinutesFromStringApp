

public class Main {

    public static void main(String[] args) {
        String input = "09:00pm-1:44am";

        StrangeTimeStringInterpreter stsi = new StrangeTimeStringInterpreter(input);
        String[] originalTimes = stsi.cut();





        String[] nums = input.split("[:]|[a-z]{2}");

        int hours1 = Integer.parseInt(nums[0]);
        int minutes1 = Integer.parseInt(nums[1]);
        int hours2 = Math.abs(Integer.parseInt(nums[2]));
        int minutes2 = Integer.parseInt(nums[3]);


        if(stsi.isPM(originalTimes[0])) {
            hours1 += 12;
        }
        if(stsi.isPM(originalTimes[1])) {
            hours1 += 12;
        }


        int totalMinutes1 = (hours1 * 60) + minutes1;
        int totalMinutes2 = (hours2 * 60) + minutes2;

        if (totalMinutes1 <= totalMinutes2) {
            System.out.println(totalMinutes2 - totalMinutes1);
        } else {
            System.out.println(totalMinutes2 - totalMinutes1 + 1440);
        }



    }
}

