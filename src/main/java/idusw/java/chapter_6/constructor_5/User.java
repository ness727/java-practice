package idusw.java.chapter_6.constructor_5;

public class User {
    private Long id;
    private String name;
    private int age;

    public User(Long id) {
        this(id, "안아줘요", 0);
        System.out.println();
    }

    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
