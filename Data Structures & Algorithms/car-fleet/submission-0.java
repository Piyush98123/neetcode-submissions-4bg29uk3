class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<Car> cars = new ArrayList<>();
        for(int i=0;i<position.length;i++){
            double t = (double)(target-position[i])/speed[i];
            cars.add(new Car(position[i], t));
        }

        cars.sort((a,b)->b.position - a.position);
        int fleet=0;
        double prevTime=0;
        for(Car c : cars){
            if(c.time>prevTime){
                fleet++;
                prevTime=c.time;
            }
        }
        return fleet;
    }
}

class Car{
    int position;
    double time;
    Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}
