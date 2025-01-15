package dev.study.immutable;

public final class ImmutableUser {
    private final String name;
    private final int age;

    public ImmutableUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ImmutableUser getImmutable() {
        return new ImmutableUser("dsdf", 10);
    }
}
