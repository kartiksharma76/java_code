package trenningjava;

public class Demo<Z> {
    private Z data;

    public Demo(Z data) {
        this.data = data;
    }

    public Z getData() {
        return data;
    }

    public void setData(Z data) {
        this.data = data;
    }
}