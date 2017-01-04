package ProxyPattern;

public class ProxyFile implements File {
    private RealFile realFile;
    private String url;

    public ProxyFile(String url) {
        this.url = url;
    }

    @Override
    public void openFile() {
        if(realFile == null){
            realFile = new RealFile(url);
        }

        realFile.openFile();
    }

}
