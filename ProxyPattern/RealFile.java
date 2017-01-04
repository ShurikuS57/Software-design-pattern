package ProxyPattern;

public class RealFile implements File {

    private String urlFile;
    private String pathFile;

    public RealFile(String urlFile) {
        this.urlFile = urlFile;
        downloadFile(urlFile);
    }


    public String getPathFile() {
        return pathFile;
    }

    private void downloadFile(String url){
        System.out.println("Download file complete.");
    }

    @Override
    public void openFile() {
        System.out.println("Open file.");
    }
}
