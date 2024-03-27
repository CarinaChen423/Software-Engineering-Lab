import java.util.ArrayList;
import java.util.List;

public class TVSeries {
    private String seriesName;
    private String producer;

    private List<Episode> episodes;
    public TVSeries(String seriesName, String producer) {
        this.seriesName = seriesName;
        this.producer = producer;
        this.episodes = new ArrayList<>();
    }

    public String getSeriesName(){
            return seriesName;
        }
        public String getProducerName(){
            return producer;
        }
    public void addEpisode(Episode episode) {
        this.episodes.add(episode);
    }

    public void printSeriesInformation() {
        System.out.println("TV Series: " + seriesName);
        System.out.println("Producer: " + producer);
        System.out.println("Episodes: ");
        for (Episode episode : episodes) {
            System.out.println("Episode number: " + episode.getNumberName());
            System.out.println("Title: " + episode.getTitleName());
            System.out.println("Synopsis: " + episode.getStorySynopsisName());
            System.out.println();
        }
    }
    }
