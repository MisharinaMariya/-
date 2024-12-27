package rum;



public class Park {

    Attraction[] attractions;

    public Park(Attraction[] attractions) {
        this.attractions = attractions;



    }

    public class Attraction {

        String name;
        int hourWorkStart;
        int hourWorkEnd;
        int cost;

        public Attraction(String name, int hourWorkStart, int hourWorkEnd, int cost) {
            this.name = name;
            this.hourWorkStart = hourWorkStart;
            this.hourWorkEnd = hourWorkEnd;
            this.cost = cost;
        }

    }


}
