package project.handlers;

public class Query {
    private String address;
    private Integer age;
    private Long start;
    private Long end;

    public Query() {}

    public Query(String address, Integer age, Long start, Long end) {
        this.address = address;
        this.age = age;
        this.start = start;
        this.end = end;
    }

    public boolean containsAddress() {
        return address != null;
    }

    public boolean containsAge() {
        return age != null;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }
}
