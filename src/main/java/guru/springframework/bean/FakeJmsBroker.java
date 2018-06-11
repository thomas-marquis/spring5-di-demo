package guru.springframework.bean;

public class FakeJmsBroker {

    private String name;
    private String password;
    private String url;

    public String getName() {
        return name;
    }

    public FakeJmsBroker setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FakeJmsBroker setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FakeJmsBroker setUrl(String url) {
        this.url = url;
        return this;
    }
}
