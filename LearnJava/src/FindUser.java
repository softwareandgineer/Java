public class FindUser {
    public static void main(String[] args) {
        String[][] phoneList = {
                {"Tom", "911"},
                {"Bob", "123123"},
                {"Jim", "2343213"}
        };
        if (args.length != 1) {
            System.out.println("usage: findUser name");
            return;
        }
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i][0].equals(args[0])) {
                System.out.println("user number is: " + phoneList[i][1]);
                return;
            }
        }
        System.out.print("User is not found");
    }
}

