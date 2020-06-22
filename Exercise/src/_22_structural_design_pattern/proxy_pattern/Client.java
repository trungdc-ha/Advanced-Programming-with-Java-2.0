package _22_structural_design_pattern.proxy_pattern;

public class Client {

    public static void main(String[] args) {
        String url = "#";
        String userAgent = "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:75.0) Gecko/20100101 Firefox/75.0";
        String destination = "D:\\Work\\CodeGym\\Module_2\\Exercise\\src\\_22_structural_design_pattern";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);
    }
}
