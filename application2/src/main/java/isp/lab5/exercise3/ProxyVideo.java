package isp.lab5.exercise3;

class ProxyVideo implements Playable {

    private ColorVideo colorVideo;
    private String fileName;
    private String type;
    private BlackAndWhiteVideo blackAndWhiteVideo;


    public ProxyVideo(String fileName, String type) {
        this.fileName = fileName;
        this.type = type;
    }

    /**
     * This method should verify the type of video and
     * let to play the video who we chose
     */
    @Override
    public void play() {
        if (type == "color video") {
            if (colorVideo == null) {
                colorVideo = new ColorVideo(fileName);
            }
            colorVideo.play();
        } else if (type == "black and white video") {
            if (blackAndWhiteVideo == null) {
                blackAndWhiteVideo = new BlackAndWhiteVideo(fileName);
            }
            blackAndWhiteVideo.play();
        }

    }
}