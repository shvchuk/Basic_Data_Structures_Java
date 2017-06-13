package ADT;

public class Counter {

    private String counterName = null;
    private int currentValue = 0;

    public Counter(String counterName) {
        this.counterName = counterName;
    }

    public void increment(){
        currentValue++;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "counterName='" + counterName + '\'' +
                ", currentValue=" + currentValue +
                '}';
    }
}
