package design_patterns.course;

import design_patterns.course.interfaces.Function;
import design_patterns.course.models.Meteo;

public class PlayWithFunctions {

    public static void main(String[] args) {
        Meteo meteo = new Meteo(20);
        Function<Meteo, Integer> f1 = Meteo::getTemperature;
        Function<Integer, Double> f2 = m -> m * 9d / 5d + 32d;

        Function<Meteo, Double> f3 = f1.andThen(f2);

        System.out.println(f3.apply(meteo));
    }
}
