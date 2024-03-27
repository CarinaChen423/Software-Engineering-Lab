package Lab6_E1;

public class Main {
    public static void main(String[] args) {
//        //tvSeries.addEpisode();
//
//        Lab6.TVSeries series = new Lab6.TVSeries("The IT Crowd", "Ash Atalla");
//        System.out.println("TV Series: " + series.getSeriesName());
//        System.out.println("Producer: " + series.getProducerName());
//
//        Lab6.Episode episode1 = new Lab6.Episode(1, "Yesterday's Jam", "Jen Barber is interviewed for a position at Reynholm Industries. Based on the false claim on her CV that she \"has a lot of experience with computers\", Denholm Reynholm places her in charge of the IT department");
//        System.out.println("Lab6.Episode number: " + episode1.getNumberName());
//        System.out.println(" Title: " + episode1.getTitleName());
//        System.out.println(" Synopsis: " + episode1.getStorySynopsisName());
//
//        Lab6.Episode episode2 = new Lab6.Episode(2, "Calamity Jen", "Denholm mandates his employees to attend a stress seminar, declaring war on stress and threatening to fire those who are still stressed by the end of the day.");
//        System.out.println("Lab6.Episode number: " + episode2.getNumberName());
//        System.out.println(" Title: " + episode2.getTitleName());
//        System.out.println(" Synopsis: " + episode2.getStorySynopsisName());
//
//        Lab6.Episode episode3 = new Lab6.Episode(3, "Fifty-Fifty", "Roy's date with a young woman goes horribly wrong after she mistakes chocolate spread on his head for faeces, despite Roy's insistence that it is not.");
//        System.out.println("Lab6.Episode number: " + episode3.getNumberName());
//        System.out.println(" Title: " + episode3.getTitleName());
//        System.out.println(" Synopsis: " + episode3.getStorySynopsisName());
        TVSeries series = new TVSeries("The IT Crowd", "Ash Atalla");
        Episode episode1 = new Episode(1, "Yesterday's Jam", "Jen Barber (Katherine Parkinson) is interviewed for a position at Reynholm Industries.");
        series.addEpisode(episode1);

        Episode episode2 = new Episode(2, "Calamity Jen", "Denholm mandates his employees to attend a stress seminar, declaring \"war on stress\" ");
        series.addEpisode(episode2);

        Episode episode3 = new Episode(3,"Fifty-Fifty","Roy's date with a young woman goes horribly wrong after she mistakes chocolate spread on his head for faeces");
        series.addEpisode(episode3);
        //print all information:
        series.printSeriesInformation();

    }
}
