package javaProblems;

class Main {

    public static void main(String[] args) {

        User user = new User(23, "Suren");


    }

    private void User() {
        System.out.println("I am doing someting");
    }

    private User User(UserRecord userRecord) {
        return new User(userRecord.age, userRecord.name);
    }

    static class User {
        int age;
        String name;

        User(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    static class UserRecord {
        int age;
        String name;
        Long netWorth;

        public UserRecord(int age, String name, Long netWorth) {
            this.age = age;
            this.name = name;
            this.netWorth = netWorth;
        }
    }

}