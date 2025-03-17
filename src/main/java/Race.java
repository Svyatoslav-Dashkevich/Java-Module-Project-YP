public class Race {
    private String leader = "";
    private int distance = 0;

    public void newLeader (Car car) {
    int newDistance = 24 * car.speed;
    if (distance < newDistance) {
        distance = newDistance;
        leader = car.name;
    }
    }
    public String getLeader() {
        return leader;
    }
}
