class City {
    String cityName; //fields
    int population;
        public City() { //constructor if no input parameters are provided
            cityName = "No city name provided";
            population = 0;
        }

        public City(String cityName) { //constructor if only a city name is provided
            this.cityName = cityName; //this keyword distinguishes the cityName's
            this.population = 0;
        }

        public City(String cityName, int population) { //constructor if both parameters provided
            this.cityName = cityName;
            this.population = population;
        }

        public int getPopulation() {
            return this.population;
        }
}
 
 public class ConstructorExample {
    public static void main(String[] args) {
        City city = new City();
        System.out.println(city.cityName);
        System.out.println(city.getPopulation());
    }
 }
