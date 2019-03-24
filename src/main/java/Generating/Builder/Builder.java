package Builder;

import org.apache.commons.lang3.StringUtils;

class Person {
    private final String Name;
    private final String SName;
    private final int age;

    private final String work;
    private final String hobby;
    private final long footSize;
    private final long moneyCash;

    private Person(Builder builder) {
        this.Name = builder.Name;
        this.SName = builder.SName;
        this.age = builder.age;
        this.work = builder.work;
        this.hobby = builder.hobby;
        this.footSize = builder.footSize;
        this.moneyCash = builder.moneyCash;
    }

    public void aboutPerson() {
        String about = "Info:\n"
            + "Name: " + Name + "\n"
            + "Second Name: " + SName + "\n"
            + "Age: " + age + "\n";

        if (StringUtils.isNotBlank(work)) {
            about += "Work: " + work + "\n";
        }

        if (StringUtils.isNotBlank(hobby)) {
            about += "Hobby: " + hobby + "\n";
        }

        if (footSize > 0) {
            about += "Foot size: " + footSize + "\n";
        }

        if (moneyCash > 0) {
            about += "Cash: " + moneyCash + "\n";
        } else {
            about += "Cash: no cash   :(" + "\n";
        }

        System.out.println(about);
    }

    public static class Builder {
        private final String Name;
        private final String SName;
        private final int age;

        private String work = "";
        private String hobby = "";
        private long footSize = 0;
        private long moneyCash = 0;

        public Builder(String name, String sname, int age) {
            this.age = age;
            this.SName = sname;
            this.Name = name;
        }

        public Builder work(String work) {
            this.work = work;
            return this;
        }

        public Builder hobby(String hobby) {
            this.hobby = hobby;
            return this;
        }

        public Builder footSize(long footSize) {
            this.footSize = footSize;
            return this;
        }

        public Builder moneyCash(long moneyCash) {
            this.moneyCash = moneyCash;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}



public class Builder {

    public static void main(String[] args) {
        Person person = new Person.Builder("Ivanov", "Ivan", 12).hobby("Eat chocolad")
            .footSize(40).build();
        person.aboutPerson();
    }

}
