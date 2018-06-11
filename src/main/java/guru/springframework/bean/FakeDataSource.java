package guru.springframework.bean;

public class FakeDataSource {

    private String name;
    private String password;
    private String url;

    public String getName() {
        return name;
    }

    public FakeDataSource setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FakeDataSource setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FakeDataSource setUrl(String url) {
        this.url = url;
        return this;
    }
}
